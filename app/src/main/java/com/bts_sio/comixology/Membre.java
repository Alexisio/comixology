package com.bts_sio.comixology;

public class Membre {
    int idM ;
    String nameM ;
    String descM ;
    String imgM ;

    public int getIdM() {
        return idM;
    }

    public void setIdM(int idM) {
        this.idM = idM;
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String nameM) {
        this.nameM = nameM;
    }

    public String getDescM() {
        return descM;
    }

    public void setDescM(String descM) {
        this.descM = descM;
    }

    public String getImgM() {
        return imgM;
    }

    public void setImgM(String imgM) {
        this.imgM = imgM;
    }

    public Membre(int idM, String nameM, String descM, String imgM) {
        this.idM = idM;
        this.nameM = nameM;
        this.descM = descM;
        this.imgM = imgM;
    }
}
