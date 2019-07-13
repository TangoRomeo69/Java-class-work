import java.util.ArrayList;

public class AddressBook {

  private String ownerName, info;
  private ArrayList<Contact> listOfContact;

  public AddressBook(){
    this.listOfContact = new ArrayList<Contact>();
  }

  public AddressBook(String ownerName, String info){
    this.listOfContact = new ArrayList<Contact>();
    this.ownerName = ownerName;
    this.info = info;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

   public void addContact(Contact con){
    this.listOfContact.add(con);
  }

  public void deleteContact(Contact con){
    this.listOfContact.remove(con);
  }

  public void showAllContactInfo(){
    for(int i = 0 ; i < listOfContact.size(); i++){
      listOfContact.get(i).showPersonInfo();
    }
  }
}
