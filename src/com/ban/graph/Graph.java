package com.ban.graph;

import java.util.ArrayList;
import java.util.List;

import com.ban.linkedlist.Node;


public class Graph {
	private int vCount;
	private int ecount;
	private ArrayList<Integer>[] adjacents;
	
	Graph(int n){
	this.vCount=n;
	this.ecount=0;
	adjacents=new ArrayList[vCount];
	for(int i=0;i<vCount;i++){
		adjacents[i]=new ArrayList<Integer>();
	}
	}
		
	public int getvCount() {
		return vCount;
	}


	public int getEcount() {
		return ecount;
	}

	public void addEdge(int source,int destination){
		adjacents[source].add(destination);
		ecount++;
			
		}
	
	public ArrayList<Integer> adj(int source){
		return adjacents[source];
	}

	}


