abstract class InterfaceEx3 {
    String name;
    int age;
  String phoneno;

    InterfaceEx3(String name, int age, String phoneno){
        this.name=name;
        this.age=age;
        this.phoneno=phoneno;
    }



    public static void main(String[] args) {
        Students s1 = new Students("Kaushal",20,"9023812604",10);
        System.out.println(s1.toString());
        Students s2 = new Students("gangubai", 19 ,"8564794613",11);
        System.out.println(s2.toString());

    }
}
class Students extends InterfaceEx3{
    static int rollno;
    Students(String name, int age, String phoneno , int rollno){
        super(name,age,phoneno);
        this.rollno=rollno;


    }
    public String toString(){
        return name+","+age+","+phoneno+","+rollno;
    }
}

