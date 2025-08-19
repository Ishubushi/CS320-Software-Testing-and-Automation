//Author Name: Christopher Barnes

//Date: 08/10/2025

//Course ID: CS320

//Description: This is the unit tests for the contact service (ContactServiceTest)

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;



@TestMethodOrder(OrderAnnotation.class)

class ContactServiceTest {
	ArrayList<Contact> contactList = new ArrayList<Contact>();
	/*
	* The following tests exercise the ContactService class.
	* In each test, a new service is created with default values for each field.
	* Then the service is requested to make some change to the list of contacts and the result
	* is tested to ensure the actual field matches what is expected.
	*
	* Because each contact that gets created has a new automatically assigned contactID,
	* and the tests are run based on that contactID, the order in which the tests are run depend
	* on the value of each contactID. Therefore, the @Order annotation is used to keep the tests
	* in a specific order.
	*
	* For evidence that the contactID is correct for each test, uncomment the service.displayContactList();
	* prior to each assertion so that the records are displayed on the console for error checking.
	*/
	@Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Poppy Lane");
		service.updateFirstName("0", "Lilly");
		service.displayContactList();
		assertEquals("Lilly",service.getContact("0").getFirstName(), "First name was not updated.");
		}
	
	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "5555551111", "123 Lollypop Lane");
		service.updateLastName( "Jupiter","2");
		service.displayContactList();
		assertEquals("Jupiter",service.getContact("2").getLastName(), "Last name was not updated.");
		}
	
	@Test
	@DisplayName("Test to update the phone number")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "1728381882", "123 Lollypop Lane");
		service.updateNumber("1908882323", "4");
		service.displayContactList();
		assertEquals("1908882323", service.getContact("4").getNumber(), "The phone number was not updated.");
	}
	
	@Test
	@DisplayName("Test to update the address")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("Dr.", "Cross", "1728381882", "123 Lollypop Lane");
		service.updateAddress("723 Gloryland Way", "6");
		service.displayContactList();
		assertEquals("723 Gloryland Way", service.getContact("6").getAddress(), "The address was not updated");
	}

}
