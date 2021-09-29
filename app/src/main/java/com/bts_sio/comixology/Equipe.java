package com.bts_sio.comixology;

public class Equipe {
    int idE ;
    String nameE ;
    String descE ;
    String imgE ;

    public Equipe(int idE, String nameE, String descE, String imgE) {
        this.idE = idE;
        this.nameE = nameE;
        this.descE = descE;
        this.imgE = imgE;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getDescE() {
        return descE;
    }

    public void setDescE(String descE) {
        this.descE = descE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }
}
