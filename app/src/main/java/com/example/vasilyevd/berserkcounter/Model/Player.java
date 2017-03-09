package com.example.vasilyevd.berserkcounter.Model;

/**
 * Created by VasilyevD on 09.03.2017.
 */

public class Player {
    private byte MAX_COIN_IN_GAME = 10;
    private byte maxCoin;
    private byte currentCoin;

    public byte getMaxCoin() {
        return maxCoin;
    }

    public byte getCurrentCoin() {
        return currentCoin;
    }
    public String getCoinStatus() {
        return currentCoin+" / "+ maxCoin;
    }
    
    public void newTurn() {
        newCoin();
        currentCoin = maxCoin;
    }
    public void newGame() {
        maxCoin = 0;
        newTurn();
    }
    public void newCoin(){
        if (maxCoin==MAX_COIN_IN_GAME) {
            //do nothing
        } else {
            maxCoin++;
        }
    }

    public boolean changeCurrentCoin(byte currentCoin) {
        if ((getCurrentCoin()+ currentCoin)<0){
            return false;
        } else {
            this.currentCoin = (byte) (getCurrentCoin() + currentCoin);
            return true;
        }
    }
}
