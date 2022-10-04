package co.com.sofka.app.calculator;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorTest {
  BasicCalculator basicCalculator = new BasicCalculator();

  @Test
  public void basicCalculatorSumTest () {
    // arrange
    Long num1 = 2L;
    Long num2 = 2L;
    Long expectedResult = 4L;
    // act
    Long sumResult = basicCalculator.sum(num1, num2);
    // assert
    Assert.assertEquals(expectedResult, sumResult);
  }

  @Test
  public void basicCalculatorSubtractTest () {
    // arrange
    Long num1 = 4L;
    Long num2 = 6L;
    Long expectedResult = 2L;
    // act
    Long subtractResult = basicCalculator.subtract(num2, num1);
    // assert
    Assert.assertEquals(expectedResult, subtractResult);
  }

  @Test
  public void basicCalculatorMultiplyTest () {
    // arrange
    Long num1 = 4L;
    Long num2 = 6L;
    Long expectedResult = 24L;
    // act
    Long multiplyResult = basicCalculator.multiply(num1, num2);
    // assert
    Assert.assertEquals(expectedResult, multiplyResult);
  }

  @Test
  public void basicCalculatorDivideTest () {
    // arrange
    Long num1 = 2L;
    Long num2 = 6L;
    Long expectedResult = 3L;
    // act
    Long divideResult = basicCalculator.divide(num2, num1);
    // assert
    Assert.assertEquals(expectedResult, divideResult);
  }

}