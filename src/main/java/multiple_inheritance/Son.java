package multiple_inheritance;

public class Son implements Father, Mother{
    @Override
    public void talkToBaby() {
        Father.super.talkToBaby();
        Mother.super.talkToBaby();
    }
}
