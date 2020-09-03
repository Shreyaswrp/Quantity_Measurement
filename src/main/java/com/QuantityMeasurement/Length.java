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
    public boolean equals(Object o){
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0;
    }
}
