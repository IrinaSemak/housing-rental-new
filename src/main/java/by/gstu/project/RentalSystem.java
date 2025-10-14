package by.gstu.project;

import java.util.ArrayList;
import java.util.List;

public class RentalSystem {
    private List<Apartment> apartments = new ArrayList<>();

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public List<Apartment> findApartmentsByPrice(double minPrice, double maxPrice) {
        List<Apartment> result = new ArrayList<>();
        for (Apartment apt : apartments) {
            if (apt.getPrice() >= minPrice && apt.getPrice() <= maxPrice) {
                result.add(apt);
            }
        }
        return result;
    }
}