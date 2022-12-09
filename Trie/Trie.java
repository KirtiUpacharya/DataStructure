

public class Trie{
 private TrieNode root;
 public Trie(){
root=new TrieNode();

 }
private class TrieNode{

    TrieNode[] children;
    boolean isWord;

    public TrieNode() 
    {
     this.children=new TrieNode[26];
     this.isWord=false;
    }


}

 public void InsertWord(String word)
  {
    TrieNode current=root;
    word=word.toLowerCase();
    for(int i=0;i<word.length();i++)
    {
        char c=word.charAt(i);

         int index= c-'a';
        if(current.children[index]==null)
        {
          TrieNode node=new TrieNode();
          current.children[index]=node;
          current=node;


        }
        else{
            
            current=current.children[index];


        }
       current.isWord=true;



    }
   

 }
 
 public void search(String word)
 {  TrieNode current=root;
    word=word.toLowerCase();
    for(int i=0;i<word.length();i++)
    {
        char c=word.charAt(i);

         int index= c-'a';
        if(current.children[index]==null)
        {
          System.out.println("Not found");
    
        }
        else{
            
            current=current.children[index];
            System.out.println("Found");

        }
       

 }
 

}

public static void main(String[] args)
{
    Trie trie=new Trie();
    trie.InsertWord("PratikKumar");
    System.out.println("Success");
    trie.search("Pratik"); 
    trie.search("Kirti");

}
 
}