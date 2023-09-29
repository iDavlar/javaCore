package Module2ClassesAndObjects.ClassesAndObjects.Exercise4;

import javax.print.DocFlavor;
import java.util.*;

public class ATM {
    static final int NOMINAL_HIGH = 100;
    static final int NOMINAL_MIDDLE = 50;
    static final int NOMINAL_LOW = 20;

    static final int[] NOMINALS_LIST = {NOMINAL_HIGH, NOMINAL_MIDDLE, NOMINAL_LOW};

    private final ArrayList<Banknote> banknotes = new ArrayList<Banknote>();
    private int balance;
    private int[] numbersOfBanknotes = new int[NOMINALS_LIST.length];

    public ATM(int numberHighBanknotes, int numberMiddleBanknotes, int numberLowBanknotes) {
        cashIn(numberHighBanknotes, numberMiddleBanknotes, numberLowBanknotes);
    }

    public void cashIn(int numberHighBanknotes, int numberMiddleBanknotes, int numberLowBanknotes) {
        this.addBanknotes(NOMINAL_HIGH, numberHighBanknotes);
        this.addBanknotes(NOMINAL_MIDDLE, numberMiddleBanknotes);
        this.addBanknotes(NOMINAL_LOW, numberLowBanknotes);
        this.setBalance(getSumOfBanknotes());
    }

    private int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    private void addBanknotes(int nominal, int number) {
        for (int i = 0; i < number; i++) {
            this.banknotes.add(new Banknote(nominal));
        }
        this.changeNumberOfBanknotes(nominal, number);
    }

    private void removeBanknotes(int number, int nominal) {
        this.sortBanknotes();
        int banknotesCount = 0;

        for (int i = 0; i < this.banknotes.size(); i++) {
            if ((this.banknotes.get(i).getNominal() == nominal) && (number-- > 0)) {
                this.banknotes.remove(i--);
                banknotesCount++;
            }
        }
        this.changeNumberOfBanknotes(nominal, -banknotesCount);

    }

    private void changeNumberOfBanknotes(int nominal, int delta) {
        int i;
        for (i = 0; i < NOMINALS_LIST.length; i++) {
            if (NOMINALS_LIST[i] == nominal) {
                break;
            }
        }
        this.numbersOfBanknotes[i] += delta;
    }

    private void sortBanknotes() {
        this.banknotes.sort(new BanknotesComparator());
    }

    private int getSumOfBanknotes() {
        int result = 0;
        for (Banknote banknote : this.banknotes) {
            result += banknote.getNominal();
        }
        return result;
    }

    private boolean balanceIsEnough(int sum) {
        if (this.getBalance() >= sum) {
            try {
                int[] numbersOfBanknotes = new Speller().spellSum(sum, NOMINALS_LIST);
                for (int i = 0; i < this.numbersOfBanknotes.length; i++) {
                    if (numbersOfBanknotes[i] > this.numbersOfBanknotes[i]) {
                        System.out.println("В банкомате недостаточно купюр[" + NOMINALS_LIST[i] + "].");
                        return false;
                    }
                }
            } catch (ImpossibleSumToSpell ex) {
                System.out.println(ex.getMessage());
                return false;
            }
            return true;
        } else {
            System.out.println("В банкомате недостаточно средств.");
            return false;
        }
    }

    public void withdrawMoneyDialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Снятие наличных");
        System.out.print("Введите сумму: ");
        int sum = scanner.nextInt();

        if (this.balanceIsEnough(sum)) {
            System.out.println(this.withdrawMoney(sum));
        } else {
            System.out.println("Снятие невозможно.");
        }
    }

    private String withdrawMoney(int sum) {
        int[] numbersOfBanknotes = new Speller().spellSum(sum, NOMINALS_LIST);

        String result = "Выдано купюр: ";

        for (int i = 0; i < NOMINALS_LIST.length; i++) {
            this.removeBanknotes(numbersOfBanknotes[i], NOMINALS_LIST[i]);
            result += numbersOfBanknotes[i] + " по " + NOMINALS_LIST[i] + "; ";
        }
        result += "Всего " + sum;

        return result;
    }


    private class Banknote {
        private final int nominal;

        public Banknote(int nominal) {
            this.nominal = nominal;
        }

        public int getNominal() {
            return nominal;
        }
    }

    private class BanknotesComparator implements Comparator<Banknote> {

        @Override
        public int compare(Banknote o1, Banknote o2) {
            if (o1.getNominal() == o2.getNominal()) {
                return 0;
            } else if (o1.getNominal() > o2.getNominal()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}




