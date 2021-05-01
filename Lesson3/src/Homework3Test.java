import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Homework3Test {

    @Test
    void operation() {
        Assertions.assertEquals(3, Homework3.operation(2));
        Assertions.assertEquals(10, Homework3.operation(0));
        Assertions.assertEquals(-4, Homework3.operation(-2));
        Assertions.assertEquals(-100, Homework3.operation(-98));
        Assertions.assertEquals(101, Homework3.operation(100));
    }

    @Test
    void calculateCountOfOddElementsInMatrix() {
        Assertions.assertEquals(0, Homework3.calculateCountOfOddElementsInMatrix(new int[]{2, 4, 6, 8, 10}));
        Assertions.assertEquals(1, Homework3.calculateCountOfOddElementsInMatrix(new int[]{1, 4, 6, 8, 10}));
        Assertions.assertEquals(2, Homework3.calculateCountOfOddElementsInMatrix(new int[]{-1, 2, -3, 4, 6, 8}));
    }
}