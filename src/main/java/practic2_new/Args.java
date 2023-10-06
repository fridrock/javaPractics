package practic2_new;

public class Args {
    private String [] arguments;

    public Args(String[] arguments) {
        this.arguments = arguments;
    }
    public void printArguments(){
        for(int i = 0;i<arguments.length;i++){
            System.out.println(arguments[i]);
        }
    }
}
