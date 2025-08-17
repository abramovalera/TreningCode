package Trening;

public class TipCalculator {
    static int tipPercent ; //процент чаевых , допустим передвем 20



    //задали значение чаевых в переменную tipPercent
    static public void setTipCalculator(int percent){
        tipPercent  = percent;
    }

    //принимаю сумму счета - говорю скольок чаевых
    static public double calculateTip(double billAmount){
        return billAmount * tipPercent / 100;
    }


}
