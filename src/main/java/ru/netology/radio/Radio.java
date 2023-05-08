package ru.netology.radio;

public class Radio {
    private int quantityRadioStation = 10;
    private int minRadioStation = 0;
    private int maxRadioStation = quantityRadioStation - 1;
    private int currentRadioStation = minRadioStation;
    private int maxAudio = 100;
    private int minAudio = 0;
    private int audioVolume = minAudio;

    public Radio(int quantityRadioStation) { // конструктор кол-во станций
        if (quantityRadioStation < minRadioStation) {
            return;
        } else {
            this.quantityRadioStation = quantityRadioStation;
        }
        this.maxRadioStation = quantityRadioStation - 1;
    }

    public Radio() {
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxAudio() {
        return maxAudio;
    }

    public int getMinAudio() {
        return minAudio;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getAudioVolume() {
        return audioVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { // устанавливает значения радиостанции от 0 до 9
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextCurrentRadioStation() { // переключает радиостанцию вверх
        if (currentRadioStation == maxRadioStation) {
            setCurrentRadioStation(minRadioStation);
        } else {
            currentRadioStation++;
        }
    }

    public void prevCurrentRadioStation() { // переключает радиостанцию вниз
        if (currentRadioStation == minRadioStation) {
            setCurrentRadioStation(maxRadioStation);
        } else {
            currentRadioStation--;
        }
    }

    public void setAudioVolume(int newAudioVolume) { // устанавливает значение звука от 0 до 100
        if (newAudioVolume < minAudio) {
            return;
        }
        if (newAudioVolume > maxAudio) {
            return;
        }
        audioVolume = newAudioVolume;
    }

    public void increaseAudioVolume() { // увеличивает звук
        if (audioVolume < maxAudio) {
            audioVolume++;
        }
    }

    public void decreaseAudioVolume() { // уменьшает звук
        if (audioVolume > minAudio) {
            audioVolume--;
        }
    }

}
