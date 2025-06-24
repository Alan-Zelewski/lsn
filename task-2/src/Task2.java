import java.util.*;
import java.io.*;

public class Task2 {

    private static final int TARGET = 13;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Insert input numbers in line:");
            String inputString = reader.readLine();
            if(inputString == null || inputString.trim().isEmpty()) {
                System.out.println("Empty input");
                return;
            }
            String[] inputArray = inputString.split("\\s+");
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            List<int[]> result = new ArrayList<>();
            for(String number : inputArray) {
                int value = Integer.parseInt(number);
                frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
            }
            List<Integer> uniqueNumbers = new ArrayList<>(frequencyMap.keySet());
            uniqueNumbers.sort(Integer::compareTo);
            for(Integer number : uniqueNumbers) {
                int requiredValue = TARGET - number;
                if(requiredValue < number) {
                    continue;
                }

                if(frequencyMap.containsKey(requiredValue)) {
                    for(int i = 0; i < frequencyMap.get(number); i++) {
                        result.add(new int[]{number, requiredValue});
                    }
                }
            }

            result.sort(Comparator.comparingInt((int[] arr) -> arr[0])
                    .thenComparingInt(arr -> arr[1]));

            for (int[] pair : result) {
                System.out.println(pair[0] + " " + pair[1]);
            }

        }catch (IOException | NumberFormatException e) {
            System.out.println("An exception occurred: " + e);
        }
    }
}
