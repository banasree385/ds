package com.ban.gms.problems;

public class RobotMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String move="UDDLLRUUUDUURUDDUULLDRRRR";
		int ver=0;
		int hor=0;
		for(int i=0;i<move.length();i++){
			switch (move.charAt(i)) {
			case 'U':ver++;break;
			case 'D':ver--;break;
			case 'L':hor--;break;
			case 'R':hor++;break;
			default:
				break;
			}
		}
		
		System.out.println("output="+"("+hor+","+ver+")");
	}

}
