import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void testSetCurrenStationRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetCurrenStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(-5);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetCurrenStationOverNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.setCurrentStation(12);
        int actual = radio.getCurrentStation();
        int expected = 5;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNextRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNextResetToZero() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testPrevRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testNextResetToNine() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetVolumeRegularFlow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetVolumeRegularFlow1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(150);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSetVolumeRegularFlow2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.setCurrentVolume(-50);
        int actual = radio.getCurrentVolume();
        int expected = 50;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIncreanseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 51;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIncreanseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDecreanseVolume1() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 49;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testDecreanseVolume2() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected,actual);
    }
}
