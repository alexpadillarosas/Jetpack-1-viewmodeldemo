package com.blueradix.android.viewmodeldemo.ui.main;


import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private static final Float usd_to_au_rate = 0.5F;
    private String dollarText = "";
    private Float result = 0F;


    public void setAmount(String value){
        this.dollarText = value;
        result = Float.valueOf(dollarText)*usd_to_au_rate;

    }

    public Float getResult(){
        return result;
    }

}
