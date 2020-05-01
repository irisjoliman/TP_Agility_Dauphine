package com.Dauphine.Agility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(features = "resources", glue ="", strict = true)

public class FunctionnalTestRunnerTest{
public static class US001Test {

    private Nac puppy;
    private String answer;

    @Given("un Nac possédant un {string} et  un {int}")
    public void un_Nac_possédant_un_et_un(String string, Integer int1) throws io.cucumber.java.PendingException {
        puppy = new Nac(string, int1);
    }

    @When("l’utilisateur lui demande de se présenter")
    public void l_utilisateur_lui_demande_de_se_présenter() throws io.cucumber.java.PendingException {
        answer = puppy.presentation();
    }

    @Then("le système renvoie la {string} du Nac")
    public void le_système_renvoie_la_du_Nac(String string) throws io.cucumber.java.PendingException {
        assertEquals(answer, string);
    }
}


public static class US002Test {
    private Maitre maitre;
    private ArrayList<Nac> myNac = new ArrayList<Nac>();
    private String answer;

    @Given("Un maitre avec un {string} et un {int} et les {string} {string} {int} {int} des animaux qu’il possede")
    public void un_maitre_avec_un_et_un_et_les_des_animaux_qu_il_possede(String nom, Integer age, String arg0, String arg1, int arg2, int arg3) throws io.cucumber.java.PendingException {
        Nac puppy1 = new Nac(arg0, arg2);
        Nac puppy2 = new Nac(arg1, arg3);
        myNac.add(puppy1);
        myNac.add(puppy2);
        maitre = new Maitre(age, nom, myNac);
    }

    @When("l’utilisateur demande de promener le groupe")
    public void lUtilisateurDemandeDePromenerLeGroupe() {
        answer = maitre.promener();
    }

    @Then("le systeme renvoie un {string} confirmant bien la promenade et les animaux qui y participent")
    public void le_systeme_renvoie_un_confirmant_bien_la_promenade_et_les_animaux_qui_y_participent(String message) throws io.cucumber.java.PendingException {
        assertEquals(answer, message);
    }


    @Given("Un maître avec un {string} et un {int} ne possédant pas d’animal")
    public void un_maître_avec_un_et_un_ne_possédant_pas_d_animal(String nom, Integer age) throws io.cucumber.java.PendingException {
        maitre = new Maitre(age, nom);
    }

    @Then("le système renvoie un {string} d erreur")
    public void le_système_renvoie_un_derreur(String message) throws io.cucumber.java.PendingException {
        assertEquals(answer, message);
    }
}
}