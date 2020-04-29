package com.Dauphine.Agility;


import java.util.ArrayList;

// La classe Nac représente un Nouvel Animal de Compagnie
public class Nac{

    // ****** ATTRIBUTS ****** //
    private String nom;
    private int nbrHeureSommeil;
    private Maitre maitre; // Un animal possède 0 ou 1 maître


    // ****** CONSTRUCTEURS ****** //

    // Constructeur vide
    public Nac(){
        this.nom = "animal sans nom";
        this.nbrHeureSommeil = 0;
        this.maitre = null;
    }
    // Ce constructeur permet de créer un animal ne possédant pas de maître à sa création
    public Nac(String nom, int nbrHeureSommeil){
        this.nom = nom;
        this.nbrHeureSommeil = nbrHeureSommeil;
        this.maitre = null;
    }

    // Ce constructeur permet de créer un animal possédant un maître à sa création
    public Nac(String nom, int nbrHeureSommeil, Maitre maitre){
        this.nom = nom;
        this.nbrHeureSommeil = nbrHeureSommeil;
        this.maitre = maitre;
        maitre.addNac(this);
    }


    // ****** ACCESSEURS ****** //
    public String getNom() {
        return(this.nom);
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public int getNbrDodo(){
        return(this.nbrHeureSommeil);
    }
    public void setNbrDodo(int nbrHeureSommeil){
        this.nbrHeureSommeil = nbrHeureSommeil;
    }
    public Maitre getMaitre(){
        return(this.maitre);
    }
    public void setMaitre(Maitre maitre){
        this.maitre = maitre;
        maitre.addNac(this);
    }

    // ****** METHODES ****** //
    @Override
    public String toString(){
        return "Je suis : " + this.nom + " et j'ai besoin de " + this.nbrHeureSommeil + " heures de sommeil.";
    }

    @Override
    public boolean equals(Object obj){
        boolean retour = false;
         if (obj!= null && (obj.getClass().equals(this.getClass()))){
            if (obj instanceof Nac){
                Nac puppy = (Nac)obj;
                if(puppy.getMaitre() == null && this.maitre == null){
                    retour = this.nom.equals(puppy.getNom()) &&
                            this.nbrHeureSommeil == puppy.getNbrDodo();
                }
                else {
                    if(puppy.getMaitre() == null || this.maitre == null){
                        retour = false;
                    }
                    else {
                        retour = this.nom.equals(puppy.getNom()) &&
                                this.nbrHeureSommeil == puppy.getNbrDodo() && this.maitre.equals(puppy.getMaitre());
                    }
                }
            }
        }
        return(retour);
    }

    public String presentation(){
        return "Je m'appelle " + this.nom + " et je dors " + this.nbrHeureSommeil + " heures.";
    }
}





