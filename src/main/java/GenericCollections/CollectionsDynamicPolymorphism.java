package GenericCollections;

import java.util.*;

public class CollectionsDynamicPolymorphism {
  public static void main(String[] args) {
    List<Student2> studentList1 = new ArrayList<Student2>();
    List<Student2> studentList2 = new LinkedList<Student2>();

    Student2 s1 = new Student2("Sujit",1);
    Student2 s2 = new Student2("Siddharth",2);
    Student2 s3 = new Student2("Karanpreet",3);
    Student2 s4 = new Student2("Hari",5);
    Student2 s5 = new Student2("Tricha",4);

    studentList1.add(s1);
    studentList1.add(s2);
    studentList1.add(s3);

    studentList2.add(s4);
    studentList2.add(s5);

    printStudentList(studentList1);
    printStudentList(studentList2);


  }

  //polymorphic function with object-parameter having parent interface(List) reference

  public static void printStudentList(List<Student2> students) {
    System.out.println("Printing student details.....");
    for(Student2 s : students) {
      System.out.println(s.getDetails());
    }
  }
}

class Student2 {
  private final String name;
  private final int rollNumber;

  public Student2(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getDetails() {
    return
      "name = " + this.name + '\n' +
      "roll number = " + this.rollNumber + '\n';
  }
}

/*
  SUMMARY
  =======

  printStudents as a polymorphic function. It uses List (which is a super-class of ArrayList and List) 
    instead of ArrayList or LinkedList, thus inter-operates smoothly with both types.
*/
