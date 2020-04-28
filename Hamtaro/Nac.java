
public class Nac{
    private String nom;
    private int nbrHeureSommeil;
    /**
     * Constructeur d'objets de classe Nac
     */
    public Nac(String nom, int nbrHeureSommeil){
        this.nom = nom;
        this.nbrHeureSommeil = nbrHeureSommeil;
    }
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
    public String presentation(){
        return "Je m'appelle " + this.nom + " et je dors " + this.nbrHeureSommeil + "heures.";
    }
}
