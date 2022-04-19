import java.util.Scanner;
import java.util.*;

class AddressBookMain
{
	public static void main(String args[])
	{
		System.out.println("Welcome To AddressBook !");
		Contacts.createContact("Padmaja Eknarayan", "IT park chakan", "pune", "maharashtra", "430501", "9067679078", "opsdsnmn@gmail.com");
	}
}

class Contacts
{
	/**creating contact using Arraylist **/

	static void createContact(String name, String address, String city, String state, String zipCode, String phoneNo, String email)
	{
		ArrayList<String> firstContact = new ArrayList<String>(7);
				
		firstContact.add(name);
		firstContact.add(address);
		firstContact.add(city);
		firstContact.add(state);
		firstContact.add(zipCode);
		firstContact.add(phoneNo);
		firstContact.add(email);
			
		System.out.println(firstContact );
		
	}
}