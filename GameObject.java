
//    Apstraktna klasa GameObject predstavlja osnovni tip svih objekata u igri.
  //  Sadrži poziciju objekta (x, y) i odgovarajući kolajder preko kojeg se
 //   provjerava sudar , definiše apstraktnu metodu.
   // getDisplayName(),  se implementira u podklasama
    //Player i Enemy.


package udg.edu.me;

public abstract class GameObject {

    private double x;
    private double y;
    private Collidable collider;

    public GameObject(double x, double y, Collidable collider) {
     if (collider == null) {
            throw new IllegalArgumentException("Collider je obavezan.");
        }
    this.x = x;
     this.y = y;
   this.collider = collider;
    }

    public double getX() { return x; }

    public double getY() { return y; }

    public void setX(double x) { this.x = x; }

    public void setY(double y) { this.y = y; }

    public Collidable getCollider() { return collider; }

    public void setCollider(Collidable collider) {
        if (collider == null) {
      throw new IllegalArgumentException("Collider je obavezan.");
        }
        this.collider = collider;
    }

    public boolean intersects(GameObject other) {
        return this.collider.intersects(other.collider);
    }

    
    
    public abstract String getDisplayName();

    
    
    @Override
    public String toString() {
        return getDisplayName() + " @(" + x + "," + y + ")";
    }
}
