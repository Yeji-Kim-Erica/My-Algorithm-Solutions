import java.util.*;
import java.util.Map.Entry;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // 정수 입력 받기
        int numOfNumbers = Integer.parseInt(reader.readLine());
        int[] numberArr = new int[numOfNumbers];
        Map<Integer, Integer> frequencyOfNumbers = new HashMap<Integer, Integer>();
        int sum = 0;
        for (int i = 0; i < numberArr.length; i++) {
        	int number = Integer.parseInt(reader.readLine());
        	numberArr[i] = number;
        	frequencyOfNumbers.put(number, frequencyOfNumbers.getOrDefault(number, 0)+1);
        	sum += number;
		}
        
        // 1. 산술평균
        int average = (int) Math.round(sum / (double) numOfNumbers);
        System.out.println(average);
        
        // 2. 중앙값
        Arrays.sort(numberArr);
        int median = numberArr[numOfNumbers/2];
        System.out.println(median);
        
        // 3. 최빈값
        int maxFrequency = Collections.max(frequencyOfNumbers.values()).intValue();
        
        List<Integer> modes = new ArrayList<>();
        for (Entry<Integer, Integer> entry : frequencyOfNumbers.entrySet()) {
        	if (entry.getValue() >= maxFrequency) {
				modes.add(entry.getKey());
			}
		}
        
        if (modes.size() > 1) {
        	Collections.sort(modes);
        	System.out.println(modes.get(1));
		} else {
			System.out.println(modes.get(0));
		}
        
        // 4. 범위
        int range = numberArr[numOfNumbers-1] - numberArr[0];
        System.out.println(range);
        
    }
}