package ListPack.Assignment;

import java.util.List;
import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contact cnt = null;
		PhoneBook pb = new PhoneBook();
		
		while(true)
		{
			System.out.println("1. Add Contact\n2. View All Contacts\n3. Search\n4. Remove Contact\n5. Exit");
			System.out.println("Pick ur Choice : ");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				cnt = new Contact();
				System.out.println("First Name ");
				cnt.setFirstName(sc.next());

				System.out.println("Last Name ");
				cnt.setLastName(sc.next());

				System.out.println("Phone Number ");
				cnt.setPhoneNumber(sc.nextLong());

				System.out.println("Email  ");
				cnt.setEmailId(sc.next());
				
				pb.addContact(cnt);
				System.out.println("New Contact is Added...");
				break;
			case 2:
				List<Contact> cList = pb.viewAllContacts();
				for(Contact c : cList)
				{
					System.out.println(c.getFirstName() + "\t" + c.getLastName() + "\t" + c.getPhoneNumber() + "\t" + c.getEmailId());
				}
				break;
			case 3:
				System.out.println("Enter Phone Number ");
				long ph = sc.nextLong();
				cnt = pb.viewContactGivenPhone(ph);
				if(cnt!=null)
					System.out.println(cnt.getFirstName() + "\t" + cnt.getLastName() + "\t" + cnt.getPhoneNumber() + "\t" + cnt.getEmailId());
				else
					System.out.println("No Contact Details");
				break;
			case 4:
				System.out.println("Enter Phone Number ");
				ph = sc.nextLong();
				boolean chk = pb.removeContact(ph);
				if(chk==true)
					System.out.println("Contact Deleted");
				else
					System.out.println("No Contact Deleted");
				break;
			case 5:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}
	}
}
