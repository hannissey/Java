package com.example.chapter10_introducingjavafx;

import java.text.DecimalFormat;

public class NumberFormatExample {
    public static void main(String[] args)
    {
        double number = 4376.7863;

        DecimalFormat df1 = new DecimalFormat("###,##0.0#");
        DecimalFormat df2 = new DecimalFormat("###000.00");
        DecimalFormat df3 = new DecimalFormat("00.0");
        DecimalFormat df4 = new DecimalFormat("000000.00000");
        DecimalFormat df5 = new DecimalFormat("000,000.00####");

        System.out.print(df1.format(number)
                + "\n" + df2.format(number)
                + "\n" + df3.format(number)
                + "\n" + df4.format(number)
                + "\n" + df5.format(number)
        );
    }

}
