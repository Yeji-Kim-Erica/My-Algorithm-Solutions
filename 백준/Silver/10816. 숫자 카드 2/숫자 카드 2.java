import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // 숫자 카드의 숫자값, 카드 개수 저장
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            map.put(card, map.getOrDefault(card, 0) + 1);
        }
        
        // 주어진 m개의 정수 저장
        int m = Integer.parseInt(reader.readLine());
        st = new StringTokenizer(reader.readLine());
        
        // 주어진 m개의 정수에 대한 카드 개수 탐색
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            answer.append(map.getOrDefault(target, 0)).append(" ");
        }
        
        System.out.println(answer.toString());
        
    } // main
    
} // class
