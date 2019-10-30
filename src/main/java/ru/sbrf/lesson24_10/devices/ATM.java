package ru.sbrf.lesson24_10.devices;

import ru.sbrf.lesson24_10.messages.Request;
import ru.sbrf.lesson24_10.messages.Response;
import ru.sbrf.lesson24_10.processing.Host;

public class ATM {

    /**Создаем приватное поле Host с переменной host, когда предложить, нажать enter и сверху добавится import*/
    private Host host;
    private Response response;

    /**Создаем публичный конструктор, который будет принимать объект класса host, делаем через Generate - Constructor*/
    public ATM(Host host){
        this.host = host;
    }

    public boolean isError (int clientId, int accountId, int PIN){
        response = host.getBalance(new Request(clientId, accountId, PIN));
        return response.isError();
    }
    public int getBalance(){

       return response.getBalance();
    }

//    /**Либо тот же самый вариант по шагам, чтобы код был более понятен, для этого вводим 2 новых переменных*/
//    public int getBalance(int clientId, int accountId, int PIN){
//
//       Request request = new Request(clientId, accountId, PIN);
//        Response response = host.getBalance(request);
//        return  response.getBalance()
//    }
}
