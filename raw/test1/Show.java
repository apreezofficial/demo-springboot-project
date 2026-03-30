 public class Show {
     public static void main(String[] args){
        Student precious = new Student("\"Apreez\"", 10, 10);
    System.out.println("Student " + precious.getName() + " created");
    precious.setAge(15);
         System.out.println("Age of  " + precious.getName() + " updated to " + precious.getAge());

    }
}