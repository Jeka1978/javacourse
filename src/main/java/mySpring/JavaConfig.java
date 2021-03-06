package mySpring;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig implements Config {
    private Map<Class, Class> ifc2Class = new HashMap<>();


    public JavaConfig() {
        ifc2Class.put(Speaker.class, ConsoleSpeaker.class);
        ifc2Class.put(Cleaner.class, PowerCleaner.class);
    }

    @Override
    public Class resolveImpl(Class ifc) {
        return ifc2Class.get(ifc);
    }

}
