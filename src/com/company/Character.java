package com.company;

public class Character {
    private boolean keyboardBacklight;
    private boolean fingerprintScanner;

    public Character(boolean keyboardBacklight, boolean fingerprintScanner) {
        this.keyboardBacklight = keyboardBacklight;
        this.fingerprintScanner = fingerprintScanner;
    }

    public boolean isKeyboardBacklight() {
        return keyboardBacklight;
    }

    public boolean isFingerprintScanner() {
        return fingerprintScanner;
    }
}
