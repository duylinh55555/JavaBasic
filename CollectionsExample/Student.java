package CollectionsExample;

import java.util.*;

public class Student implements Comparable<Student> {
   private String id;
   private String name;
   // private Date dateOfBirth;
   private String major;
   private double gpa;

   public Student(String id, String name, String major, double gpa) {
      this.id = id;
      this.name = name;
      // this.dateOfBirth = dateOfBirth;
      this.major = major;
      this.gpa = gpa;
   }

   public String GetID() {
      return this.id;
   }

   public void SetID(String id) {
      this.id = id;
   }

   public String GetName() {
      return this.name;
   }

   public void SetName(String name) {
      this.name = name;
   }

   // public Date GetDateOfBirth() {
   // return this.dateOfBirth;
   // }

   // public void SetDateOfBirth(Date dateOfBirth) {
   // this.dateOfBirth = dateOfBirth;
   // }

   public String GetMajor() {
      return this.major;
   }

   public void SetMajor(String major) {
      this.major = major;
   }

   public double GetGPA() {
      return this.gpa;
   }

   public void SetGPA(float gpa) {
      this.gpa = gpa;
   }

   public void Print() {
      System.out.println("ID: " + id + ", Name: " + name + ", Major: " + major + ", GPA: " + gpa);
   }

   @Override
   public int compareTo(Student student) {
      return GetName().compareTo(student.GetName());
   }

   public static Comparator<Student> NameComparator = new Comparator<Student>() {
      public int compare(Student student1, Student student2) {
         String name1 = student1.GetName().toUpperCase();
         String name2 = student2.GetName().toUpperCase();

         return name1.compareTo(name2);
      }
   };

   public static Comparator<Student> IDComparator = new Comparator<Student>() {
      public int compare(Student student1, Student student2) {
         String id1 = student1.GetID().toUpperCase();
         String id2 = student2.GetID().toUpperCase();

         return id1.compareTo(id2);
      }
   };

   public static Comparator<Student> GPAComparator = new Comparator<Student>() {
      public int compare(Student student1, Student student2) {
         double gpa1 = student1.GetGPA();
         double gpa2 = student2.GetGPA();

         if (gpa1 > gpa2)
            return 1;
         else if (gpa1 == gpa2)
            return 0;
         else
            return -1;
      }
   };
}
