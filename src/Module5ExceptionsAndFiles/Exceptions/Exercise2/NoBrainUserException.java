package Module5ExceptionsAndFiles.Exceptions.Exercise2;

public class NoBrainUserException extends  Exception{
    private String msg;

    public NoBrainUserException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
