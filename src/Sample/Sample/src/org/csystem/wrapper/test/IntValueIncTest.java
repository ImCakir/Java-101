package org.csystem.wrapper.test;

import org.csystem.wrapper.IntValue;

import java.util.Scanner;

public class IntValueIncTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        IntValue count = IntValue.of(kb.nextInt());

        for (IntValue i = IntValue.ZERO; i.compareTo(count) <= 0; i = i.inc())
            System.out.printf("%d ", i.intValue());

        System.out.println();
    }

    public static void main(String[] args)
    {
        run();
    }
}
