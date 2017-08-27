package org.redbasin.algorithms.digits;

/**
 * Created by manojjoshi on 7/2/17.
 */
public class ExtractDigits {
    public static void main(String[] args) {
        int inputNo = 5828;
        int lastDigit = inputNo % 10;
        System.out.println(lastDigit);
        int secondLast = (inputNo/10)%10;
        System.out.println(secondLast);
        int thirdLast = (inputNo/100)%10;
        System.out.println(thirdLast);

        int modNum = inputNo;
        int exp = 0;
        int base = 10;
        while (modNum > 10) {
            base = base * 10;
            modNum = (modNum/base) % 10;
        }

    }
}
