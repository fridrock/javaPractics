package practic6_new;

public class Chair extends Furniture{
    public Chair(double height, double horizontalWidth, double horizontalHeight, String material){
        this.name = "Chair";
        this.height = height;
        this.horizontalHeight = horizontalHeight;
        this.horizontalWidth = horizontalWidth;
        this.material = material;
    }
    @Override
    double getPrice() {
        return 30;
    }
}
