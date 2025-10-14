package by.gstu.project;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class RentalSystemTest {
    @Test
    public void testFindApartmentsByPrice() {
        RentalSystem system = new RentalSystem();
        Apartment apt1 = new Apartment("ул. Ленина, 10", 50000, 60.5);
        Apartment apt2 = new Apartment("ул. Мира, 5", 75000, 80.0);
        system.addApartment(apt1);
        system.addApartment(apt2);

        List<Apartment> result = system.findApartmentsByPrice(40000, 60000);
        assertEquals(1, result.size());
        assertEquals(apt1.getAddress(), result.get(0).getAddress());
    }
}