import java.util.*;
class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4};
        int b[]={2,3,5,6};
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!m.containsKey(a[i])){
                m.put(a[i],1);
            }
            else{
                m.put(a[i],m.get(a[i])+1);
            }
        }
        for(int i=0;i<b.length;i++){
            if(m.containsKey(b[i])){
                System.out.print(b[i]+" ");
            }
        }
        System.out.println();
    }
}