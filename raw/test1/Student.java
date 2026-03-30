public class Student{
private String name;
private int age;
private int student_id;

    public Student(String name, int age, int student_id) {
        this.name = name;
        this.age = age;
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {

        if (age > 9){
            this.age = age;
        }else {
          throw new IllegalArgumentException("Age must be more than 9");
        }

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", student_id=" + student_id +
                '}';
    }
}