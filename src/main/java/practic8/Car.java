package practic8;

public class Car implements Priceable{
    private final String name = "Mercedec";
    private final double horsePower = 300;

    @Override
    public double getPrice() {
        return 1000;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
