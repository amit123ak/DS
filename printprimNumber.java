// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*; 
public class Main {
public static void main(String[] args) {



for(int num=2;num<=7;num++)
{

 boolean Isprime=true;
 for(int i=2;i<num;i++)
 {
    if(num%i==0)
    {
   Isprime =false;
    }
 }

 if(Isprime)
 {
  System.out.println(num);  
 }

}
}


}
