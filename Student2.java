package constructor;
public class Student2 {
    int id;
    String name;
Student2(int id, String name){
    id=id;
    name=name;
}
void display(){System.out.println(id+" "+name);}
public static void main(String[] args) {
    Student2 s1 =new Student2(111,"Karan");
    Student2 s2 =new Student2(321,"Arayan");
s1.display();
s2.display();
}
}