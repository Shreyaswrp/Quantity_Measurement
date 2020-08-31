package com.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityCalculator = null;

    @Before
    public void setup() {
        quantityCalculator = new QuantityMeasurement();
    }

    @Test
    public void givenLength_whenSame_ResultTrue() {
        quantityCalculator = new QuantityMeasurement();
        double lengthInFeet = 1;
        double LengthInInch = 12;
        boolean result = quantityCalculator.compareLengths(lengthInFeet, LengthInInch);
        Assert.assertTrue(result);
    }
}
