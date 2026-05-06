package com.pluralsight;

public class StaticClasses {
    public static void main(String[] args) {

        String prefix = "Dr";
        String firstName = "Mel";
        String middleName = "B";
        String lastName = "Johnson";
        String suffix = "PhD";

        String name = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        System.out.println(name);
    }
}
