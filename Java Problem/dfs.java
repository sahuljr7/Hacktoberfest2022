import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
    }

    public void dfs(int startVertex) {
        boolean[] visited = new boolean[adjacencyList.size()];
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);

        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            if (!visited[currentVertex]) {
                System.out.print(currentVertex + " ");
                visited[currentVertex] = true;

                List<Integer> neighbors = adjacencyList.get(currentVertex);
                if (neighbors != null) {
                    for (int neighbor : neighbors) {
                        if (!visited[neighbor]) {
                            stack.push(neighbor);
                        }
                    }
                }
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.print("Depth-First Traversal (starting from vertex 2): ");
        graph.dfs(2);
    }
}
