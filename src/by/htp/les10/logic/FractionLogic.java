package by.htp.les10.logic;

import by.htp.les10.entity.Fraction;

public class FractionLogic {

    public Fraction sum(Fraction f1, Fraction f2) {
        int newNum;
        int newDen;

        newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getDenominator();
        newDen = f1.getDenominator() * f2.getDenominator();

        Fraction rezult = new Fraction(newNum, newDen);

        return rezult;
    }

    public Fraction reduce(Fraction f1, Fraction f2) {
        int newNum;
        int newDen;

        newNum = f1.getNumerator() * f2.getDenominator() - f1.getDenominator() * f2.getDenominator();
        newDen = f1.getDenominator() * f2.getDenominator();

        Fraction rezult = new Fraction(newNum, newDen);

        return rezult;
    }
    public Fraction multiplication(Fraction f1, Fraction f2){

        int newNum = f1.getNumerator() * f2.getNumerator();
        int newDen = f2.getDenominator() * f2.getDenominator();

        Fraction rezult = new Fraction(newNum, newDen);
        return rezult;
    }

    public Fraction division(Fraction f1, Fraction f2){
       int newNum = f1.getNumerator() * f2.getDenominator();
       int newDen = f1.getDenominator() * f2.getNumerator();

        return new Fraction(newNum, newDen);
    }
}
