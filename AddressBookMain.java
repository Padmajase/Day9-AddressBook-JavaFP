import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class AddressBookMain
{
	public static void main(String args[])
	{
		System.out.println("	 Welcome To AddressBook !");
		System.out.println("	**************************");
		
		Contacts.deleteContact();
	}
}

class Contacts
{
	static void deleteContact()
	{
		ArrayList<String> firstContact = new ArrayList<String>(7);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ");		
		System.out.println("Enter the contact details  : ");
		System.out.println("name address city state zip phoneNo email  : ");
		
		/**adding contact using for loop and Arraylist **/

		for(int i =0; i<7; i++)
		{
			String s = sc.nextLine();
			firstContact.add(s);
		}
		System.out.println(" -------------------------------------------");
		System.out.println("contact details added :");
		System.out.println(firstContact );
	
		System.out.println(" ");
		System.out.println("Enter the name of contact that have to delete  : ");
		String nameToDelete = sc.nextLine();
	
		/**deleting the added contact using Arraylist method **/
	
		if(nameToDelete.equals(firstContact.get(0)))
		{
			firstContact.removeAll(firstContact);
		}
		System.out.println(" ");
		System.out.println("contact deleted successfuly ");
		System.out.println(firstContact );
		
	}
}