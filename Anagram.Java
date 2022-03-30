import java.util.Arrays;

public class Anagram {
	
	public String start(String s1, String s2) {

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		// if the length is longer or shorter its not an anagram
		if (s1.length() != s2.length())
			return "No Its not an anagram!";
			

		// converting them into an array
		char[] s1C = s1.toCharArray();
		char[] s2C = s2.toCharArray();

		// Sorting the array using pre-defined method
		Arrays.sort(s1C);
		Arrays.sort(s2C);

		// checking the equality
		// Since the equality is check by the the values and and order if its not same
		// then it cant be an annagram
		// do not the sort was used organizing it so we can check equlity
		for(int i =0; i < s1C.length;i++)
		{
			if(s1C[i] != s2C[i])
				return"Not an anagram";
		}

		// if our test case crossed all barriers then it must be a anagram
		return "Yes Its an anagram";
	}

}
