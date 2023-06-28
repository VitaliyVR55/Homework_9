package ru.netologi.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldSetNumberMinRadio() {                  // пров-ка миним-го гран-ного значения станции
        radio.setCurrentNumberRadio(0);

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldSetNumberStandRadio() {               // пров-ка установки кол-ва станций ниже встроенного

        radio.setNumberMaxUserRadio(5);
        radio.setCurrentNumberRadio(8);
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(8, actual);
    }

    @Test
    public void shouldSetNumberMaxRadio() {    // пров-ка максим-го гран-ного значения станции
        radio.setNumberMaxUserRadio(10);
        radio.setCurrentNumberRadio(9);                  // при минимальном количестве станций

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(9, actual);
    }



    @Test
    public void shouldSetNumberAverRadio() {               // пров-ка сред-го значения станции
        radio.setNumberMaxUserRadio(10);
        radio.setCurrentNumberRadio(5);

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void shouldSetNumberBelMinRadio() {                  // пров-ка ниже миним-го гран-ного значения станции
        radio.setNumberMaxUserRadio(10);
        radio.setCurrentNumberRadio(6);
        radio.setCurrentNumberRadio(-1);                        // при минимальном количестве станций

        int expected = radio.getCurrentNumberRadio();
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberBigMaxRadio() {               // пров-ка выше максим-го гран-ного значения станции
        radio.setNumberMaxUserRadio(5);
        radio.setCurrentNumberRadio(10);                     // при минимальном количестве станций

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldSetNextNumberRadio() {               // пров-ка перекл-ния станции next
        radio.setNumberMaxUserRadio(5);

        radio.setCurrentNumberRadio(4);
        radio.setNextCurrentNumberRadio();

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(5, actual);
    }

    @Test
    public void shouldSetNextBigNumberRadio() {               // пров-ка перекл-ния станции next на граничном значении
                                                              // при минимальном количестве станций
        radio.setNumberMaxUserRadio(5);
        radio.setCurrentNumberRadio(9);
        radio.setNextCurrentNumberRadio();

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldSetPrevNumberRadio() {               // пров-ка перекл-ния станции prev

        radio.setNumberMaxUserRadio(5);
        radio.setCurrentNumberRadio(7);
        radio.setPrevCurrentNumberRadio();

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(6, actual);
    }

    @Test
    public void shouldSetPrevBelNumberRadio() {               // пров-ка перекл-ния станции prev на граничном значении
                                                              // при минимальном количестве станций
        radio.setNumberMaxUserRadio(5);
        radio.setCurrentNumberRadio(0);
        radio.setPrevCurrentNumberRadio();


        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(9, actual);
    }

    @Test
    public void shouldSetNumberUserRadio() {               // пров-ка установки пользов-кого кол-ва станций

        radio.setNumberMaxUserRadio(25);
        radio.setCurrentNumberRadio(24);

        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(24, actual);
    }

    @Test
    public void shouldSetNumberNextBigUserRadio() {               // пров-ка переключения сверверхнего

        radio.setNumberMaxUserRadio(25);
        radio.setCurrentNumberRadio(24);

        radio.setNextCurrentNumberRadio();
        int actual = radio.getCurrentNumberRadio();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldSetCurrentMaxVolume() {                 // пров-ка максим-го гран-ного значения громкости

        radio.setCurrentVolume (100);

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(100, actual);
    }

    @Test
    public void shouldSetCurrentBigMaxVolume() {                 // пров-ка сверх максим-го гран-ного значения громкости

        radio.setCurrentVolume (10);
        radio.setCurrentVolume (101);

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(10, actual);
    }

    @Test
    public void shouldSetIncreaseMaxVolume() {                 // пров-ка сверх максим-го гран-ного значения громкости

        radio.setCurrentVolume (100);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(100, actual);
    }

    @Test
    public void shouldSetCurrentBelMinVolume() {                 // пров-ка ниже миним-го гран-ного значения громкости

        radio.setCurrentVolume (0);
        radio.setCurrentVolume (-1);

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldSetCurrentMinVolume() {                 // пров-ка миним-го гран-ного значения громкости

        radio.setCurrentVolume (0);

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(0, actual);
    }


    @Test
    public void shouldSetAverVolume() {                 // пров-ка среднего гран-ного значения громкости

        radio.setCurrentVolume (50);

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(50, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {                 // пров-ка переключения громкости вверх

        radio.setCurrentVolume (72);
        radio.increaseVolume ();

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(73, actual);
    }

    @Test
    public void shouldSetIncreaseBigMaxVolume() {                 // пров-ка переключения громкости сверхвверха

        radio.setCurrentVolume (100);
        radio.increaseVolume ();

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(100, actual);
    }

    @Test
    public void shouldSetDeclineVolume() {                 // пров-ка переключения громкости вниз

        radio.setCurrentVolume (46);
        radio.declineVolume ();

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(45, actual);
    }

    @Test
    public void shouldSetDeclineBelMinVolume() {                 // пров-ка переключения громкости нижевниз

        radio.setCurrentVolume (0);
        radio.declineVolume ();

        int actual = radio.getCurrentVolume ();

        Assertions.assertEquals(0, actual);
    }

}
