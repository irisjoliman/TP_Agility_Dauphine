
/**
 * Décrivez votre classe Maitre ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Maitre
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int age;
    private String nom;
    private Nac animal;

    /**
     * Constructeur d'objets de classe Maitre
     */
    public Maitre()
    {
        // initialisation des variables d'instance
        age = 0;
        nom = "Laura";  
    }

    public int getAge(){
        return(this.age);
    }
    public void setAge(int number){
        this.age = number;
    }
    public String getNom(){
        return(this.nom);
    }
    public void setAge(String name){
        this.nom = name;
    }
    public Nac getAnimal(){
        return(this.animal);
    }
    public void setAnimal(Nac nc){
        this.animal = nc;
    }
    public String promener()
    {
        // Insérez votre code ici
        return "*Arrive dans son jardin* Hey, je suis " + this.nom + "... Hoooo reviens ici "+ animal.getNom();
    }
}
