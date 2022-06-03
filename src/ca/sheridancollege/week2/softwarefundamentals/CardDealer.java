/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    private String CzarinaSotelo; // Student no.: 991624256
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clubs", 9);
        nineClubs.setSuit("Diamonds");
        
        Card fourSpades = new Card("Spades", 4); // Step 3: Create an object of Card class in CardDealer.java file 
        fourSpades.setSuit("Hearts");
        
        Card sevenHearts = new Card("Hearts", 7); // Step 6: Safely fetch+merge the code into your NetBeans project. Now create one more object of Card .
        sevenHearts.setSuit("Spades");
        
        System.out.println(fourSpades); // Step 5: Edit your code from GitHub to print the card suit and value which you have just created in CardDealer.java file . 
    }
}
