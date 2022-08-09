import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer>dfsOfGraph(int V,ArrayList<ArrayList<Integer>>adj){

        boolean[]visited = new boolean[V];
        ArrayList<Integer>answer = new ArrayList<>();

        for (int i=0;i<V;i++){
            if (!visited[i]){
                dfs(i,adj,visited,answer);
            }
        }

       //33 dfs(0,adj,visited,answer);

        return answer;
    }

    private void dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> answer) {

         visited[i]=true;

         answer.add(i);
         for (Integer neighbours:adj.get(i)){
             if (!visited[neighbours]){
                 dfs(neighbours,adj,visited,answer);
             }
         }
    }
}
