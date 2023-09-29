package Module3OOP.Enum.Exercise1;

public enum Season {
    SPRING("blossom", 93), SUMMER("warm", 93),
    AUTUMN("windy", 90), WINTER("cold", 89);

    private String description;
    private int countOfDays;

    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    @Override
    public String toString() {
        return String.format("%6s {description='%7s', countOfDays=%3d}",
                this.name(),
                this.description,
                this.countOfDays
        );
    }
}
