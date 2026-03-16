//Design an interface AdvancedArithmetic which contains a method 
//signature int divisor_sum(int n). You need to write a class called 
//MyCalculator which implements the interface. divisor_sum(int n) function 
//takes an integer as input and return the sum of all its divisors. Divisors of 6 
//are 1, 2, 3 and 6, so divisor_sum should return 12. (0<n<100) 

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    int sum=0;
    public int divisor_sum(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
class lab1_interface{
    public static void main(String arg[]){
        MyCalculator m=new MyCalculator();
        int res=m.divisor_sum(6);
        System.out.println("sum: "+res);
    }
}
