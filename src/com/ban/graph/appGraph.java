package com.ban.graph;

public class appGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterGraph myGraph=new BetterGraph(5);
		myGraph.addVertex("state");
		myGraph.addVertex("avenel");
		myGraph.addVertex("eln");
		myGraph.addVertex("pocono");
		myGraph.addVertex("willion");
		
		myGraph.addEdge("avenel", "pocono");
		myGraph.addEdge("state", "eln");
		myGraph.addEdge("eln", "avenel");
		myGraph.addEdge("eln", "willion");
		myGraph.addEdge("willion", "state");
		myGraph.addEdge("willion", "pocono");
		myGraph.addEdge("pocono", "eln");
		myGraph.addEdge("state", "avenel");
		
		//myGraph.print();
		myGraph.bfs("state");
		System.out.println("dfs");
		myGraph.dfs("state");


		

	}

}
