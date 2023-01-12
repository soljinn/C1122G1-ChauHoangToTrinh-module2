package ss11_stack_queue.bai_tap.count_occurrences_of_word;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountOccurrencesOfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String string = scanner.nextLine();

        String[] strings = string.trim().toLowerCase().split(" ");

        Map<String, Integer> map = new TreeMap<>();
        for (String key : strings) {
            if (map.containsKey(key)) {
                map.replace(key, map.get(key) + 1);
                // replace để thay thế tất cả cá ký tự hoặc chuỗi thành ký tự hoặc chuỗi mới
            } else {
                map.put(key, 1);
            }
        }
        System.out.println(map);

        Set<String> stringSet = map.keySet();
        System.out.println("List word");
        for (String key : stringSet) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
