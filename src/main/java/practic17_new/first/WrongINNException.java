package practic17_new.first;

public class WrongINNException extends RuntimeException {
    private int inn;
    private String FIO;
    public WrongINNException(String FIO, int inn){
        super();
        this.FIO = FIO;
        this.inn = inn;
    }
    @Override
    public String getMessage(){
        return "Неправильный номер INN:("+this.inn+") для пользователя с именем "+this.FIO;
    }
}
