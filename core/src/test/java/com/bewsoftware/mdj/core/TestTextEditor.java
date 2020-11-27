package com.bewsoftware.mdj.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTextEditor {

    @Test
    public void testDetabify() {
        assertEquals("    ", new TextEditor("\t").detabify().toString());
        assertEquals("    ", new TextEditor(" \t").detabify().toString());
        assertEquals("    ", new TextEditor("  \t").detabify().toString());
        assertEquals("    ", new TextEditor("   \t").detabify().toString());
        assertEquals("        ", new TextEditor("    \t").detabify().toString());
        assertEquals("     ", new TextEditor("\t ").detabify().toString());
        assertEquals("        ", new TextEditor("\t \t").detabify().toString());
    }
}
