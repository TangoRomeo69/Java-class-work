public class Contact {

  private String personName, personId, mobileNumber;
  private int age;
  private char gender;

  public Contact() {}

  public Contact(String personName, String mobileNumber) {
    this.personName = personName;
    this.mobileNumber = mobileNumber;
  }

  public Contact(String personName, String personId, String mobileNumber, int age, char gender) {
    this.personName = personName;
    this.personId = personId;
    this.mobileNumber = mobileNumber;
    this.age = age;
    this.gender = gender;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }

  public String getPersonId() {
    return personId;
  }

  public void setPersonId(String personId) {
    this.personId = personId;
  }

  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void showPersonInfo(){
    System.out.println("Information about contacts: \n" +
                        "Name: " + this.personName + "\n" +
                        "ID: " + this.personId + "\n" +
                        "Mobile NO: " + this.mobileNumber + "\n" +
                        "Gender: " + this.gender + "\n" +
                        "Age: " + this.age + "\n");
  }

  public void detectMobileOperator(){
    if(this.mobileNumber.charAt(2) == 7){
      System.out.println("GP");
    }
    else if(this.mobileNumber.charAt(2) == 8){
      System.out.println("Robi");
    }
    else{
      System.out.println("Banglalink");
    }
  }
}
