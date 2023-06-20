package EmployeeObjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SalaryEmployeeTest {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales",
            "Manager", 64325);
    @Test
    void calculateWeeklyPayForSteveShouldBeTwelveThirtySevenPointOhTwo() {
        double pay = emp.calculateWeeklyPay();
        assertEquals(1237.02, pay);
    }

    @Test
    void holidayBonusForSteveShouldBeTwentyOneSixtyFourPointFiftyFour() {
        double bonus = emp.holidayBonus();
        assertEquals(2164.54, bonus);
    }

}
