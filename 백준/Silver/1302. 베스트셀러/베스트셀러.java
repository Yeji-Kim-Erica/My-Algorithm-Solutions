import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Key(책 제목)가 자동으로 사전순 정렬되는 TreeMap 사용
        TreeMap<String, Integer> sales = new TreeMap<>();
        
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String book = reader.readLine();
            // getOrDefault를 사용해 간결하게 판매량 집계
            sales.put(book, sales.getOrDefault(book, 0) + 1);
        }
        
        int maxValue = 0;
        String answer = "";
        
        // for-each 구문으로 깔끔하게 순회
        // TreeMap이므로 entry는 이미 책 제목의 사전순으로 정렬된 상태
        for (Entry<String, Integer> entry : sales.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                answer = entry.getKey();
            }
        }
        
        System.out.println(answer);
        
    } // main
    
} // class
