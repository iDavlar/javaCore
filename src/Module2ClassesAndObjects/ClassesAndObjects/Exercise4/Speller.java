package Module2ClassesAndObjects.ClassesAndObjects.Exercise4;

public class Speller {

    public int[] spellSum(int sum, int[] nominalsList) throws ImpossibleSumToSpell {

        int[] result = new int[nominalsList.length];

        for (int i = nominalsList.length - 1; i >= 0; i--) {

            int currentNominal = nominalsList[i];

            while (!canUseNextNominals(sum, nominalsList, i) && sum > 0) {
                sum -= currentNominal;
                result[i]++;
            }
        }
        if (sum != 0) {
            throw new ImpossibleSumToSpell("Невозможно разбить сумму на купюры");
        }
        return result;
    }

    private boolean canUseNextNominals(int sum, int[] nominalsList, int currentIndex) {
        int previousIndex = currentIndex - 1;
        if (previousIndex < 0) {
            return false;
        }

        for (int i = previousIndex; i >= 0; i--) {
            if (sum % nominalsList[i] == 0) {
                return true;
            }
        }
        return false;
    }
}