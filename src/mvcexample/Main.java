package mvcexample;
/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {


        Model model = new Model();// Create shared database
        Controller1 c1 = new Controller1(model,"Controller1",50,250); // Create first controller
        Controller2 c2 = new Controller2(model,"Controller2",100,300); // Create second controller

        
    } // main
  
} // Main

