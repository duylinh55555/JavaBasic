package CollectionsExample;

public class Book {
   private String id;
   private String title;
   private String author;
   private int numberOfPage;

   public Book(String id, String title, String author, int numberOfPage) {
      this.id = id;
      this.title = title;
      this.author = author;
      this.numberOfPage = numberOfPage;
   }

   public String GetID() {
      return this.id;
   }

   public void SetID(String id) {
      this.id = id;
   }

   public String GetTitle() {
      return this.title;
   }

   public void SetTitle(String name) {
      this.title = name;
   }

   public String GetAuthor() {
      return this.author;
   }

   public void SetAuthor(String author) {
      this.author = author;
   }

   public float GetNumberOfPage() {
      return this.numberOfPage;
   }

   public void SetNumberOfPage(int numberOfPage) {
      this.numberOfPage = numberOfPage;
   }
}
