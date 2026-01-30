import java.util.Scanner;

public class Ush4 {
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);
        int nr;
        int shuma=0;
        System.out.print("Jep nje numer dhe 0 per te ndaluar. ");
        while(true){
            nr=input.nextInt();
            if(nr==0){
                break;
            }
            shuma+=nr;
        }
        System.out.print("Shuma e nr eshte:  "+shuma);
    }
    
}
