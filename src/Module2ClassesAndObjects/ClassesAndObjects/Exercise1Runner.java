package Module2ClassesAndObjects.ClassesAndObjects;

public class Exercise1Runner {
    public static void main(String[] args) {
        Phone nokia = new Phone("Nokia", 400, "+78905675643");
        Phone samsung = new Phone("Samsung", 350, "+78901233234");
        Phone iPhone = new Phone("Apple", 425, "+78906478990");

        System.out.println(nokia);
        System.out.println(samsung);
        System.out.println(iPhone);

        Phone[] phones = {nokia, samsung, iPhone};
        String[] names = {"Игорь","Стас","Влад"};
        String[] numbers = {"+78005553535","900","+79081243470"};

        for (int i = 0; i < phones.length; i++) {
            phones[i].receiveCall(names[i]);
            System.out.println("На номер: " + phones[i].getNumber());

            phones[i].receiveCall(names[i], numbers[i]);
            System.out.println("На номер: " + phones[i].getNumber());
        }

        iPhone.sendMessage(numbers);
    }
}
