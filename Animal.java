package com.nttdata.sei.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class RemoveDuplicatesJavaExample {
	
	public static int[] randomIntegers = new int[0];   


	private static Integer[]  usingArrayList(){
		List<Integer> withOutDuplicate = new ArrayList<Integer>();
		for (int i = 0; i < randomIntegers.length-1; i++)
        {
            if(!withOutDuplicate.contains(randomIntegers[i])) {
            	withOutDuplicate.add(randomIntegers[i]);
            }
        }
		
		return withOutDuplicate.toArray(new Integer[withOutDuplicate.size()]);
	}
	
	
	private static Integer[] usingCollectionAPI(){
		
		    Set<Integer> set = new LinkedHashSet<Integer>();
	        for (int arrayElement :randomIntegers )
	        {
	        	set.add(arrayElement); 
	        }
	     return set.toArray(new Integer[set.size()]);   
	}
	
	private static Integer[] withoutUsingCollectionAPI(){
		
        int noOfUniqueElements = randomIntegers.length;
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                if(randomIntegers[i] == randomIntegers[j])
                {
                    randomIntegers[j] = randomIntegers[noOfUniqueElements-1];
                    noOfUniqueElements--;
                    j--;
                }
            }
        }
        
        Integer[] withoutDuplicate = new Integer[noOfUniqueElements];
        int i = 0;
        for(int number:Arrays.copyOf(randomIntegers, noOfUniqueElements)) {
        	withoutDuplicate[i]= number;
        	i++;
        }
         return withoutDuplicate;
    }
		

	

public static void main(String[] args) {
	
	System.out.println("Please Enter array in comma separated:");
	Scanner scanner = new Scanner(System.in);
	String input = scanner.nextLine();
	randomIntegers = new int[input.split(",").length+1];
	StringTokenizer tokenizer = new StringTokenizer(input,",");
	int i = 0;
	while(tokenizer.hasMoreTokens()) {
		randomIntegers[i] = Integer.parseInt(tokenizer.nextToken());
		i++;
	}
	
	System.out.println("Please Enter method type in integer (for ex : 1,2,3):");
	Integer[] print = new Integer[randomIntegers.length];
	String methodType = scanner.next();
	if("1".equalsIgnoreCase(methodType)) {
		print = usingArrayList();
	}else if("1".equalsIgnoreCase(methodType)) {
		print = usingCollectionAPI();
	}else {
		print = withoutUsingCollectionAPI();
	}
	
	
	for(int number:print) {
		System.out.print(number+",");
	}
	
}

}

