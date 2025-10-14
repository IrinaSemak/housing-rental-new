package by.gstu.project;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem();
        system.addApartment(new Apartment("ул. Ленина, 10", 50000, 60.5));
        system.addApartment(new Apartment("ул. Мира, 5", 75000, 80.0));
        System.out.println(system.findApartmentsByPrice(40000, 60000));
    }
}