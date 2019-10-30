package ru.sbrf.lesson24_10;

import ru.sbrf.lesson24_10.devices.ATM;
import ru.sbrf.lesson24_10.processing.Host;

public class Main {
    public static void main(String[] args) {

        /**Это конструктор по умолчанию*/
        Host host = new Host();

//        /**Это касмотныйконструктор с заданными значениями, вводим для примера, чтобы убедиться, что отработает, если
//         * передадим другие значения, не те, что задали по умолчанию*/
//        Host host = new Host(2,2,123,321);

        ATM atm = new ATM(host);

        /**Специально передаем первое значение некорректным, чтобы вызвать ошибку и с ней поработать,
         * корректное значение 1, а мы передаем 2*/
        if (atm.isError(2, 2, 123)) {
            System.out.println("Some error");
        } else {
            System.out.println(atm.getBalance());
        }
    }
}
