/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

/**
 *
 * @author btssio
 */
public class TypePraticien {
    
    private int type_code;
    private String type_libelle;
    private String type_lieu;

    public TypePraticien(int type_code, String type_libelle, String type_lieu) {
        this.type_code = type_code;
        this.type_libelle = type_libelle;
        this.type_lieu = type_lieu;
    }

    @Override
    public String toString() {
        return "TypePraticien{" + "type_code=" + type_code + ", type_libelle=" + type_libelle + ", type_lieu=" + type_lieu + '}';
    }

    public int getType_code() {
        return type_code;
    }

    public void setType_code(int type_code) {
        this.type_code = type_code;
    }

    public String getType_libelle() {
        return type_libelle;
    }

    public void setType_libelle(String type_libelle) {
        this.type_libelle = type_libelle;
    }

    public String getType_lieu() {
        return type_lieu;
    }

    public void setType_lieu(String type_lieu) {
        this.type_lieu = type_lieu;
    }
    
}
