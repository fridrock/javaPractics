package practic16_new;

public class Six {
    public static void main(String[] args) {
        var test = new Six();
        //test.executeTest(null);
        test.executeTest2();
    }
    public void executeTest(String key){
        if(key==null){
            throw new RuntimeException("Нулевая строка в тесте");
        }else{
            System.out.println(key);
        }
    }
    public void executeTest2(){
        try{
            this.executeTest(null);
        }catch(RuntimeException e){
            printError(e.getMessage());
        }
    }
    private void printError(String errorMessage){
        System.out.println("Ошибка выполнения:"+errorMessage);
    }
}
