package Module3OOP.Generics.Exercise1;

import java.util.Scanner;

public class Exercise1Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter cars name: ");
        Garage<Car> carGarage = new Garage<>(new Car(s.nextLine()));

        System.out.print("Enter motorcycle name: ");
        Garage<Motorcycle> motorcycleGarage = new Garage<>(new Motorcycle(s.nextLine()));

        System.out.println("Cars name is: " + carGarage.getVehiclesName());
        System.out.println("Motorcycle name is: " + motorcycleGarage.getVehiclesName());
    }
}
