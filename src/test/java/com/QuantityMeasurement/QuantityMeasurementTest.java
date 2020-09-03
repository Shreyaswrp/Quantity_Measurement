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
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given0feetand1feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET,0);
        Length feet2 = new Length(Unit.FEET,1);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        Length inch1 = new Length(Unit.INCH,0);
        Length inch2 = new Length(Unit.INCH,0);
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
        Length inch1 = new Length(Unit.INCH,0);
        Length inch2 = new Length(Unit.INCH,1);
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

}
