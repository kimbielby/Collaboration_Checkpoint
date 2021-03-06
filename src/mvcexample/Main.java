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
       
        // laura -- instantiaying Controller1 several times
        Controller1 c1b = new Controller1(model, "Controller1", 50, 250); // Creating another controller1
        Controller1 c1c = new Controller1(model, "Controller1", 50, 250); // Creating another controller1
        Controller1 c1d = new Controller1(model, "Controller1", 50, 250); // Creating another controller1
        
        // laura -- instantiating Controller2 several times
        Controller2 c2b = new Controller2(model, "Controller2", 100, 300); // Creating another controller2
        Controller2 c2c = new Controller2(model, "Controller2", 100, 300); // Creating another controller2
        Controller2 c2d = new Controller2(model, "Controller2", 100, 300); // Creating another controller2
        
        // laura -- should create multiple windows that all get updated 
        // at same time when increment A button pressed
        // laura -- tested and it works :)     

        
    } // main
  
} // Main

