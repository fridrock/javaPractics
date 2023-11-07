package practic17_new.second;

public class EmptyStringException extends Exception{
    @Override
    public String getMessage(){
        return "Строка которую вы ввели пустая";
    }
}
