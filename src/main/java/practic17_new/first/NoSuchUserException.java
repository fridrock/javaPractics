package practic17_new.first;

public class NoSuchUserException extends RuntimeException{
    private String userName;
    public NoSuchUserException(String userName){
        super();
        this.userName = userName;
    }
    @Override
    public String getMessage(){
        return "Нет покупателя с именем "+this.userName;
    }
}
