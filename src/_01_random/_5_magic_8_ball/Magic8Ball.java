//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	
	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("Enter a message");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random r= new Random();
int s = r.nextInt(4);
	
	// 4. If the random number is 0

	// -- tell the user "Yes" or "It seems likely."
if (s == 0) {
	JOptionPane.showMessageDialog(null, "It seems likely.");
}
	// 5. If the random number is 1

	// -- tell the user "No" or "It seems unlikely."
if (s == 1) {
	JOptionPane.showMessageDialog(null, "It seems unlikely.");
}
	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

if (s == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}

	// 7. If the random number is 3

	// -- write your own answer
if (s == 3) {
	JOptionPane.showMessageDialog(null, "Message hazy, ask again.");
}
}
}