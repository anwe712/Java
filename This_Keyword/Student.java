 class StudentDetails {
      String name ;
  int age ;
     int  roll ;
 
     public void greeting()
     {
        System.out.println("Welcome to Student tracker ");

     }

     public void printinfo()
     {
        // this method prints the information about each student 
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);

     }

   
   }
public class Student
{
   public static void main(String[] args) {
      //object creation 
      StudentDetails stud1 = new StudentDetails();//object1 
      StudentDetails stud2 = new StudentDetails(); //object2 
      stud2.name = "Avi Baby" ;
      stud2.age = 5 ;
      stud2.roll = 11 ;

      stud1.name = "Anwesha Ghosh" ;
      stud1.age = 14 ;
      stud1.roll = 10 ;
      
      stud1.greeting();//Greeting printed
      stud1.printinfo();//Details of Anwesha
      stud2.printinfo();//Details of Avi

   }
}
 