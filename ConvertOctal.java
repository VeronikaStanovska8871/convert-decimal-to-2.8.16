package sk.kosickaakademia.stanovska.calc;

public class ConvertOctal {
    public String convertToOctal(int num) {
            String octal="";
            while (num > 0){
                octal=(num%8)+octal;
                num=num%8;
            }
            return octal;
    }
}
