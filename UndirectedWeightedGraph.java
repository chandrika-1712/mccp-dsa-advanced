import java.util.*;

class UndirectedWeightedGraph {

    int n;
    int[][] matrix;

    // Constructor
    UndirectedWeightedGraph(int n) {
        this.n = n;
        matrix = new int[n][n];

        // Initialize with -1 (no edge)
        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], -1);
        }
    }

    // Add edge with weight
    void addEdge(int u, int v, int w) {
        matrix[u][v] = w;
        matrix[v][u] = w; // undirected
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

        UndirectedWeightedGraph g = new UndirectedWeightedGraph(n);

        // Input edges
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v weight):");

        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            g.addEdge(u, v, w);
        }

        // Print matrix
        System.out.println("Adjacency Matrix:");
        g.printMatrix();
    }
}