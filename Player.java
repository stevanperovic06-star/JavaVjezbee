
 class  Player extends GameObject{
private String name;
private int health;

public Player(String name, int x, int y, int width, int height, int health) {
        super(x, y, width, height);
         setName(name);
          setHealth(health);
		    }
public String getName() { return name; }
public int getHealth() { return health; }

		    public void setName(String name) {
		    	 if (name == null || name.trim().isEmpty()) {
		    	        this.name = "Player";
		    	        return;
		    	    }

		    	    String[] parts = name.trim().toLowerCase().split("\\s+");
		    	    for (int i = 0; i < parts.length; i++) {
		    	        parts[i] = Character.toUpperCase(parts[i].charAt(0)) + parts[i].substring(1);
		    	    }

		    	    this.name = String.join(" ", parts);
		    	}

		    

		    public void setHealth(int health) {
		        if(health < 0) health = 0;
		        if(health > 100) health = 100;
		        this.health = health;
		    }

		    @Override
		    public String toString() {
		        return "Player[" + name + "] @ " + super.toString() + " HP=" + health;
		    }
		}
 
 
	



