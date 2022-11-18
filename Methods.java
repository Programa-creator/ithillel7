import java.util.Arrays;
import java.util.Scanner;
public class Methods {

    public void findSymbolOccurance(String a){
        System.out.print("Input string: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("a: " + count(s, 'a'));

    }
    private static long count(String s, char c){
        return s.chars().filter(x->x==c).count();
    }

    public void findWordPosition(String source, String target){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input string: ");
        source = scan.nextLine();
        System.out.print("Input word: ");
        target = scan.nextLine();

        int i = source.indexOf(target);
        if (i > -1){
            System.out.print(i+"\n");
        }
        else {
            System.out.print(-1+"\n");
        }
    }
    public void stringReverse(){
        Scanner scan = new Scanner(System.in);

        String abc= scan.nextLine(), cba="";
        char ch;
          for (int i=0; i<abc.length(); i++)
        {
            ch= abc.charAt(i);
            cba= ch+cba;
        }
          System.out.println("Reversed word: "+ cba);
    }


        public boolean isPalindrome(){
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            int i = s.length()-1;
            int j=0;
            while(i > j) {
                if(s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i--;
                j++;
            }
            return true;
        }



}


