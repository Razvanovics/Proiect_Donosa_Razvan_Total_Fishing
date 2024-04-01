package tests.ContNouTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class ContNouTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(ContNouTest.class);
    private String contNouUrl = getBaseUrl() + "https://www.totalfishing.ro/customer/account/create/"; //Folosim aceasta methoda pentru a trece peste anumiti pasi unde trebuie sa definim locatorii, avem deja adresa exacta a paginii de unde dorim sa incepem.


    //Variabile definite pentru introducere specifica a anumitor valori in fieldurile definite.
    String prenume = "Razvan";
    String nume = "Azimut";
    String email = "razvan.azimut@gmail.com";
    String parola = "";


    @Test
    public void ContNou() {

        //Testare Creeare Cont Nou
        driver.get(contNouUrl);

        LOG.info("Verify if 'Cont nou' button is displayed");
        contNou.isContNouButtonDisplayed();

//        LOG.info("Click on 'Cont nou' button");
//        contNou.clickContNouButton();

        sleep(4000);
        LOG.info("Type firstname in 'Prenume' field");
        contNou.typePrenume(prenume);

        LOG.info("Type lastname in 'Nume' field");
        contNou.typeNume(nume);

        LOG.info("Type email address in 'Email' field");
        contNou.typeEmail(email);

        LOG.info("Type parola in 'Parola' field");
        contNou.typeParola(parola);

        LOG.info("Type parola in 'Confirma Parola' field");
        contNou.typeConfirmaParola(parola);

        LOG.info("Check 'Tine-ma minte Info' field");
        contNou.clickTinemaMinteInfoField();

        LOG.info("Check 'Am citit şi sunt de acord cu Termenii şi condiţiile' field");
        contNou.clicktermeniSiConditiiField();

        LOG.info("Check 'Newsletter' field");
        contNou.clicknewsetterField();

    }


}
