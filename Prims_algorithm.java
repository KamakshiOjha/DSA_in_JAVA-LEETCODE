public class Prims_algorithm {
    public static void main(String args[]) {
        int graph[][] = new int[][]{{0, 4, 3, 0, 0, 0, 0},
                                    {4, 0, 0, 0, 12, 5, 0},
                                    {3, 0, 0, 7, 10, 0, 0},
                                    {0, 0, 7, 0, 2, 0, 0},
                                    {0, 12, 10, 2, 0, 0, 5},
                                    {0, 5, 0, 0, 0, 0, 16},
                                    {0, 0, 0, 0, 5, 16, 0}};

        int visited[] = new int[7];
        int min = 999;
        int u = 0; // source vertex
        int v = 0; // destination vertex
        int total = 0;

        for (int i = 0; i < 7; i++) {
            visited[i] = 0;
            for (int j = 0; j < 7; j++) {
                if (graph[i][j] == 0) {
                    graph[i][j] = 999;
                }
            }
        }
        visited[0] = 1;

        for (int i = 0; i < 6; i++) {
            min = 999;
            for (int j = 0; j < 7; j++) {
                if (visited[j] == 1) {
                    for (int k = 0; k < 7; k++) {
                        if (visited[k] == 0) {
                            if (min > graph[j][k]) {
                                min = graph[j][k];
                                u = j; 
                                v = k; 
                            }
                        }
                    }
                }
            }
            visited[v] = 1;
            total += min;
            System.out.println("source " + u + " --> " + v + " : " + min);
        }
        System.out.println("total weight of graph: " + total);
    }
}

