import java.io.*;
import  java.util.*;
class UserMaincode
{
public int nnGenerator(String input1)
{
String s=input1;
  int i=0,sum=0,j;
  String str="";
  String k="";

  while(i<s.length())
  {
   j=(int)s.charAt(i)-48;
   k=EvenOdd(j);
   sum=j;
   if(k.equals("odd"))
   {
    i++;
    while(EvenOdd(sum)=="odd" && i<s.length())
    {
     int m=(int)s.charAt(i)-48;
     sum=sum+m;
     i++;
    }
    str=str+sum;
    sum=0;
   }
   else if(k.equals("even"))
   {
    i++;
 
    while(EvenOdd(sum)=="even" && i<s.length())
    {
     int m=(int)s.charAt(i)-48;
     sum=sum+m;
     i++;
    }
    str=str+sum;
    sum=0;
   }
  }
  int val=Integer.parseInt(str);
  return val;
 }
 public String EvenOdd(int sum)
 {
  if(sum%2==0)
   return "even";
  else
   return "odd";
 }
}
