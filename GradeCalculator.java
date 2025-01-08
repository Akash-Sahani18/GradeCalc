  import java.util.Scanner;
public class GradeCalculator {
    public void enterMarks(){

        System.out.println("Enter the marks obtained!!");
          Scanner sc = new Scanner(System.in);

          //Marks obtained in Physics
          System.out.print("Enter the Marks of Physics: "); 
          float phy = sc.nextInt();

          //Grades in Physics
          if(phy>=90 && phy<=100)
          System.out.println("Grade in Physics: O");

          else if(phy>=80 && phy<=89){
            System.out.println("Grade in Physics: A+");
          }
          else if(phy>=70 && phy<=79){
            System.out.println("Grade in Physics: A");
          }
          else if(phy>=60 && phy<=69){
            System.out.println("Grade in Physics: B+");
          }
          else if(phy>=50 && phy<=59){
            System.out.println("Grade in Physics: B");
          }
          else if(phy>=70 && phy<=79){
            System.out.println("Grade in Physics: P");
          }
          else if(phy<40){
            System.out.println("Grade in Physics: F");
          }
          else{
            System.out.println("Enter the valid Marks");
          }

          //Marks Obtained in Chemistry
          System.out.print("Enter The Marks of Chemistry: ");
            float chem = sc.nextFloat();

            //Grades in Chemistry
          if(chem>=90 && chem<=100)
          System.out.println("Grade in Chemistry: O");

          else if(chem>=80 && chem<=89){
            System.out.println("Grade in Chemistry: A+");
          }
          else if(chem>=70 && chem<=79){
            System.out.println("Grade in Chemistry: A");
          }
          else if(chem>=60 && chem<=69){
            System.out.println("Grade in Chemistry: B+");
          }
          else if(chem>=50 && chem<=59){
            System.out.println("Grade in Chemistry: B");
          }
          else if(chem>=70 && chem<=79){
            System.out.println("Grade in Chemistry: P");
          }
          else if(chem<40){
            System.out.println("Grade in Chemistry: F");
          }
          else{
            System.out.println("Enter the valid Marks ");
          }

          //Marks Obtained in Maths
          System.out.print("Enter the Marks of Maths: ");
          float maths = sc.nextFloat();
          
          //Grades in Mathematics
          if(maths>=90 && maths<=100)
          System.out.println("Grade in Mathematics: O");

          else if(maths>=80 && maths<=89){
            System.out.println("Grade in Mathematics: A+");
          }
          else if(maths>=70 && maths<=79){
            System.out.println("Grade in Mathematics: A");
          }
          else if(maths>=60 && maths<=69){
            System.out.println("Grade in Mathematics: B+");
          }
          else if(maths>=50 && maths<=59){
            System.out.println("Grade in Mathematics: B");
          }
          else if(maths>=70 && maths<=79){
            System.out.println("Grade in Mathematics: P");
          }
          else if(maths<40){
            System.out.println("Grade in Mathematics: F");
          }
          else{
            System.out.println("Enter the valid Marks");
          }

            //Total marks Obtained
            float totalMarks = phy + chem + maths;
            System.out.println("Total Marks Obtained: "+totalMarks);
           
          //Average Marks Obtained
          float avg = totalMarks/3;
          System.out.println("Average Marks Obatined: "+avg);

          //Percentage Obtined 
          float per = (totalMarks*100)/300;
          System.out.println("Percentage Obatianed: "+per+"%");

          //Overall Grade Obtained
          if(per>=90 && per<=100)
          System.out.println("Overall Grade: O");

          else if(per>=80 && per<=89){
            System.out.println("Overall Grade: A+");
          }
          else if(per>=70 && per<=79){
            System.out.println("Overall Grade: A");
          }
          else if(per>=60 && per<=69){
            System.out.println("Overall Grade: B+");
          }
          else if(per>=50 && per<=59){
            System.out.println("Overall Grade: B");
          }
          else if(per>=70 && per<=79){
            System.out.println("Overall Grade: P");
          }
          else {
            System.out.println("Overall Grade: F");
          }
          System.out.println("Press the Following");
          System.out.println("1. Continue");
          System.out.println("2. Exit");
          int input = sc.nextInt();
          if(input==1)
            enterMarks();
         else if(input==2){
          return;
         }     
    }
    public static void main(String args[]){
          
        GradeCalculator gc = new GradeCalculator();
        gc.enterMarks();
        System.out.println("Thank You!!");
          
    }
    
}
