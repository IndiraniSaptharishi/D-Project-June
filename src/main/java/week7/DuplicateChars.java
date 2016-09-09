package week7;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="indirani";
  HashMap<Character,Integer> map=new HashMap<Character,Integer>();
  char[] strarray=s.toCharArray();
  for (char c : strarray) {
	if(map.containsKey(c)){
		int val=map.get(c);
		map.put(c, val+1);
	}
	else{
		map.put(c, 1);
	}
}
  Set<Character> keys=map.keySet();//Set is an interface that doesnt allow duplicate values
  for (Character character : keys) { //using for each loop check the each key in the key set 
	if(map.get(character)>1){   //if the value of the key is greater than one 
		System.out.println("char "+character+ "=" +map.get(character));//then print them
	}
}
	}

}
