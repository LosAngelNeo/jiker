package com.jiker.keju;

public class Valuation {

    public int charge(int kilometer, int minute) {
        int price;
        if( kilometer <= 2) {
            price = 6 + (int)(minute * 0.25 + 0.5) ;
        }else if( kilometer > 2 && kilometer <= 8) {
            price = 6 + (int)((kilometer - 2)*0.8 + minute * 0.25 + 0.5);
        }else {
            price = 6 + (int)( 4.8 + (kilometer - 8)*1.2 + minute * 0.25 + 0.5);
        }
        return price;

    }

}
