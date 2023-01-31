package cpt203CW2;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String string) {
		System.out.println("Wrong input");
	}

	public static void main(String[] args) {
		 try  
	        {  
	            // calling the method   
	          String reString = Ticket.getTicketCategory(-1);  
	          System.out.println(reString);
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            // printing the message from InvalidAgeException object  
	          System.out.println("Exception occured at : " + ex);  
	        }  

	}

}
