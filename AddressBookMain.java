import java.util.Scanner;
import java.util.*;

class AddressBookMain
{
	public static void main(String args[])
	{
		System.out.println("	 Welcome To AddressBook !");
		System.out.println("	***********************");
		
		Contacts.createContact();
	}
}

class Contacts
{
	static void createContact()
	{
		ArrayList<String> firstContact = new ArrayList<String>(7);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");		
		System.out.println("Enter the contact details  : ");
		System.out.println("name address city state zip phoneNo email  : ");
		
		/** adding contact details from console **/
		for(int i =0; i<7; i++)
		{
			String s = sc.nextLine();
			firstContact.add(s);
		}
		System.out.println(" -------------------------------------------");
		System.out.println("contact details added :");
		System.out.println(firstContact );
	
		System.out.println(" ");
		System.out.println("Enter which detail you have to edit  : ");
		System.out.println("name or address or city or state or zip or phone or email  : ");
		
		/** editing specific detail which user want **/
		String detailToEdit = sc.nextLine();
		
			switch (detailToEdit) {
			case "name" :
				System.out.println("Enter the name to edit  : ");
				String n = sc.nextLine();
				firstContact.set(0, n);
				break;
			case "address" :
				System.out.println("Enter the address to edit  : ");
				String a = sc.nextLine();
				firstContact.set(1, a);
				break;
			case "city" :
				System.out.println("Enter the name to edit  : ");
				String city = sc.nextLine();
				firstContact.set(2, city);
				break;
			case "state" :
				System.out.println("Enter the name to edit  : ");
				String state = sc.nextLine();
				firstContact.set(3, state);
				break;
			case "zip" :
				System.out.println("Enter the name to edit  : ");
				String zip = sc.nextLine();
				firstContact.set(5, zip);
				break;
			case "phone" :
				System.out.println("Enter the name to edit  : ");
				String phone = sc.nextLine();
				firstContact.set(6, phone);
				break;
			case "email" :
				System.out.println("Enter the name to edit  : ");
				String email = sc.nextLine();
				firstContact.set(7, email);
				break;
			default :
				System.out.println("no edit match  : ");
				
			}
			
			System.out.println("----------------------------------------------------- ");
			System.out.println("edited contact details are :");
			System.out.println(firstContact );
		
	}
}