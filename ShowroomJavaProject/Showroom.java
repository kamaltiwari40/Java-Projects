package ShowroomJavaProject;

import java.util.List;

public class Showroom {

    private String name;
    private List<Vehicle> vehicles;

    public Showroom(String name, List<Vehicle> vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}