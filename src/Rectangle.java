import java.util.Objects;

class Rectangle {
    private double x1, y1, x2, y2; // Координати протилежних вершин

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getWidth() {
        return Math.abs(x2 - x1);
    }

    public double getHeight() {
        return Math.abs(y2 - y1);
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return String.format("Rectangle[(%.1f,%.1f)-(%.1f,%.1f)], P=%.2f, S=%.2f",
                x1, y1, x2, y2, getPerimeter(), getArea());
    }
}