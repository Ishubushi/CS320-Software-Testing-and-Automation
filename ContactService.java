//Author Name: Christopher Barnes

//Date: 08/10/2025

//Course ID: CS320

//Description: This is the contact service. It maintains a list of contacts and has capabilities
//for adding and deleting contacts, as well as updating first name, last name, phone number, and address.

import java.util.ArrayList;

public class ContactService {
	//Start with an ArrayList of contacts to hold the list of contacts
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		//Display the full list of contacts to the console for error checking.
		public void displayContactList() {
			for(int counter = 0; counter < contactList.size(); counter++) {
			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
			System.out.println("\t Phone Number: " + contactList.get(counter).getNumber());
			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
			}
			}
		
		//Adds a new contact using the Contact constructor, then assign the new contact to the list.
		public void addContact(String firstName, String lastName, String number, String address) {
			// Create the new contact
			Contact contact = new Contact(firstName, lastName, number, address);
			contactList.add(contact);
			}
		
		public Contact getContact(String contactID) {
			Contact contact = new Contact(null,null,null,null);
			for (int counter = 0; counter < contactList.size(); counter++) {
				if(contactList.get(counter).getContactID().equals(contactID)) {
					contact = contactList.get(counter);
				}
			}
			return contact;
		}

		public void updateFirstName(String contactID, String newName) {
			// TODO Auto-generated method stub
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getContactID().equals(contactID)) {
					contactList.get(counter).setFirstName(newName);
					break;
				}
				if(counter == contactList.size() - 1) {
					System.out.println("Contact ID: " + contactID + " not found");
				}
			}
		}

		public void updateLastName(String newLastName, String contactID) {
			// TODO Auto-generated method stub
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getContactID().equals(contactID)) {
					contactList.get(counter).setLastName(newLastName);;
					break;
				}
				if(counter == contactList.size() - 1) {
					System.out.println("Contact ID: " + contactID + " not found");
				}
			}
		}
		
		public void updateNumber(String newNumber, String contactID) {
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getContactID().equals(contactID)) {
					contactList.get(counter).setPhoneNumber(newNumber);
					break;
				}
				if(counter == contactList.size() - 1) {
					System.out.println("Contact ID: " + contactID + " not found");
				}
			}
		}
		
		public void updateAddress(String newAddress, String contactID) {
			for (int counter = 0; counter < contactList.size(); counter++) {
				if (contactList.get(counter).getContactID().equals(contactID)) {
					contactList.get(counter).setAddress(newAddress);
					break;
				}
				if(counter == contactList.size() - 1) {
					System.out.println("Contact ID: " + contactID + " not found");
				}
			}
		}
}
