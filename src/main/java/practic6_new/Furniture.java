package practic6_new;

abstract class Furniture {
    protected double height;
    protected double horizontalWidth;
    protected double horizontalHeight;
    protected String material;
    protected String name;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHorizontalWidth() {
        return horizontalWidth;
    }

    public void setHorizontalWidth(double horizontalWidth) {
        this.horizontalWidth = horizontalWidth;
    }

    public double getHorizontalHeight() {
        return horizontalHeight;
    }

    public void setHorizontalHeight(double horizontalHeight) {
        this.horizontalHeight = horizontalHeight;
    }
    public String getSizes(){
        String sizes = "Height is:" + height+", horizontalWidth is:"
                + horizontalWidth +", horizontalHeight is:"+horizontalHeight;
        return sizes;
    }
    public String getName(){
        return this.name;
    }
    abstract double getPrice();
}
