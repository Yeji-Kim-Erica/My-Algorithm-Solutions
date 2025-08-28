import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 카드의 숫자값, 카드 개수 저장
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int n = Integer.parseInt(reader.readLine());
		String[] cards = reader.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			map.put(cards[i], map.getOrDefault(cards[i], 0) + 1);
		}
		
		// 주어진 m개의 정수 저장
		int m = Integer.parseInt(reader.readLine());
		String[] givenNumbers = reader.readLine().split(" ");
		
		// m개의 정수를 숫자값으로 가진 숫자 카드의 개수
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < m; i++) {
			answer.append(" " + map.getOrDefault(givenNumbers[i], 0));
		}
		
		System.out.println(answer.delete(0, 1).toString());

	} // main
	
} // class