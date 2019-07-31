package capgemini.contactbook;

import java.util.Arrays;

public class ContactOperationImpl implements ContactBookOperation {

	Contact[] contacts;

	public ContactOperationImpl(int size) {
		contacts = new Contact[size];
	}

	@Override
	public void createContact(Contact contact) {
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] == null) {
				contacts[index] = contact;
				break;
			}
		}
	}

	@Override
	public void listAll() {
		System.out.println(Arrays.toString(contacts));
	}

	@Override
	public void deleteContact(String firstName) {
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] != null && contacts[index].getFirstName().equals(firstName)) {
				contacts[index] = null;
			}
		}
	}

	@Override
	public Contact findContact(String firstName) {
		Contact contact = null;
		for (int index = 0; index < contacts.length; index++) {
			if (contacts[index] != null && contacts[index].getFirstName().equals(firstName)) {
				contact = contacts[index];
			}
		}
		return contact;
	}
}