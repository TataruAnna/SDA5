import java.util.*;

public class ArrayIntersection {
    //Given two integer arrays nums1 and nums2, return an array of their intersection.
    // Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
    //Example 1:
    //
    //Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2,2] Example 2:
    //
    //Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [4,9] Explanation: [9,4] is also accepted.
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(getIntersection(nums1,nums2));
        System.out.println(getIntersection2(nums1,nums2));
        System.out.println(findIntersection(nums1,nums2));


    }
    public static ArrayList<Integer> getIntersection(int[] nums1, int[] nums2){
        ArrayList<Integer> result = new ArrayList<>();
        int[] bigArray;
        int[] smallArray;
        //parcurg primul array cu un for si iau fiecare element pe rand
                //parcurg al doilea array si verific la fiecare daca se potriveste cu elementele din nums2 si daca nu cumva se repeta
                        //daca da, atunci imi costruiesc rezultataul si ies din al doilea for
        if(nums1.length>nums2.length){
            bigArray = nums1;
            smallArray = nums2;
        }else{
            bigArray = nums2;
            smallArray= nums1;
        }
        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < smallArray.length; j++) {
                if(bigArray[i]==smallArray[j] && !result.contains(bigArray[i])){
                    result.add(bigArray[i]);
                    break;
                }
            }
        }

        return result;
    }
    public static List<Integer> getIntersection2 (int[] nums1, int[] nums2){
        //am initializat o lista goala pt a salva intersectia
        List<Integer> result = new ArrayList<>();
        //am initializat un index pt a parcurge al doilea array
        //prima oara am facut cu for in for si nu era ok

        //parcurg primul array
        for (int i = 0; i < nums1.length; i++) {
            int j=0;
            //atat timp cat indexul j nu a ajuns la capatul celui de al doilea array
            //si daca un numar din primul array e egal cu un numar din al doilea array
            while (j < nums2.length ) {
                if(nums1[i] == nums2[j] && !result.contains(nums1[i])){
                //il adaug in lista
                result.add(nums1[i]);}
                j++;
            }


        }
        return result;
    }
    public static List<Integer> findIntersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> first = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (first.containsKey(nums1[i])) {
                first.put(nums1[i], first.get(nums1[i]) + 1);
            } else {
                first.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (first.containsKey(nums2[i]) && (first.get(nums2[i]) > 0)) {
                result.add(nums2[i]);
                first.put(nums2[i], first.get(nums2[i]) - 1);
            }
        }
        return result;
    }
}
