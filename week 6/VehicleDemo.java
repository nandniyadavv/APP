import java.util.Scanner;

class Vehicle {
    String vehicleNumber;
    String brand;
    double speed;

    Vehicle(String vehicleNumber, String brand, double speed) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleNumber, String brand, double speed, int numberOfDoors) {
        super(vehicleNumber, brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayDetails() {
        System.out.println("\nCar Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

class Bike extends Vehicle {
    boolean hasGear;

    Bike(String vehicleNumber, String brand, double speed, boolean hasGear) {
        super(vehicleNumber, brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void displayDetails() {
        System.out.println("\nBike Details");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car number: ");
        String carNumber = sc.nextLine();

        System.out.print("Enter car brand: ");
        String carBrand = sc.nextLine();

        System.out.print("Enter car speed: ");
        double carSpeed = sc.nextDouble();

        System.out.print("Enter number of doors: ");
        int doors = sc.nextInt();

        sc.nextLine();

        System.out.print("\nEnter bike number: ");
        String bikeNumber = sc.nextLine();

        System.out.print("Enter bike brand: ");
        String bikeBrand = sc.nextLine();

        System.out.print("Enter bike speed: ");
        double bikeSpeed = sc.nextDouble();

        System.out.print("Does the bike have gear? (true/false): ");
        boolean gear = sc.nextBoolean();

        Vehicle car = new Car(carNumber, carBrand, carSpeed, doors);
        Vehicle bike = new Bike(bikeNumber, bikeBrand, bikeSpeed, gear);

        car.displayDetails();
        bike.displayDetails();

        sc.close();
    }
}