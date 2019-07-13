public class Message {

  private Contact sender, receiver;
  private String date, content;

  public Message(){}

  public Message(Contact sender, Contact receiver, String date, String content) {
    this.sender = sender;
    this.receiver = receiver;
    this.date = date;
    this.content = content;
  }

  public Contact getSender() {
    return sender;
  }

  public void setSender(Contact sender) {
    this.sender = sender;
  }

  public Contact getReceiver() {
    return receiver;
  }

  public void setReceiver(Contact receiver) {
    this.receiver = receiver;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void showInfo(){
    if(this.sender != null){
      System.out.println("Sender: ");
      this.sender.showPersonInfo();
    }
    if(this.receiver != null){
      System.out.println("Reciever: ");
      this.receiver.showPersonInfo();
    }
    System.out.println("Content: " + this.content + "\n" +
                        "Date: " + this.date);
  }

}
