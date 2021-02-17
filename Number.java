//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Kyle Kim


//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
//private instance variable (must be an Integer)
private Integer num;
//constructor
public Number()
{
  num = 0;
}

public Number(Integer initNum)
{
  num = initNum;
}
//getter method
public Integer getNum()
{
  return num;
}

//setter method
public void setNum(int n)
{
  num = n;
}
//isOdd method

public boolean isOdd()
{
  int q = this.getNum();
  boolean odd = false;
  if(q % 2 == 0)
  {
    odd = false;
  }
  else
  {
    odd = true;
  }
  return odd;
}

//isPerfect

public boolean isPerfect()
{
  int q = this.getNum();
  int total = 0;
  boolean perfect = false;

  for(int i=1; i<q-1; i++)
  {
    if(q%i == 0)
    {
      total += i;
    }
  }

  if(total == q)
  {
    perfect = true;
  }
  else
  {
    perfect = false;
  }

  return perfect;
}
//toString


public String toString(Number sample)
{
  return("");
}

}
