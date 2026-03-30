public class Show {
    public static void main(String[] args){
        Book book1 = new Book("Archemy of souls", "Korean", "123-23457-22", 10000);
        Book book2 = new Book("Vulcaniser", "Chinese", "123-23434-22", 150000);
        Book book3 = new Book("Mechnaic", "Amerciacan", "123-23987-22",2000);

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Book 3: " + book3);
    }
}