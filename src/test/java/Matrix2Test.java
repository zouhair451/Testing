import org.junit.Before;
import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

public class Matrix2Test
{

    private Matrix2 m;

    @Before
    public void init()
    {
        m = new Matrix2();
    }

    @After
    public void tearDown()
    {
        m = null;
    }

    @Test
    void TestMatrix2() {
        assertEquals(1, 1);

    }

    @ParameterizedTest

   @ValueSource(strings = {
           "6, 8, 4, 7, 5 ",
           "1, 4, 7, 1, 0 ",
           "4, 1, 4, 5, 1 ",
           "7, 7, 5, 1, 7 "})
    public void palindromeTest(String date) {
        assertTrue(m.palindrome(date));
    }


    @DisplayName("Addition Test")
    @Test
    public  void additionTest()
    {
        double[][] f = {{-4,5,2},{6,-3,1}};
        double[][] s = {{6,-2,-5},{3,-1,-1}};
        double[][] r = {{2,3,-3},{9,-4,0}};
        assertArrayEquals( r, Matrix2.addition(f,s));
    }

    @DisplayName("Multiply Test")
    @Test
    public void multiplyTest()
    {
        double[][] f = {{4,5,3},{4,4,4}};
        double[][] s = {{3,8},{1,1},{1,2}};
        double[][] r = {{20,43},{20,44}};
        assertArrayEquals( r, Matrix2.multiply(f,s));
    }

    @DisplayName("Subtraction Test")
    @Test
    public void subtractionTest()
    {
        double[][] f = {{-4,5,2},{6,-3,1}};
        double[][] s = {{6,-2,-5},{3,-1,-1}};
        double[][] r = {{2,3,-3},{9,-4,0}};
        assertArrayEquals( r, Matrix2.addition(f,s));
    }

    @DisplayName("Division Test")
    @Test
    public void divisionTest() {
        double[][] f = {{-4,5,2},{6,-3,1}};
        double[][] s = {{6,-2,-5},{3,-1,-1}};
        double[][] r = {{0.9999999999999999,-3,-4.2},{0.0,0.0,1.7999999999999998}};
        assertArrayEquals(r, Matrix2.division(f, s));
    }

    @DisplayName("Compariso Test")
    @Test
    public void comparisonTest() {
        double[][] f = {{25,6},{8,7}};
        double[][] s = {{18,7},{8,85}};
        int r = m.comparison(f, s);
        Assert.assertEquals(-1, r);
    }


}