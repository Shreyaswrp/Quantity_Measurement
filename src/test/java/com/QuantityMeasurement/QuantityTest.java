package com.QuantityMeasurement;


import com.QuantityMeasurement.com.QuantityMeasurement.Unit;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuantityTest {

    @Test
    public void given0FeetAnd0FeetLength_ShouldReturnEqualLength() {
        Quantity  quantity1 = new Quantity(Unit.feet.getBaseUnit(), 0);
        Quantity quantity2 = new Quantity(Unit.feet.getBaseUnit(), 0);
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void given0FeetAnd1FeetLength_ShouldNotReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 0);
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenFeet_WhenCheckedOnNull_ShouldReturnNotEqualLength() {
        Quantity unit1 = null;
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenFeet_WhenSameReference_ShouldReturnEqual() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 2);
        unit2 = unit1;
        Boolean equals = unit1.equals(unit2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenSameFeet_ShouldReturnEqual() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given0InchAnd0InchLength_ShouldReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 0);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 0);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given0InchAnd1InchLength_ShouldReturnNotEqualLength() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 0);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenInch_WhenCheckedOnNull_ShouldReturnNotEqual() {
        Quantity unit1 = null;
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void givenInch_WhenSameRef_ShouldReturnEqual() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 2);
        unit2 = unit1;
        Boolean equals = unit1.equals(unit2);
        Assert.assertTrue(equals);
    }

    @Test
    public void givenSameInch_ShouldReturnEqual() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1FeetAnd12InchesLength_ShouldReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 12);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given3FeetAnd1YardLength_ShouldReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 3);
        Quantity unit2 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1FeetAnd1YardLength_ShouldNotReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1InchAnd1YardLength_ShouldNotReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1yardAnd36InchLength_ShouldReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 36);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given37InchAnd1YardLength_ShouldNotReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 37);
        Quantity unit2 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1YardAnd3FeetLength_ShouldReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 3);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1YardAnd4FeetLength_ShouldNotReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.yard.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 4);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given2InchAnd5cmLength_ShouldReturnEqualLength() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 2);
        Quantity unit2 = new Quantity(Unit.cm.getBaseUnit(), 5);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 2);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 2);
        double add = Quantity.add(unit1, unit2);
        Assert.assertEquals(add, 4, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_WhenAdded_ShouldReturn13Inch() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.inch.getBaseUnit(), 1);
        double add = Quantity.add(unit1, unit2);
        Assert.assertEquals(add, 13, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        Quantity unit1 = new Quantity(Unit.feet.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.feet.getBaseUnit(), 1);
        double add = Quantity.add(unit1, unit2);
        Assert.assertEquals(add, 24, 0.0);
    }

    @Test
    public void given2InchAnd2decimal5CM_WhenAdded_ShouldReturn3Inch() {
        Quantity unit1 = new Quantity(Unit.inch.getBaseUnit(), 2);
        Quantity unit2 = new Quantity(Unit.cm.getBaseUnit(), 2.5);
        double add = Quantity.add(unit1, unit2);
        Assert.assertEquals(add, 3, 0.0);
    }

    @Test
    public void given1GallonAnd3decimal78Liter_ShouldReturnEqualVolume() {
        Quantity unit1 = new Quantity(Unit.gallon.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.liter.getBaseUnit(), 3.78);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given2GallonAnd3decimal78Liter_ShouldNotReturnEqualVolume() {
        Quantity unit1 = new Quantity(Unit.gallon.getBaseUnit(), 2);
        Quantity unit2 = new Quantity(Unit.liter.getBaseUnit(), 3.78);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1LiterAnd1000Ml_ShouldReturnEqualVolume() {
        Quantity unit1 = new Quantity(Unit.liter.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.ml.getBaseUnit(), 1000);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1LiterAnd10000Ml_ShouldNotReturnEqualVolume() {
        Quantity unit1 = new Quantity(Unit.liter.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.ml.getBaseUnit(), 10000);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1GallonAnd3decimal78Liters_WhenAdded_ShouldReturn7decimal57Liters() {
        Quantity unit1 = new Quantity(Unit.gallon.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.liter.getBaseUnit(), 3.78);
        double add = Quantity.add(unit1, unit2);
        Assert.assertEquals(7.57, add, 0.1);
    }

    @Test
    public void given1kgAnd1000grams_ShouldReturnEqualWeight() {
        Quantity unit1 = new Quantity(Unit.kg.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.gram.getBaseUnit(), 1000);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1kgAnd10000grams_ShouldNotReturnEqualWeight() {
        Quantity unit1 = new Quantity(Unit.kg.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.gram.getBaseUnit(), 10000);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1TonneAnd1000Kgs_ShouldReturnEqualWeight() {
        Quantity unit1 = new Quantity(Unit.tonne.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.kg.getBaseUnit(), 1000);
        Assert.assertEquals(unit1, unit2);
    }

    @Test
    public void given1TonneAnd10000Kgs_ShouldNotReturnEqualWeight() {
        Quantity unit1 = new Quantity(Unit.tonne.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.kg.getBaseUnit(), 10000);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given1TonneAnd1000grams_WhenAdded_ShouldReturn1001Kg() {
        Quantity unit1 = new Quantity(Unit.tonne.getBaseUnit(), 1);
        Quantity unit2 = new Quantity(Unit.gram.getBaseUnit(), 1000);
        double add = Quantity.add(unit1, unit2);
        Assert.assertEquals(1001, add, 0.0);
    }

    @Test
    public void given212FahrenheitAnd200Celsius_ShouldNotReturnEqualTemperature() {
        double convertedFahrenheittemperature = Quantity.temperatureConversion(200);
        Quantity unit1 = new Quantity(Unit.celsius.getBaseUnit(), convertedFahrenheittemperature);
        Quantity unit2 = new Quantity(Unit.fahrenheit.getBaseUnit(), 212);
        Assert.assertNotEquals(unit1, unit2);
    }

    @Test
    public void given212FahrenheitAnd100Celsius_ShouldReturnEqualTemperature() {
        double convertedFahrenheittemperature = Quantity.temperatureConversion(100);
        Quantity temp1 = new Quantity(Unit.celsius.getBaseUnit(), convertedFahrenheittemperature);
        Quantity temp2 = new Quantity(Unit.fahrenheit.getBaseUnit(), 212);
        Assert.assertEquals(temp1, temp2);
    }
}
