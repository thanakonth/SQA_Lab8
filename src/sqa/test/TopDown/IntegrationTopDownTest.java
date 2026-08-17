package sqa.test.TopDown;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import sqa.main.UniversalConverter;

public class IntegrationTopDownTest {

    @Test
    void TestDistanceStub() {
        DistanceConverterStub distanceStub = new DistanceConverterStub();

        UniversalConverter converter = new UniversalConverter(
                distanceStub,
                new WeightConverterStub(),
                new TemperatureConverterStub());

        double result = converter.convert(1000, "Distance", "meter", "kilometer");

        assertEquals(1.0, result, 0.001);
    }

    @Test
    void TestWeightStub() {
        WeightConverterStub weightStub = new WeightConverterStub();

        UniversalConverter converter = new UniversalConverter(
                new DistanceConverterStub(),
                weightStub,
                new TemperatureConverterStub());

        double result = converter.convert(1, "Weight", "kilogram", "gram");

        assertEquals(1000.0, result, 0.001);
    }

    @Test
    void testTemperatureStub() {
        TemperatureConverterStub temperatureStub = new TemperatureConverterStub();

        UniversalConverter converter = new UniversalConverter(
                new DistanceConverterStub(),
                new WeightConverterStub(),
                temperatureStub);

        double result = converter.convert(0, "Temperature", "C", "F");

        assertEquals(32.0, result, 0.001);
    }
}