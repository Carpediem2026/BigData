package com.company;

public class KK {
    int id,summ;
    boolean block;
    public KK(int id, int summ) {
        this.id = id;
        this.summ = summ;
        this.block = false;
    }

    public int getId() {
        return id;
    }

    public int getSumm() {
        return summ;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public boolean getBlock() {
        return block;
    }

    public void setSumm(int summ) {
        this.summ = summ;
    }

    @Override
    public String toString() {
        return "KK{" +
                "id=" + id +
                ", summ=" + summ +
                ", status_block=" + block +
                '}';
    }
}
