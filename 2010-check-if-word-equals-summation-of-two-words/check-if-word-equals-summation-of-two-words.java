class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        // Intuition: turn each word into a digit string, then parse it as a number
        return getValue(firstWord) + getValue(secondWord) == getValue(targetWord);
    }

    public int getValue(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(c - 'a');
        }
        return Integer.parseInt(sb.toString());
    }
}