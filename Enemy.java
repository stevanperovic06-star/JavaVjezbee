
public class Enemy extends GameObject {
    private String type;
    private int damage;
    private int health;

    public Enemy(String type, int x, int y, int width, int height, int damage, int health) {
        super(x, y, width, height);
        setType(type);
        setDamage(damage);
        setHealth(health);
    }
  public String getType() { 
	  return type; }
  
  public int getDamage() { 
	  return damage;
  }
   public int getHealth(){ 
	   return health; }

    public void setType(String type) {
        if(type == null || type.trim().isEmpty()) type = "Enemy";
        this.type = type.trim();
    }

    public void setDamage(int damage) {
        if(damage < 0) 
        	damage = 0;
        if(damage > 100)
        	damage = 100;
        this.damage = damage;
    }

    public void setHealth(int health) {
        if(health < 0) health = 0;
        if(health > 100) health = 100;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Enemy[" + type + "] @ " + super.toString() + " DMG=" + damage + " HP=" + health;
    }
}