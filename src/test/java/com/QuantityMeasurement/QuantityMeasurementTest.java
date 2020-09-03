package com.QuantityMeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    int length1InFeet;
    int length2InFeet;
    int unit1InInch;
    int unit2InInch;
    @Before
    public void setup() {
        length1InFeet = 0;
        length2InFeet = 0;
        unit1InInch = 0;
        unit2InInch = 0;
    }

    @Test
    public void given0feetand0feet_ShouldReturnEqual(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(length1InFeet);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(length2InFeet);
        Assert.assertEquals(quantityMeasurement1,quantityMeasurement2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement(unit1InInch);
        QuantityMeasurement quantityMeasurement2 = new QuantityMeasurement(unit2InInch);
        Assert.assertEquals(quantityMeasurement1,quantityMeasurement2);
    }


}
