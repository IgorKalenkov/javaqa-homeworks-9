package ru.netology.radio;
public class Radio {
    private int currentRadioStation;
    private int audioVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getAudioVolume() {
        return audioVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { // устанавливает значения радиостанции от 0 до 9
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextCurrentRadioStation() { // переключает радиостанцию вверх
        if (currentRadioStation == 9) {
            setCurrentRadioStation(0);
        } else {
                currentRadioStation++;
            }
    }

    public void prevCurrentRadioStation() { // переключает радиостанцию вниз
        if (currentRadioStation == 0) {
            setCurrentRadioStation(9);
        } else {
                currentRadioStation--;
            }
    }

    public void setAudioVolume(int newAudioVolume) { // устанавливает значение звука от 0 до 100
        if (newAudioVolume < 0) {
            return;
        }
        if (newAudioVolume > 100) {
            return;
        }
        audioVolume = newAudioVolume;
    }

    public void increaseAudioVolume() { // увеличивает звук
        if (audioVolume < 100) {
            audioVolume++;
        }
    }

    public void decreaseAudioVolume() { // уменьшает звук
        if (audioVolume > 0) {
            audioVolume--;
        }
    }

}
