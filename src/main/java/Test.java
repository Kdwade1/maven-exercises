import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.reverse;
import static org.apache.commons.lang3.StringUtils.lowerCase;
import static org.apache.commons.lang3.StringUtils.upperCase;


public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is this a number?");

        String input = scan.nextLine();
        System.out.println(isNumeric(input));
        System.out.println(StringUtils.swapCase(input));
        System.out.println(StringUtils.reverse(input));

        reverse();
        scan.nextLine();
//        System.out.println(isNumeric());
        reverse();



    }

//    private static boolean isNumeric(String num) {
//
//    }

    private static void reverse() {
        System.out.println("Enter a string");


    }


}
