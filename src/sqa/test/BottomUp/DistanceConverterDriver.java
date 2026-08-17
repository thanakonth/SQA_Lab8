package sqa.test.BottomUp;

import sqa.main.DistanceConverter;

public class DistanceConverterDriver {

    public double testDistanceConversion() {

        DistanceConverter distanceConverter = new DistanceConverter();

        return distanceConverter.convert(
                1000,
                "meter",
                "kilometer");
    }
}