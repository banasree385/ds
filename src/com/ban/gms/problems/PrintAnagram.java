package com.ban.gms.problems;

import java.util.Arrays;
import java.util.Comparator;

public class PrintAnagram {
	/****
	 * 1) Create two auxiliary arrays index[] and words[].Copy all given words to words[] and store the original indexes in index[]
	 * index[]: 0 1 2 3 4 
	 * words[]: cat dog tac god act 
	 * 
	 * 2) Sort individual words in words[]. Index array doesn’t change.
	 * index[]: 0 1 2 3 4 
	 * words[]: act dgo act dgo act 
	 * 
	 * 3) Sort the words array. Compare individual words using strcmp() to sort 
	 * index: 0 2 4 1 3 
	 * words[]: act act act dgo dgo 
	 * 
	 * 4) All anagrams come together. But words are changed in words array. To print the original
	 * words, take index from the index array and use it in the original array. We get
	 * "cat tac act dog god"
	 *****/
/*the class keeps the associated index for a string */
   static class Word{
	int index;
	String str;
	public Word(int index, String str) {
		super();
		this.index = index;
		this.str = str;
	}	
	}
   // Compare two words. Used in Arrays.sort() for  sorting an array of words
	static class compStr implements Comparator<Word> {
		public int compare(Word a, Word b) {
			return a.str.compareTo(b.str);
		}
	}
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	String[] inputArr={"cat", "dog", "tac", "god", "act"};
	Word[] words=new Word[inputArr.length];
	for (int i=0;i<words.length;i++){
    Word word=new Word(i, inputArr[i]);
    words[i]=word;
	}
	for (int i=0;i<words.length;i++){
	    System.out.println(words[i].str);
		}
    /* sort individual words*/
	for (int i=0;i<words.length;i++){
		char[] chArr=words[i].str.toCharArray();
		Arrays.sort(chArr);
		words[i].str=new String(chArr);
	}

	/*sort the array itself*/
	Arrays.sort(words,new compStr());
	for (int i=0;i<words.length;i++){
	    System.out.println(words[i].str);
		}
	System.out.println("----------------last result-----------------");
	/*arrange based on the old array*/
	for (int i=0;i<inputArr.length;i++){
	    System.out.println(inputArr[words[i].index]);
		}
	}
	

}
