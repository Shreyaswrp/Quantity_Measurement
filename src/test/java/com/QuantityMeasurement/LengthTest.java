package com.QuantityMeasurement;

import com.QuantityMeasurement.com.QuantityMeasurement.Unit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LengthTest {

    @Test
    public void given0feetand0feet_ShouldReturnEqual(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given0feetand1feet_ShouldReturnNotEqual(){
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenFeet_WhenCheckedOnNull_ShouldReturnFalse(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = null;
        boolean equals = feet1.equals(feet2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenFeet_WhenSameReference_ShouldReturnTrue(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        feet2=feet1;
        boolean equals = feet1.equals(feet2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenFeet_WhenCheckOnClassType_ShouldReturnTrue(){
        Length feet1 = new Length(Unit.FEET,1.0);
        Length feet2 = new Length(Unit.FEET,2.0);
        boolean equals = feet1.getClass().equals(feet2.getClass());
        Assert.assertTrue(equals);
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

    @Test
    public void givenInch_WhenCheckedOnNull_ShouldReturnFalse(){
        Length inch1 = new Length(Unit.INCH,1.0);
        Length inch2 = null;
        boolean equals = inch1.equals(inch2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenInch_WhenSameReference_ShouldReturnTrue(){
        Length inch1 = new Length(Unit.INCH,1.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        inch2=inch1;
        boolean equals = inch1.equals(inch2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenInch_WhenCheckOnClassType_ShouldReturnTrue(){
        Length inch1 = new Length(Unit.INCH,1.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        boolean equals = inch1.getClass().equals(inch2.getClass());
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqualLength(){
        Length inch = new Length(Unit.INCH,1);
        Length feet = new Length(Unit.FEET,1);
        boolean equals = inch.equals(feet);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength(){
        Length feet = new Length(Unit.FEET,0);
        Length inch = new Length(Unit.INCH,0);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand12Inch_ShouldReturnEqualLength(){
        Length feet = new Length(Unit.FEET,1);
        Length inch = new Length(Unit.INCH,12);
        boolean compareCheck = feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand13Inch_ShouldNotReturnEqualLength(){
        Length feet = new Length(Unit.FEET,1);
        Length inch = new Length(Unit.INCH,13);
        boolean compareCheck = feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0Feetand0Yard_ShouldReturnEqualLength(){
        Length feet = new Length(Unit.FEET,0);
        Length yard = new Length(Unit.YARD,0);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqualLength(){
        Length feet = new Length(Unit.FEET,1);
        Length yard = new Length(Unit.YARD,1);
        boolean compareCheck = feet.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqualLength(){
        Length feet = new Length(Unit.FEET,3);
        Length yard = new Length(Unit.YARD,1);
        boolean compareCheck = feet.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqualLength(){
        Length inch = new Length(Unit.INCH,1);
        Length yard = new Length(Unit.YARD,1);
        boolean compareCheck = inch.compare(yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36Inch_ShouldReturnEqualLength(){
        Length yard = new Length(Unit.YARD,1);
        Length inch = new Length(Unit.INCH,36);
        boolean compareCheck = yard.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_ShouldReturnEqualLength(){
        Length inch = new Length(Unit.INCH,36);
        Length yard = new Length(Unit.YARD,1);
        boolean compareCheck = inch.compare(yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Yardand3Feet_ShouldReturnEqualLength(){
        Length yard = new Length(Unit.YARD,1);
        Length feet = new Length(Unit.FEET,3);
        boolean compareCheck = yard.compare(feet);
        Assert.assertTrue(compareCheck);
    }
}
