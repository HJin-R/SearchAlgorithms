# Search Algorithms

## Uninformed (Blind) Search 

### Breadth-First Search (BFS)
Breadth-First Search is a graph traversal algorithm that explores all the vertices of a graph level by level, starting from a given source node. <br/>
It uses a FIFO queue data structure to keep track of nodes to be explored.

Steps:<br/>
Initialize a queue and enqueue the starting node.<br/>
Mark the starting node as visited.<br/>
While the queue is not empty, dequeue a node from the front of the queue.
For each of its unvisited neighbors <br/>
Mark the neighbor as visited.<br/>
Enqueue (pop) the neighbor.<br/>
Repeat until all reachable nodes are visited.<br/>


BFS guarantees finding the shortest path in an unweighted graph where all actions have the same cost.<br/>
It processes all neighbors of a node before moving to the next level.
Applications:
Shortest path in unweighted graphs.
Finding connected components in a graph.
Solving puzzles (like finding the shortest sequence of moves).

Complexity for graph search<br/>
Time: 𝑂(𝑉+𝐸), where V is the number of vertices and E is the number of edges.
This accounts for visiting all vertices and exploring all edges once.<br/>
Space: O(V), due to the queue storing up to V vertices in the worst case.

Complexity for tree search<br/>
Time: O(b<sup>d</sup>), where b is the branching factor and d is depth of the tree <br/>
Space: O(b<sup>d</sup>)
