package mahfuz;

public class Student {
  String name = "";
  int id;
  static String universityName = "";

  Student() {
//    System.out.println("default constructor");
  }

  Student(int id) {
    this.id = id;
//    System.out.println("parameterized constructor");
  }

  Student(String name, int id) {
    this.name = name;
    this.id = id;
//    System.out.println("parameterized constructor");
  }

  void display() {
    System.out.println(universityName);
  }
}

    /*
        Name: Mahfuzur Rahman Chowdhury
        ID: 2012020117
        Section: C
        Email: cse_2012020117@lus.ac.bd
        Date: 5th August, 2021
    */
