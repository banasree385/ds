package com.ban.stack;

public class app {
	public static void main(String args[]){
		
		
		Stack theStack=new Stack(3);
		
		theStack.push(22);
		theStack.push(33);
		theStack.push(44);
		theStack.push(55);
		theStack.push(66);
		
	

		System.out.println(theStack.peak());
		theStack.pop();
		System.out.println(theStack.peak());
		long poppedNumber=theStack.pop();
		System.out.println(poppedNumber);
		String the="/ge_serv/tomcat_risk/apache-tomcat-7.0.52/temp/";
		the=the.replace("/", "\\");
		System.out.println(the);
		/*-----------------*/
		  String res="";
		  Stack stk=new Stack(10);

		  //String s="DDIDDIID";
		  String s="DIDD";

          for(int i=0;i<=s.length();i++)
          {
              stk.push(i+1);
              if(i==s.length()|| s.charAt(i)=='I')
              {
                  while(!stk.isEmpty())
                      res+=String.valueOf(stk.pop());
              }
          }
          System.out.println("res----------"+res);
	}
	


}
