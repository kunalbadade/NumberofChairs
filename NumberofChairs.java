package com.general.solution;

import java.util.Arrays;

public class NumberofChairs {

	private static int CountNumberofChairs(int[] s, int[] e) {
		// TODO Auto-generated method stub
		int chairs = 0, count=0;
		Arrays.sort(s);
		Arrays.sort(e);
		int j=0;
		
		for(int i=0;i<s.length;i++) {
			
			if(s[i] != e[j]) {
				count++;
			}
			else {
				int subs = 0;
				while(j<e.length) {
					if(s[i] != e[j]) {
						break;
					}
					else {
						subs++;
					}
					j++;
				}
				count = count + 1 - subs;				
			}
			
			if(count > chairs)
				chairs = count;
		}
		
		return chairs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] S = new int[] {1,2,6,5,3};
		int[] E = new int[] {5,5,7,6,8};
		
		int chairs = CountNumberofChairs(S, E);
		
		System.out.println(chairs);

	}

}
