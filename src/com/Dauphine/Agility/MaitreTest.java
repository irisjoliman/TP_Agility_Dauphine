package com.Dauphine.Agility;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MaitreTest {

    public MaitreTest() {
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
    public void constructeurVideTest() {
        Maitre m1 = new Maitre();
        assertEquals(m1.getNom(), "Laura");
        assertEquals(m1.getAge(), 0);
        assertEquals(m1.getAnimal(), new ArrayList<Nac>());
    }

    @Test
    public void constructeur2argumentsTest() {
        Maitre m1 = new Maitre(10, "Laye");
        assertEquals(m1.getNom(), "Laye");
        assertEquals(m1.getAge(), 10);
        assertEquals(m1.getAnimal(), new ArrayList<Nac>());
    }

    @Test
    public void constructeur3argumentsTest() {
        Nac n1 = new Nac("Hamtaro", 12);
        Nac n2 = new Nac("Hamtara", 11);
        Nac n3 = new Nac("Hamtaru", 10);
        ArrayList<Nac> myNacs = new ArrayList<Nac>();
        myNacs.add(n1);
        myNacs.add(n2);
        myNacs.add(n3);
        Maitre m1 = new Maitre(10, "Laye", myNacs);
        assertEquals(m1.getNom(), "Laye");
        assertEquals(m1.getAge(), 10);
        assertEquals(m1.getAnimal(), myNacs);
    }

    @Test
    public void getNomTest() {
        Maitre m1 = new Maitre(10, "Laye");
        assertEquals("Laye", m1.getNom());
    }

    @Test
    public void getAgeTest() {
        Maitre m1 = new Maitre(10, "Laye");
        assertEquals(10, m1.getAge());
    }

    @Test
    public void getAnimals() {
        Nac n1 = new Nac("Hamtaro", 12);
        Nac n2 = new Nac("Hamtara", 11);
        Nac n3 = new Nac("Hamtaru", 10);
        ArrayList<Nac> myNacs = new ArrayList<Nac>();
        myNacs.add(n1);
        myNacs.add(n2);
        myNacs.add(n3);
        Maitre m1 = new Maitre(10, "Laye", myNacs);
        assertEquals(myNacs, m1.getAnimal());
    }

    @Test
    public void setNomTest() {
        Maitre m1 = new Maitre(10, "Laye");
        m1.setNom("Bijou");
        assertEquals("Bijou", m1.getNom());
    }

    @Test
    public void setAge() {
        Maitre m1 = new Maitre(10, "Laye");
        m1.setAge(20);
        assertEquals(20, m1.getAge());
    }

    @Test
    public void setAnimalTest() {
        Maitre m2 = new Maitre(10, "Laye");
        Nac n1 = new Nac("Hamtaro", 12,m2);
        Nac n2 = new Nac("Hamtara", 11,m2);
        Nac n3 = new Nac("Hamtaru", 10,m2);

        Nac n5 = new Nac("amtaro", 2,m2);
        Nac n6 = new Nac("amtara", 1,m2);
        Nac n7 = new Nac("amtaru", 0,m2);

        ArrayList<Nac> myNacs = new ArrayList<Nac>();
        ArrayList<Nac> myNacsNew = new ArrayList<Nac>();
        myNacs.add(n1);
        myNacs.add(n2);
        myNacs.add(n3);
        myNacsNew.add(n5);
        myNacsNew.add(n6);
        myNacsNew.add(n7);
        Maitre m1 = new Maitre(10, "Laye", myNacs);

        m1.setAnimal(myNacsNew);
        assertEquals(myNacsNew, m1.getAnimal());
    }

    @Test
    public void toStringTest(){
        Maitre maitre = new Maitre(8, "Laura");
        assertEquals(maitre.toString(), "Je suis : Laura et j'ai 8 ans.");
    }

    @Test
    public void equalsTest(){
        Nac n1 = new Nac("Hamtaro", 12);
        Nac n2 = new Nac("Hamtara", 11);
        Nac n3 = new Nac("Hamtaru", 10);

        Nac n5 = new Nac("amtaro", 2);
        Nac n6 = new Nac("amtara", 1);
        Nac n7 = new Nac("amtaru", 0);

        ArrayList<Nac> myNacs1 = new ArrayList<Nac>();
        ArrayList<Nac> myNacs2 = new ArrayList<Nac>();
        myNacs1.add(n1);
        myNacs1.add(n2);
        myNacs1.add(n3);
        myNacs2.add(n5);
        myNacs2.add(n6);
        myNacs2.add(n7);

        Maitre maitre0 = new Maitre(8, "Laura");
        Maitre maitre1 = new Maitre(10, "Laurent",myNacs2);
        Maitre maitre2 = new Maitre(10, "Laurent",myNacs1);
        Maitre maitre3 = new Maitre(10, "Laurent",myNacs1);

        assertEquals(true, maitre3.equals(maitre2));
        assertEquals(false, maitre0.equals(maitre1));
        assertEquals(false, maitre1.equals(maitre2));
    }

    @Test
    public void promenadeTest()
    {
        Nac n1 = new Nac("Hamtaro", 12);
        Nac n2 = new Nac("Hamtara", 11);
        Nac n3 = new Nac("Hamtaru", 10);
        ArrayList<Nac> myNacs1 = new ArrayList<Nac>();
        myNacs1.add(n1);
        myNacs1.add(n2);
        myNacs1.add(n3);
        Maitre maitre2 = new Maitre(10, "Laurent",myNacs1);
        assertEquals("Pour cette promenade, Laurent vous présente :\n" +
                "-Je m'appelle Hamtaro et je dors 12 heures.\n" +
                "-Je m'appelle Hamtara et je dors 11 heures.\n" +
                "-Je m'appelle Hamtaru et je dors 10 heures.", maitre2.promener());
    }

    @Test
    public void addNacTest(){
        Nac n1 = new Nac("Hamtaro", 12);
        Nac n2 = new Nac("Hamtara", 11);
        Nac n3 = new Nac("Hamtaru", 10);

        Nac n4 = new Nac("Hamtarette", 80);

        ArrayList<Nac> myNacs = new ArrayList<Nac>();
        ArrayList<Nac> myNacsNew = new ArrayList<Nac>();
        myNacs.add(n1);
        myNacs.add(n2);
        myNacs.add(n3);

        myNacsNew.add(n1);
        myNacsNew.add(n2);
        myNacsNew.add(n3);
        myNacsNew.add(n4);

        Maitre maitre2 = new Maitre(10, "Laurent",myNacs);
        maitre2.addNac(n4);
        assertEquals(maitre2.getAnimal(),myNacsNew);
    }
}