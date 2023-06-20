package EmployeeObjects;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HourlyEmployeeTest {
    HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
    @Test
    void increaseHoursByPositiveThreePointFiveShouldGiveThreePointFive() {
        emp.increaseHours(3.5);
        assertEquals(3.5, emp.getHoursWorked());
    }

    @Test
    void increaseHoursByNegativeThreePointFiveShouldGiveZero() {
        emp.increaseHours(-3.5);
        assertEquals(0, emp.getHoursWorked());
    }

    @Test
    void increaseHoursByPositiveThreeShouldGiveThree() {
        emp.increaseHours(3);
        assertEquals(3, emp.getHoursWorked());
    }

    @Test
    void increaseHoursByNegativeThreeShouldGiveZero() {
        emp.increaseHours(-3);
        assertEquals(0, emp.getHoursWorked());
    }

    @Test
    void increaseHoursByPositiveZeroPointThreeShouldGivePointThree() {
        emp.increaseHours(0.3);
        assertEquals(0.3, emp.getHoursWorked());
    }

    @Test
    void increaseHoursByNegativeZeroPointThreeShouldGiveZero() {
        emp.increaseHours(-0.3);
        assertEquals(0, emp.getHoursWorked());
    }


    @Test
    void annualRaiseShouldMakeHourlyWageThirtyFourPointFortyNine() {
        emp.annualRaise();
        assertEquals(34.49, emp.getWage());
    }

    @Test
    void weeklyPayForThirtyFiveHoursShouldBeElevenFortyNinePointSeventyFive() {
        emp.resetWeek();
        emp.increaseHours(35);
        double weeksWages = emp.calculateWeeklyPay();
        assertEquals(1149.75, weeksWages);
    }

    @Test
    void weeklyPayForFortyFiveHoursShouldBeFifteenSixtyPointThirtyEight() {
        emp.resetWeek();
        emp.increaseHours(45);
        double weeksWages = emp.calculateWeeklyPay();
        assertEquals(1560.38, weeksWages);
    }
}
