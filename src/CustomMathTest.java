import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CustomMathTest {
  @Parameterized.Parameters
    public static Collection divisionValues() {
        return Arrays.asList(new Object[][]{
                {2, 2, 2},
                {3, 3, 3},
                {4, 4, 4},
                {5, 5, 5},
                {0, 0, 0},
                {0, 0, 0}});
    }

    int x, y, divResult;

    public CustomMathTest(int x, int y, int divResult) {
        this.x = x;
        this.y = y;
        this.divResult = divResult;
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }


    @Test
    public void testSum2() {
        System.out.println("Sum");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = CustomMath.sum(x, y);
        assertTrue(expResult == result);
//        fail("The test case is a prototype.");
    }

    @Test
    public void testDivisionByZero() {
        int x = 0;
        int y = -2;
        int expResult = 0;
        try {
            int result = CustomMath.division(x, y);
            assertFalse(expResult != result);
            if (y == 0) fail("Деление на ноли не создает исключителънои ситуации");
        } catch (IllegalArgumentException e) {
            if (y != 0) fail("Генерация исключения при ненулевом знаменателе");
        }
    }

    @Test
    public void testSum(){
        System.out.println("Suma:");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = CustomMath.sum(x,y);
        assertEquals(expResult,result);

    }
}

/**
 * Test of main method, of class CustomMath.
 */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        CustomMath.main(args);
//        fail("The test case is a prototype.");
//    }


