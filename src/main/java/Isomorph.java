import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Isomorph {
    public static void main(String[] args) {
        String c1 = "paper";
        String c2 = "titli";
        System.out.println(areIsomorphic(c1,c2));


    }

            public static boolean areIsomorphic(String word1, String word2) {
                // trebuie sa fie de aceasi lungime
                if (word1.length() != word2.length()) {
                    return false;
                }

                Map<Character, Character> charMap = new HashMap<>();


                // parcurg literele cuvantului 1  si cuvantul 2
                   //
                for (int i = 0; i < word1.length(); i++) {
                char currentLetterW1 = word1.charAt(i);
                char currentLetterW2 = word2.charAt(i);
                    // verific daca litera din cuvantul 1 este in prima mapa
                        // daca da, atunci verific valoarea de la cheie sa nu fie diferita de litera din cuvantul 2
                    if (charMap.containsKey(currentLetterW1)) {
                        if(charMap.get(currentLetterW1)!= currentLetterW2){
                            return false;
                        }

                    }else{
                        if (charMap.containsValue(currentLetterW2)){
                            return false;
                        }
                    }
                    charMap.put(currentLetterW1,currentLetterW2);
                }

                // daca nu indeplinesc conditiile , atunci returnez true
                return true;
            }

    }
