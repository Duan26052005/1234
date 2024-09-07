package constructor;
public class Student4 {
    int id;
    String name;
    Student4(){System.out.println("default constructor is invoked");}
    Student4(int id,String name){
        this();
        this.id=id;
        this.name=name;
    }
    void display(){System.out.println(id+" "+name);}
    public static void main(String[] args) {
        Student4 e1 = new Student4(111,"Karan");
        Student4 e2 =new Student4(222,"Aryan");
        e1.display();
        e2.display();
        
    }
}
