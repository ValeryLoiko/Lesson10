package by.htp.les10.Start;
import by.htp.les10.entity.Fraction;
import by.htp.les10.logic.FractionLogic;
import by.htp.les10.presentation.FractionView;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        FractionLogic logic = new FractionLogic();
        FractionView view = new FractionView();
        Fraction f3;

        f3 = logic.sum(f1, f2);
        view.printAll(f1, f2, f3, "+");

        f3 = logic.division(f1, f2);
        view.printAll(f1, f2, f3, "/");

        f3 = logic.multiplication(f1,f2);
        view.printAll(f1,f2,f3,"*");

    }
}
