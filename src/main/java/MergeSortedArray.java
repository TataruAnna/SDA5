import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {

    public static void main(String[] args) {
        //1,2,3
        //2,5,6,7
        //output: 1,2,2,3,5,6
        System.out.println(merge(List.of(2,5,6,7), List.of(1,2,3)));
    }

    public static List<Integer> merge (List<Integer> arr1, List<Integer> arr2){
        List<Integer> merged = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i<arr1.size() && j<arr2.size()){
            if(arr1.get(i) <= arr2.get(j)){
                merged.add(arr1.get(i));
                i++;
            } else{
                merged.add(arr2.get(j));
                j++;
            }
        }

        while (i<arr1.size()){
            merged.add(arr1.get(i));
            i++;
        }

        while (j<arr2.size()){
            merged.add(arr2.get(j));
            j++;
        }

        return merged;


    }
}
