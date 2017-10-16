package strategy;

public class RadioImpl implements Radio {
    @Override
    public void setVolume(int delta) {
        System.out.println("Volume was changed to delta" + delta);
    }

    @Override
    public void play() {
        System.out.println("yesterday....");
    }
}
