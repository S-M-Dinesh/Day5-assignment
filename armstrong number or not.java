import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int num, temp, totalDigit=0, res=0, rem;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Number: ");
      num = scan.nextInt();
      
      for(temp=num; num>0; num /= 10)
         totalDigit++;
      
      for(num=temp; num>0; num /= 10)
      {
         rem = num%10;
         res = res + (int) Math.pow(rem, totalDigit);
      }
      
      if(res==temp)
         System.out.println("\nArmstrong Number");
      else
         System.out.println("\nNot an Armstrong Number.");
   }
}