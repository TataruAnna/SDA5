import java.util.ArrayList;
import java.util.List;

public class Flip {
//    You are playing the following Flip Game with your friend: Given a string that contains only two characters: + and -,
//    you can flip two consecutive "++" into "--", you can only flip one time. Please find all strings that can be obtained after one flip.
//    Write a program to find all possible states of the string after one valid move.
//
//   Example Example1
//    Input: s = "++++" Output: [ "--++", "+--+", "++--" ]
//    Example2
//    Input: s = "---+++-+++-+" Output: [ "---+++-+---+", "---+++---+-+", "---+---+++-+", "-----+-+++-+" ]
    public static void main(String[] args) {
        //parcurg lista de elemente, litera cu litera
         //verific daca la pozitia i este + si la i=1 tot + si imi construiesc rezultatul
        //adaug rezultatul gasit la lista
        String input = "---+++-+++-+";
        System.out.println("input"+input);
        List<String> flipList = result(input);
        for (int i = 0; i <flipList.size() ; i++) {
            System.out.println(flipList.get(i));

        }



    }
    public static List<String> result (String input){
        List<String> resulList = new ArrayList<>();
        String output = "";
        for(int i =0;i<input.length()-1;i++){
            if(input.charAt(i)=='+'&& input.charAt(i+1)=='+'){
                output = input.substring(0,i)+ "--"+ input.substring(i+2);
                resulList.add(output);
            }
        }
        return resulList;
    }
}
