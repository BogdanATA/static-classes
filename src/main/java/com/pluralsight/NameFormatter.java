package com.pluralsight;

public class NameFormatter {
    private String prefix;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    private NameFormatter() {}


    public static String format(String firstName, String lastName) {
        return format("", firstName, "", lastName, "");
    }

    public static String format(String prefix, String firstName, String middleName,
                                String lastName, String suffix) {
        String formattedName = lastName + ", ";

        if (!prefix.isBlank()) {
            formattedName += prefix + ". ";
        }

        formattedName += firstName + " ";

        if (!middleName.isBlank()) {
            formattedName += middleName;
        }

        if (!suffix.isBlank()) {
            formattedName += ", " + suffix;
        }

        return formattedName;
    }


}
