package practic6_new;

import java.util.ArrayList;
import java.util.List;

public class FurnitureShop {
    private List<Furniture> furnitureList;
    public FurnitureShop(){
        this.furnitureList = new ArrayList<>();
        furnitureList.add(new Chair(140.0, 20.0, 20.0, "plastic"));
        furnitureList.add(new Sofa(120.0, 100.0, 200.0, "soft"));
        furnitureList.add(new WoodenTable(140.0, 200.0, 150.0));
    }
    private int getProductsAmount(){
        return this.furnitureList.size();
    }
    public void addProduct(Furniture furniture){
        this.furnitureList.add(furniture);
    }
    public void printProducts(){
        System.out.println("Shot has " + getProductsAmount()+" products:");
        for(int i = 0;i < furnitureList.size();i++){
            Furniture curFurniture = furnitureList.get(i);
            System.out.println(curFurniture.getName()+": "+curFurniture.getSizes());
            System.out.println("It's price: " + curFurniture.getPrice());
        }
    }

    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        shop.printProducts();
        shop.addProduct(new Sofa(400, 300, 100, "cotton"));
        shop.printProducts();
    }

}
