package lab3;

abstract class Shape {
    protected boolean filled;
    protected String color;
    public Shape(){}
    public Shape(String color, boolean filled){}

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
