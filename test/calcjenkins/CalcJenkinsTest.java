/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcjenkins;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author charles.capiaux
 */
public class CalcJenkinsTest {
   CalcJenkins instance;
    
    public CalcJenkinsTest () {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CalcJenkins();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouter method, of class CalculatriceIncrementale.
     */
    @Test
    public void testAjouter() {
        /*Ajout positif*/
        System.out.println("ajouter positif");
        int a = 5;
        int b = 4;
        int expResult = 9;
        
        int result = instance.ajouter(a, b);
        assertEquals(expResult, result);
        
        /* a negatif */
        System.out.println("ajouter a negatif");
        a = -5;
        b = 4;
        expResult = -1;
        result = instance.ajouter(a, b);
        assertEquals(expResult, result);
        
        /* b negatif */
        System.out.println("ajouter b negatif");
        a = -5;
        b = -4;
        expResult = -9;
        result = instance.ajouter(a, b);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of soustraire method, of class CalculatriceIncrementale.
     */
    @Test
    public void testSoustraire() {
        System.out.println("soustraire");
        int a = 8;
        int b = 4;
        int expResult = 4;
        int result = instance.soustraire(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplier method, of class CalculatriceIncrementale.
     */
    @Test
    public void testMultiplier() {
        System.out.println("multiplier positif");
        int a = 5;
        int b = 5;
        int expResult = 25;
        int result = instance.multiplier(a, b);
        assertEquals(expResult, result);
        
        System.out.println("multiplier resultat negatif");
        a = 5;
        b = -5;
        expResult = -25;
        result = instance.multiplier(a, b);
        assertEquals(expResult, result);
        
        System.out.println("multiplier double negatif resultat positif");
        a = -5;
        b = -5;
        expResult = 25;
        result = instance.multiplier(a, b);
        assertEquals(expResult, result);
    }

    /**
     * test de la division
     */
    @Test
    public void testDiviser() throws Exception {
        System.out.println("diviser resultat negatif");
        int a = 25;
        int b = -5;
        int expResult = -5;
        int result = instance.diviser(a, b);
        assertEquals(expResult, result);
        
        System.out.println("diviser resultat positif");
        a = 25;
        b = 5;
        expResult = 5;
        result = instance.diviser(a, b);
        assertEquals(expResult, result);
        
        System.out.println("diviser double negatif");
        a = -25;
        b = -5;
        expResult = 5;
        result = instance.diviser(a, b);
        assertEquals(expResult, result);
    }
    
    /**
     * Test division par zero
     */
    @Test (expected = Exception.class)
    public void testDiviserParZero() throws Exception{
        System.out.println("diviser par zero");
        int a = 5;
        int b = 0;
        instance.diviser(a, b);
    }
    
}
