package sk.kosickaakademia.stanovska.calc;

public class ConvertBinary {
        public String convertToBinary(int num) {
            String binary = "";
            while (num > 0) {
                binary= num % 2 + binary;
                num = num / 2;
            }
            return binary;
        }

}

