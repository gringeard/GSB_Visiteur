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
public class Laboratoire {
    
    private String lab_code;
    private String lab_nom;
    private String lab_chefvente;

    public Laboratoire(String lab_code, String lab_nom, String lab_chefvente) {
        this.lab_code = lab_code;
        this.lab_nom = lab_nom;
        this.lab_chefvente = lab_chefvente;
    }
    
    public String getLab_code() {
        return lab_code;
    }

    public String getLab_nom() {
        return lab_nom;
    }

    public String getLab_chefvente() {
        return lab_chefvente;
    }

    public void setLab_code(String lab_code) {
        this.lab_code = lab_code;
    }

    public void setLab_nom(String lab_nom) {
        this.lab_nom = lab_nom;
    }

    public void setLab_chefvente(String lab_chefvente) {
        this.lab_chefvente = lab_chefvente;
    }

    @Override
    public String toString() {
        return "laboratoire{" + "lab_code=" + lab_code + ", lab_nom=" + lab_nom + ", lab_chefvente=" + lab_chefvente + '}';
    }
    
    
    
}
