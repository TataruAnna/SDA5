import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    //You're given strings jewels representing the types of stones that are jewels,
    // and stones representing the stones you have. Each character in stones is a type of stone you have.
    // You want to know how many of the stones you have are also jewels.

    //Letters are case sensitive, so "a" is considered a different type of stone from "A".
    //
    //Example 1:
    //
    //Input: jewels = "aAcdddddeeeee", stones = "aAAbbbb" Output: 3 Example 2:
    //
    //Input: jewels = "z", stones = "ZZ" Output: 0
    public static void main(String[] args) {

    }
    public static int getNumberOfJewels(String jewels, String stones){
        int numberOfJewels = 0;

        Set<Character> jewelsSet = new HashSet<>();
        for (int i = 0; i <jewels.length() ; i++) {
            jewelsSet.add(jewels.charAt(i));
        }
        for (int i = 0; i <stones.length() ; i++) {
            if(jewelsSet.contains(stones.charAt(i))){
                numberOfJewels++;
            }
        }
        return numberOfJewels;
    }
}
