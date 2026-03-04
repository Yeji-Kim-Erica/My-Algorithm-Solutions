import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        String number = n + "";
        String[] numbers = number.split("");
        Arrays.sort(numbers, Collections.reverseOrder());
        number = String.join("", numbers);
        return Long.parseLong(number);
    }
}
