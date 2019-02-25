/*
  Matthew Ludwig
  February 24 2019
  This program will convert the user's message into morse code
 */
package morsecode;

/**
 *
 * @author malud0519    
 */
import javax.swing.*;
public class MorseCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputWord;
        inputWord = JOptionPane.showInputDialog("This program will convert a message into morse code"
                + "\n\n" + "Enter a message: ");
        inputWord.toUpperCase();
        char ch;
        String morseWord;
        morseWord = "";
        for (int i = 0; i < inputWord.length(); i++) {
            ch = inputWord.charAt(i); // checks each letter of the message
          
            // converts each instance of the character into its respective morse code
            if (ch == 'A') { 
                morseWord += ".-";   
            }
            else if (ch == 'B'){  
               morseWord += "-…";
            }
            else if (ch == 'C') {
                morseWord += "-.-.";
            } 
            else if (ch == 'D') {
                morseWord += "-..";
            }
            else if (ch == 'E') {
                morseWord += ".";
            }
            else if (ch == 'F') {
                morseWord += "..-.";
            }
            else if (ch == 'G') {
                morseWord += "--.";
            }
            else if (ch == 'H') {
                morseWord += "....";
            }
            else if (ch == 'I') {
                morseWord += "..";
            }
            else if (ch == 'J') {
                morseWord += ".---";
            }
            else if (ch == 'K') {
                morseWord += "-.-";
            }
            else if (ch == 'L') {
                morseWord += ".-..";
            }
            else if (ch == 'M') {
                morseWord += "--";
            }
            else if (ch == 'N') {
                morseWord += "-.";
            }
            else if (ch == 'O') {
                morseWord += "---";
            }
            else if (ch == 'P') {
                morseWord += ".--.";
            }
            else if (ch == 'Q') {
                morseWord += "--.-";
            }
            else if (ch == 'R') {
                morseWord += ".-.";
            }
            else if (ch == 'S') {
                morseWord += "...";
            }
            else if (ch == 'T') {
                morseWord += "-";
            }
            else if (ch == 'U') {
                morseWord += "..-";
            }
            else if (ch == 'V') {
                morseWord += "...-";
            }
            else if (ch == 'W') {
                morseWord += ".--";
            }
            else if (ch == 'X') {
                morseWord += "-..-";
            }
            else if (ch == 'Y') {
                morseWord += "-.--";
            }
            else if (ch == 'Z') {
                morseWord += "--..";
            }
            JOptionPane.showMessageDialog(null, "Your message in morse code is: " + ch);
        }
       
         
       
    
    }
}
