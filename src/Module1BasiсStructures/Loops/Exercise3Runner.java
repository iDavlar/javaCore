package Module1BasiсStructures.Loops;

public class Exercise3Runner {
    public static void main(String[] args) {

        int primeCount = 0;
        for (int i = 50; i <= 70; i++) {
            if (isPrime(i)){
                System.out.println(i);
                primeCount++;
            }
            if (primeCount == 2){
                System.out.println("Второе простое число: " + i);
                break;
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
