public class GraphDemo {

    static class Edge {
        int start;
        int end;
        Edge(int start, int end) {
            this.start = start;
            this.end = end;
        }
        void display() {
            System.out.println(start + " - " + end);
        }
    }

    int vertex;
    int edges;
    Edge[] edgeList;

    public GraphDemo(int vertex, int edges) {
        this.vertex = vertex;
        this.edges = edges;
        edgeList = new Edge[edges];
    }

    void addEdge(int index, int start, int end) {
        edgeList[index] = new Edge(start, end);
    }

    void displayGraph() {
        for (int i = 0; i < edges; i++) {
            edgeList[i].display();
        }
    }

    public static void main(String[] args) {
        GraphDemo graph = new GraphDemo(5, 8);

        graph.addEdge(0, 1, 2);
        graph.addEdge(1, 1, 3);
        graph.addEdge(2, 1, 4);
        graph.addEdge(3, 2, 4);
        graph.addEdge(4, 2, 5);
        graph.addEdge(5, 3, 4);
        graph.addEdge(6, 3, 5);
        graph.addEdge(7, 4, 5); // Extra edge to make 8

        graph.displayGraph();
    }
}




