public class Student {

  private String Name;
  private int Age;
  private String dateOfBirth;

  public Student(String name, int age, String dateOfBirth) {
    Name = name;
    Age = age;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetdateOfBirth() {return dateOfBirth;}
  
  public String ToString() {
    return Name + " " + dateOfBirth + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3){
      return new Student("Parse Error", -1, "Unknown");
    }
    return new Student(data[0], Integer.parseInt(data[1]), data[2]);
  }
}