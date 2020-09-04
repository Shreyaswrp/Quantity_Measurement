package com.QuantityMeasurement;

import com.QuantityMeasurement.com.QuantityMeasurement.Unit;

public class Quantity {

    private final double value;

    public Quantity(double unit, double value) {
        this.value = unit * value;
    }

    public static double add(Quantity quantity1, Quantity quantity2) {
        return quantity1.value + quantity2.value;
    }

    public static double temperatureConversion(double temperature) {
        return (temperature * 9 / 5) + 32;
    }

    @Override
    public boolean equals(Object that){
        if (this == that) return true;
        if ( that == null || getClass() != that.getClass()) return false;
        Quantity quantity = (Quantity)that;
        return Double.compare(quantity.value,value) == 0 ;
    }
}
