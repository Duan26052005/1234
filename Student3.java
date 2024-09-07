package construtor;
public class Student3 {
    int id;
    String name;
    
    Student3(int i, String n){
        id=i;
        name =n;
    }
    void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        Student3 e1= new Student3(111,"Karan");
        Student3 e2= new Student3(222,"Aryan");
        e1.display();
        e2.display();
    }
}
