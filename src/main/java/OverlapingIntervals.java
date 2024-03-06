import java.util.*;

public class OverlapingIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals1));  // Output: 1

        int[][] intervals2 = {{1,2},{1,2},{1,2}};
        System.out.println(eraseOverlapIntervals(intervals2));  // Output: 2

        int[][] intervals3 = {{1,2},{2,3}};
        System.out.println(eraseOverlapIntervals(intervals3));

    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort intervals based on end times
        //Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1])); -> nu merge
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i][1] > intervals[j][1]) {
                    // Swap intervals if the end time of the first interval is greater than the second
                    int[] temp = intervals[i];
                    intervals[i] = intervals[j];
                    intervals[j] = temp;
                }
            }
        }

        int count = 0;  // Count of intervals to be removed
        int endTime = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < endTime) {
                // Overlapping interval found, remove it
                count++;
            } else {
                // Non-overlapping interval, update end time
                endTime = intervals[i][1];
            }
        }

        return count;
    }

}
