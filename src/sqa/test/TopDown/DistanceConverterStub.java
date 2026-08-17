package sqa.test.TopDown;

import sqa.main.DistanceConverter;

public class DistanceConverterStub extends DistanceConverter {

    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        return 1.0;
    }
}