
import java.io.*;
import java.util.*;

// Calculate  
public class CharFrequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String s1 = br.readLine();
        Map<Character, Integer> freq = new HashMap();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> en : freq.entrySet()) {
            System.out.println("'" + en.getKey() + "': " + en.getValue());
        }
    }
}
