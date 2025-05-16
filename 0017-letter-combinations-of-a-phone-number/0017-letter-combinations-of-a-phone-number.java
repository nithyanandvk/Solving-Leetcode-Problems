class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }

        String[] digitToLetters = {
            "abc", "def", "ghi", "jkl", 
            "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> combinations = new ArrayList<>();
        generateCombinations("", digits, digitToLetters, combinations);
        return combinations;
    }

    private void generateCombinations(
        String currentCombination,
        String remainingDigits,
        String[] digitToLetters,
        List<String> combinations
    ) {
        if (remainingDigits.isEmpty()) {
            combinations.add(currentCombination);
        } else {
            char currentDigit = remainingDigits.charAt(0);
            String possibleLetters = digitToLetters[currentDigit - '2'];

            for (char letter : possibleLetters.toCharArray()) {
                generateCombinations(
                    currentCombination + letter,
                    remainingDigits.substring(1),
                    digitToLetters,
                    combinations
                );
            }
        }
    }
}
