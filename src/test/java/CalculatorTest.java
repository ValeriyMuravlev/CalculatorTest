import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void checkSumLong(){
        long result = calculator.sum(2,3);
        Assert.assertEquals(result,5);
    }

    @DataProvider(name = "sumLongDataProvider")
    public Object[][] sumLongDP(){
      return new Object[][] {
              {7,8,15},
              {10,10,20},
              {1,2,3}
      };
    }
    @Test(dataProvider = "sumLongDataProvider")
    public void checkSumLongDP(long firstParam, long secondParam, long expectedResult){
        long result = calculator.sum(firstParam,secondParam);
        Assert.assertEquals(result,expectedResult);

    }


    @Test
    public void checkSumDouble(){
        double result = calculator.sum(3.0, 5.0);
        Assert.assertEquals(result,8.0);

    }


}
