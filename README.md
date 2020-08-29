# NumberToWord-Program
Write a console application that takes in a currency value (Min Value 00, Max Value 9,99,999.99) and prints out a text. For ex. If provided "123456.78" , it should print out "Rs. One Lakh Twenty Three Thousand Four Hundred And Fifty Six 78/100 ONLY".


Prerequisite to run the program.
System should have any versions of java install. below is the link to download it and installation instructions 
https://www.java.com/en/

Below are the steps to run the program 
1. Download the code from GitHub lets say you downloaded it in demo folder which contain com folder.
2. in command prompt go to the demo folder.
3. run below command from demo folder to compile the classes 
	javac com/num/conversion/*
4. run below command to run the program 
	java com/num/conversion/NumIntoWord
5. it will ask you to enter the number 
6. after the number is entered the program will print the output in the command prompt . 

To run the test case follow above steps from 1 to 3 and run below command to run the test case
java com/num/conversion/testCases

Below are the sample input and output of the program in which the the given number converted into word format and the decimal number converted into fraction.

Input:4232321.443234
output: TwentyFour crore FourtyTwo lakh thirtyTwo Thousand Three Hundred and TwentyOne 443234/1000000 Only
