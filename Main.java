package sk.kosickaakademia.stanovska.calc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int system;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a decimal number : ");
            num = input.nextInt();
        }while (num<0);
        do {
            System.out.print("Enter a system: ");
            system = input.nextInt();
        } while (system != 2 && system != 8 && system != 16);


        if (system == 2) {
            String binary= "";
            ConvertBinary convertbinary= new ConvertBinary ();
            binary= convertbinary.convertToBinary(num);
        }

        if (system == 8) {
            String octal= "";
            ConvertOctal convertoctal= new ConvertOctal();
            octal= convertoctal.convertToOctal(num);

        }

        if (system == 16){
            String hexadecimal="";
            ConvertHexadecimal converthexadecimal = new ConvertHexadecimal();
            hexadecimal= converthexadecimal.convertToHexadecimal(num);
        }


    }
}
