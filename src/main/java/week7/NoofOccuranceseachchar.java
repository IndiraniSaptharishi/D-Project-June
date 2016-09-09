package week7;

import java.util.HashMap;
import java.util.Scanner;


public class NoofOccuranceseachchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The below method is to give the input in the program itself
     //String s="indirani Saptharishi";
		//Below method is used to get the input during run time
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the string: ");
		String s=scan.nextLine();
		//Using HashMap which is a class that implements Map interface in collection
		//which stores key and value.Here in our example key is the character and value is the occurence of each charcter. 
		//Hash Map is unschnchronized and it allows null key and null values.It is unorderded(meaning it doesnt return the keys in the way it is inserted 
     HashMap<Character,Integer> map=new HashMap<Character, Integer>();//Creating an object for the HashMap class
    char[] strarray=s.toCharArray();//Converting the string array to character array using the method toCharArray();
    for (char c : strarray) {  //Using for each loop to fetch each character in the string array
		if(map.containsKey(c)){ //if the map contains the character
			int val=map.get(c); //Check the value of the character using get(value) method in the Hash Map class
			map.put(c, val+1); //if the occurence is more than one ,then using the method put(key,value) add the value plus 1(this happens for the entire loop)
		}
			else{
				map.put(c, 1);//if the occurence of the key is not more than once use the same put method to return the value
			}
		}
    System.out.println(map);//Print the map
	}
    
}

