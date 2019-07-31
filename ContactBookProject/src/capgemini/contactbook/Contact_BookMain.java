package capgemini.contactbook;

import java.util.*;

public class Contact_BookMain {
	public static void main(String[] args) {
		int size=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of contacts: ");
		size=scan.nextInt();
		ContactOperationImpl contactoperationImpl=new ContactOperationImpl(size);
		int choice=0;
		do{
			System.out.println("....Welcome to Contact book....");
			System.out.println("1.Create Contact");
			System.out.println("2.Delete Contact");
			System.out.println("3.List All");
			System.out.println("4.Find the contact");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			switch(choice=scan.nextInt()){
			case 1:{
				
				String firstName,lastName,phoneNumber,email;
				System.out.println("Enter Your First name: ");
				firstName=scan.next();
				System.out.println("Enter Your Last name: ");
				lastName=scan.next();
				System.out.println("Enter Your Phone Number: ");
				phoneNumber=scan.next();
				System.out.println("Enter Your Email ID: ");
				email=scan.next();
				Contact contact=new Contact(firstName, lastName, phoneNumber, email);
				contactoperationImpl.createContact(contact);
				System.out.println("Contact is Created Successfully....");
				break;
			}
			case 2:{
				String firstName;
				System.out.println("Enter the First name you want to delete: ");
				firstName=scan.next();
				contactoperationImpl.deleteContact(firstName);
				System.out.println("Contact is Deleted successfully....");
				break;
			}
			case 3:{
				contactoperationImpl.listAll();
				break;
			}
			case 4:{
				String firstName;
				System.out.println("Enter the First name you want to delete: ");
				firstName=scan.next();
				System.out.println("Found the contact:\n"+contactoperationImpl.findContact(firstName));
			}
			}
			
		}while(choice!=5);
		scan.close();
	}

}
