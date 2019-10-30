package ru.sbrf.lesson24_10.messages;

public class Request {
    private int clientId;
    private int accountId;
    private int PIN;

    public Request(int clientId, int accountId, int PIN) {
        this.clientId = clientId;
        this.accountId = accountId;
        this.PIN = PIN;
    }

    public int getClientId() {
        return clientId;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getPIN() {
        return PIN;
    }
}
