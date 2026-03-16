// final keyword in jave is used to restrict the user. 
// final keyword is used with in different context such as
//1. final variable: when we declare a variable as final we can not change the value of that variable. it is constant.
//2. final method: when we declere a methof as final we can not override that function in child class.
//3. final class: when we define a class as final we can not inherit that class.

final class bike{
    final int speed=100;
    final void show(){
        System.out.printf("bike speed"+ speed);
    }
}
class FinalEx{
    public static void main(String arg[]){
        bike b=new bike();
        b.show();
    }
}
