import java.util.Scanner;
class Revers {
    public static void main(String[] args){
        int num, rev = 0, aux;
        Scanner numb_sc = new Scanner(System.in);
        System.out.println("Enter your numb to switch it ...");
        num = numb_sc.nextInt();

        while(num > 0){
            aux = num % 10;
            rev = (rev*10) + aux;
            num = num / 10;
        }
        System.out.println("your reversed number is " + rev);
    }
}