package sk.kosickaakademia.stanovska.calc;

public class ConvertHexadecimal {
    public String convertToHexadecimal (int num) {
        int temp;
        String hexadecimal = "";
        while (num > 0) {
            temp = (num % 16);
            switch (temp) {
                case 10:
                    hexadecimal = "A" + hexadecimal; break;
                case 11:
                    hexadecimal = "B" + hexadecimal; break;
                case 12:
                    hexadecimal = "C" + hexadecimal; break;
                case 13:
                    hexadecimal = "D" + hexadecimal; break;
                case 14:
                    hexadecimal = "E" + hexadecimal; break;
                case 15:
                    hexadecimal= "F" + hexadecimal; break;
                default:
                    hexadecimal = temp + hexadecimal;
            }
            num = num / 16;
        }
        return hexadecimal;
    }
}
