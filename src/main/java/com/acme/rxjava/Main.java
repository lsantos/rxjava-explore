package com.acme.rxjava;

import static com.acme.rxjava.TempObservable.getCelsiusTemperatures;

import io.reactivex.Observable;

public class Main {
    public static void main(String[] args) {
        //getTemperature("Hamilton").blockingSubscribe(new TempObserver());
        //getCelsiusTemperature("Hamilton").blockingSubscribe(new TempObserver());
        //getNegativeTemperature("Hamilton").blockingSubscribe(new TempObserver());
        Observable<TempInfo> celsiusTemperatures = getCelsiusTemperatures("Hamilton", "New York", "Quebec City");
        celsiusTemperatures.blockingSubscribe(new TempObserver());
    }
}
