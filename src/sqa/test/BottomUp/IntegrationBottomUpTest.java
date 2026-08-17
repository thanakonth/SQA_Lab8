package sqa.test.BottomUp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IntegrationBottomUpTest {

    @Test
    void TestDistanceConverter() {

        DistanceConverterDriver driver = new DistanceConverterDriver();

        double result = driver.testDistanceConversion();

        assertEquals(1.0, result, 0.001);
    }

    @Test
    void TestWeightConverter() {

        WeightConverterDriver driver = new WeightConverterDriver();

        double result = driver.testWeightConversion();

        assertEquals(1000.0, result, 0.001);
    }

    @Test
    void TestTemperatureConverter() {

        TemperatureConverterDriver driver = new TemperatureConverterDriver();

        double result = driver.testTemperatureConversion();

        assertEquals(32.0, result, 0.001);
    }
}