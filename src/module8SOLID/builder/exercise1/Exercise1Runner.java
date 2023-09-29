package module8SOLID.builder.exercise1;

public class Exercise1Runner {
    public static void main(String[] args) {
        InteractivePersonBuilder pb = new InteractivePersonBuilder();
        pb.showSetName();
        pb.showSetSurname();
        pb.showSetBirthYear();
        pb.showSetAddress();
        Person person = pb.createPerson();
        System.out.println(person);
    }
}
