import java.util.ArrayList;
import java.util.List;

public class WordDistance {
    //Given a list of words and two words: word1 and word2, return the shortest distance between these two words in the list.
    //Example: Assume that words =["practice", "makes", "perfect", "coding", "makes"].
    // Input: word1 = “coding”, word2 = “practice” Output: 3
    // Input: word1 = "makes", word2 = "coding" Output: 1
    public static void main(String[] args) {

        String[] words = new String[]{"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(wordDistance(words, "coding", "practice"));



    }
    //imi setez distanta minima cu 100, minDist =100
    //parcurg lista
    //verific daca cuvantul din lista este egal cu w1
        //daca da, retin pozitia cuvantului gasit in w1FoundAt
        //daca nu, exceptie
    //verific daca cuvantul din lista este egal cu w2
        //daca da, ii retin pozitia in w2FoundAt
        //daca nu, exceptie
    // fac diferenta dintre pozitia 1 si pozitia 2 si o setez ca min -> algorit de minim

    public static int wordDistance(String[] listOfWords,String w1, String w2){
        int index1 =10000;
        int index2=5000;
        int min =100;

        for(int i =0;i<listOfWords.length;i++){
            if(listOfWords[i].equals(w1)){
                index1 =i;
            }
            if(listOfWords[i].equals(w2)){
                index2 =i;
            }

            if(Math.abs(index1-index2)<min){
                min=Math.abs(index1-index2);
            }
        }
        return min;
    }

}
