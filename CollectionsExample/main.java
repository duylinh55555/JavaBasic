package CollectionsExample;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.TreeMap;

public class main {
   public static Student SearchByID_List(String id, List<Student> arrayList) {
      Collections.sort(arrayList, Student.IDComparator);

      int student = Collections.binarySearch(arrayList, new Student(id, null, null, 0), Student.IDComparator);

      return arrayList.get(student);
   }

   public static Student SearchByName_List(String name, List<Student> arrayList) {
      Collections.sort(arrayList, Student.NameComparator);

      int student = Collections.binarySearch(arrayList, new Student(null, name, null, 0), Student.NameComparator);

      return arrayList.get(student);
   }

   public static Student SearchByGPA_List(double gpa, List<Student> arrayList) {
      Collections.sort(arrayList, Student.NameComparator);

      int student = Collections.binarySearch(arrayList, new Student(null, null, null, gpa), Student.GPAComparator);

      return arrayList.get(student);
   }

   public static boolean SearchByName_Set(String name, Set<Student> studentSet) {
      Set<Student> set = new TreeSet<Student>(Student.NameComparator);
      set.addAll(studentSet);

      return set.contains(new Student(null, name, null, 0));
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

      Student s1 = SearchByID_List("HV03", arrayListStudents);
      s1.Print();

      Student s2 = SearchByGPA_List(7, linkedListStudents);
      s2.Print();

      boolean s3 = SearchByName_Set("Linh", treeSetStudents);
      System.out.println("Found !");

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