import java.util.ArrayList;

class GraphL{
  ArrayList<ArrayList<Integer>> adjL = new ArrayList<>();

  GraphL(int v){
    for(int i=0;i<v;i++){
      adjL.add(new ArrayList<Integer>());
    }
  }
  public void addEdge(int u, int v){
    adjL.get(u).add(v);
    adjL.get(v).add(u);
  }
  public void printadj(){
    for(int i=0;i<adjL.size();i++){
      System.out.println("AdjList "+ i);
      for(int j=0;j<adjL.get(i).size();j++){
        System.out.println(" " + adjL.get(i).get(j));
      }
    }
  }
}
class Graph{
  public static void main(String[] args) {
    int[][] graph ={
      {0,1,0,0,1},
      {1,0,1,0,1},
      {0,1,0,1,0},
      {0,0,1,0,1},
      {1,1,0,1,0}
    };

    GraphL g= new GraphL(5);

    g.addEdge(0,1);
    g.addEdge(2,3);
    g.addEdge(1,2);
    g.addEdge(3,4);
    g.addEdge(0,4);
    g.addEdge(1,4);

    g.printadj();


  }
}