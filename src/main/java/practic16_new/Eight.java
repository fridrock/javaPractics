package practic16_new;

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        var test = new Eight();
        test.getKey();
    }
    public void getKey()    {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.nextLine();
        try{
            this.printDetails( key );
        }catch (Exception e){
            System.out.println("Введите значение не равное wrong");
            this.getKey();
        }
    }
    public void printDetails(String key) throws Exception{
        String message = this.getDetails(key);
        System.out.println( message );
    }
    private String getDetails(String key) throws Exception{
        if(key.equals("wrong")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
