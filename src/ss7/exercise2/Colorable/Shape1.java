package ss7.exercise2.Colorable;

public abstract class Shape1 {
    private String color = "green";
    private boolean filled = true;

    public Shape1() {
    }

    public Shape1(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                '}';
    }

    public void howToColor() {
    }
}