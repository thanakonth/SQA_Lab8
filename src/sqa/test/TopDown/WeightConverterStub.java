package sqa.test.TopDown;

import sqa.main.WeightConverter;

public class WeightConverterStub extends WeightConverter {

    @Override
    public double convert(double value, String fromUnit, String toUnit) {
        return 1000.0;
    }
}