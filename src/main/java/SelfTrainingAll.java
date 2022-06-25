import java.util.ArrayList;

public class SelfTrainingAll { public static void main(String[] args) {
    // SelfTrainingAll arrays = new SelfTrainingAll();
    // arrays.arrayComparator(new String[]{"cat", "blue", "skt", "umbrella", "paddy"});
    // SelfTrainingAll bool = new SelfTrainingAll();
    // System.out.println(bool.hasConsecutiveIdenticalLetters("loop"));
    // SelfTrainingAll shuffle = new SelfTrainingAll();
    //shuffle.Shuffle("Donald Trump");
    // SelfTrainingAll score = new SelfTrainingAll();
    //score.calculateScore("ABBACCCCCAC");
    SelfTrainingAll score2 = new SelfTrainingAll();
    score2.calculateScore2("ABBACCCCCAC");

}

    public void arrayComparator(String[] UserTYPE) {
//        for (int i=0;i<UserTYPE.length;i++){
//    System.out.println(UserTYPE[i]);}

        String[] correctArray = {"cat", "blue", "sky", "umbrella", "paddy"};

        for (int i = 0; i < UserTYPE.length; i++) {
            if (UserTYPE[i].equals(correctArray[i])) {
                System.out.println("1");
            } else {
                System.out.println("-1");
            }
        }

    }

    //===============================================================================================

    public boolean hasConsecutiveIdenticalLetters(String word) {
        System.out.println("The input word is " + word);

        char[] wordToArray = word.toCharArray();

        for (int i = 1; i < wordToArray.length; i++) {
            System.out.print(wordToArray[i] + " ");

            if (wordToArray[i - 1] == wordToArray[i]) {
                return true;
            }

        }
        return false;


    }

    //====================================================================================================
    public void Shuffle(String names) {
        String[] name = names.split("\\s");
        String shuffleRes = name[1] + " " + name[0];
        System.out.println(shuffleRes);
    }

    //====================================================================================================
    public void calculateScore(String Score) {
        System.out.println(Score);
        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;

        for (int i = 0; i < Score.length(); i++) {
            String letter = String.valueOf(Score.charAt(i));

            if (letter.equals("A")) {
                aCounter++;

            } else if (letter.equals("B")) {
                bCounter++;


            } else if (letter.equals("C")) {
                cCounter++;

            }

        }
        System.out.println("Score is: " + aCounter + bCounter + cCounter);

    }
//=========================================================================================

    public void calculateScore2(String Score) {
        System.out.println(Score);
        ArrayList<Integer> aCounter = new ArrayList<Integer>();
        ArrayList<Integer> bCounter = new ArrayList<Integer>();
        ArrayList<Integer> cCounter = new ArrayList<Integer>();

        for (int i = 0; i < Score.length(); i++) {
            String letter = String.valueOf(Score.charAt(i));

            if (letter.equals("A")) {
                aCounter.add(1);

            } else if (letter.equals("B")) {
                bCounter.add(1);


            } else if (letter.equals("C")) {
                cCounter.add(1);

            }

        }
        // System.out.println("Score is: " + aCounter.size() + bCounter.size() + cCounter.size());
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(aCounter.size());
        result.add(bCounter.size());
        result.add(cCounter.size());
        System.out.println("Score is: " + result);
    }
}








