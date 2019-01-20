import java.util.Scanner;

public class Cap1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        String input;
        int indexPoint = 0;
        boolean firstConsonant = true; //used as a catch to not use "way" if the word has no vowels
        
        String cont = "";
        
        //welcome message
        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();
        
        
        do { 
        boolean check = true;
        System.out.println("Enter a line to be translated: "); //get user input
        input = scan.nextLine();
       // input = input.toLowerCase(); //convert to lower case
        
        
        //look at each letter of the string and check for a vowel. Once a vowel is found print the rest of the string inclusive.
        //store i into another variable which will act as a bookmark in the string.
        for (int i=0; i < input.length(); i++) {
            
            if ((input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u' || 
                 input.charAt(i) == 'A' || input.charAt(i) == 'E' || input.charAt(i) == 'I' || input.charAt(i) == 'O' || input.charAt(i) == 'U') && 
                 check == true) {
                
                firstConsonant = false; 
                indexPoint = i; //store the index value for use later in the program
                check = false; //set check to false to ensure we only go through the if statement once
                
            }
        }
        
        System.out.print(input.substring(indexPoint)); //prints the first part of our pig latin statement starting with the first vowel onwards
        if (indexPoint == 0 && firstConsonant == false) {
            System.out.print((input.substring(0, indexPoint)) + "way"); //print out the beginning to the point where we found the first vowel and add way
            System.out.println();
        } else {
        System.out.print((input.substring(0, indexPoint)) + "ay"); //print out the beginning to the point where we found the first vowel and add ay
        System.out.println();
        }
        
        do {
        System.out.println("Do you want to continue? (y/n) "); //check if user wants to continue
        cont = scan.nextLine();
        if (!(cont.equalsIgnoreCase("y")) && (!cont.equalsIgnoreCase("n"))) {
            System.out.println("Invalid input. Please enter y or n");
        }
        } while (!(cont.equalsIgnoreCase("y")) && !(cont.equalsIgnoreCase("n"))); //check for valid input and repeat the question if invalid
        
        
        } while (cont.equalsIgnoreCase("y"));
        
        System.out.println("Goodbye!");
     
        scan.close();
    }



    

}