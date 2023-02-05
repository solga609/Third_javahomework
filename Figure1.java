abstract class Figure {
    public float x;
    public float y;
 
    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }
 
    abstract float getArea();
 
    abstract float getPerimeter();
}
 class Rectangle extends Figure implements Moveable{
    public float height;
    public float width;
 
    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }
 
    @Override
    public float getArea() {
        return height * width;
    }
 
    @Override
    public float getPerimeter() {
        return (height + width) * 2;
    }
 
    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
 
    @Override
    public void resize(float koeff) {
        this.height *= koeff;
        this.width *= koeff;
    }
 
    public void getCenter() {
        this.x += x / 2;
        this.y += y / 2;
    }
 
    @Override
    public String toString() {
        return ("Rectangle" + "\n" + "Center: " + "(" + (x + height / 2) + ", " + (y + width / 2) + ")" + "\n" + "Height: " + height + "\n" + "Width: " + width);
    }
}


class Circle extends Figure implements Moveable {
    public float radius;
 
    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }
 
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.sqrt(radius));
    }
 
    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
 
    @Override
    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }
 
    @Override
    public void resize(float koeff) {
        this.radius *= koeff;
    }
 
    @Override
    public String toString() {
        return ("Circle" + "\n" + "Center: " + "(" + x + ", " + y + ")" + "\n" + "Radius: " + radius);
    }
}
 
interface Moveable {
    void move(float dx, float dy);
    void resize(float koeff);
}

