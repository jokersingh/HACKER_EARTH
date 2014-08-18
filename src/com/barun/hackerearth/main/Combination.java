/**
 * 
 */
package com.barun.hackerearth.main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bbarun
 *
 */
public class Combination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "barun";
		char[] nameArray = name.toCharArray();
		int i=1;
		for(char ch:nameArray){
			List<String> combination = combinations(ch,i);
			for(String str:combination){
				System.out.println(str);
			}
		}

	}

	private static List<String> combinations(char ch, int i) {
		List<String> combinations = new ArrayList<String>();
		
		
		return null;
	}

}
