public class Excite {
    public static void main(String[] args) {
        // variable to accept words
        String allWords = String.join("-", args);
        int indexStart = allWords.lastIndexOf("-");
        String finalChars = allWords.substring(indexStart + 1);
        String triple = finalChars + finalChars + finalChars;
        String excitedWords = allWords.toUpperCase().substring(0, indexStart) + triple;
        System.out.println(excitedWords);       
    }
}


// input:  some words
// output: SOME WORDS!!!

// java Excite some words <Enter>

// input:  some words !
// output: SOME-WORDS!!!

// input:  other words this time ?
// output: OTHER-WORDS-THIS-TIME???