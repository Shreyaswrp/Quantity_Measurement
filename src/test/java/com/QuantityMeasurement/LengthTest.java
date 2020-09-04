package com.QuantityMeasurement;


import com.QuantityMeasurement.com.QuantityMeasurement.Unit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LengthTest {

    @Mock
    Length length1;
    Length length2;

    @Test
    public void given0feetand0feet_ShouldReturnEqual(){
         length1 = new Length(Unit.FEET,0.0);
         length2 = new Length(Unit.FEET,0.0);
        boolean equals = length1.equals(length2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given0feetand1feet_ShouldReturnNotEqual(){
         length1 = new Length(Unit.FEET,0.0);
         length2 = new Length(Unit.FEET,1.0);
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenFeet_WhenCheckedOnNull_ShouldReturnFalse(){
         length1 = new Length(Unit.FEET,1.0);
         length2 = null;
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenFeet_WhenSameReference_ShouldReturnTrue(){
         length1 = new Length(Unit.FEET,1.0);
         length2 = new Length(Unit.FEET,1.0);
         length2 = length1;
        boolean equals = length1.equals(length2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given0Inchand0Inch_ShouldReturnEqual(){
        length1 = new Length(Unit.INCH,0);
        length2 = new Length(Unit.INCH,0);
        boolean equals = length1.equals(length2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given0Inchand1Inch_ShouldReturnNotEqual(){
         length1 = new Length(Unit.INCH,0);
         length2 = new Length(Unit.INCH,1);
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenInch_WhenCheckedOnNull_ShouldReturnFalse(){
        length1 = new Length(Unit.INCH,1.0);
        length2 = null;
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void givenInch_WhenSameReference_ShouldReturnTrue(){
         length1 = new Length(Unit.INCH,1.0);
         length2 = new Length(Unit.INCH,1.0);
        length2 = length1;
        boolean equals = length1.equals(length2);
        Assert.assertTrue(equals);
    }

    @Test
    public void given1Inchand1Feet_ShouldReturnNotEqualLength(){
        length1 = new Length(Unit.INCH,1);
        length2 = new Length(Unit.FEET,1);
        boolean equals = length1.equals(length2);
        Assert.assertFalse(equals);
    }

    @Test
    public void given0Feetand0Inch_ShouldReturnEqualLength(){
        length1 = new Length(Unit.FEET,0);
        length2 = new Length(Unit.INCH,0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void givenLength1Feetand12Inch_ShouldReturnEqualLength(){
        length1 = new Length(Unit.FEET,1);
        length2 = new Length(Unit.INCH,12);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand13Inch_ShouldNotReturnEqualLength(){
        length1 = new Length(Unit.FEET,1);
        length2 = new Length(Unit.INCH,13);
        boolean compareCheck = length1.compare(length2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given0Feetand0Yard_ShouldReturnEqualLength(){
        length1 = new Length(Unit.FEET,0);
        length2 = new Length(Unit.YARD,0);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Feetand1Yard_ShouldReturnNotEqualLength(){
        length1 = new Length(Unit.FEET,1);
        length2 = new Length(Unit.YARD,1);
        boolean compareCheck = length1.compare(length2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given3Feetand1Yard_ShouldReturnEqualLength(){
        length1 = new Length(Unit.FEET,3);
        length2 = new Length(Unit.YARD,1);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Inchand1Yard_ShouldReturnNotEqualLength(){
        length1 = new Length(Unit.INCH,1);
        length2 = new Length(Unit.YARD,1);
        boolean compareCheck = length1.compare(length2);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1Yardand36Inch_ShouldReturnEqualLength(){
        length1 = new Length(Unit.YARD,1);
        length2 = new Length(Unit.INCH,36);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36Inchand1Yard_ShouldReturnEqualLength(){
        length1 = new Length(Unit.INCH,36);
        length2 = new Length(Unit.YARD,1);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1Yardand3Feet_ShouldReturnEqualLength(){
        length1 = new Length(Unit.YARD,1);
        length2 = new Length(Unit.FEET,3);
        boolean compareCheck = length1.compare(length2);
        Assert.assertTrue(compareCheck);
    }
}
