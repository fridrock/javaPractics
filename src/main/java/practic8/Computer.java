package practic8;

public class Computer implements Priceable{
    private final String model = "Lenovo";
    private final String processor = "Intel";
    @Override
    public double getPrice() {
        return 300;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
