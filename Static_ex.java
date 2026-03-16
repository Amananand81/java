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
