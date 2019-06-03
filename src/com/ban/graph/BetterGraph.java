package com.ban.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.ban.linkedlist.Node;

public class BetterGraph {
	private int vCount;
	private int ecount;
	private int indexCounter=0;
	Vertex[] vertices;
	boolean[] visitedForDfs;


	
public BetterGraph(int vCount) {
		super();
		this.vCount = vCount;
		this.vertices= new Vertex[vCount];
		visitedForDfs=new boolean[vCount];
	}

public void addVertex(String name){
	vertices[indexCounter]=new Vertex(name, null);
	indexCounter++;
}

public void addEdge(String sourceVertexName,String destVertexName){
	
	int sourceVertexIndex=indexForName(sourceVertexName);
	int destVertexIndex=indexForName(destVertexName);
	vertices[sourceVertexIndex].adjList	=new Node(destVertexIndex,vertices[sourceVertexIndex].adjList);

}

int indexForName(String name){
	for(int v=0;v<vertices.length;v++){
		if(name.equals(vertices[v].name))
			return v;
	}
	return -1;
}

public void print(){
	for(int v=0;v<vertices.length;v++){
		System.out.print(vertices[v].name);
		for(Node aNode=vertices[v].adjList;aNode!=null;aNode=aNode.next){
			System.out.print("-->"+vertices[aNode.vertexIndex].name);
		}
		System.out.println("\n");	
	}

}
Vertex vertexForName(String name){
	for(int v=0;v<vertices.length;v++){
		if(name.equals(vertices[v].name))
			return vertices[v];
	}
	return null;
}

public void bfs(String startingPoint){
	boolean[] visited=new boolean[vCount];
	Queue<Vertex> displayQ=new LinkedList<Vertex>();
	
	displayQ.add(vertexForName(startingPoint));
	visited[indexForName(startingPoint)]=true;
	while(displayQ.size()!=0){
		Vertex display=displayQ.poll();
		System.out.print(display.name+"-->");
		/*-----loop through adjacency---*/
		Node next=display.adjList;
		while(next!=null){
			if(visited[next.vertexIndex]!=true){
			visited[next.vertexIndex]=true;
			displayQ.add(vertices[next.vertexIndex]);
			}
			next=next.next;

		}
	}
}

public void dfs(String startingPoint){
	visitedForDfs[indexForName(startingPoint)]=true;
	Vertex current=vertexForName(startingPoint);
	System.out.print(startingPoint+"-->");
	Node next=current.adjList;
	while(next!=null){
		if(visitedForDfs[next.vertexIndex]!=true){
			dfs(vertices[next.vertexIndex].name);
		}
	}
	
}

public boolean detectCycle(String startingPoint){
	return false;
}



	
/*inner class vertex*/
	class Vertex{
		String name;
		Node adjList;
		Vertex(String name,Node aNode){
			this.name=name;
			this.adjList=aNode;
		}
	}
/* end inner class vertex*/	
/*inner class Node*/
	 class Node {
		int vertexIndex;
		Node next=null;
		public Node(int vertexIndex,Node node){
			super();
			this.vertexIndex=vertexIndex;
			this.next=node;
		}
	}
/*end inner class Node*/
/*inner class SLL*/
	 class SinglyLinkedList{
		 Node first=null;
		 
	 }
/*end inner class SLL*/
	 
}
