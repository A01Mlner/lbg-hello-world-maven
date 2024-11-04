package com.qa;

public class CowSay {

    public static String cowSay(String message) {
        // Handle empty message
        if (message == null || message.trim().isEmpty()) {
            message = "";
        }

        // Split the message into lines (for multiline messages)
        String[] lines = message.split("\n");

        // Find the longest line length to create the box
        int maxLength = 0;
        for (String line : lines) {
            maxLength = Math.max(maxLength, line.length());
        }

        // Add padding
        maxLength += 2; // for space in the box

        // Create the top border of the box
        StringBuilder result = new StringBuilder();
        result.append(" _______\n");

        // Create the message lines in the box
        for (String line : lines) {
            String paddedLine = String.format("< %" + "s >", line);
            result.append(paddedLine + "\n");
        }

        // Create the bottom border of the box
        result.append(" ---------\n");

        // Add the cow's ASCII art
        result.append("        \\   ^__^\n");
        result.append("         \\  (oo)\\_______\n");
        result.append("            (__)\\       )\\/\\\n");
        result.append("                ||----w |\n");
        result.append("                ||     ||");

        return result.toString();
    }
}
