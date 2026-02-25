package ListPack.Assignment;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	List<Contact> phBook = new ArrayList<Contact>();

	public List<Contact> getPhBook() {
		return phBook;
	}

	public void setPhBook(List<Contact> phBook) {
		this.phBook = phBook;
	}
	
	public void addContact(Contact contactObj)
	{
		phBook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts()
	{
		return phBook;
	}
	
	public Contact viewContactGivenPhone(long phoneNumber)
	{
		Contact cnt = null;
		for(Contact c : phBook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
				cnt = c;
				break;
			}
		}
		return cnt;
	}
	
	public boolean removeContact(long phoneNumber)
	{
		boolean chk = false;
		for(Contact c : phBook)
		{
			if(c.getPhoneNumber()==phoneNumber)
			{
				chk = true;
				phBook.remove(c);
				break;
			}
		}
		return chk;
	}
}
