package com.qa;

public class CowSay {

    public static String cowSay(String message) {
        // Split the message into lines (for multiline messages)
        String[] lines = message.split("\n");

        // Find the longest line length to create the box
        int maxLength = 0;
        for (String line : lines) {
            maxLength = Math.max(maxLength, line.length());
        }

        // Create the top border of the box
        StringBuilder result = new StringBuilder();
        result.append(" _______\n");

        // Create the message lines in the box
        for (String line : lines) {
            // Center the text and create the box line
            String paddedLine = String.format("< %-" + maxLength + "s >", line);
            result.append(paddedLine + "\n");
        }

        // Create the bottom border of the box
        result.append(" ---------\n");

        // Add the cow's ASCII art
        result.append("        \\   ^__^\n");
        result.append("         \\  (oo)\\_______\n");
        result.append("            (__)\\       )\\/\\\n");
        result.append("                ||----w |\n");
        result.append("                ||     ||\n");

        return result.toString();
    }
}
