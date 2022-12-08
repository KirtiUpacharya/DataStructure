public class ValidSubsequence{

    public boolean subsequence(String arr,String sequence)
    {   
        int i=0;
        int j=0;
        while(j<arr.length() && i<sequence.length())
        {
           if(arr.charAt(j)==sequence.charAt(i))    
           {
            i++;
            if (i==(sequence.length()-1))
               System.out.println("Found");
            }
            j++; 
           
        }
        return i==sequence.length();
        

        
    }
   public static void main(String[] args)
   {

     ValidSubsequence v=new ValidSubsequence();

     v.subsequence("KIRTI", "RTI");

   }

}