package com.snow.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestBFS {

    // Strings hold all states - represented as integer in the program
    public static void main(String[] args) {

        // Create new nodes
        BFSNode one = new BFSNode(1);
        BFSNode two = new BFSNode(2);
        BFSNode three = new BFSNode(3);
        BFSNode four = new BFSNode(4);
        BFSNode five = new BFSNode(5);
        BFSNode six = new BFSNode(6);
        BFSNode seven = new BFSNode(7);
        BFSNode eight = new BFSNode(8);

        // Add neighbours on each node
        one.addNeighbours(one);
        one.addNeighbours(two);
        one.addNeighbours(three);

        two.addNeighbours(two);
        two.addNeighbours(one);
        two.addNeighbours(six);

        three.addNeighbours(three);
        three.addNeighbours(four);

        four.addNeighbours(three);
        four.addNeighbours(four);
        four.addNeighbours(eight);

        five.addNeighbours(five);
        five.addNeighbours(six);
        five.addNeighbours(seven);

        six.addNeighbours(six);
        six.addNeighbours(five);

        seven.addNeighbours(seven);
        seven.addNeighbours(eight);

        eight.addNeighbours(eight);
        eight.addNeighbours(seven);

        // Start BFS
        System.out.println("BFS starts from the node " + one.getNode());
        traverseNeighbours(one);

    }
    // BFS traversal method
    static void traverseNeighbours(BFSNode startNode){

        LinkedList<BFSNode> queue = new LinkedList<>(); // holds all nodes to traverse
        BFSNode currentNode = startNode;
        queue.add(currentNode);

        while(!queue.isEmpty()){
            // remove the current first node from the queue
            currentNode = queue.poll();
            currentNode.setVisited(); // set to 1
            // print out the recently removed node
            System.out.println(currentNode);
            // explore all neighbours
            for (BFSNode nextNode : currentNode.getNeighbours()) {
                if (nextNode.isVisited() == 0) { //add unvisited nodes to the queue
                    nextNode.setVisited();
                    queue.add(nextNode);
                }
            }
        }
    }
}

class BFSNode {

    private int node;
    private List<BFSNode> neighbours;
    private int visited;

    public BFSNode(int node) {
        this.node = node;  //node number
        this.neighbours = new ArrayList<>(); //neighbouring nodes
        this.visited = 0; // unvisited
    }

    public void addNeighbours(BFSNode node){
        this.neighbours.add(node);
    }
    public int getNode() {
        return node;
    }

    public int isVisited() {
        return visited;
    }

    public void setVisited() {
        this.visited = 1; //change to 1 if visited
    }

    public List<BFSNode> getNeighbours() {
        return this.neighbours;
    }

    @Override
    public String toString() {
        return "Node : " + this.getNode();
    }

}
