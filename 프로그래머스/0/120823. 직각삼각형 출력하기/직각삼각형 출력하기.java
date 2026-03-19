import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        for (int i = 1; i <= Integer.parseInt(line); i++) {
            System.out.println("*".repeat(i));
        }
    }
}