import java.util.Scanner;

public class ChangeToXXSystem {

    static boolean isValidInput(String input_val) {
        for (char c : input_val.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    static String toXXsystem(String input, String type) {
        String output = "";
        String decimal_val = "";

        if (input.startsWith("0B") && type.equalsIgnoreCase("decimal")) {
            output = binary2decimal(input);
        } else if (input.startsWith("0B") && type.equalsIgnoreCase("octal")) {
            decimal_val = binary2decimal(input);
            output = decimal2octal(decimal_val);
        } else if (input.startsWith("0B") && type.equalsIgnoreCase("hexa")) {
            String input1 = input.substring(2);
            decimal_val = binary2decimal(input1);
            output = decimal2hexa(decimal_val);
        } else if (input.startsWith("0O") && type.equalsIgnoreCase("decimal")) {
            String input1 = input.substring(2);
            output = octal2decimal(input1);
        } else if (input.startsWith("0O") && type.equalsIgnoreCase("binary")) {
            String input1 = input.substring(2);
            decimal_val = octal2decimal(input1);
            output = decimal2binary(decimal_val);
        } else if (input.startsWith("0O") && type.equalsIgnoreCase("hexa")) {
            String input1 = input.substring(2);
            decimal_val = octal2decimal(input1);
            output = decimal2hexa(decimal_val);
        } else if (input.startsWith("0X") && type.equalsIgnoreCase("decimal")) {
            output = hexa2decimal(input);
        } else if (input.startsWith("0X") && type.equalsIgnoreCase("binary")) {
            String input1 = input.substring(2);
            decimal_val = hexa2decimal(input1);
            output = decimal2binary(decimal_val);
        } else if (input.startsWith("0X") && type.equalsIgnoreCase("octal")) {
            String input1 = input.substring(2);
            System.out.println("input1 : "+input1);
            decimal_val = hexa2decimal(input1);
                        System.out.println("decimal_val : "+decimal_val);
            output = decimal2octal(decimal_val);
        } else if (isValidInput(input) && type.equalsIgnoreCase("binary")) {
            output = decimal2binary(input);
        } else if (isValidInput(input) && type.equalsIgnoreCase("octal")) {
            output = decimal2octal(input);
        } else if (type.equalsIgnoreCase("hexa")) {
            output = decimal2hexa(input);
        }

        return output;
    }

    static String reversing(String s) {
        String reverse_string = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse_string += s.charAt(i);
        }
        return reverse_string;
    }

    static String to2conversion(String value) {
        int div = Integer.parseInt(value);
        String s = "";
        do {
            if (div % 2 != 0) {
                s = s + 1;
                div = (div - 1) / 2;
            } else {
                s = s + 0;
                div = div / 2;
            }
        } while (div != 0);

        return reversing(s);
    }

    static String to2secConversion(String value) {
        int length = value.length();
        double base_val = Integer.parseInt(value) / Math.pow(10, length);
        String output = "";

        int i = 0;
        while (i < 3) {
            base_val = base_val * 2;
            output += (int) base_val;
            if (base_val > 1) {
                base_val = base_val - 1;
            }
            i++;
        }
        return output;
    }

    static String decimal2binary(String input_val) {
        String output = "";

        if (input_val.contains(".")) {
            String[] split_arr = input_val.split("\\.");
            String first_val = split_arr[0];
            String second_val = split_arr[1];

            String first_output = to2conversion(first_val);
            String second_output = to2secConversion(second_val);

            output = "0B" + first_output + "." + second_output;
        } else {
            output = to2conversion(input_val);
        }

        return output;
    }

    static String decimal2octal(String input_val) {
        int decimal = Integer.parseInt(input_val);
        String output = "";

        while (decimal > 0) {
            int remainder = decimal % 8;
            output = remainder + output;
            decimal /= 8;
        }

        return output;
    }

    static String decimal2hexa(String input_val) {
        int value = Integer.parseInt(input_val);
        String output = "";
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (value > 0) {
            int remainder = value % 16;
            output = hexChars[remainder] + output;
            value = value / 16;
        }

        return output;
    }

    static String binary2decimal(String input_val) {
        int output = 0;
        for (int i = 0; i < input_val.length(); i++) {
            if (input_val.charAt(i) == '1') {
                output += (int) Math.pow(2, input_val.length() - 1 - i);
            }
        }
        return String.valueOf(output);
    }

    static String octal2decimal(String input_val) {
        int output = 0;
        for (int i = 0; i < input_val.length(); i++) {
            output += Math.pow(8, input_val.length() - 1 - i) * Character.getNumericValue(input_val.charAt(i));
        }
        return String.valueOf(output);
    }

    static String hexa2decimal(String input_Val) {
        int output = 0;
        for (int i = 0; i < input_Val.length(); i++) {
            char hexChar = input_Val.charAt(i);
            int decimalValue = 0;
            if (hexChar >= '0' && hexChar <= '9') {
                decimalValue = hexChar - '0';
            } else if (hexChar == 'A' || hexChar == 'a') {
                decimalValue = 10;
            } else if (hexChar == 'B' || hexChar == 'b') {
                decimalValue = 11;
            } else if (hexChar == 'C' || hexChar == 'c') {
                decimalValue = 12;
            } else if (hexChar == 'D' || hexChar == 'd') {
                decimalValue = 13;
            } else if (hexChar == 'E' || hexChar == 'e') {
                decimalValue = 14;
            } else if (hexChar == 'F' || hexChar == 'f') {
                decimalValue = 15;
            }
            output = output * 16 + decimalValue;
        }
        return String.valueOf(output);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ChangeToXXSystem Conversion");
        System.out.print("Enter the number: ");
        String input = scanner.nextLine();

        System.out.println("Please select the conversion type:");
        System.out.println("1. Decimal");
        System.out.println("2. Binary");
        System.out.println("3. Octal");
        System.out.println("4. Hexadecimal");
        System.out.print("Enter your choice (1/2/3/4): ");
        int conversionChoice = scanner.nextInt();
        scanner.nextLine();

        String conversionType = "";
        switch (conversionChoice) {
            case 1:
                conversionType = "decimal";
                break;
            case 2:
                conversionType = "binary";
                break;
            case 3:
                conversionType = "octal";
                break;
            case 4:
                conversionType = "hexa";
                break;
            default:
                System.out.println("Invalid conversion choice. Exiting...");
                return;
        }

        String output = toXXsystem(input, conversionType);
        System.out.println("Converted " + input + " to " + conversionType + ": " + output);
    }
}

