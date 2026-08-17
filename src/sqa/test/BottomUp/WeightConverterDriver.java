package sqa.test.BottomUp;

import sqa.main.WeightConverter;

public class WeightConverterDriver {

    public double testWeightConversion() {

        WeightConverter weightConverter =
                new WeightConverter();

        return weightConverter.convert(
                1,
                "kilogram",
                "gram"
        );
    }
}