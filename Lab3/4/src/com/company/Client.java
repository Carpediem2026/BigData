package com.company;

public class Client {
    Account acc = new Account(1,3000);
    KK card = new KK(1,1000);
    String fio;
    int id;

    public Client(String fio, int id) {
        this.fio = fio;
        this.id = id;
    }
    void pay(int s){
        acc.setSumm(acc.getSumm()-s);
        System.out.println("Pay on 1000 (account): ost_acc - "+acc.getSumm());
    }
    void payto(int s){
        if (card.getBlock()){
            System.out.println("Card in block");
        }else{
            acc.setSumm(acc.getSumm()-s);
            card.setSumm(card.getSumm()+s);
            System.out.println("Pay acc to kk 100: ost_acc - "+acc.getSumm()+"; ost_kk - "+card.getSumm());
        }
    }
    void blockKKandNULL(){
        card.setBlock(true);
        this.payto(100);
        acc.setSumm(0);
    }
    void status(){
        System.out.println(card);
        System.out.println(acc);
    }
}
