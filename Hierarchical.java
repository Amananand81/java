class personal{
    String name;
    String address;
    String phone;
    int dob;
    public personal(){
        name=new String();
        address=" ";
        phone=" ";
        dob=0;
    }
    public personal(String name,String address,String phone,int dob){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.dob=dob;
    }
    public void show(){
        System.out.println("name: "+this.name);
        System.out.println("address: "+this.address);
        System.out.println("phone: "+this.phone);
        System.out.println("dob: "+this.dob);
    }
}
class student extends personal{
    int id;
    float fee;
    String courses;
    student(){
        super();
        id=0;
        fee=0;
        courses=" ";
    }
    student(String name,String address,String phone,int dob, int id,float fee,String courses){
        super(name,address,phone,dob);
        this.id=id;
        this.fee=fee;
        this.courses=courses;
    }
    public void show(){
        super.show();
        System.out.println("id: "+this.id);
        System.out.println("fee: "+this.fee);
        System.out.println("courses: "+this.courses);
        System.out.println("********************************************");
    }
}
class teacher extends personal{
    int id;
    String subject;
    float salary;
    public teacher(){
        super();
        id=0;
        subject=" ";
        salary=0;
    }
    public teacher(String name,String address,String phone,int dob,int id,String subject,float salary){
        super(name,address,phone,dob);
        this.id=id;
        this.subject=subject;
        this.salary=salary;
       
    }
    public void show(){
        super.show();
        System.out.println("id: "+this.id);
        System.out.println("address: "+this.subject);
        System.out.println("salary: "+this.salary);
    }
    
    
}
class Hierarchical{
    public static void main(String arg[]){
        student s=new student("Aman","patahi","8709014819",2002,1,96000,"mca");
        s.show();
        teacher t=new teacher("sanjay","pune","7038978789",1989,1,"Java",55000);
        t.show();
    }
}