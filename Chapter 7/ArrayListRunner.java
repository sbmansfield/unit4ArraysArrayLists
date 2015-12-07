import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       
       String[] newNames = {"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
       for (int i = 0; i < newNames.length; i++)
       {
           names.add(newNames[i]);
       }
       System.out.println(names);
       
       String first = names.get(0);
       String last = names.get(names.size()-1);
       System.out.println("First Name: "+first);
       System.out.println("Last Name: "+last);
       
       System.out.println("Size of Array: "+names.size());
       names.set (0, "Alice B. Toklas");
       System.out.println(names);
       
       names.add (4, "Doug");
       System.out.println(names);
       
       for (String element : names)
       {
           System.out.println(element);
       }
        
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
} 