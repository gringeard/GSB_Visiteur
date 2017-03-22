/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.metier;

import java.util.Date;

/**
 *
 * @author btssio
 */
public class Rapport {
    
    private Visiteur visiteur ;
    private int rap_num;
    private Praticien pra_num;
    private Date rap_date;
    private String rap_bilan;
    private String rap_motif;

    public Rapport(Visiteur visiteur, int rap_num, Praticien pra_num, Date rap_date, String rap_bilan, String rap_motif) {
        this.visiteur = visiteur;
        this.rap_num = rap_num;
        this.pra_num = pra_num;
        this.rap_date = rap_date;
        this.rap_bilan = rap_bilan;
        this.rap_motif = rap_motif;
    }

    @Override
    public String toString() {
        return "Rapport{" + "visiteur=" + visiteur + ", rap_num=" + rap_num + ", pra_num=" + pra_num + ", rap_date=" + rap_date + ", rap_bilan=" + rap_bilan + ", rap_motif=" + rap_motif + '}';
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public int getRap_num() {
        return rap_num;
    }

    public void setRap_num(int rap_num) {
        this.rap_num = rap_num;
    }

    public Praticien getPra_num() {
        return pra_num;
    }

    public void setPra_num(Praticien pra_num) {
        this.pra_num = pra_num;
    }

    public Date getRap_date() {
        return rap_date;
    }

    public void setRap_date(Date rap_date) {
        this.rap_date = rap_date;
    }

    public String getRap_bilan() {
        return rap_bilan;
    }

    public void setRap_bilan(String rap_bilan) {
        this.rap_bilan = rap_bilan;
    }

    public String getRap_motif() {
        return rap_motif;
    }

    public void setRap_motif(String rap_motif) {
        this.rap_motif = rap_motif;
    }
    
    
    
}
