package by.gstu.project;

import java.time.LocalDate;

public class Contract {
    private Apartment apartment;
    private String tenantId;
    private LocalDate startDate;
    private LocalDate endDate;

    public Contract(Apartment apartment, String tenantId, LocalDate startDate, LocalDate endDate) {
        this.apartment = apartment;
        this.tenantId = tenantId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Apartment getApartment() { return apartment; }
    public String getTenantId() { return tenantId; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
}