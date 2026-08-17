package sqa.test.BottomUp;

import sqa.main.TemperatureConverter;

public class TemperatureConverterDriver {

    public double testTemperatureConversion() {

        TemperatureConverter temperatureConverter =
                new TemperatureConverter();

        return temperatureConverter.convert(
                0,
                "C",
                "F"
        );
    }
}