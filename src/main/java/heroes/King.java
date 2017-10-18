package heroes;

import lombok.Setter;

public class King implements Character{

    @Setter
    private KickBehavior kickBehavior = new SwordKickBehavior();

    @Override
    public void kick(Character enemy) {
        kickBehavior.kick(this,enemy);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
