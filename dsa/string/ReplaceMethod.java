// replace substrings with in a string using replace()-Method.
package dsa.string;

public class ReplaceMethod {
	public static void main(String[] args) {
		
		String str = "My name is Sayan";
		
		/*replace() is a predefined non-static method in String class
		 which is used to replace substring with in a string*/
		
		System.out.println(str);//My name is Sayan
		str = str.replace("My", "His");
		System.out.println(str);//His name is Sayan
		
//		replace() method is also used to replace characters with in a String 
		str = str.replace('y', 'i');
		System.out.println(str);//His name is Saian
		
		/* 
		 * we can not replace character with string directly 
		 * it will compile time error.
		 */
		//str = str.replace('s', "Sayan");//CTE
		
//		but we can treat a char as String using "" 
//		and replace with a new String.
		str = str.replace("S", "Sayan");
		System.out.println(str);//His name is Sayanaian
		
	}
}
