package com.QuantityMeasurement.com.QuantityMeasurement;

import com.QuantityMeasurement.Quantity;

public enum Unit {

    inch(1),
    feet(12),
    yard(36),
    cm(0.4),
    ml(0.001),
    liter(1),
    gallon(3.78),
    kg(1),
    gram(0.001),
    tonne(1000),
    celsius(1),
    fahrenheit(1);

    private final double BASE_UNIT;

    Unit(double baseUnit) {
        this.BASE_UNIT = baseUnit;
    }

    public double getBaseUnit() {
        return BASE_UNIT;
    }
}
