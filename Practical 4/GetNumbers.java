import java.util.Scanner;

public class GetNumbers {

    static int convert2byte(int num) {
        int res = num % 256;
        if (res > 127) {
            return res - 256;
        } else if (res < -128) {
            return res + 256;
        } else {
            return res;
        }
    }

    static int convert2short(int num) {
        int res = num % 65536;
        if (res > 32767) {
            return res - 65536;
        } else if (res < -32768) {
            return res + 65536;
        } else {
            return res;
        }
    }

    static int getNumber(int num, String type) {
        int result = 0;
        if (type.equalsIgnoreCase("byte")) {
            result = convert2byte(num);
        } else if (type.equalsIgnoreCase("short")) {
            result = convert2short(num);
        } else {
            result = -1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int value = sc.nextInt();
        System.out.println("Enter the type to convert (byte/short):");
        String type = sc.next();
        int result = getNumber(value, type);
        if (result == -1) {
            System.out.println("Invalid type entered.");
        } else {
            System.out.println("Result: " + result);
        }
    }
}

