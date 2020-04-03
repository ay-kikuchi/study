package com.example.jissen.practice.chap5;

public class StrongBox<T> {
    private T data;
    private KeyType keyType;
    private int trialNumber;

    public StrongBox(KeyType keyType) {
        this.keyType = keyType;
    }

    public void put(T data) {
        this.data = data;
    }

    public T get() {
        this.trialNumber++;

        if (this.trialNumber < requiredTrialNumber(this.keyType)) {
            return null;
        }
        return this.data;
    }

    // 必要試行回数
    private int requiredTrialNumber(KeyType keyType) {
        switch (keyType) {
            case PADLOCK:
                return 1024;
            case BUTTON:
                return 10000;
            case DIAL:
                return 30000;
            default: // FINGER
                return 1000000;
        }
    }
}
