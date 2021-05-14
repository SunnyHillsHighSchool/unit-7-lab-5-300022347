//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

  //write constructor
  public NumberAnalyzer(int[] a)
  {
    list = new ArrayList<Number>();
    for(int i:a)
    {
      list.add(new Number(i));
    }
    
  }
  


  //write count odds
  public int countOdds()
  {
    int oddCount = 0; 
    for(int i=0; i<list.size() ; i++)
    {
      Number currentNum = new Number(i);
      if(currentNum.isOdd())
      {
        oddCount ++;
      }
     
    }
    return oddCount;
  }

	//write count evens

  public int countEvens()
  {
    int evenCount = 0; 
    for(int i=0; i<list.size() ; i++)
    {
      Number currentNum = new Number(i);
      if(currentNum.getNum()%2==0)
      {
        evenCount ++;
      }
     
    }
    return evenCount;
  }
	//write count perfects
	
  public int countPerfects()
  {
    int perfectCount = 0; 
    for(int i=0; i<list.size() ; i++)
    {
      Number currentNum = new Number(i);
      if(currentNum.isPerfect())
      {
        perfectCount ++;
      }
     
    }
    return perfectCount;
  }

	//write a toString
  public String toString()
  {
    ArrayList<String> strList = new ArrayList<String>();

    for(Number i:list)
    {
      strList.add(Integer.toString(i.getNum()));
    }

    String finalString = strList.toString();  
    return finalString;
  }
}