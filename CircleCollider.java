
 //   CircleCollider predstavlja kružni sudarni oblik objekta.
   // Čuva koordinate centra i poluprečnik, i implementira  koliziju
   // krug i krug ili krug i pravougaonik .








package udg.edu.me;

public class CircleCollider implements Collidable {

    private double cx;
    private double cy;
    private double radius;

    public CircleCollider(double cx, double cy, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Poluprecnik mora biti veci od nule.");
        }
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }

    public double getCx() { return cx; }
    public double getCy() { return cy; }
    public double getRadius() { return radius; }

    @Override
    public boolean intersects(Collidable other) {
        if (other instanceof CircleCollider) {
            CircleCollider c = (CircleCollider) other;
            double dx = this.cx - c.cx;
            double dy = this.cy - c.cy;
            double dist2 = dx * dx + dy * dy;
            double rSum = this.radius + c.radius;
            return dist2 <= rSum * rSum;
        } else if (other instanceof RectangleCollider) {
            RectangleCollider r = (RectangleCollider) other;

            
            double closestX = clamp(cx, r.getX(), r.getX() + r.getWidth());
            double closestY = clamp(cy, r.getY(), r.getY() + r.getHeight());

            double dx = cx - closestX;
            double dy = cy - closestY;
            double dist2 = dx * dx + dy * dy;

            return dist2 <= radius * radius;
        } else {
            throw new IllegalArgumentException("Nepoznat tip kolajdera.");
        }
    }

    private double clamp(double value, double min, double max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }
}
