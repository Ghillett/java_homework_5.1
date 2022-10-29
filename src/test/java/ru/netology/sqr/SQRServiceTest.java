package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            //позитивные тесты
            "3, 200, 300",
            "1, 100, 101",
            "1, 9800, 9801",
            //негативные тесты
            "0, -9801, -100",
            "0, 0, 0",
            "0, 300, 200",
            "0, 100000, 200000"
    })
    public void test(int expected, int x, int y) {

        SQRService test = new SQRService();

        Assertions.assertEquals(expected, test.calc(x, y));
    }
}