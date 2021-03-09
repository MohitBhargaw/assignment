package unit2;
import java.util.*;
import java.util.Collections;
import java.lang.String;
import java.util.ArrayList;
public class validation {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	ArrayList<String> obj=new ArrayList<String>();
    obj.add("mbhargaw@gmail.com");
    obj.add("manish@gmail.com");
    obj.add("dell@gmail.com");
    obj.add("Ajeesha@gmail.com");
    obj.add("Raman@gmail.com");
    System.out.println("Enter the string you want to search");
    String searchString=sc.next();    
    complete comp=new complete();
    comp.containsIgnoreCase(searchString,obj);      
}

public static void containsIgnoreCase(String searchString,ArrayList<String> obj)
	{
	
	for (String element : obj)
	{
        if (element.equalsIgnoreCase(searchString))
	
	{
System.out.println(searchString+" "+ "is present in the array");
break;
			}
	}
       }
}