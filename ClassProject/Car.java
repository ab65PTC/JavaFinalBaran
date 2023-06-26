public class Car {
    private String make;
    private String model;
    private int year;
    private int mileage;
    private double price;

    // Default constructor
    public Car() {
    }

    // Constructor with parameters
    public Car(String make, String model, int year, int mileage, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    // toString method to display car information
    @Override
    public String toString() {
        return "Make: " + make +
                ", Model: " + model +
                ", Year: " + year +
                ", Mileage: " + mileage +
                ", Price: $" + price;
    }

    // Main method to instantiate cars and display them
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2018, 50000, 15000.00);
        Car car2 = new Car("Honda", "Civic", 2020, 20000, 18000.00);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
    }
}
