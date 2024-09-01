import java.util.*;
class StudentDetails{
    int roll_no,mark;
    String name,cl,grade;
    public void input()
    {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = sn.nextLine();
        System.out.println("Enter the class : ");
        cl = sn.nextLine();
        System.out.println("Enter the mark out of 100 : ");
        mark = sn.nextInt();
        
    }
}
class Student extends StudentDetails{
    public void display()
    {
        System.out.println("Roll No is : "+roll_no);
        System.out.println("Name is : "+name);
        System.out.println("Class is : "+cl);
        System.out.println("Mark is : "+mark);
        if(mark>90) 
            grade = "Distinction";
        else if(mark>80)
            grade = "First Class";
        else if(mark>60)
            grade = "Second Class";
        else 
            grade = "Failed";
        System.out.println("Result is : "+grade);
    }
}
public class test {
    public static void main(String args[])
    {
        Student s = new Student();
        s.input();
        s.display();
    }
}
