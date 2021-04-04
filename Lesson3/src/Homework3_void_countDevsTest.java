import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Homework3_void_countDevsTest {

    @Test
    void countDevs() {
        Assertions.assertEquals("1 программист", Homework3_void_countDevs.countDevs(1));
        Assertions.assertEquals("2 программиста", Homework3_void_countDevs.countDevs(2));
        Assertions.assertEquals("3 программиста", Homework3_void_countDevs.countDevs(3));
        Assertions.assertEquals("4 программиста", Homework3_void_countDevs.countDevs(4));
        Assertions.assertEquals("5 программистов", Homework3_void_countDevs.countDevs(5));
        Assertions.assertEquals("10 программистов", Homework3_void_countDevs.countDevs(10));
        Assertions.assertEquals("11 программистов", Homework3_void_countDevs.countDevs(11));
        Assertions.assertEquals("12 программистов", Homework3_void_countDevs.countDevs(12));
        Assertions.assertEquals("13 программистов", Homework3_void_countDevs.countDevs(13));
        Assertions.assertEquals("14 программистов", Homework3_void_countDevs.countDevs(14));
        Assertions.assertEquals("15 программистов", Homework3_void_countDevs.countDevs(15));
        Assertions.assertEquals("20 программистов", Homework3_void_countDevs.countDevs(20));
        Assertions.assertEquals("21 программист", Homework3_void_countDevs.countDevs(21));
        Assertions.assertEquals("22 программиста", Homework3_void_countDevs.countDevs(22));
        Assertions.assertEquals("23 программиста", Homework3_void_countDevs.countDevs(23));
        Assertions.assertEquals("24 программиста", Homework3_void_countDevs.countDevs(24));
        Assertions.assertEquals("25 программистов", Homework3_void_countDevs.countDevs(25));
        Assertions.assertEquals("103 программиста", Homework3_void_countDevs.countDevs(103));
    }
}