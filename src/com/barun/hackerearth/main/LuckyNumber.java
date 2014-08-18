/**
 * 
 */
package com.barun.hackerearth.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author bbarun
 *
 */
public class LuckyNumber {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		 /*
         * Read input from stdin and provide input before running 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        //Map<Integer,int[]> lucky = new HashMap<Integer,int[]>();
        List<int[]> luckyNumberArray = new ArrayList<int[]>();
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
        	StringTokenizer luckyNumber=new StringTokenizer(br.readLine()," ");
        	int[] luckyNumbers = new int[100];
        	int j = 0;
        	while(luckyNumber.hasMoreElements()){
				luckyNumbers[j]=Integer.parseInt(luckyNumber.nextElement().toString());
				j++;
        	}
        	luckyNumberArray.add(luckyNumbers);
        	numbers.add(Integer.parseInt(br.readLine()));
        	//lucky.put(Integer.parseInt(br.readLine()), luckyNumbers);
        }
       for(int i=0;i< N;i++){
    	   int finalResult = 0;
    	   int number = numbers.get(i);
    	   int []luckyNumber = luckyNumberArray.get(i);
    	   for(int j=1;j<1000;j++){
    		   int result = number*j;
    		   int resultedNumber=result;
    		   while(result>1){
    			   int temp = result%10;
    			   for(int value:luckyNumber){
    				   if(value == temp){
    					   finalResult=resultedNumber;
    				   }else {
    					   finalResult=0;
    				   }
    			   }
    			   result = result/10;
    		   }
    		   if(finalResult != 0){
    		   System.out.println(finalResult);
    		   }
    	   }
    	  
       }

	}

}
