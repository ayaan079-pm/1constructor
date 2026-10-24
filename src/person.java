


public class person {
    private String name;
    private int id;

    public  void setName(String name){
        this.name=name;
    }
public void setId(int id){
        this.id=id;
}





    public String getName(){
        return name;
    }
    public int getId( ){
        return id;

    }


}

public class student extends person{
    private double gba;
    public void setGba(double gba){
        this.gba=gba;
    }
    public  double getGba(){
        return gba;
    }



    }
public class lecture extends person{
    private int salary;

    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }
}


void main(){
    student student1=new student();
    student1.setName("ayaan");
    System.out.println(student1.getName());
    student1.setId(11);
    System.out.println(student1.getId());
    student1.setGba(3.5);
    System.out.println(student1.getGba());
    lecture lecture1=new lecture();
    lecture1.setSalary(800);
    lecture1.setName("black");
    System.out.println(lecture1.getSalary());
    System.out.println(lecture1.getName());

}


