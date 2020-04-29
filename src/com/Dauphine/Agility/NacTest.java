package com.Dauphine.Agility;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test NacTest.
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 */

public class NacTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir

    /**
     * Constructeur de la classe-test NacTest
     */
    public NacTest()
    {
    }

    /**
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
    }

    /**
     * Supprime les engagements
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

 

    @Test
    public void constructeurVideTest(){
        Nac nac1 = new Nac();
        assertEquals(nac1.getNom(),"animal sans nom");
        assertEquals(nac1.getNbrDodo(), 0);
        assertEquals(nac1.getMaitre(), null);
    }

    @Test
    public void constructeur2argumentsTest(){
        Nac nac2 = new Nac("Hamtaro",12);
        assertEquals(nac2.getNom(),"Hamtaro");
        assertEquals(nac2.getNbrDodo(), 12);
        assertEquals(nac2.getMaitre(), null);
    }

    @Test
    public void constructeur3argumentsTest(){
        Maitre maitre3 = new Maitre(8, "Laura");
        Nac nac3 = new Nac("Hamtaro",12, maitre3);
        assertEquals(nac3.getNom(),"Hamtaro");
        assertEquals(nac3.getNbrDodo(), 12);
        assertEquals(nac3.getMaitre(), maitre3);
    }

    @Test
    public void getNomTest(){
        Nac n = new Nac("Hamtaro", 12);
        assertEquals("Hamtaro", n.getNom());
    }

    @Test
    public void getNbrHeureSommeilTest(){
        Nac n = new Nac("Hamtaro", 12);
        assertEquals(12, n.getNbrDodo());
    }

    @Test
    public void getMaitreTest(){
        Maitre maitre = new Maitre(8, "Laura");
        Nac n = new Nac("Hamtaro", 12, maitre);
        assertEquals(maitre, n.getMaitre());
    }

    @Test
    public void setNomTest(){
        Nac n = new Nac("Hamtaro", 12);
        n.setNom("Bijou");
        assertEquals("Bijou", n.getNom());
    }

    @Test
    public void setNbrHeureSommeilTest(){
        Nac n = new Nac("Hamtaro", 12);
        n.setNbrDodo(20);
        assertEquals(20, n.getNbrDodo());
    }

    @Test
    public void setMaitreTest(){
        Maitre maitre = new Maitre(8, "Laura");
        Maitre maitre2 = new Maitre(8, "Zam");
        Nac n = new Nac("Hamtaro", 12, maitre);
        n.setMaitre(maitre2);
        assertEquals(maitre2, n.getMaitre());
    }

    @Test
    public void equalsTest(){
        Maitre maitre = new Maitre(8, "Laura");
        Maitre maitre1 = new Maitre(10, "Laurent");
        Nac n1 = new Nac("Hamtaro", 12, maitre);
        Nac n2 = new Nac("Hamtaro", 12, maitre);
        Nac n3 = new Nac("Hamtaro", 12, maitre1);
        Nac n4 = new Nac("Hamtaro", 12);
        Nac n5 = new Nac("Hamtaro", 12);
        assertEquals(true, n4.equals(n5));
        assertEquals(true, n1.equals(n2));
        assertEquals(false, n3.equals(n2));
        assertEquals(false, n2.equals(n4));
        assertEquals(false, n4.equals(n2));
    }

    @Test
    public void toStringTest(){
        Maitre maitre = new Maitre(8, "Laura");
        Nac n1 = new Nac("Hamtaro", 12);
        Nac n2 = new Nac("Hamtara", 10, maitre);
        assertEquals(n1.toString(), "Je suis : Hamtaro et j'ai besoin de 12 heures de sommeil.");
        assertEquals(n2.toString(), "Je suis : Hamtara et j'ai besoin de 10 heures de sommeil.\n" +
                " Mon maître s'appelle : Laura");

    }
    @Test
    public void presentationTest()
    {
        Nac hamtaro = new Nac("Hamtaro", 12);
        Maitre maitre = new Maitre(8, "Laura");
        assertEquals("Je m'appelle Hamtaro et je dors 12 heures.", hamtaro.presentation());
    }




}



