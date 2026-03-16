//static keyword is used to create class level members.it can be variable, method, block and nested class.
//1.static variable: when we declare a variable as static it is shared by all the objects of that class. it is also called class variable.
//2. static method: when we declare a method as static we can call that method without creating an object of that class. it is also called class method.


class std1{
    static String college="IICMR college";
    int id;
    String name;
    static{
        System.out.println("this is static block");    
    }
    std1(int id,String name){
        this.id=id;
        this.name=name;
    }
    static void changeCollege(){
        college="ABC college";
    }
    void display(){
        System.out.println("id: "+this.id);
        System.out.println("name: "+this.name);
        System.out.println("college: "+college);
    }
}
class Static_ex{
    public static void main(String arg[]){
        std1 s=new std1(1,"Aman");
        s.display();
    }
}
