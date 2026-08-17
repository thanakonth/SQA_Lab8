package sqa.test.TopDown;

import sqa.main.TemperatureConverter;

public class TemperatureConverterStub extends TemperatureConverter {

    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        return 32.0;
    }
}