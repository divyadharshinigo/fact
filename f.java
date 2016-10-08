import java.util.Scanner;
class f{
   public static void main(String args[]){
   	Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int i=1,f=1;
   while(i<=n)
   {
   	f=f*i;
   	i++;
   }
      System.out.println("Factorial of 4 is: "+f);
   }
  
}
