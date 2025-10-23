import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int counter = 1;
    for(int i = 0; i <= 50; i++)
    {
      System.out.print(i + " ");
      counter++;

      if(counter == 5)
      {
        counter = 0;
        System.out.println(i);
      }



      }
    }

}
