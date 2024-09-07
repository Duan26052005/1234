package overloading;
class Calculation3 {
int sum(int a, int b){System.out.println(a+b);}
double sum(int a,int b){System.out.println(a+b);} 
    
    public static void main(String[] args) {
        Calculation obj =new Calculation();
        int result=obj.sum(20,20);
    }
}
    

