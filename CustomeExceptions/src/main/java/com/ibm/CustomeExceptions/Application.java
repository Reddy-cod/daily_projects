package com.ibm.CustomeExceptions;

class ElectionVoting {
    public void register(int age)throws IllegalAgeException {
  	  if(age<18) {
  		  throw new IllegalAgeException();
  	  }
  	  System.out.println("Registration completed");
    }
}
class IllegalAgeException extends Exception {
	public String getMessage() {
		return "You should be 18 or above to do the registration";
	}
}

public class Application {
       public static void main(String args[]) {
    	   System.out.println("start");
    	   ElectionVoting electionVoting=new ElectionVoting();
    	   try {
    		   electionVoting.register(17);
    	   }catch (IllegalAgeException e) {
    		  e.printStackTrace();
    	   }
    	   System.out.println("end");
       }
}
