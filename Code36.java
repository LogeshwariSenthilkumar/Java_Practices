class Person{
    String name;
    Person(String name){
        this.name=name;

    }
}
class Employee extends Person{
    int employeeid=101;
    Employee(){
        super("Logu");
    }
    void display(){
        System.out.println(name+" "+employeeid);
    }
}
class Demo{
    public static void main(String[] args){
        Employee em=new Employee();
        em.display();
    }
}