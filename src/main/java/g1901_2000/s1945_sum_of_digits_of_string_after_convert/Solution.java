package g1901_2000.s1945_sum_of_digits_of_string_after_convert;

// #Easy #String #Simulation #2022_05_18_Time_2_ms_(72.10%)_Space_43.2_MB_(31.43%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int getLucky(String s, int k) {
        List<Integer> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c - 'a' + 1);
        }
        int sum = 0;
        for (int i : list) {
            if (i >= 10) {
                sum += i / 10;
            }
            sum += i % 10;
        }
        while (k-- > 1) {
            int newSum = 0;
            while (sum != 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;
        }
        return sum;
    }
}
