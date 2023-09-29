package Module2ClassesAndObjects.ClassesAndObjects;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String model, int weight, String number) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Модель: " + this.model + " Вес: " + this.weight + " Номер: " + this.number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public void sendMessage(String[] numbers) {
        System.out.println("Отправка сообщений на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
        System.out.println("Завершена успешно!");
    }
}
