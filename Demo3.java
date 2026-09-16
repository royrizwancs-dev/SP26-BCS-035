public class Demo3{
 public static void main(String[] args){
   Student a=new Student();
   a.name="Ali";
   Student b=a;
   b.name="sara";
   Student c =new Student();
   c.name=a.name;
   System.out.println("A:"+a.name);
   System.out.println("B:"+b.name);
   System.out.println("C:"+c.name);
  
}
}