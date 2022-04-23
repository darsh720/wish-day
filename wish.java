import java.util.Scanner;
class wish{
   public static void main(String[ ] args){
     Scanner myObj = new Scanner(System.in);
     int i = myObj.nextInt();
      {
    if(i<=12) 
{
  System.out.print("Good Morning");
}
else if (i<=16 && i>=12) 
{
System.out.println("Good Afternoon");
}
else if (i<=20 && i>=16) 
{
System.out.println("Good Evening");
}
else if (i<=24 && i>=20)
{
System.out.println("Good Night");
}
else 
{
System.out.println("please enter clockwise time");
}
}
}
}

