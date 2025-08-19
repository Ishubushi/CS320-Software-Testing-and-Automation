//Author Name: Christopher Barnes

//Date: 08/10/2025

//Course ID: CS320

//Description: This is the unit tests for the contact class (ContactTest).

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
	/*
	* The following tests exercise the Contact class.
	* The first 5 tests to make sure the field does not become longer than the constraint
	* (10 characters for first and last name, exactly 10 characters for phone number,
	* and 30 characters for the address).
	* The last 4 tests ensure that each field is not null.
	* ContactID is not tested for being not null because there isn't a way to create
	* a contact with a null contactID. Likewise it is not tested for being non-updateable
	* because there is no way to update it.
	*/
	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName","LastName","PhoneNumbr","Address");
		if(contact.getContactID().length() > 10) {
		fail("Contact ID has more than 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact First Name cannot have more than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("OllyOllyOxenFree","LastName","PhoneNumbr","Address");
		if(contact.getFirstName().length() > 10) {
		assertEquals(10, contact.getFirstName().length(), "First name was not shortened to 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact Last Name cannot have more than 10 characters")
	void testContactLastNameWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName","PlutoIsStillAPlanet","PhoneNumbr","Address");
		if(contact.getLastName().length() > 10) {
		assertEquals(10, contact.getLastName().length(), "Last name was not shortened to 10 characters.");
		}
	}
	
	@Test
	@DisplayName("Contact phone number is exactly 10 characters")
	void testContactNumberWithMoreThanTenCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "1112223232", "Address");
		if (contact.getNumber().length() != 10) {
			fail("Phone number length does not equal 10.");
		}
	}
	
	@Test
	@DisplayName("Contact address cannot have more than 30 charactesr")
	void testContactAddressWithMoreThanThirtyCharacters() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", "If the address is longer than this message than that means it has too many characters in it");
		if(contact.getAddress().length() > 30) {
			fail("Address has more than 30 characters in it.");
		}
	}
	
	@Test
	@DisplayName("Contact First Name shall not be null")
	void testContactFirstNameNotNull() {
		Contact contact = new Contact(null, "LastName", "PhoneNumbr", "Address");
		assertNotNull(contact.getFirstName(), "First name was null");
	}
	
	@Test
	@DisplayName("Contact Last Name shall not be null")
	void testContactLastNameNotNull() {
		Contact contact = new Contact("FirstName", null, "PhoneNumbr", "Address");
		assertNotNull(contact.getLastName(), "Last name was null");
	}
	
	@Test
	@DisplayName("Contact Phone Number shall not be null")
	void testContactPhoneNumberNotNull() {
		Contact contact = new Contact("FirstName","Last Name", null, "Address");
		assertNotNull(contact.getNumber(), "Phone Number was null");
	}
	
	@Test
	@DisplayName("Contact Address shall not be null")
	void testContactAddressNotNull() {
		Contact contact = new Contact("FirstName", "LastName", "PhoneNumbr", null);
		assertNotNull(contact.getAddress(), "Address was null");
	}
	
}
