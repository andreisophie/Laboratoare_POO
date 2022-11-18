import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random(20);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch(taskNum) {
            case 1:
                // TODO: uncomment for Task1
                 Car mercedes = new Car(20000, Car.CarType.MERCEDES, 2019);
                 Car fiat = new Car(7000, Car.CarType.FIAT, 2020);
                 Car skoda = new Car(12000, Car.CarType.SKODA, 2022);
                 Dealership dealership = new Dealership();
                break;
            case 2:
                // TODO: uncomment for Task2
                 dealership = new Dealership();
                ArrayList<Car> cars = new ArrayList<>();
                cars.add(new Car(20000, Car.CarType.MERCEDES, 2010));
                cars.add(new Car(35000, Car.CarType.MERCEDES, 2015));
                cars.add(new Car(3500, Car.CarType.FIAT, 2008));
                cars.add(new Car(7000, Car.CarType.FIAT, 2010));
                cars.add(new Car(12000, Car.CarType.SKODA, 2015));
                cars.add(new Car(25000, Car.CarType.SKODA, 2021));
                for (Car car : cars) {
                    dealership.getFinalPrice(car);
                }
                break;
            case 3:
                // TODO: uncomment for Task3
                 dealership = new Dealership();
                // TODO: write solution for Task3 here
                Car car3 = new Car(20000, Car.CarType.MERCEDES, 2019);
                dealership.negotiate(car3, new Offer() {
                    @Override
                    public int getDiscount(Car car) {
                        return (int)(car.getPrice() * 0.05);
                    }
                });
                break;
            case 4:
                // TODO: write solution for Task4 here
                ArrayList<Car> cars4 = new ArrayList<>();
                cars4.add(new Car(20000, Car.CarType.SKODA, 2019));
                cars4.add(new Car(30000, Car.CarType.MERCEDES, 2019));
                cars4.add(new Car(50000, Car.CarType.MERCEDES, 2021));
                cars4.add(new Car(10000, Car.CarType.FIAT, 2018));

                cars4.forEach(System.out::println);

                ArrayList<Car> cars5= new ArrayList<>();
                cars4.forEach((car) -> {
                    if (car.getPrice() <= 25000) {
                        cars5.add(car);
                    }
                });
                cars5.forEach(System.out::println);
                break;
        }
    }
}