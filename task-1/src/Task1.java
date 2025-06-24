import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Insert input numbers in line:");
            String inputString = reader.readLine();
            if(inputString == null || inputString.trim().isEmpty()){
                System.out.println("Empty input");
                return;
            }
            String[] inputArray = inputString.split("\\s+");
            Set<Integer> input = new TreeSet<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(String number : inputArray){
                int value = Integer.parseInt(number);
                input.add(value);
                if(value < min) min = value;
                if(value > max) max = value;
            }

            for(Integer number : input){
                System.out.print(number + " ");
            }
            System.out.println();
            System.out.println("count: " + inputArray.length);
            System.out.println("distinct: " + input.size());
            System.out.println("min: " + min);
            System.out.println("max: " + max);
        }catch (IOException | NumberFormatException e){
            System.out.println("An exception occurred: " + e);
        }
    }
}