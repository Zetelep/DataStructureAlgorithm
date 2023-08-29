package Graph;

public class GraphTest {
    public static void main(String[] args) {
        //Matrix Adjacency Graph
        GraphMatrix graph = new GraphMatrix(5);
        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        System.out.println(graph.checkEdge(0,1)); //checking is there an edge in A and B

        //List Adjacency Graph
        GraphList graph2 = new GraphList();
        graph2.addNode(new Node('A'));
        graph2.addNode(new Node('B'));
        graph2.addNode(new Node('C'));
        graph2.addNode(new Node('D'));
        graph2.addNode(new Node('E'));

        graph2.addEdge(0,1);
        graph2.addEdge(1,2);
        graph2.addEdge(2,3);
        graph2.addEdge(2,4);
        graph2.addEdge(4,0);
        graph2.addEdge(4,2);
        graph2.print();

    }
}
