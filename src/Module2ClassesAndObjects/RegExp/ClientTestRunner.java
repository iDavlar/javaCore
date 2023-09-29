package Module2ClassesAndObjects.RegExp;

public class ClientTestRunner {
    public static void main(String[] args) {
        Client client1 = new Client(
                "my_email@gmail.com",
                "255.255.255.255",
                "Россия обл.() Иркутская р-н @Братский    г. Братск ул. Советская д. 28",
                "https://www.labirint.ru/books/594619/",
                "Вася"
        );
        Client client2 = new Client(
                "a.petrov@gmail.com",
                "234.34.98.260",
                "Россия обл.() Иркутская р-н @Братский    д. Братск ул. Советская д. 28",
                "https://catalog.onliner.by/bike?is_prime=1",
                "Даня"
        );
        Client client3 = new Client(
                "coder-4575@yandex.ru",
                "127.0.0.0",
                "Russia обл.() Иркутская р-н @Братский    ж. Братск ул. Советская д. 28",
                "https://www.youtube.com/watch?v=P7dByA1rz5c&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=43&ab_channel=alishev",
                "Петя"
        );

        ClientValidator.validate(client1);
        System.out.println();
        ClientValidator.validate(client2);
        System.out.println();
        ClientValidator.validate(client3);

    }
}
