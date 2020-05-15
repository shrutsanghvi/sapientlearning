import java.lang.Math; 
import java.lang.String;
import java.util.*;// headers MUST be above the first class

// one class needs to have a main() method
class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
   Shrut a=new Shrut();
   Set<String> set3 = new HashSet<String>();
   Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter word");

    String word = myObj.nextLine();
    Boolean b=a.find(word);
    
    if(b)
    {
        System.out.println(a.map.get(word));
    }
    
    else
    {
        System.out.println("Word not available. Do you want to update?");
        
        String flag=myObj.nextLine();
        if(flag.equals("Y"))
        {
            String synonym=myObj.nextLine();
            
            Boolean v = synonym.equals("");
            while(!v){
                
                System.out.println(synonym);
                set3.add(synonym);
                synonym=myObj.nextLine();
                v = synonym.equals("");
            }
            
        
            a.newword(word,set3);
            
            
            
        }
        
        
    }
    System.out.println(a.map);
    
    
    
  }
}


 
class Shrut{ 
  
    // Declaring the static map 
    public static Map<String, Set<String>> map; 
  	static Set<String> set = new HashSet<String>();
  	static Set<String> set1 = new HashSet<String>();
  
    // Instantiating the static map 
    static
    { 
        map = new HashMap<>(); 
      	set.add("GoodMorning");
      	set.add("Shubhodaya");
        set.add("Shubhoday");
        set.add("Bonjour");
        map.put("GoodMorning", set);
      	set1.add("GoodEvening");
      	set1.add("ShubhaSange");
      	set1.add("Susandhya");
      	set1.add("Bonsoir");
      	map.put("GoodEvening",set1);
      } 
  
   	public boolean find(String a)
    {
        return map.containsKey(a);
    }
    
    public void newword(String f, Set<String> g)
    {
        map.put(f,g);
    }
    
    
}
    

