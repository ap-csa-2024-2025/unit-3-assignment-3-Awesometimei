import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x: ");
    int x = sc.nextInt();
    System.out.println("Enter y: ");
    int y = sc.nextInt();
    if (y == 0)
    {
      System.out.println("Error: cannot divide by 0");
    }
    else
    {
      double ratio = (double) x / y;
      if (ratio > 1 && ratio <= 8)
      {
        System.out.println("Ratio OK");
      }
    }
    
    System.out.println("Enter a: ");
    int a = sc.nextInt();
    System.out.println("Enter b: ");
    int b = sc.nextInt();
    if (b == 0)
    {
      System.out.println("Error: cannot divide by 0");
    }
    else if(a%b == 0)
    {
        System.out.println("Is a factor");
    }

    System.out.println("Enter a number in the fifties: ");
    int num = sc.nextInt();
    if (num < 50 || num > 59)
    {
      System.out.println("Hey! That's not a number in the fifties!");
      num = 55;
    }
    System.out.println("Your number is " + num + ".");

    System.out.println("Enter two numbers: ");
    x = sc.nextInt();
    y = sc.nextInt();
    if ((y <= 9 || x > 2) && (x * y > 10))
		{
			System.out.println("Pass");
		}
  }

  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // I did on notepad
    return false;
  }
}
