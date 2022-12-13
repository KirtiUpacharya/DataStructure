

public class main{


public static void main(String[] args)
{
          printpattern(4);
}

static void printpattern(int n)
{
// Here n decides no of rows that means the length.
//outer for loop is for RowS
// inner for loop is for column
for(int i=0;i<=n;i++)
{
for(int j=0;j<=i;j++)
{

System.out.print("*");


}
System.out.println("");



}


}

}