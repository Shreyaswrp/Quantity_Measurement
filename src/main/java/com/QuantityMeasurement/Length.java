package com.QuantityMeasurement;

import com.QuantityMeasurement.com.QuantityMeasurement.Unit;

public class Length {

    private final double value;
    private final Unit unit;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object that){
        if (this == that) return true;
        if ( that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 && this.unit == length.unit;
    }
}
