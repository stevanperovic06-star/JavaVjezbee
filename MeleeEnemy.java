package udg.edu.me;

public class MeleeEnemy extends Enemy {

    public MeleeEnemy(double x, double y, Collidable collider,
                      String type, int damage, int health) {
        super(x, y, collider, type, damage, health);
    }

    @Override
    public String getDisplayName() {
        return "MeleeEnemy[" + getType() + "]";
    }
}
