
public class Boss extends Enemy{
	 public Boss(String type, int x, int y, int w, int h, int damage, int health) {
	        super(type, x, y, w, h, damage, health);
	    }

	    @Override
	    public String toString() {
	        return "BossEnemy[" + getType() + "] @ (" + getX() + "," + getY() + ") "
	                + getWidth() + "x" + getHeight() + " DMG=" + (getDamage()*2) + " HP=" + getHealth();
	    }
	}

