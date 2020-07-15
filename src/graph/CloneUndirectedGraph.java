package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneUndirectedGraph {

    private static HashMap<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        return clone(node);
    }

    public static Node clone(Node node){
        if (node == null) return null;

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        Node clone = new Node(node.val);
        map.put(clone.val, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(clone(neighbor));
        }
        return clone;
    }

    public static void main(String args[]){

    }
}
