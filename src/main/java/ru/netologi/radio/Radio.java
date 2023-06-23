package ru.netologi.radio;

public class Radio {

    private int currentNumberRadio;
    private int currentVolume;
    private int numberMinRadio = 0;                          // Минимальный номер радиостанции
    private int numberMaxRadio = 9;                          // Максимальный номер радиостанции
    private int levelMinVolume = 0;                          // Минимальный уровень громкости
    private int levelMaxVolume = 100;                          // Максимальный уровень громкости

    public int getCurrentNumberRadio() {
        return currentNumberRadio;
    }

    public void setCurrentNumberRadio(int newCurrentNumberRadio) {     // Выбор станции по ее номеру
        if (newCurrentNumberRadio < numberMinRadio) {
            return;
        }
        if (newCurrentNumberRadio > numberMaxRadio) {
            return;
        }
        currentNumberRadio = newCurrentNumberRadio;

    }

    public void setNextCurrentNumberRadio() {                  // Переключение станций next
        if (currentNumberRadio < numberMaxRadio) {
            currentNumberRadio = currentNumberRadio + 1;
        } else {
            currentNumberRadio = numberMinRadio;
        }
    }

    public void setPrevCurrentNumberRadio() {                   // Переключение станций prev
        if (currentNumberRadio > numberMinRadio) {
            currentNumberRadio = currentNumberRadio - 1;
        } else {
            currentNumberRadio = numberMaxRadio;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {                // Предустановка уровня громкости
        if (newCurrentVolume < levelMinVolume) {
            return;
        }
        if (newCurrentVolume > levelMaxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {                                               // увеличение звука
        if (currentVolume < levelMaxVolume) currentVolume = currentVolume + 1;
    }

    public void declineVolume() {                                                 // снижение звука
        if (currentVolume > levelMinVolume) currentVolume = currentVolume - 1;
    }

}
