package Collections;

import java.util.*;

public class Student {
   private String id;
   private String name;
   private Date dateOfBirth;
   private String major;
   private float gpa;

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

   public float GetGPA() {
      return this.gpa;
   }

   public void SetGPA(float gpa) {
      this.gpa = gpa;
   }
}
