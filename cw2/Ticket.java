package cpt203CW2;

public class Ticket {
	public static String getTicketCategory(int age) throws InvalidAgeException {
		if (age >= 0 && age <=11) {
			return "FREE";
		} else if ((age > 11 && age <=21)||(age >=60)) {
			return "HALF";
		}else if (age > 21 && age < 60) {
			return "FULL";
		}else {
			throw new InvalidAgeException("Age cannot be a negative value");
		}
	}
}
//class InvalidAgeException  extends Exception  
//{  
//    public InvalidAgeException (String str)  
//    {  
//        // calling the constructor of parent Exception  
//        super(str);  
//    }  
//}  
