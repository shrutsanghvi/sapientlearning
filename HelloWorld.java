import java.util.*;

public class HelloWorld{

public static void main(String []args){
int i=0;
int m=0;
int flag=0;
int n=1;//it is the number to be checked
Dictionary codify = new Hashtable(); 

char a1='A';
Vector v = new Vector(); 
codify.put(a1, n);
a1++;
n++;
codify.put(a1, n);
a1++;
n++;
int count =24;


        
while(count>0){
    flag=0;
    m=n/2;
for(i=2;i<=m;i++){      
if(n%i==0){      
    flag=1;      
    break;    }}
   
   if(flag==0)  { codify.put(a1, Integer.toHexString(n)); 
   v.add(n);
       count--;
       a1++;
   }
    n=n+2;   
        
     }
 a1='A';
String s;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string"); 
s = sc.nextLine();
System.out.println(s);
String coded_name="";


for(int z=0; z<=s.length()-1; z++) {
		coded_name= coded_name+codify.get(s.charAt(z));
	}
System.out.println(coded_name);


}

}