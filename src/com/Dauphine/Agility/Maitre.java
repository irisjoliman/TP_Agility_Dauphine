package com.Dauphine.Agility;

import java.util.ArrayList;

public class Maitre
{
    // ****** ATTRIBUTS ****** //
    private int age;
    private String nom;
    private ArrayList<Nac> animaux = new ArrayList<Nac>(); // Un maître possède 0 ou plusieurs NAC

    // ****** CONSTRUCTEURS ****** //

    // Constructeur vide
    public Maitre() {
        this.age = 0;
        this.nom = "Laura";
    }
    // Ce constructeur permet de créer un maître ne possédant pas de nac
    public Maitre(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    // Ce constructeur permet de créer un maître possédant des Nacs
    public Maitre(int age, String nom, ArrayList<Nac> animal) {
        this.age = age;
        this.nom = nom;
        this.animaux = animal;
    }

    // ****** ACCESSEURS ****** //
    public int getAge(){ return(this.age); }
    public void setAge(int number){
        this.age = number;
    }
    public String getNom(){
        return(this.nom);
    }
    public void setNom(String name){
        this.nom = name;
    }
    public ArrayList<Nac> getAnimal(){
        return(this.animaux);
    }
    public void setAnimal(ArrayList<Nac> nc){
        if(nc != null) {
            this.animaux = nc;
            for (Nac puppy : this.animaux) {
                if (!puppy.getMaitre().equals(this)) {
                    puppy.setMaitre(this);
                }
            }
        }
    }

    // ****** METHODES ****** //

    @Override
    public String toString(){
        return "Je suis : " + this.nom + " et j'ai " + this.age + " ans.";
    }

    @Override
    public boolean equals(Object obj){
        boolean retour = false;
        if (obj!= null && (obj.getClass().equals(this.getClass()))){
            if (obj instanceof Maitre){
                Maitre maitre = (Maitre)obj;
                if(maitre.getAnimal() == null && this.animaux==null){
                    retour = this.nom.equals(maitre.getNom()) &&
                            this.age == maitre.getAge();
                }
                else{
                    if(maitre.getAnimal() == null || this.animaux == null){
                        retour = false;
                    }
                    else{
                        retour = this.nom.equals(maitre.getNom()) &&
                                this.age == maitre.getAge() && this.animaux.equals(maitre.getAnimal());
                    }
                }
            }

        }
        return(retour);
    }

    // Cette fonction ajoute un animal à la liste déjà existante
    public void addNac(Nac puppy) {
        if(! this.isNacInAnimals(puppy)) {
            this.animaux.add(puppy);
        }
    }

    public boolean isNacInAnimals(Nac puppy){
        for (Nac mypuppy:this.animaux) {
            if(puppy.equals(mypuppy)){
                return(true);
            }
        }
        return(false);
    }

    // Préciser qu'on doit modifier la méthode promener dans le rapport
    public String promener() {
        String promenade = "Pour cette promenade, " + this.nom + " vous présente :";
        for (Nac puppy:this.animaux) {
            promenade = promenade + '\n' + '-' + puppy.presentation();
        }
        return(promenade);
    }
}
