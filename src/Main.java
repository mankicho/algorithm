
import graph.StrongConnection;
import minCostExpansionTree.Node;
import shortestPath.BellmanFord;
import shortestPath.Dijkstra;

import java.util.*;

public class Main {


    static Node[] nodes;
    static private int V;
    static private int E;

    public static void main(String[] args) {
        int[] distance;
//        int[][] graph = {{0, 8, 11, 9, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
//                {Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
//                {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 8, 8, Integer.MAX_VALUE},
//                {Integer.MAX_VALUE, Integer.MAX_VALUE, 3, 0, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
//                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, 2},
//                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 7, Integer.MAX_VALUE},
//                {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 12, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 5},
//                {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE,4,Integer.MAX_VALUE,0}};

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String[] strings = str.split(" ");
        V = Integer.parseInt(strings[0]);
        E = Integer.parseInt(strings[1]);

        String str2 = scanner.nextLine().trim();
        int start = Integer.parseInt(str2);

        List<Node>[] lists = new List[V + 1];
        List<Node>[] reLists = new List[V + 1];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList<>();
            reLists[i] = new ArrayList<>();
        }
        for (int i = 0; i < E; i++) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);

            lists[a].add(new Node(b, c));
            reLists[b].add(new Node(a, c));
        }

        for (int i = 0; i < lists.length; i++) {
            System.out.println("i = " + i);
            System.out.println("list = " + lists[i]);
            System.out.println("reList = " + reLists[i]);
            System.out.println();
        }
        StrongConnection connection = new StrongConnection(lists, reLists);
        connection.print();
    }


}
