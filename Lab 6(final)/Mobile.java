import java.util.ArrayList;

public class Mobile {

   private String mobileOwnerName, mobileNumber, mobileBalance, mobileOSName;
   private boolean lock;
   private AddressBook addressBook;
   private ArrayList<Message> messages;

  public Mobile() {
    this.messages = new ArrayList<Message>();
  }

  public Mobile(String mobileOwnerName, String mobileNumber, String mobileBalance, String mobileOSName, boolean lock, AddressBook addressBook) {
    this.messages = new ArrayList<Message>();
    this.mobileOwnerName = mobileOwnerName;
    this.mobileNumber = mobileNumber;
    this.mobileBalance = mobileBalance;
    this.mobileOSName = mobileOSName;
    this.lock = lock;
    this.addressBook = addressBook;
  }

  public String getMobileOwnerName() {
    return mobileOwnerName;
  }

  public void setMobileOwnerName(String mobileOwnerName) {
    this.mobileOwnerName = mobileOwnerName;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public String getMobileBalance() {
    return mobileBalance;
  }

  public void setMobileBalance(String mobileBalance) {
    this.mobileBalance = mobileBalance;
  }

  public String getMobileOSName() {
    return mobileOSName;
  }

  public void setMobileOSName(String mobileOSName) {
    this.mobileOSName = mobileOSName;
  }

  public boolean isLock() {
    return lock;
  }

  public void setLock(boolean lock) {
    this.lock = lock;
  }

  public AddressBook getAddressBook() {
    return addressBook;
  }

  public void setAddressBook(AddressBook addressBook) {
    this.addressBook = addressBook;
  }

  void showInfo(){
    System.out.println("Information about contacts: \n" +
            "Owner's name: " + this.mobileOwnerName + "\n" +
            "Number: " + this.mobileNumber + "\n" +
            "Balance: " + this.mobileBalance + "\n" +
            "Lock status: " + this.lock + "\n" +
            "OS name: " + this.mobileOSName + "\n");
  }

  void sendMessage(String content, Contact receiver) {
    if (!this.lock) {
      String date = "Today";
      Contact self = new Contact(this.mobileOwnerName, this.mobileNumber);
      Message text = new Message(self, receiver, date, content);
      text.showInfo();
    }
  }

  void showAllmessages() {
    if (!this.lock) {
      for (int i = 0; i < messages.size(); i++) {
        messages.get(i).showInfo();
      }
    }
  }
}
