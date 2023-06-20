package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {
    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales",
            "Customer Representative", .0265);
    @Test
    void increaseSalesOfPositiveTwoHundredFiftySixPointThirtyFiveShouldMakeSalesTwoHundredFiftySixPointThirtyFive() {
        emp.increaseSales(256.35);
        double sales = emp.getSales();
        assertEquals(256.35, sales);
    }

    @Test
    void increaseSalesOfNegtiveTwoHundredFiftySixPointThirtyFiveShouldMakeSalesTwoHundredFiftySixPointThirtyFive() {
        emp.increaseSales(-256.35);
        double sales = emp.getSales();
        assertEquals(0, sales);
    }
}