package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.Autentificare.Autentificare;
import pages.BasePage;
import pages.ContNou.ContNou;
import pages.CosulMeu.CosulMeu;

public class BaseTest {

    public Autentificare autentificare = Autentificare.getInstance();//Obiect de tip SignInpage, ia valoarea din Sign in Page getInstance
    public ContNou contNou = ContNou.getInstance(); // Obiect de tip
    public CosulMeu cosulMeu = CosulMeu.getInstance();


    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();

    }
}
