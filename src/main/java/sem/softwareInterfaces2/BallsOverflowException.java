package sem.softwareInterfaces2;

public class BallsOverflowException extends RuntimeException{
    public BallsOverflowException(){
        super("Невозможно создать более 15 шаров");
    }
}
