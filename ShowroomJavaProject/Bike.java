package ShowroomJavaProject;

public abstract class Bike implements Vehicle {
    protected String model;
    protected String brand;

    public Bike(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBrand() {
        return brand;
    }
}