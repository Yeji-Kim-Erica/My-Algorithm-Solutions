import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // 스위치 상태 저장
        int switchNum = Integer.parseInt(reader.readLine());
        boolean[] switchArr = new boolean[switchNum+1]; // 스위치 번호에 매번 1 빼서 혼란 생기는 걸 막기 위해
        StringTokenizer st = new StringTokenizer(reader.readLine());
        for (int i = 1; i < switchArr.length; i++) { // 스위치 개수가 고정되어 있으므로 for문
			switchArr[i] = st.nextToken().equals("1"); // 1이면 true, 0이면 false
		}
        
        // 학생
        int studentNum = Integer.parseInt(reader.readLine());
        for (int i = 0; i < studentNum; i++) { // 학생 수가 고정되어 있으므로 for문
        	st = new StringTokenizer(reader.readLine());
        	String gender = st.nextToken();
        	int givenNum = Integer.parseInt(st.nextToken());
        	if (gender.equals("1")) { // 남자일 경우
        		for (int j = givenNum; j < switchArr.length; j+=givenNum) {
					switchArr[j] = !switchArr[j];
				}
			} else if (gender.equals("2")) { // 여자일 경우
				int rightDistance = Math.min(switchArr.length - 1, givenNum*2) - givenNum;
				int leftDistance = givenNum - Math.max(1, givenNum - rightDistance);
				int distance = Math.min(rightDistance, leftDistance);
				for (int j = 1; j <= distance; j++) {
					if (switchArr[givenNum + j] == switchArr[givenNum - j]) {
						switchArr[givenNum + j] = !switchArr[givenNum + j];
						switchArr[givenNum - j] = !switchArr[givenNum - j];
					} else {
						break;
					}
				}
				switchArr[givenNum] = !switchArr[givenNum];
			}
        }
        
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < switchArr.length; i++) {
			if (switchArr[i]) {
				sb.append("1 ");
			} else {
				sb.append("0 ");
			}
			if (i%20==0) {
				System.out.println(sb.toString().trim());
				sb = new StringBuffer();
			}
		}
        if (sb.length() > 0) {
        	System.out.println(sb.toString().trim());
		}
    }
}