package com.QuantityMeasurement;

public class QuantityMeasurement {

    private double UNIT;

    public QuantityMeasurement(double unit) {
        this.UNIT = unit;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if ( o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement quantityMeasurement = (QuantityMeasurement) o;
        return Double.compare(quantityMeasurement.UNIT, UNIT) == 0;
    }
}
