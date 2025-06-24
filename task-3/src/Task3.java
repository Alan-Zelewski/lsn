import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Insert number of pairs:");
            int n = Integer.parseInt(reader.readLine());
            Map<Integer, List<Integer>> graph = new HashMap<>();
            Set<Integer> nodes = new HashSet<>();

            System.out.println("Insert pairs of nodes line by line:");
            for(int i = 0; i < n; i++){
                String[] inputArray = reader.readLine().trim().split("\\s+");
                int a = Integer.parseInt(inputArray[0]);
                int b = Integer.parseInt(inputArray[1]);

                nodes.add(a);
                nodes.add(b);

                graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
                graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
            }

            Set<Integer> visited = new HashSet<>();
            int components = 0;

            for(int node : nodes){
                if(!visited.contains(node)){
                    dfs(node, graph, visited);
                    components++;
//                    printComponent(component);
                }
            }

            System.out.println(components);

        }catch (IOException | NumberFormatException e) {
            System.out.println("An exception occurred: " + e);
        }
    }

    private static void dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            int current = stack.pop();
            if(!visited.contains(current)){
                visited.add(current);
                for(Integer neighbor : graph.get(current)){
                    if(!visited.contains(neighbor)){
                        stack.push(neighbor);
                    }
                }
            }
        }
    }
//    private static void printComponent(List<Integer> component) {
//        Collections.sort(component);
//        for (int i = 0; i < component.size(); i++) {
//            System.out.print("[" + component.get(i) + "]");
//            if (i < component.size() - 1) {
//                System.out.print("-");
//            }
//        }
//        System.out.println();
//    }
}