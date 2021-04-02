package by.htp.les10.presentation;

import by.htp.les10.entity.Fraction;

public class FractionView {

    public void printAll(Fraction f1, Fraction f2, Fraction f3, String operation) {

        System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " " + operation + " "
                + f2.getNumerator() + "/" + f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
    }
}