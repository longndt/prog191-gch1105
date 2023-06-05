package lab09;

import org.junit.*;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestDemo {

    @Test
    public void test1() {
        int a = 5;
        int b = 3;
        int total = a + b;
        assertEquals(8, total);
        int[] numbers = {6,8,10,-3,-7,-15};
        assertEquals(10, numbers[2]);
    }

    @Test
    public void test2() {
        ArrayList<String> students = new ArrayList<>();
        assertTrue(students.isEmpty());
        students.add("Nam");
        assertFalse(students.isEmpty());
        students.add("Phuong");
        assertEquals("Adding 2 new elements to array list",2, students.size());
    }

    @Test
    public void test3() {
        LocalDate date = LocalDate.now();  //get current date
        assertEquals(2023, date.getYear());
        assertEquals(6, date.getMonthValue());
        assertEquals(5, date.getDayOfMonth());
        assertEquals("2023-06-05",date.toString());
    }
}
