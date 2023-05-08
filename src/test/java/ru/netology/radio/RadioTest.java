package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldQuantityRadioStationBelowMin() { //
        Radio station = new Radio(-5); // конструктор. если кол-во станций < 0

        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldQuantityRadioStationAboveMax() { //
        Radio station = new Radio(25); // конструктор. если кол-во станций > 10

        station.setCurrentRadioStation(16);

        int expected = 16;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldConstructorSetNextCurrentRadioStationMaxToMin() { // конструктор. переключаем станцию с макс на мин
        Radio station = new Radio(20);

        station.setCurrentRadioStation(19);
        station.nextCurrentRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldConstructorSetPrevCurrentRadioStationMinToMax() { // конструктор. переключаем станцию с мин на макс
        Radio station = new Radio(15);

        station.setCurrentRadioStation(0);
        station.prevCurrentRadioStation();

        int expected = 14;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldConstructorSetNextCurrentRadioStation() { // конструтор. переключаем радиостанцию +1
        Radio station = new Radio(16);

        station.setCurrentRadioStation(11);
        station.nextCurrentRadioStation();

        int expected = 12;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldConstructorSetPrevCurrentRadioStation() { // конструктор. переключаем радиостанцию -1
        Radio station = new Radio(17);

        station.setCurrentRadioStation(15);
        station.prevCurrentRadioStation();

        int expected = 14;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveMax() { // ставим радиостанцию больше 9
        Radio station = new Radio();

        station.setCurrentRadioStation(11);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowMin() { // ставим радиостанцию меньше 0
        Radio station = new Radio();

        station.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBetweenBorders() { // ставим радиостанцию между 0 и 9
        Radio station = new Radio();

        station.setCurrentRadioStation(5);

        int expected = 5;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentRadioStationMaxToMin() { // переключаем радиостанцию с 9 на 0
        Radio station = new Radio();

        station.setCurrentRadioStation(9);
        station.nextCurrentRadioStation();

        int expected = 0;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentRadioStationMinToMax() { // переключаем радиостанцию с 0 на 9
        Radio station = new Radio();

        station.setCurrentRadioStation(0);
        station.prevCurrentRadioStation();

        int expected = 9;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextCurrentRadioStation() { // переключаем радиостанцию +1
        Radio station = new Radio();

        station.setCurrentRadioStation(5);
        station.nextCurrentRadioStation();

        int expected = 6;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevCurrentRadioStation() { // переключаем радиостанцию -1
        Radio station = new Radio();

        station.setCurrentRadioStation(5);
        station.prevCurrentRadioStation();

        int expected = 4;
        int actual = station.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAudioVolumeAboveMax() { // ставим звук больше 100
        Radio audio = new Radio();

        audio.setAudioVolume(101);

        int expected = 0;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAudioVolumeBelowMin() { // ставим звук меньше 0
        Radio audio = new Radio();

        audio.setAudioVolume(-1);

        int expected = 0;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAudioVolumeBetweenBorders() { // ставим звук между границами 0 и 100
        Radio audio = new Radio();

        audio.setAudioVolume(56);

        int expected = 56;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseAudioVolume() { // увеличиваем звук
        Radio audio = new Radio();

        audio.setAudioVolume(70);;
        audio.increaseAudioVolume();

        int expected = 71;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseAudioVolumeAboveMax() { // увеличиваем звук больше 100
        Radio audio = new Radio();

        audio.setAudioVolume(100);;
        audio.increaseAudioVolume();

        int expected = 100;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseAudioVolume() { // уменьшаем звук
        Radio audio = new Radio();

        audio.setAudioVolume(48);;
        audio.decreaseAudioVolume();

        int expected = 47;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseAudioVolumeBelowMin() { // уменьшаем звук меньше 0
        Radio audio = new Radio();

        audio.setAudioVolume(0);;
        audio.decreaseAudioVolume();

        int expected = 0;
        int actual = audio.getAudioVolume();

        Assertions.assertEquals(expected, actual);
    }

}
