package q1_c_pangramchecker;

public class Pan_Checker {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = isPangram(sentence);

        if (isPangram) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {

        boolean[] letters = new boolean[26];


        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);


            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                letters[index] = true;
            }
        }


        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
