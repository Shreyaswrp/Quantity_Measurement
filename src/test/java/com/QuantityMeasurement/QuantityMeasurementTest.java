package com.QuantityMeasurement;

import com.QuantityMeasurement.com.QuantityMeasurement.Unit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {


    @Before
    public void setup() {

    }

    @Test
    public void given0feetand0feet_ShouldReturnEqual(){
        Length feet1 = new Length(Unit.FEET,0);
        Length feet2 = new Length(Unit.FEET,0);
        Assert.assertEquals(feet1,feet2);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Unit.INCH,0);
        Length inch2 = new Length(Unit.INCH,0);
        Assert.assertEquals(inch1,inch2);
    }


}
