package tests.AutentificareTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class AutentificareTest extends BaseTest { //Mosteneste din Clasa Best Test
    private static final Logger LOG = LoggerFactory.getLogger(AutentificareTest.class);

    //Variabile definite pentru introducere specifica a anumitor valori in fieldurile definite.
    String email = "razvan.donosa@gmail.com";
    String parola = "";
    String strada = "Test";

    String judet = "Cluj";
    String oras = "Cluj-Napoca";
    String awb = "1B4M24179915214001";

    @Test
    public void Autentificare() {


        //Testare Autentificare Client
        LOG.info("Check if 'TotalFishing Logo' is displayed");
        Assert.assertTrue(autentificare.isBasePageLogoDispalyed(), "Base Page Logo is not displayed");

        LOG.info("Check if 'Contul Meu' button is displayed");
        Assert.assertTrue(autentificare.isAutentificareButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Autentificare' button");
        autentificare.clickAutentificareButton();

        LOG.info("Type email address in  'Email' field");
        autentificare.typeEmailAutentificare(email);

        LOG.info("Type Parola in  'Parola' field");
        autentificare.typeParolaAutentificare(parola);

        LOG.info("Click 'Autentificare Client' button on the bottom page");
        autentificare.clickAutentificareClientButton();

        LOG.info("Click 'Autentificare Button' that is Bugged");
        autentificare.clickAutentificareButtonBugged();

        LOG.info("Check  'Contul Meu Main Button' button is displayed");
        Assert.assertTrue(autentificare.isContulMeuMainButtonDisplayed(), "Button is not displayed");

        //Testare Sectiune Agenda
        LOG.info("Click on 'Agenda' Button");
        autentificare.clickAgendaButton();

        LOG.info("Click on'Schimba Adresa de livrare' button");
        autentificare.clickSchimbaAdresaDeLivrareButton();

        LOG.info("Click on 'Pers.Juridica' Radio button");
        autentificare.selectPersoanaJuridicaRadioButton();

        LOG.info("Click on 'Pers.Fizica' Radio button");
        autentificare.selectPersoanaFizicaRadioButton();

        LOG.info("Change 'Adresa Strada' on Adresa Field");
        autentificare.changeStradaField(strada);

        LOG.info("");
        autentificare.changeJudetField(judet);

        sleep(5000);

        LOG.info("");
        autentificare.changeOrasField(oras);

        sleep(5000);

        LOG.info("Click on 'Salveaza Adresa' Button");
        autentificare.clickSalveazaAdressaButton();

        LOG.info("Click on number '2' button to navigate to second Page from 'Comenzile mele' section");
        autentificare.clickPaginaDoiComenzileMeleButton();

        sleep(3000);

        LOG.info("Click on Limiter 'ComenziAfisate' to show more than 10 orders");
        autentificare.clickSelectLimiterComenziAfisate();

        LOG.info("Click on 'Vizualizeaza Comanda' in order to open an old Order");
        autentificare.clickSelectVizualizeazaComanda();

        LOG.info("Click on'Livrari Comanda' tab in order to check specific details of the order");
        autentificare.clickSelectLivrariComandaTab();

        LOG.info("Method to find specific tracking number on the order");
        autentificare.setFindTrackingNumber(awb);

        LOG.info("Click on 'Deconectare' button in order to log out");
        autentificare.clickDeconectareButton();

        sleep(9000);
    }


}
