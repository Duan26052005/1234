public class NewClass1 {
    int ID;
    String name;
    public NewClass1(int ID, String name) {
        this.ID=ID;
        this.name=name;
        
    }
    void displayInformation(){
        System.out.println("ID:" +ID+"Name:"+name);
    }
    public static void main(String[] args) {
        NewClass1 newclass1=new NewClass1(1,"nam");
        NewClass1 newclass2= new NewClass1(2,"lan");
        newclass1.displayInformation();
        newclass2.displayInformation();
    }
          
}
