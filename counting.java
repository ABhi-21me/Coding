import java.util.*;
public class counting{
    public static void count(String str){
        str=str.toLowerCase();
        int vc=0,cc=0,nc=0,scc=0,sc=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch >='a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vc++;
                }
                else
                {
                    cc++;
                }
            }
            else if(ch>='0' && ch <= '9')
            {
                nc++;
            }
            else if(ch==' '){
                sc++;
            }
            else 
            {
                scc++;
            }
        }
        System.out.println("vowels : "+vc);
        System.out.println("Consonants : "+cc);
        System.out.println("Numbers : "+nc);
        System.out.println("Spaces : "+sc);
        System.out.println("Special character : "+scc);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);
    }
}