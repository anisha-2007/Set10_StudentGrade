package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testGradeA() {
        assertEquals("A", App.calculateGrade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", App.calculateGrade(85));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", App.calculateGrade(75));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", App.calculateGrade(40));
    }

    @Test
    public void testZeroMarks() {
        assertEquals("F", App.calculateGrade(0));
    }

    @Test
    public void testInvalidMarks() {
        try {
            App.calculateGrade(101);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Marks must be between 0 and 100",
                    e.getMessage());
        }
    }
}