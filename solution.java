/*
  Ödev
  
  Recursive Metotlar ile Üslü Sayı Hesaplama
  Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int base, pow;
        
        System.out.print("Enter base: ");
        base = input.nextInt();
        System.out.print("Enter power: ");
        pow = input.nextInt();
        
        System.out.print(power(base , pow));
    }
    
    
    static int power(int base, int pow) {
        if (pow <= 0) {
            return 1;
        } 
        
        return base * power(base, pow - 1);
    }
}
