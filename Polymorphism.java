package OOP;
// Polymorphism is a technique refers to creating an function with similar name but different Taks , parameters or datatypes are given .
class Student{
    String name;
    int age;
    float height;
    // Constructor:the methods created below is called constructor this can be created manually or if not it will be 
//  public  Student(String name,int age,float height){
//     this.name=name;
//     this.age=age;
//     this.height=height;
//  }
 public void info(String name,int age,float height){
    System.out.println("Name: "+this.name +"\n Age "+this.age+"\n Height"+this.height);
 }
 public void info(String name){
    System.out.println("Student_Name: "+this.name);
 }
 public void info(int age){
    System.out.println("Student_Age "+this.age);
 }
 public void info(float height){
    System.out.println("Student_Height"+this.height);
 }
}
public class Polymorphism {
public static void main(String[] args) {
    //creating object of the class student
    Student s1 = new Student();
    s1.name = "Mihir";
    s1.age = 21;
    s1.height = 4.41f;
    s1.info(s1.name, s1.age , s1.height);
    s1.info(s1.name);
    s1.info(s1.age);
    s1.info(s1.height);

}
    
}
