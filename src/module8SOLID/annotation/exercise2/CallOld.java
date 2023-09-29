package module8SOLID.annotation.exercise2;

public class CallOld {

    public static void main(String[] args) {
        new CallOld().call();
    }

    @SuppressWarnings("deprecation")
    public void call() {

        System.out.println(new AnnotationTest().old());
    }
}
