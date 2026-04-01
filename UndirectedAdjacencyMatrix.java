//create a undirected graph of n vertices using adjacency matrix 
//input edges store data and print the graph(adjacency matrix)
import java.util.*;

class UndirectedAdjacencyMatrix {

    int n;
    int[][] matrix;

    // Constructor
    UndirectedAdjacencyMatrix(int n) {
        this.n = n;
        matrix = new int[n][n];
    }

    // Add edge
    void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1; // undirected
    }

    // Print matrix
    void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input vertices
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        UndirectedAdjacencyMatrix g = new UndirectedAdjacencyMatrix(n);

        // Input edges
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v):");

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdge(u, v);
        }

        // Print result
        System.out.println("Adjacency Matrix:");
        g.printMatrix();
    }
}