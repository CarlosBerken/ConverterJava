
package com.example.projectconverter;
public class MeasurementConverter {

    public static double convert(double value, String fromUnit, String toUnit) {
        switch (fromUnit) {
            case "km":
                return convertFromKilometers(value, toUnit);
            case "m":
                return convertFromMeters(value, toUnit);
            case "cm":
                return convertFromCentimeters(value, toUnit);
            case "in":
                return convertFromInches(value, toUnit);
            case "ft":
                return convertFromFeet(value, toUnit);
            default:
                throw new IllegalArgumentException("Invalid unit");
        }
    }

    private static double convertFromKilometers(double value, String toUnit) {
        switch (toUnit) {
            case "km":
                return value;
            case "m":
                return value * 1000;
            case "cm":
                return value * 100000;
            case "in":
                return value * 39370.1;
            case "ft":
                return value * 3280.84;
            default:
                throw new IllegalArgumentException("Invalid unit");
        }
    }

    private static double convertFromMeters(double value, String toUnit) {
        switch (toUnit) {
            case "km":
                return value / 1000;
            case "m":
                return value;
            case "cm":
                return value * 100;
            case "in":
                return value * 39.3701;
            case "ft":
                return value * 3.28084;
            default:
                throw new IllegalArgumentException("Invalid unit");
        }
    }

    private static double convertFromCentimeters(double value, String toUnit) {
        switch (toUnit) {
            case "km":
                return value / 100000;
            case "m":
                return value / 100;
            case "cm":
                return value;
            case "in":
                return value / 2.54;
            case "ft":
                return value / 30.48;
            default:
                throw new IllegalArgumentException("Invalid unit");
        }
    }

    private static double convertFromInches(double value, String toUnit) {
        switch (toUnit) {
            case "km":
                return value / 39370.1;
            case "m":
                return value / 39.3701;
            case "cm":
                return value * 2.54;
            case "in":
                return value;
            case "ft":
                return value / 12;
            default:
                throw new IllegalArgumentException("Invalid unit");
        }
    }

    private static double convertFromFeet(double value, String toUnit) {
        switch (toUnit) {
            case "km":
                return value / 3280.84;
            case "m":
                return value / 3.28084;
            case "cm":
                return value * 30.48;
            case "in":
                return value * 12;
            case "ft":
                return value;
            default:
                throw new IllegalArgumentException("Invalid unit");
        }
    }
}
