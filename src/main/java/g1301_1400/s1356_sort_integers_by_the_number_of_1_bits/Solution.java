package g1301_1400.s1356_sort_integers_by_the_number_of_1_bits;

// #Easy #Array #Sorting #Bit_Manipulation #Counting
// #Programming_Skills_I_Day_11_Containers_&_Libraries
// #2022_03_21_Time_10_ms_(65.50%)_Space_46.2_MB_(40.10%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int num : arr) {
            int count = Integer.bitCount(num);
            if (!map.containsKey(count)) {
                map.put(count, new ArrayList<>());
            }
            map.get(count).add(num);
        }
        int[] result = new int[arr.length];
        int i = 0;
        for (int count : map.keySet()) {
            List<Integer> list = map.get(count);
            Collections.sort(list);
            for (int num : list) {
                result[i++] = num;
            }
        }
        return result;
    }
}
