package com.ban.graph;

import java.util.Iterator;
import java.util.LinkedList;


public class GraphNormal {
	private int verticeCount;
	private LinkedList<Integer> adj[];
	public GraphNormal(int verticeCount, LinkedList<Integer>[] adj) {
		super();
		this.verticeCount = verticeCount;
		this.adj = new LinkedList[verticeCount];
		for(int i=0;i<verticeCount;i++){
			adj[i]=new LinkedList<Integer>();
		}
	}	
void addEdge(int source,int dest){
	adj[source].add(dest);
}
void bfs(int startingPoint){
	boolean visited[] = new boolean[verticeCount];
	LinkedList<Integer> queue=new LinkedList<Integer>();
	int s=startingPoint;

	visited[s]=true;
	queue.add(s);
	while(queue.size()!=0){
		s=queue.poll();
		System.out.print(s+"-->");
		Iterator it=(Iterator) adj[s].listIterator();
		/*while(it.hasNext()){
			int n=(int) it.next();
			if(!visited[])
		}*/
	}
	
}

	

}
