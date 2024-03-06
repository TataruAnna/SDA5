import java.util.Arrays;

public class ContentChildren {
    public static void main(String[] args) {
        // Example 1
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println("Example 1: " + countContentChildren(g1, s1)); // Output: 1

        // Example 2
        int[] g2 = {1, 2};
        int[] s2 = {1, 1,1};
        System.out.println("Example 2: " + countContentChildren(g2, s2)); // Output: 2

    }
    public static int countContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;

        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] >= g[i]) {
                    count++;
                    //s[j] = -1;
                    break;
                }
            }
        }

        return count;
    }
}
