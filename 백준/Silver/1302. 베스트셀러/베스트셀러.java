import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		String book;
		try {
			int number = Integer.parseInt(reader.readLine());
			for (int i = 0; i < number; i++) {
				book = reader.readLine();
				if (treeMap.containsKey(book)) {
					treeMap.replace(book, treeMap.get(book)+1);
				} else {
					treeMap.put(book, 1);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> set = treeMap.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		int maxValue = 0;
		String answer = "";
		while (it.hasNext()) {
			Entry<String, Integer> entry = (Entry<String, Integer>) it.next();
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				answer = entry.getKey();
			}
		}
		
		System.out.println(answer);

	} // main
	
} // class