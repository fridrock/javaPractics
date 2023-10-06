package practic6_new;

public class Sofa extends Furniture{
    public Sofa(double height, double horizontalWidth, double horizontalHeight, String material){
        this.name = "Sofa";
        this.height = height;
        this.horizontalHeight = horizontalHeight;
        this.horizontalWidth = horizontalWidth;
        this.material = material;
    }
    @Override
    double getPrice() {
        return 300;
    }
}
