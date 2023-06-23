package ru.netologi.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumberMinRadio() {                  // пров-ка миним-го гран-ного значения станции
        Radio number = new Radio();
        number.setCurrentNumberRadio(0);

        int expected = 0;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberMaxRadio() {               // пров-ка максим-го гран-ного значения станции
        Radio number = new Radio();
        number.setCurrentNumberRadio(9);

        int expected = 9;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberAverRadio() {               // пров-ка сред-го гран-ного значения станции
        Radio number = new Radio();
        number.setCurrentNumberRadio(5);

        int expected = 5;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberBelMinRadio() {                  // пров-ка ниже миним-го гран-ного значения станции
        Radio number = new Radio();
        number.setCurrentNumberRadio(-1);

        int expected = 0;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberBigMaxRadio() {               // пров-ка выше максим-го гран-ного значения станции
        Radio number = new Radio();
        number.setCurrentNumberRadio(10);

        int expected = 0;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberRadio() {               // пров-ка перекл-ния станции next
        Radio number = new Radio();

        number.setCurrentNumberRadio(4);
        number.setNextCurrentNumberRadio();

        int expected = 5;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextBigNumberRadio() {               // пров-ка перекл-ния станции next на граничном значении
        Radio number = new Radio();

        number.setCurrentNumberRadio(9);
        number.setNextCurrentNumberRadio();

        int expected = 0;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberRadio() {               // пров-ка перекл-ния станции prev
        Radio number = new Radio();

        number.setCurrentNumberRadio(7);
        number.setPrevCurrentNumberRadio();

        int expected = 6;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevBelNumberRadio() {               // пров-ка перекл-ния станции prev на граничном значении
        Radio number = new Radio();

        number.setCurrentNumberRadio(0);
        number.setPrevCurrentNumberRadio();

        int expected = 9;
        int actual = number.getCurrentNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMaxVolume() {                 // пров-ка максим-го гран-ного значения громкости
        Radio volume = new Radio();

        volume.setCurrentVolume (100);

        int expected = 100;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentBigMaxVolume() {                 // пров-ка сверх максим-го гран-ного значения громкости
        Radio volume = new Radio();

        volume.setCurrentVolume (10);
        volume.setCurrentVolume (101);

        int expected = 10;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseMaxVolume() {                 // пров-ка сверх максим-го гран-ного значения громкости
        Radio volume = new Radio();

        volume.setCurrentVolume (100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentBelMinVolume() {                 // пров-ка ниже миним-го гран-ного значения громкости
        Radio volume = new Radio();

        volume.setCurrentVolume (20);
        volume.setCurrentVolume (-1);

        int expected = 20;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentMinVolume() {                 // пров-ка миним-го гран-ного значения громкости
        Radio volume = new Radio();

        volume.setCurrentVolume (0);

        int expected = 0;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetAverVolume() {                 // пров-ка среднего гран-ного значения громкости
        Radio volume = new Radio();

        volume.setCurrentVolume (50);

        int expected = 50;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume() {                 // пров-ка переключения громкости вверх
        Radio volume = new Radio();

        volume.setCurrentVolume (72);
        volume.increaseVolume ();

        int expected = 73;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseBigMaxVolume() {                 // пров-ка переключения громкости сверхвверха
        Radio volume = new Radio();

        volume.setCurrentVolume (100);
        volume.increaseVolume ();

        int expected = 100;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDeclineVolume() {                 // пров-ка переключения громкости вниз
        Radio volume = new Radio();

        volume.setCurrentVolume (46);
        volume.declineVolume ();

        int expected = 45;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDeclineBelMinVolume() {                 // пров-ка переключения громкости нижевниз
        Radio volume = new Radio();

        volume.setCurrentVolume (0);
        volume.declineVolume ();

        int expected = 0;
        int actual = volume.getCurrentVolume ();

        Assertions.assertEquals(expected, actual);
    }

}
