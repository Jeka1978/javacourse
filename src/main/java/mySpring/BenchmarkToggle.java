package mySpring;

import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class BenchmarkToggle implements BenchmarkToggleMBean {
    @Getter
    @Setter
    private boolean enabled;


    @SneakyThrows
    public BenchmarkToggle() {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        mBeanServer.registerMBean(this, new ObjectName("niceMBeans", "name", "benchmark"));
    }

    @Override
    public void shutDown(int code) {
        System.out.println("Lets go to break for 10 minutes");
        System.out.println(code);
        System.exit(code);
    }
}
