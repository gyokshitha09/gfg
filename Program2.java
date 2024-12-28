import java.util.*;
public class Program2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=s.split(" ");
    for(int i=0;i<arr.length;i++){
        char c[]=arr[i].tocharArray();
        c[0]=c[0].toUpperCase();
        String x=c.toString();
        System.out.print(x+" ");
    }
    }
}