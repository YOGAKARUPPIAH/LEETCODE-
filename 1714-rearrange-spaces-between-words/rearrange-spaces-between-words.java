class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int totalSpaces = 0;
        for (char ch : text.toCharArray()) {
            if (ch == ' ') totalSpaces++;
        }
        int totalWords = words.length;

        if (totalWords == 1) {
            return words[0] + " ".repeat(totalSpaces);
        }

        int spacesInBetween = totalSpaces / (totalWords - 1);
        int spacesAtEnd = totalSpaces % (totalWords - 1);

        String result = String.join(" ".repeat(spacesInBetween), words);
        return result + " ".repeat(spacesAtEnd);
    }
}