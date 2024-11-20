class Vehicle1 {
    private int vehicleID;
    private String manufacturer;
    private String model;
    private int year;

    public Vehicle1(int vehicleID, String manufacturer, String model, int year) {
        this.vehicleID = vehicleID;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

class Car1 extends Vehicle1{
    private String fuelType;

    public Car1(int vehicleID, String manufacturer, String model, int year, String fuelType) {
        super(vehicleID, manufacturer, model, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }
}

public class Question16 {
    public static void main(String[] args) {
        Car1 car = new Car1(111223, "benz", "x40", 2024, "diesel");
        System.out.println("Vehicle ID: " + car.getVehicleID());
        System.out.println("Manufacturer: " + car.getManufacturer());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Fuel Type: " + car.getFuelType());
    }
}

