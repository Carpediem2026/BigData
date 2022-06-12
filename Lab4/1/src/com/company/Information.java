package com.company;

public class Information  {
    int idCd;
    String cat,podcat,zap;
    public Information(int idCd) {
        this.idCd = idCd;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getPodcat() {
        return podcat;
    }

    public void setPodcat(String podcat) {
        this.podcat = podcat;
    }

    public String getZap() {
        return zap;
    }

    public void setZap(String zap) {
        this.zap = zap;
    }

    @Override
    public String toString() {
        return "Information{" +
                "cat='" + cat + '\'' +
                ", podcat='" + podcat + '\'' +
                ", zap='" + zap + '\'' +
                '}';
    }
}
