package shortestPath;

import minCostExpansionTree.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class BellmanFord {

    private Node[] nodes;
    private int size;

    public BellmanFord(Node[] nodes, int size) {
        this.nodes = nodes;
        this.size = size;
    }

    public int[] bellmanFord(int start) {
        int[] distance = new int[size + 1];
        for (int i = 1; i < distance.length; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[start] = 0;

        boolean isCycle = false;
        for (int i = 0; i <= size+1; i++) {
            System.out.println("[" + i + "] = " + i);
            for (int j = 0; j < nodes.length; j++) {
                System.out.println("getS() =" + nodes[j].getS() + "," + "getE() =" + nodes[j].getE());
                if (distance[nodes[j].getS()] != Integer.MAX_VALUE && distance[nodes[j].getE()] > distance[nodes[j].getS()] + nodes[j].getV()) {
                    distance[nodes[j].getE()] = distance[nodes[j].getS()] + nodes[j].getV();
                    if (i == nodes.length) {
                        isCycle = true;
                    }
                }
            }
            System.out.println(Arrays.toString(distance));
        }

        if (isCycle) {
            return null;
        } else {
            return distance;
        }
    }
}