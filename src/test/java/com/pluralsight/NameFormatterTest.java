package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {
    String prefix = "Dr";
    String firstName = "Mel";
    String middleName = "B";
    String lastName = "Johnson";
    String suffix = "PhD";

    @Test
    public void format_PrintFullName_AllFieldsGiven() {
        // arrange
        // all the fields

        // act
        String fullName = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // assert
        assertEquals("Johnson, Dr. Mel B, PhD", fullName);
    }
}