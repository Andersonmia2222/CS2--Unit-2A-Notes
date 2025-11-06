public class Main {



   public static void main(String []args) {
      // BOOLEAN VARIABLES can only hold true or false 
      boolean lightsOn = false;
      boolean dannyPresent = true; 


   // BOOLEAN EXPRESSIONS are like questions( or comparison)
   // where the only possible answers are true and false
   boolean exp1 = (danny = true); // is danny here? 
   boolean exp2 = (lightsOn != true); //are the lights NOT on? (off)
   // comparing numerical values 

   int x = 6;
   int y = 7;

   // check for equality using the == operator 
   system.out.println( x== y ); // you 
   //check for NOT equal using the != operator 
   boolen exp3 = (x != y); //store  the boolean exp result in a veriable 
   system.out.println( x < y); // true 
   system.out.println( x > y); // false
   system.out.println( x <= y); // true
   system.out.println( x >= y); // false
   system.out.println( x >= y); // true (ORDER MATTERS w/rel. operators)
   System.out.println( y == y); // true 

   // can you compare ints and doubles?
   double z = 6;
   system.out.println( x== z ); // true (6 and 6.0 are the same thing)
// determine what value/ condition your choice rests on
// Ex: Using the elevator at BWL depends on time 
double time = 7.75; //means 7:45 AM  
 
if (time < 8) {

   // if statment BODY 
   System.out.println( "You can take the elevator!"); 
    
} 

   System.out.println( "The elevator is only available before 8 AM!"); 
// two way selection: If block + else block 

if ( time < 8 ) {

      System.out.println("Eligible for elevator"); 

}
else {
    // Statemnt in else blick runs when if block is false 
     System.out.println("take the satirs");

}

boolean heads = true;
if ( heads == true) {
   System.out.println("Flipped heads ! Wear white."); 

}
else {
 System.out.println( "Flipped heads! Wear black.");

}

// MULTI-WAY SELECTION
//1. NESTING if statements is like asking a "follow up"

int age = 19;
boolean havePermit = false;
System.out.println("lets see if you can take this road test...");
if( age >= 16 ) {
   system.out.println(" Alright, I guess you're old enough..."); 
   // after passing the first condtiton (age >= 16)
   // you ask a follow up (another if statemnt)

   if ( havePermit == true) {
   System.out.println("Fine, get in the car");

   }

}
else {
   System.out.println("You're too young. Grow up.");

}


   

}
   }


