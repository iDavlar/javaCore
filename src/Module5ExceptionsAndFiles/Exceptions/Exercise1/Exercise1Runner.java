package Module5ExceptionsAndFiles.Exceptions.Exercise1;

public class Exercise1Runner {
    public static void main(String[] args) {
        try {
            String o = null;
            System.out.println(o.toString());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
