package com.QuantityMeasurement;

public class QuantityMeasurement {

    public boolean compareLengths(double lengthInFeet, double lengthInInch) {
        double convertResult = lengthInFeet * 12;
        return convertResult == lengthInInch;
    }
}
