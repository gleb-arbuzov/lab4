package exceptions;

public class WrongNameException extends Exception{
    public WrongNameException() {
        super("name объекта Shorty должно начинаться с заглавной буквы");
    }
}
