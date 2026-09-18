public class Student1{
 public static void main(String[] args){
   student1 s3=new Student1();
   s3.name="Ali";
   Student1 b=s3;
   b.name="sara";
   Student1 c=new Student1();
   c.name=s3.name;
   System.out.println("S3:"+s3.name);
   System.out.println("B:"+b.name);
   System.out.println("C:"+c.name);
  
}
}