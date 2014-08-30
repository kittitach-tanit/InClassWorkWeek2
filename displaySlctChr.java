//Tanit Suenghataiporn(5631255821), Kittitach Pongpairoj(5631211121)


import java.util.Scanner;
import java.util.regex.*;

public class displaySlctChr {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input: ");
		String input = " "+kb.nextLine();
		kb.close();
		input = input.replaceAll("[a,]", "");	//As the board did not state to exclude "A", it will still show. Just add A in [a,] to exclude it.
		
		Pattern pattern = Pattern.compile(" [a-z]");
	    Matcher matcher = pattern.matcher(input);
		while(matcher.find()) input = input.replaceFirst(" [a-z]", (" "+input.charAt(matcher.start()+1)).toUpperCase());
	    System.out.print(input.trim());
	}
}
