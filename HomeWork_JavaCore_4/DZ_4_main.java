package HomeWork_JavaCore_4;

import java.util.HashMap;

public class DZ_4_main {

    public static void main(String[] args) {

        String[] words = {"America", "Russia", "Germany", "France", "France",
                "Spain", "Britain", "America", "Greece", "Russia", "Finland", "Canada"};

        HashMap<String, Integer> arrayWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (arrayWords.containsKey(words[i])) {
                arrayWords.put(words[i], arrayWords.get(words[i]) + 1);
            } else {
                arrayWords.put(words[i], 1);
            }
        }
        System.out.println(arrayWords);
    }
}
