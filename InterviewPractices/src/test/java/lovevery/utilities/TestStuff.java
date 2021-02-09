package lovevery.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestStuff {

	public static void main(String[] args) {
		int[] nums = {4,2,2,3};
		int countNextTo = 0;
		 int countAlone = 0;
		 
		 	for(int i= 0 ; i < nums.length-1; i++){
					if(nums[i+1] == 2 && nums[i+1] == nums[i]){
						countNextTo = countNextTo + 1;} 
		      else if(nums[i+1] == 2 && nums[i+1] != nums[i]) {
			    countAlone = countAlone + 1;	} 
			  }
			  System.out.println(countAlone);
			  System.out.println(countNextTo);

		System.out.println(reverseString("Yasin"));
		System.out.println(reverseStringTwo("Yasin is happy"));
		repeatingChars("Tooodayyyy");
		System.out.println("Tooodayyyy after eliminating dublications becomes : " + repeatingCharsTwo("Tooodayyyy"));

		String word = "Helllllllo";
		String letter = "L";
		System.out.println(
				"Occurance of " + "-" + letter + "-" + " in " + word + " is: " + occurrenceOfLetter(word, letter));
		
		int[] list = { 84, 84, 84, 84, 84, 84, 84 };
		findSecondLargest(list);
		int[] list2 = { 55, 84, 64, 44, 84, 22, 84 };
		findSecondLargest(list2);
		System.out.println(isPalindrome2("beheb"));
		System.out.println(isPalindrome("beheb"));
		
		int abs = 4;
		
		
		List<String> yaso = new ArrayList<String>();
		
		for (int i = 0; i < 10; i++) {
			yaso.add(String.valueOf(i));
		}
		String yaso2 = yaso.get(9);
		
		System.out.println(yaso2);
	
		 
		String input = "Try     to remove   extra spaces.";
		String inputNew = input;
		while (inputNew.contains("  ")) {
		inputNew = inputNew.replace("  "," ");
		};
		System.out.println(input);
		System.out.println(inputNew);
		
		
		
		
		
		
	}

	// REVERSES STRING BY LOOP
	public static String reverseString(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}

	// REVERSES BY STRINGBUILDER
	public static String reverseStringTwo(String word) {
		String reverse = new StringBuilder(word).reverse().toString();
		return reverse;
	}

	// PRINTS COUNT OF EACH CHARACTER
	public static void repeatingChars(String word) {
		Map<String, Integer> repeatsTimes = new LinkedHashMap<String, Integer>();
		Integer count = 1;
		for (int i = 0; i < word.length(); i++) {
			if (!repeatsTimes.containsKey(String.valueOf(word.charAt(i)))) {
				repeatsTimes.put(String.valueOf(word.charAt(i)), count);
			} else {
				repeatsTimes.put(String.valueOf(word.charAt(i)), repeatsTimes.get(String.valueOf(word.charAt(i))) + count);
			}
		}
		for (String name : repeatsTimes.keySet()) {
			System.out.println("Count of the letter:" + name + " = " + repeatsTimes.get(name));
		}
	}

	// RETURNS THE STRING AFTER ELIMINATING DUBLICATE CHARACTERS AND COUNT (PRINTS MAP)
	public static String repeatingCharsTwo(String word) {
		Map<String, Integer> repeatsTimes = new LinkedHashMap<String, Integer>(); // can be SET if i don't need to count
		Integer count = 1;
		for (int i = 0; i < word.length(); i++) {
			if (!repeatsTimes.containsKey(String.valueOf(word.charAt(i)))) {
				repeatsTimes.put(String.valueOf(word.charAt(i)), count);
			} else {
				repeatsTimes.put(String.valueOf(word.charAt(i)),repeatsTimes.get(String.valueOf(word.charAt(i))) + count);
				}
		}
		System.out.println(repeatsTimes.toString());
		String eliminated = String.join("", repeatsTimes.keySet());
		return eliminated;
	}

	// RETURN THE COUNT FOR SPECIFIC CHARACTER
	public static int occurrenceOfLetter(String word, String letter) {
		int countOfLetter = word.length() - word.toUpperCase().replaceAll(letter, "").length();
		return countOfLetter;
	}

	// SORTS THEN RETURNS THE SECOND HIGHEST NUMBER IN ARRAY
	public static void findSecondLargest(int[] intArr) {
		if (intArr.length < 2) {
			System.out.println("Array not big enough!");
			return;
		}
		Arrays.sort(intArr);
		for (int i = intArr.length - 2; i >= 0; i--) {
			if (intArr[i] != intArr[intArr.length - 1]) {
				System.out.println("Second largest number is:" + intArr[i]);
				return;
			}
		}
		System.out.println("Second largest number is doest exist");
	}
	public static String findSecondLargest2(int[] intArr) {
		if (intArr.length < 2) {
			String notBig = "Array not big enough!";
			
			return notBig ;
		}
		
		Arrays.sort(intArr);
		String empty = "";
		for (int i = intArr.length - 2; i >= 0; i--) {
			if (intArr[i] != intArr[intArr.length - 1]) {
				empty = String.valueOf(intArr[i]);
				return empty;
			}
		}
		String noExist = "Second largest number is doest exist";
		return noExist;
	}

	public static boolean isPalindrome(String str) {
		if(str == null)
		return false;
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString().equals(str); }
	
	public static boolean isPalindrome2(String str) {
		
	String reverse = "";
	for(int i  = str.length()-1; i >= 0; i--) {
		reverse= reverse + str.charAt(i);
	}
	if(reverse.equals(str)) {
		return true;
	}
		return false;
	
	}
	public boolean twoTwo(int[] nums) {
		  for(int i= 0 ; i <= nums.length; i++){
		    if(nums[i] == nums[i+1]){
		      return true;
		    }
		  }
		return false;
		}
	
//	public boolean twoTwo1(int[] nums) {
//			if(nums[nums.length-1] == 2 && nums[nums.length-1] != nums[nums.length-2] ) {
//				return false;
//			}
//			
//			for (int i : nums){
//			    if(nums.length < 2 && i == 2) {
//			    	return false;
//			    }
//			  }
//			for(int i= 0 ; i <= nums.length; i++){
//				if(nums[i] == 2 && ){
//					return true;
//				}
//			}
//			return false;
//		}

	
	public boolean twoTwo7(int[] nums) {
		 
		 
		  if(nums.length == 0){
		    return true;
		  }
				for (int i : nums){
				    if(nums.length < 2 && i == 2) {
				    	return false;
				    }else if(nums.length < 2 && i!= 2)  {
				  	return true;
			  	}
				  }
				  
				  if(nums[nums.length-1] == 2 && nums[nums.length-1] != nums[nums.length-2] ){
				    return false;
				  }
				  
				for(int i= 0 ; i <= nums.length-1; i++){
					if(nums[i] == 2 && nums[i] == nums[i+1]){
						return true;
					}
				}
				return false;
			}

	public boolean twoTwo3(int[] nums) {
		  
		  int countNextTo = 0;
		 int countAlone = 0;
		 
		 	for(int i= 0 ; i < nums.length-1; i++){
					if(nums[i+1] == 2 && nums[i+1] == nums[i]){
						countNextTo = countNextTo + 1;} 
		      else if(nums[i+1] == 2 && nums[i+1] != nums[i]) {
			    countAlone = countAlone + 1;	} 
			  }
			  
			  if(countAlone != 0 ) {
			    return false;
			  }else if (countNextTo > 0) {
			    return true;
			  }
			  return true;
		}




//	public boolean sameFirstLast(int[] nums) {
//		  if(nums.length >= 1 && nums[1] == nums[length-1]){
//		    return true;
//		  }
//		}





	
}

