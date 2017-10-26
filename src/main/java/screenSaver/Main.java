package screenSaver;

import lombok.SneakyThrows;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        while (true) {
            ColorFrame colorFrame = context.getBean(ColorFrame.class);
            colorFrame.fly();
            Thread.sleep(100);
        }
    }
}
