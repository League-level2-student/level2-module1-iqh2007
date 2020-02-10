package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {

	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();

		// 2. Add five Strings to your list
		String a = " red ";
		String b = " orange ";
		String c = " yellow ";
		String d = " green ";
		String e = " blue ";

		strings.add(a);
		strings.add(b);
		strings.add(c);
		strings.add(d);
		strings.add(e);

		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {

			String j = strings.get(i);
			System.out.println(j);

		}

		// 4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}

		// 5. Print only the even numbered elements in the list.
		for(int i = 0; i <strings.size(); i++) {
			if(i%)
		}
		
		

		// 6. Print all the Strings in reverse order.
		for (int i = strings.size()-1; i >= 0; i--) {

			String j = strings.get(i);
			System.out.println(j);
		}

		// 7. Print only the Strings that have the letter 'e' in them.
	}
}
