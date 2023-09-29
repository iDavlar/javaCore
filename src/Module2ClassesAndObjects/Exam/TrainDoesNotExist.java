package Module2ClassesAndObjects.Exam;

public class TrainDoesNotExist extends Exception {
    private String message;

    public TrainDoesNotExist(String s) {
        super(s);
        this.message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
