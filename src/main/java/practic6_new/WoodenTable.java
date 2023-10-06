package practic6_new;

public class WoodenTable extends Furniture {
    public WoodenTable(double height, double horizontalWidth, double horizontalHeight){
        this.name = "Wooden table";
        this.material = "wood";
        this.height = height;
        this.horizontalHeight = horizontalHeight;
        this.horizontalWidth = horizontalWidth;

    }
    @Override
    double getPrice() {
        return 100;
    }
}
