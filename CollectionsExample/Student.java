package CollectionsExample;

import java.util.*;

public class Student {
   private String id;
   private String name;
   private Date dateOfBirth;
   private String major;
   private double gpa;

   public Student(String id, String name, Date dateOfBirth, String major, double gpa) {
      this.id = id;
      this.name = name;
      this.dateOfBirth = dateOfBirth;
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

   public Date GetDateOfBirth() {
      return this.dateOfBirth;
   }

   public void SetDateOfBirth(Date dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

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
}
