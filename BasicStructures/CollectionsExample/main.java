package CollectionsExample;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class main {
   public static void main(String[] args) {
      SimpleDateFormat dFormatter = new SimpleDateFormat("dd/MM/yyyy");

      Student student1 = new Student("HV01", "Linh", dFormatter.parse("20/12/1999"), "IT1", 9.3);
      Student student2 = new Student("HV02", "Ngo", dFormatter.parse("20/12/1999"), "IT2", 8.3);
      Student student3 = new Student("HV03", "Tai", dFormatter.parse("20/12/1999"), "IT3", 6.3);
      Student student4 = new Student("HV04", "Phan", dFormatter.parse("20/12/1999"), "IT4", 5.3);
      Student student5 = new Student("HV05", "Son", dFormatter.parse("20/12/1999"), "IT1", 5);
      Student student6 = new Student("HV06", "Dan", dFormatter.parse("20/12/1999"), "IT2", 6.3);
      Student student7 = new Student("HV07", "Hanh", dFormatter.parse("20/12/1999"), "IT3", 7);
      Student student8 = new Student("HV08", "Nam", dFormatter.parse("20/12/1999"), "IT4", 8.3);
      Student student9 = new Student("HV09", "Thi", dFormatter.parse("20/12/1999"), "IT1", 9.5);
      Student student10 = new Student("HV10", "Van", dFormatter.parse("20/12/1999"), "IT2", 7.2);

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

      ArrayList<Student> arrayList = new ArrayList<>();
      arrayList.add(student1);
      arrayList.add(student2);
      arrayList.add(student3);
      arrayList.add(student4);
      arrayList.add(student5);
      arrayList.add(student6);
      arrayList.add(student7);
      arrayList.add(student8);
      arrayList.add(student9);
      arrayList.add(student10);

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

   }
}