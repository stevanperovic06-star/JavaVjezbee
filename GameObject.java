//Radili Monika Velimirovic 24/119 i Stevan Perovic 24/194
public class GameObject {
protected int x;
protected int y;
protected int width;
protected int height;

public GameObject(int x, int y, int width, int height) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
}

public int getX() {
	return x;
}
public int getY() {
	return y;
}
public int getWidth() {
	return width;
}
public int getHeight() {
	return height;
}
public void setX(int x) {
	this.x = x;
}
public void setY(int y) {
	this.y = y;
}
public void setWidth(int width) {
	if(width >0)this.width = width;
	
}
public void setHeight(int height) {
	 if(height <= 0) return;
     this.height = height;
}
public boolean intersects(GameObject other) {
    return !(x + width < other.x || other.x + other.width < x ||y + height < other.y ||other.y + other.height < y);
}
@Override
public String toString() {
    return "(" + x + "," + y + ") " + width + "x" + height;}

}
