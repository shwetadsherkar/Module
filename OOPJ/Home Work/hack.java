import java.util.Scanner;

// Interface definition
interface VehicleFeatures {
    void startEngine();
    void stopEngine();
}

// Abstract class Vehicle
abstract class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public abstract void displayDetails();
}

// Car class extending Vehicle
class Car extends Vehicle {
    private String model;

    public Car(String brand, int year, String model) {
        super(brand, year);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void displayDetails() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Model: " + model);
    }
}

// ElectricCar class extending Car and implementing VehicleFeatures
class ElectricCar extends Car implements VehicleFeatures {
    private int batteryCapacity;

    public ElectricCar(String brand, int year, String model, int batteryCapacity) {
        super(brand, year, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    @Override
    public void startEngine() {
        System.out.println("Electric engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric engine stopped.");
    }
}

// Main class
class Solution
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String brand = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());
        String model = scanner.nextLine();
        int batteryCapacity = Integer.parseInt(scanner.nextLine());

        ElectricCar eCar = new ElectricCar(brand, year, model, batteryCapacity);
        
        eCar.displayDetails();
        eCar.startEngine();
        eCar.stopEngine();
        
        scanner.close();
    }
}