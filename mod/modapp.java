public class modapp{

public void modulusapp()
{ int a=1;
    for(int i=0;i<=255;i++)
    {
       
        int x=a%5;

        
        System.out.println(x);
     a++;
        
    }
    int i=0;
    int index=0;
    while(i<20)
    {
    String[] arr=new String[10];
    
    index=index%arr.length;
    System.out.println(index);
    index++;
    i++;
    }
System.out.println("--------------------------------------- ");
 System.out.println(0%10);
 System.out.println("--------------------------------------- ");
 //System.out.println(10%0);// division by zero arrr
}

public static void main(String[] args) 
{
    modapp mp=new modapp();
    mp.modulusapp();
}

}