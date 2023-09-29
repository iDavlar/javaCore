package Module2ClassesAndObjects.ClassesAndObjects.Exercise4;

public class ImpossibleSumToSpell extends ExceptionInInitializerError{
    private String message;

    public ImpossibleSumToSpell(String s) {
        super(s);
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
