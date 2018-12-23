package math.problems;
import org.testng.Assert;

import org.testng.Assert;

import java.util.ArrayList;

public class UnitTestingMath {
    public static void main(String[] args) {

        //Factorial test
        Assert.assertEquals(120, Factorial.findFactorial(5));
        //Missing number test
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9,FindMissingNumber.findMissingNumber(array,10));
    }
}
