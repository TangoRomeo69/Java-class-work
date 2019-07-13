public class Main {

  public static void  main(String[] args){
    Contact c1 = new Contact("A", "1", "12345", 20, 'M');
    Contact c2 = new Contact("B", "2", "12346", 21, 'F');
    Contact c3 = new Contact("C", "3", "12347", 22, 'M');
    AddressBook phoneBook = new AddressBook("A", "PhoneBook");
    phoneBook.addContact(c1);
    phoneBook.addContact(c2);
    phoneBook.addContact(c3);
    Mobile samsung = new Mobile("D", "Samsung", "100", "Android", false, phoneBook);
    samsung.showInfo();
    samsung.sendMessage("Hello A", c1);
    samsung.sendMessage("Hello B", c2);
    samsung.showAllmessages();
  }
}
