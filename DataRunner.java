import java.util.Scanner;

public class DataRunner {

  public static void main(String[] args) {

    Birds information = new Birds("names.txt", "status.txt", "colors.txt", "diets.txt"); //makes a new Birds
  
//information.printBirdieInfo();

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What feature of birds are you looking for?");
    String traits = myObj.nextLine();  // Read user input
    System.out.println("You chose: " + traits);  // Output user input

      System.out.println("What " + traits + " are you looking for?");

    if(traits.equals("Color")) {
        System.out.println("Searchable Colors: | Red | Brown | White | Black | Grey | Green | Yellow | Pink | Blue.");
    }

    if(traits.equals("Name")) {
      System.out.println("Don't be lazy. Search up bird names yourself.");
    }

    if(traits.equals("Status")) {
      System.out.println("Searchable Statuses: | Least Concern | Vulnerable | Near Threatened | Endangered | Critically Endangerd");
    }
      
      String userAnswer = myObj.nextLine(); //stores the next answer the user types

      if(traits.equals("Diet")) { //checks if the user typed Diet
        
          System.out.println("Birds that eat: " + userAnswer);
        
              BirdieInfo[] answers = Birds.inquiryAnswer(userAnswer); //makes answers equal to the inquiryAnswer method with the argument of userAnswer
        
            System.out.println(answers); //prints the array "answers"
        System.out.println("Ommitted " + Birds.ommittedResults + " results!");
      }

      String secondCheck = (userAnswer);
         
     if(traits.equals("Color")) {
      System.out.println("Birds that are the color: " + secondCheck);
       
          BirdieInfo[] colorAnswers = Birds.inquiryAnswerColor(secondCheck);
       
      System.out.println(colorAnswers);
        System.out.println("Ommitted " + Birds.ommittedResults + " results!");
      }

 String thirdCheck = (userAnswer);
         
     if(traits.equals("Status")) {
       
      System.out.println("Birds that are the status: " + thirdCheck);
       
          BirdieInfo[] statusAnswers = Birds.inquiryAnswerStatus(thirdCheck);
       
      System.out.println(statusAnswers);
        System.out.println("Ommitted " + Birds.ommittedResults + " results!");
      }

  String fourthCheck = (userAnswer);
         
     if(traits.equals("Name")) {
       
      System.out.println("Birds that have the name: " + fourthCheck);
       
          BirdieInfo[] nameAnswers = Birds.inquiryAnswerName(fourthCheck);
       
      System.out.println(nameAnswers);
        System.out.println("Ommitted " + Birds.ommittedResults + " results!");
      }       

      
      //for (String index : answers) {
          ///System.out.println(index); //prints data from bird at a specific position
      //}
     


    

  // if(traits.equals("Status")) {
      
   // }
  // if(traits.equals("Color")) {
      
  //  }

    
    
  }
}
