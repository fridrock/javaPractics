package practic16_new;

public class Fifth {
    public static void main(String[] args) {
        var test = new Fifth();
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
            System.out.println("Ошибка выполнения:"+e.getMessage());
        }
    }
}
