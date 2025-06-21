public class Employee
{
    String Firstname;
    String Lastname;
    int age ;
    String designation;
    Employee()
    {
        Firstname="";
        Lastname="";
        age=0;
        designation="";
    }
    Employee(String Firstname, String Lastname,int age,String designation)
    {
        this.Firstname=Firstname;
        this.Lastname=Lastname;
        this.age=age;
        this.designation=designation;
    }

    public void  setFirstname(String Firstname)
    {
      this.Firstname=Firstname;
    }
    public void setLastname(String Lastname)
    {
      this.Lastname = Lastname;
    }
    public void setAge(int age)
    {
        this.age= age ;
    }
    public  void setDesignation(String designation)
    {
        this.designation = designation ;
    }

    public String toString()
    {
           return "Firstname= "+Firstname+"\t"+"Lastname= "+Lastname+" age= "+age
                   +" Designation= "+designation;
    }

    public static void main(String [] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Animesh","Yadav",22,"Software developer trainee");
        e1.setFirstname("Jane");
        e1.setLastname("Smith");
        e1.setAge(28);
        e1.setDesignation("Manager");
        System.out.println(e1); // Uses toString()
        System.out.println(e2);
    }
}
