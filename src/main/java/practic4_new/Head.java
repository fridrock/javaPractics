package practic4_new;

public class Head {
    private int height;
    private int width;
    private String hairColor;
    private String eyeColor;

    public Head(int height, int width, String hairColor, String eyeColor) {
        this.height = height;
        this.width = width;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
