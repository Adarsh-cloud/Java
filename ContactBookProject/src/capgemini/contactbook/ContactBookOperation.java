package capgemini.contactbook;

public interface ContactBookOperation {
	public void createContact(Contact contact);
	public void deleteContact(String firstName);
	public Contact findContact(String firstName);
	public void listAll();

}
