package Module5ExceptionsAndFiles.Exceptions.Exercise4;

public class Division {
    public static Double divide(String... arguments)
            throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {
        Double result = 0.0;
        try {
            int[] arg = convertToInt(arguments);
            if ((result = (double) arg[0]) == 0.0) {
                return result;
            }
            for (int i = 1; i < arg.length; i++) {
                result /= arg[i];
            }
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            throw e;
        }
        return result;

    }

    private static int[] convertToInt(String[] arguments)
            throws NumberFormatException, ArrayIndexOutOfBoundsException, ArithmeticException {

        if (arguments.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Arguments array is empty!");
        }

        int[] result = new int[arguments.length];

        for (int i = 0; i < arguments.length; i++) {
            try {
                result[i] = Integer.parseInt(arguments[i]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Cannot parse '" + arguments[i] + "' to integer");
            }
        }

        if (result.length > 1) {
            for (int i = 1; i < result.length; i++) {
                if (result[i] == 0) {
                    throw new ArithmeticException("division by zero");
                }
            }
        }

        return result;
    }
}
