package HackerEarth;
//Game of Piles
///java program giving all paths in a graph and then using this path to get the array of piles to play game of Piles

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

// A directed graph using
// adjacency list representation
public class Graph {

    // No. of vertices in graph
    private int v;

    // adjacency list
    private ArrayList<Integer>[] adjList;
    public TreeSet<Integer> uniquePathSet;

    //Constructor
    public Graph(int vertices) {

        //initialise vertex count
        this.v = vertices;

        // initialise adjacency list
        initAdjList();
        uniquePathSet = new TreeSet<>();
    }

    // utility method to initialise
    // adjacency list
    @SuppressWarnings("unchecked")
    private void initAdjList() {
        adjList = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    // add edge from u to v
    public void addEdge(int u, int v) {
        // Add v to u's list.
        adjList[u].add(v);
    }

    // Prints all paths from
    // 's' to 'd'
    public void printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();

        //add source to path[]
        pathList.add(s);

        //Call recursive utility
        printAllPathsUtil(s, d, isVisited, pathList);
    }

    // A recursive function to print
    // all paths from 'u' to 'd'.
    // isVisited[] keeps track of
    // vertices in current path.
    // localPathList<> stores actual
    // vertices in the current path
    private void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList) {

        // Mark the current node
        isVisited[u] = true;

        if (u.equals(d)) {
            uniquePathSet.addAll(localPathList);
            // if match found then no need to traverse more till depth
            isVisited[u] = false;
            return;
        }

        // Recur for all the vertices
        // adjacent to current vertex
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
                // store current node
                // in path[]
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList);

                // remove current node
                // in path[]
                localPathList.remove(i);
            }
        }

        // Mark the current node
        isVisited[u] = false;
    }

    // Driver program
    public static void main(String[] args) throws IOException {
        // Create a sample graph
        File file = new File("/Users/syedmq/Documents/competetive-coding-problems-java/src/HackerEarth/graphInput.txt");
//
        Scanner scanner = new Scanner(file);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        ArrayList<Integer> piles = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            piles.add(scanner.nextInt());
        }


        Graph g = new Graph(N);
        for (int i = 1; i < N; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            g.addEdge(u, v);
            g.addEdge(v, u);

        }

        // arbitrary source
        for (int i = 0; i < Q; i++) {
            int s = scanner.nextInt() - 1;

            // arbitrary destination
            int d = scanner.nextInt() - 1;


            g.printAllPaths(s, d);
            int[] currentPiles = new int[g.uniquePathSet.size()];
            int r =0;

            for(Object k :g.uniquePathSet.toArray())
            {
                currentPiles[r]=piles.get((int)k);
                r++;
            }
            knowWinnerBeforePlaying(currentPiles, g.uniquePathSet.size());
            g.uniquePathSet.clear();
        }
    }


    static void knowWinnerBeforePlaying(int piles[], int n) {

        if (calculateNimSum(piles, n) != 0) {
            System.out.println("Bob");
        } else
        {System.out.println("Alex");
        }
        return;
    }


    static int calculateNimSum(int piles[], int n) {
        int i, nimsum = piles[0];
        for (i = 1; i < n; i++)
            nimsum = nimsum ^ piles[i];
        return (nimsum);
    }
}

