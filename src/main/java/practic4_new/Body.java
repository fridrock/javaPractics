package practic4_new;

public class Body {
    private int height;
    private int width;
    private int weight;
    private int fatPercentage;
    private String bodyColor;

    public Body(int height, int width, int weight, int fatPercentage, String bodyColor) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.fatPercentage = fatPercentage;
        this.bodyColor = bodyColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(int fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }
}
