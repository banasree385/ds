package com.ban.queue;

import com.ban.stack.Stack;

public class AppQueue {
	public static void main(String args[]){
		Queue theQueue=new Queue(3);
		System.out.println(theQueue.isEmpty());
		theQueue.insert(11);
		theQueue.view();
		theQueue.insert(22);
		theQueue.view();
		theQueue.insert(33);
		theQueue.view();
	/*	theQueue.insert(44);
		theQueue.view();
		theQueue.insert(55);*/




	//System.out.println("front"+theQueue.peakFront());	
	theQueue.view();
}
}

