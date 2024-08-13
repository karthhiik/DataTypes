public class Student
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    Project po1 = new project;

    po1.Name = sc.next();
    po1.Gender = sc.next().charAt(0);
    po1.Rollnumber = sc.nextbyte();
    po1.Batch = sc.nextint();
    po1.Score = sc.nextshort();
    po1.Gpa = sc.nextfloat();
    po1.Average = sc.nextdouble();
    po1.completed = sc.nextboolean;

    System.out.println("Name: " + po1.Name );
    System.out.println("Gender: " + po1.Gender);
    System.out.println("Rollnumber: " + po1.Rollnumber);
    System.out.println("Batch: " + po1.Batch);
    System.out.println("Score: " + po1.Score);
    System.out.println("Gpa: " + po1.Gpa);
    System.out.println("Average: " + po1.Average);
    System.out.println("completed:" + po1.completed);
    
    ///////////////////////////////////////////////////

    Project po2 = new project;

    po2.Name = sc.next();
    po2.Gender = sc.next().charAt(0);
    po2.Rollnumber = sc.nextbyte();
    po2.Batch = sc.nextint();
    po2.Score = sc.nextshort();
    po2.Gpa = sc.nextfloat();
    po2.Average = sc.nextdouble();
    po2.completed = sc.nextboolean;

    System.out.println("Name: " + po2.Name );
    System.out.println("Gender: " + po2.Gender);
    System.out.println("Rollnumber: " + po2.Rollnumber);
    System.out.println("Batch: " + po2.Batch);
    System.out.println("Score: " + po2.Score);
    System.out.println("Gpa: " + po2.Gpa);
    System.out.println("Average: " + po2.Average);
    System.out.println("completed:" + po2.completed);

    sc.close();
  }
    
    

}
