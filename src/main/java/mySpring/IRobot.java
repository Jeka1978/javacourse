package mySpring;


import lombok.AccessLevel;
import lombok.Setter;

import javax.annotation.PostConstruct;

@Setter(AccessLevel.PACKAGE)
public class IRobot {
    @InjectByFieldType
    private Speaker speaker;

    @InjectByFieldType
    private Cleaner cleaner;


    @PostConstruct
    public void init(){
        System.out.println(cleaner.getClass());
    }

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
