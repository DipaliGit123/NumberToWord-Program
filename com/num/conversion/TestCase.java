package com.num.conversion;
import java.util.Scanner;
/**Write a console application  that takes in a currency value
* (Min Value 00, Max Value 9,99,999.99) and prints out a text. For ex. If provided "123456.78"
*, it should print out "Rs. One Lakh Twenty Three Thousand Four Hundred And Fifty Six 78/100 ONLY".
*/
public class TestCase{
	public static void main(String[] arg){
		
		System.out.print("\n number 16.32 ::"+NumIntoWord.convert(16.32)+" Only");
		System.out.print("\n number 435::"+NumIntoWord.convert(435)+" Only");
		System.out.print("\n number 64385.43::"+NumIntoWord.convert(64385.43)+" Only");
		System.out.print("\n number 4232321.443234::"+NumIntoWord.convert(244232321.443234)+" Only");
		System.out.print("\n number 8765316.3234 ::"+NumIntoWord.convert(8765316.3234)+" Only");
		System.out.print("\n number 13765355.8872 ::"+NumIntoWord.convert(13765355.8872)+" Only");
	
		
		
		
		
	}
}