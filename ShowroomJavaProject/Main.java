package ShowroomJavaProject;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Vehicle tesla = new TeslaModelS();
        Vehicle ducati = new Ducati10985S();
        Vehicle audi = new AudiR8();
        Vehicle bmw = new BMWK1200S();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(tesla);
        vehicles.add(ducati);
        vehicles.add(audi);
        vehicles.add(bmw);

        Showroom showroom = new Showroom("XYZ Showroom", vehicles);
        System.out.println("Welcome to our " + showroom.getName());

        for (Vehicle v : showroom.getVehicles()) {
            System.out.println(v.getBrand() + "-: " + v.getModel());
        }
    }
}