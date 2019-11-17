package buffer;

import java.io.*;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 练习
 */
public class DemoTest {
    public static void test(String source, String target, String regex) {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(source));
            bufferedWriter = new BufferedWriter(new FileWriter(target));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(regex);
                map.put(arr[0], arr[1]);
            }
            Set<String> set = map.keySet();
            for (String key : set) {
                String newLine = key + "." + map.get(key);
                bufferedWriter.write(newLine);
                bufferedWriter.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

    }
}
