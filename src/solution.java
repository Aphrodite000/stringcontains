import java.util.Scanner;

public class solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        StringBuilder sd=new StringBuilder();
        int count=0;
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s2.charAt(j)!=s1.charAt(i)){
                    count++;
                }
            }
            //System.out.println(count);
            if(count==s2.length()){
                sb.append(s1.charAt(i));
                //System.out.println(sb.toString());
            }
            count=0;
        }
        System.out.println(sb.toString());
    }
}
