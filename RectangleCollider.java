

 //   RectangleCollider je pravougaoni sudar  objekta.
   // Sadrži koordinate i dimenzije pravougaonika, kao i  provjere
    //kolizije pravougaonik i pravougaonik ili pravougaonik i krug.


package udg.edu.me;



public class RectangleCollider implements Collidable {

    private double x;
    private double y;
    private double width;
    private double height;

    public RectangleCollider(double x, double y, double width, double height) {
        if (width <= 0 || height <= 0) {
      throw new IllegalArgumentException("Dimenzije moraju biti vece od nule.");
        }
 this.x = x;
    this.y = y;
    this.width = width;
     this.height = height;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getWidth() { return width; }
    public double getHeight() { return height; }

   
    
    @Override
    public boolean intersects(Collidable other) {
        if (other instanceof RectangleCollider) {
     RectangleCollider r = (RectangleCollider) other;

    boolean xOverlap = this.x < r.x + r.width && this.x + this.width > r.x;
   boolean yOverlap = this.y < r.y + r.height && this.y + this.height > r.y;

     
   
   
   return xOverlap && yOverlap;
       } else if (other instanceof CircleCollider) {
         // kruzni kojader
   return other.intersects(this);
        } else {
     throw new IllegalArgumentException("Nepoznat");
        }
    }
}
