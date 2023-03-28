//Lianna Patel 
//ICS3U 
//For Loops (Problem #2)
//November 2, 2022
//Asks the user for the starting value of their number sequence and the ending number of their sequence. Then ask the user if they want even or odd numbers or steps of an input value! 

import java.util.Scanner;
class Main {
  static void myMethod(int start, int end, int increase) { //start method with parameters
    for (int i = start; i <= end; i = i + increase){ //to calc output (even, odd and step numbers)
      System.out.println(i);
    }}
  public static void main(String[] args) {

    
  Scanner kb = new Scanner(System.in);
    System.out.println("Enter your first value");
    int first = kb.nextInt();
    System.out.println("Enter your second value");
    int last = kb.nextInt();
    String str = "";
    
    for (int i = first; i <= last; i = i + 1) {//to create a list from the first and last value in string format 
    if (i == last){ 
       String str1 = Integer.toString(i);  
      str += str1; //appending the new number to the string 
    }
    else {
    	String str2 = Integer.toString(i);
      str += str2; //appending the new number to the string 
      str += ",";
    }
    }
System.out.println("Do you want odd numbers (1), even numbers (2), or step numbers (3) ?");
    int par = kb.nextInt();
    if (par == 3){ //user inputs 3 it will ask for the step value
      System.out.println("What is the step value?");
      int step = kb.nextInt();
      System.out.println("Here are your numbers:");
      System.out.println(str);
      System.out.println("Here are your numbers:");
      myMethod(first, last, step); 
    }
    else if(par == 1){ //user inputs 1 it outputs odd numbers from the list
      System.out.println("Here are your numbers:");
      System.out.println(str);
      if (first%2 != 0){ //checks if the first number is odd
      System.out.println("Here are your numbers:");
        myMethod(first, last, 2);
      }
      else{
        System.out.println("Here are your numbers:");
        myMethod(first = first + 1, last, 2);
      }
    }
    else if (par == 2){ //user inputs 2 it outputs even numbers from the list
        System.out.println("Here are your numbers:");
        System.out.println(str);
        if (first%2 == 0){ //checks if the first number is odd
        System.out.println("Here are your numbers:");
          myMethod(first, last, 2);
        }
        else{
        System.out.println("Here are my numbers:");
          myMethod(first + 1, last, 2);
        }
    }
    else{
      System.out.println("What is the step value?");
      int step = kb.nextInt();
      System.out.println("Here are your numbers:");
      System.out.println(str);
      System.out.println("Here are your numbers:");
      myMethod(first, last, step);
    }

    
      
        
      
  
  }

    

  }

