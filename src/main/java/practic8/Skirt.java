package practic8;

public class Skirt implements Priceable{
    private final String brand = "Lacoste";
    private final String size = "M";

    @Override
    public double getPrice() {
        return 30;
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
