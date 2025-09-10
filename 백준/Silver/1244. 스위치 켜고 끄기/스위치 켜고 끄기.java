import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());
        // 1번 인덱스부터 사용하기 위해 n+1 크기로 생성
        boolean[] switches = new boolean[n + 1]; 
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i <= n; i++) {
            switches[i] = st.nextToken().equals("1");
        }
        
        int studentCount = Integer.parseInt(reader.readLine());
        for (int i = 0; i < studentCount; i++) {
            st = new StringTokenizer(reader.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            
            if (gender == 1) { // 남학생
                for (int j = num; j <= n; j += num) {
                    switches[j] = !switches[j];
                }
            } else { // 여학생
                switches[num] = !switches[num]; // 중심 스위치 먼저 변경
                int d = 1;
                while (num - d >= 1 && num + d <= n) {
                    if (switches[num - d] == switches[num + d]) {
                        switches[num - d] = !switches[num - d];
                        switches[num + d] = !switches[num + d];
                        d++;
                    } else {
                        break; // 대칭이 깨지면 중단
                    }
                }
            }
        }
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(switches[i] ? "1" : "0").append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }
        System.out.println(sb.toString().trim());
    }
}