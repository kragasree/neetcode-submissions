class WordDictionary {

    List<String> words;

    public WordDictionary() {
        words = new ArrayList<>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public boolean search(String word) {
        for (String currWord : words) {
            if (currWord.length() != word.length())
                continue;
            boolean match = true;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == '.')
                    continue;
                if (word.charAt(i) != currWord.charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return true;
            } 
        }
        return false;
    }
}
