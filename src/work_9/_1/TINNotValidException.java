package work_9._1;

public class TINNotValidException extends Exception {
    public TINNotValidException(String tin) {
        super("ИНН " + tin + " не действителен");
    }
}
