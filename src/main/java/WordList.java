import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
    int reslut = 0;
    for(int i = 0; i< wordList.length();i++){
      if(i.length==len){
        result++;
      }
      return result;
    }
    
  }

  public void removeWordsOfLength(int len)
  {
    for(int i = 0; i<wordList.length();i++){
      if(i.length==len){
        wordList.remove(i);
        i++;
      }
    }

  }
}
