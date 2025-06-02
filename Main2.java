import java.util.*;
public class Main2{
  public static void main(String[] args){
   int [] a=new int [5];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<a.length;i++){
	   a[i]=sc.nextInt();
	   
   }
   
for(int i=0;i<a.length;i++){
	if (a[i]%2==0){
	   System.out.println("even count");
	}
	   else{
	   System.out.println("odd count");}
	   
	System.out.println(a[i]);   
   }
}
}
