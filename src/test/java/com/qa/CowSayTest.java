package com.qa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CowSayTest {

    @Test
    public void testCowSayBasic() {
        String result = CowSay.cowSay("Hello, World!");
        String expected = " _______\n< Hello, World! >\n ---------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     ||";
        assertEquals(expected, result);
    }

    @Test
    public void testCowSayEmptyMessage() {
        String result = CowSay.cowSay("");
        String expected = " _______\n<  >\n ---------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     ||";
        assertEquals(expected, result);
    }

    @Test
    public void testCowSayLongMessage() {
        String longMessage = "This is a really long message to see how the cow handles it when the text is too long.";
        String result = CowSay.cowSay(longMessage);
        String expected = " _______\n< This is a really long message to see how the cow handles it when the text is too long. >\n ---------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     ||";
        assertEquals(expected, result);
    }

    @Test
    public void testCowSaySpecialCharacters() {
        String result = CowSay.cowSay("Cowsay with special chars: !@#$%^&*()");
        String expected = " _______\n< Cowsay with special chars: !@#$%^&*() >\n ---------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     ||";
        assertEquals(expected, result);
    }

    @Test
    public void testCowSayMultilineMessage() {
        String multilineMessage = "Hello,\nWorld!";
        String result = CowSay.cowSay(multilineMessage);
        String expected = " _______\n< Hello,\n World! >\n ---------\n        \\   ^__^\n         \\  (oo)\\_______\n            (__)\\       )\\/\\\n                ||----w |\n                ||     ||";
        assertEquals(expected, result);
    }
}