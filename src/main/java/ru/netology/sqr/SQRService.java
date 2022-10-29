package ru.netology.sqr;

public class SQRService {

    public int calc(int x, int y) {

        int result = 0;

        for (int i = 10; i < 100; i++) {

            int temp = i * i;

            //заканчивает выполнение программы если число вышло за верхнюю границу
            if (temp > y) {
                break;
            }
            //проверяет что число попадает в диапозон или соответстует границе
            else if (temp >= x || temp == y) {
                result++;
            }
        }
        return result;
    }
}