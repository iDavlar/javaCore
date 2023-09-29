package Module2ClassesAndObjects.ClassesAndObjects.Exercise4;

public class Exercise4Runner {
    public static void main(String[] args) {
        ATM atm = new ATM(1, 1, 1);
        atm.cashIn(8, 0, 4);
        atm.withdrawMoneyDialog();
    }
}
