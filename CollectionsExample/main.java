package CollectionsExample;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.TreeMap;

public class main {
   public static List<Student> SearchByID_List(String id, List<Student> arrayList) {
      ArrayList<Student> list = new ArrayList<>();

      Collections.sort(arrayList, Student.IDComparator);

      for (Student iterator : arrayList) {
         if (iterator.GetID() == id.toUpperCase())
            list.add(iterator);
      }

      return list;
   }

   public static List<Student> SearchByName_List(String name, List<Student> arrayList) {
      ArrayList<Student> list = new ArrayList<>();

      Collections.sort(arrayList, Student.NameComparator);

      for (Student iterator : arrayList) {
         if (iterator.GetName() == name.toUpperCase())
            list.add(iterator);
      }

      return list;
   }

   public static List<Student> SearchByGPA_List(double gpa, List<Student> arrayList) {
      ArrayList<Student> list = new ArrayList<>();

      Collections.sort(arrayList, Student.GPAComparator);

      for (Student iterator : arrayList) {
         if (iterator.GetGPA() == gpa)
            list.add(iterator);
      }

      return list;
   }

   public static List<Student> SearchByName_TreeSet(String name, TreeSet<Student> treeSet) {
      ArrayList<Student> list = new ArrayList<>();

      for (Student iterator : treeSet) {
         if (iterator.GetName() == name.toUpperCase())
            list.add(iterator);
      }

      return list;
   }

   public static List<Student> SearchByID_HashSet(String id, HashSet<Student> hashSet) {
      ArrayList<Student> list = new ArrayList<>();

      for (Student iterator : hashSet) {
         if (iterator.GetID() == id.toUpperCase())
            list.add(iterator);
      }

      return list;
   }

   public static Student SearchByKey_TreeMap(String key, TreeMap<String, Student> treeMap) {
      return treeMap.get(key);
   }

   public static Student SearchByKey_HashMap(String key, HashMap<String, Student> hashMap) {
      return hashMap.get(key);
   }

   public static void main(String[] args) {
      Student student1 = new Student("HV01", "Linh", "IT1", 9.3);
      Student student2 = new Student("HV02", "Ngo", "IT2", 8.3);
      Student student3 = new Student("HV03", "Tai", "IT3", 6.3);
      Student student4 = new Student("HV04", "Phan", "IT4", 5.3);
      Student student5 = new Student("HV05", "Son", "IT1", 5);
      Student student6 = new Student("HV06", "Dan", "IT2", 6.3);
      Student student7 = new Student("HV07", "Hanh", "IT3", 7);
      Student student8 = new Student("HV08", "Nam", "IT4", 8.3);
      Student student9 = new Student("HV09", "Thi", "IT1", 9.5);
      Student student10 = new Student("HV10", "Van", "IT2", 7.2);

      Book book1 = new Book("B001", "IT", "Stephen King", 320);
      Book book2 = new Book("B002", "IT2", "Stephen King", 320);
      Book book3 = new Book("B003", "AoE", "Stephen King", 320);
      Book book4 = new Book("B004", "Project T", "Stephen King", 320);
      Book book5 = new Book("B005", "Call My Name", "Stephen King", 320);
      Book book6 = new Book("B006", "Three Are Legends", "Stephen King", 320);
      Book book7 = new Book("B007", "Demons And Angle", "Stephen King", 320);
      Book book8 = new Book("B008", "Da Vinci Code", "Stephen King", 320);
      Book book9 = new Book("B009", "Godfather", "Stephen King", 320);
      Book book10 = new Book("B010", "Adventure To The West", "Stephen King", 320);

      ArrayList<Student> arrayListStudents = new ArrayList<>();
      arrayListStudents.add(student1);
      arrayListStudents.add(student2);
      arrayListStudents.add(student3);
      arrayListStudents.add(student4);
      arrayListStudents.add(student5);
      arrayListStudents.add(student6);
      arrayListStudents.add(student7);
      arrayListStudents.add(student8);
      arrayListStudents.add(student9);
      arrayListStudents.add(student10);

      LinkedList<Student> linkedListStudents = new LinkedList<>();
      linkedListStudents.addAll(arrayListStudents);
      TreeSet<Student> treeSetStudents = new TreeSet<>();
      treeSetStudents.addAll(arrayListStudents);
      HashSet<Student> hashSetStudents = new HashSet<>();
      hashSetStudents.addAll(arrayListStudents);
      TreeMap<String, Student> treeMapStudents = new TreeMap<String, Student>();
      treeMapStudents.put("1", student1);
      treeMapStudents.put("3", student2);
      treeMapStudents.put("5", student3);
      treeMapStudents.put("7", student4);
      treeMapStudents.put("2", student6);
      HashMap<String, Student> hashMapStudents = new HashMap<>();
      hashMapStudents.putAll(treeMapStudents);

      LinkedList<Book> linkedList = new LinkedList<>();
      linkedList.add(book1);
      linkedList.add(book2);
      linkedList.add(book3);
      linkedList.add(book4);
      linkedList.add(book5);
      linkedList.add(book6);
      linkedList.add(book7);
      linkedList.add(book8);
      linkedList.add(book9);
      linkedList.add(book10);

      List<Student> s1 = SearchByID_List("HV03", arrayListStudents);
      for (int i = 0; i < s1.size(); i++) {
         s1.get(i).Print();
      }

      List<Student> s2 = SearchByGPA_List(7, linkedListStudents);
      for (int i = 0; i < s2.size(); i++) {
         s2.get(i).Print();
      }

      List<Student> s3 = SearchByName_TreeSet("Linh", treeSetStudents);
      for (int i = 0; i < s3.size(); i++) {
         s3.get(i).Print();
      }

      List<Student> s4 = SearchByID_HashSet("Linh", hashSetStudents);
      for (int i = 0; i < s4.size(); i++) {
         s4.get(i).Print();
      }

      System.out.println(SearchByKey_TreeMap("Hoa", treeMapStudents));
      for (Map.Entry<String, Student> entry : treeMapStudents.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
      }

      System.out.println(SearchByKey_HashMap("Hoa", hashMapStudents));
      for (Map.Entry<String, Student> entry : hashMapStudents.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
      }
   }
}