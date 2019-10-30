package ru.sbrf.lesson24_10.processing;

import ru.sbrf.lesson24_10.messages.Request;
import ru.sbrf.lesson24_10.messages.Response;

public class Host {
    private Client client;

    /**Объявляем 2 конструктора, 1 дефолтный и 1, который будет задавать начальные значения*/
    public Host(){
        this(1, 2, 123, 6);
    }

    public Host(int clientId, int accountId, int PIN,int balance){
        Account account = new Account(accountId, balance);

        client = new Client(clientId, PIN, account);

    }


    public Response getBalance(Request request){
        if (request.getClientId() == client.getClientId()){
            if (request.getPIN() == client.getPIN()){
                if (request.getAccountId() == client.getAccount().getAccountId()){
                    return new Response(false,client.getAccount().getBalance());
                }
            }
        }
        return new Response(true, "");
    }
}
