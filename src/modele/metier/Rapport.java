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
public class Rapport {
    
    private Visiteur visiteur ;
    private String rap_num;
    private Praticien pra_num;
    private String rap_date;
    private String rap_bilan;
    private String rap_motif;

    public Rapport(Visiteur visiteur, String rap_num, Praticien pra_num, String rap_date, String rap_bilan, String rap_motif) {
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

    public String getRap_num() {
        return rap_num;
    }

    public void setRap_num(String rap_num) {
        this.rap_num = rap_num;
    }

    public Praticien getPra_num() {
        return pra_num;
    }

    public void setPra_num(Praticien pra_num) {
        this.pra_num = pra_num;
    }

    public String getRap_date() {
        return rap_date;
    }

    public void setRap_date(String rap_date) {
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
