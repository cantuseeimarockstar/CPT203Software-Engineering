package cpt203CW2;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;

class TicketTest {
	@Test
	void lessThan11isFree() {
		Assertions.assertEquals("FREE", Ticket.getTicketCategory(9));
	}
	
	@Test
	void ageCannotBeNegative() {
		Assertions.assertThrows(InvalidAgeException.class, 
		() -> Ticket.getTicketCategory(-1),
			"An Invalid Argument Exception is expcted"); 
	}
}
