import java.util.*;

class HashTag {
    static String[] getTop5(String[] lines) {
        Map<String, Integer> map = new HashMap<>();
        for (String line : lines) {
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.startsWith("#")) {
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        int size = list.size();
        String[] result = new String[size > 5 ? 5 : size]; // size > 5 ? 5 : size == Math.min(size, 5);
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(size - i - 1).getKey() + " " + list.get(size - i - 1).getValue();
        }

        return result;
    }

    public static void main(String[] args) {
        String[] lines = {
                "#java is a #programming language",
                "#java is #platform independent",
                "#java is #simple",
                "#java is #robust",
                "#java is #secure",
                "#java is #architecture neutral",
                "#java is #object-oriented",
                "#java is #interpreted",
                "#java is #high-performance",
                "#java is #distributed",
                "#java is #dynamic",
                "#java is #multithreaded",
                "#java is #multithreaded",
                "#java is #multithreaded",
                "#java is #multithreaded"
        };
        System.out.println(Arrays.toString(getTop5(lines)));
    }
}
