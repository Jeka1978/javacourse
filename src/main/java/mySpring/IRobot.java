package mySpring;


import lombok.AccessLevel;
import lombok.Setter;

@Setter(AccessLevel.PACKAGE)
public class IRobot {
    @InjectByFieldType
    private Speaker speaker;

    @InjectByFieldType
    private Cleaner cleaner;

    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
