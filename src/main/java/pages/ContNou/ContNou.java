package pages.ContNou;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class ContNou extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(ContNou.class);
    public static ContNou instance;

    private ContNou() {
    }

    public static ContNou getInstance() { //Methoda prin care face Clasa Cont Nou sa fie apelata din Base Test

        if (instance == null) {
            instance = new ContNou();
        }
        return instance;
    }

    //    Locatori Cont Nou
    private By contNouButton = By.xpath("//a[@href='https://www.totalfishing.ro/customer/account/create/']");
    private By prenumeField = By.id("firstname");
    private By numeField = By.id("lastname");
    private By emailAddressField = By.id("email_address");
    private By parolaField = By.id("password");
    private By confirmaParolaField = By.id("password-confirmation");
    private By tinemaMinteInfoField = By.xpath("//span[normalize-space()='Tine-ma minte']");
    private By termeniSiConditiiField = By.id("agreement__1");
    private By newsetterField = By.id("is_subscribed");
    private By confirmContNouButton = By.xpath("//button[@title='Cont nou']");

    //Methode Cont Nou

    public boolean isContNouButtonDisplayed() { //Metoda ce verifica buton Cont Nou este existent pe pagina.
        LOG.info("Verify if 'Cont nou' button is displayed");
        return driver.findElement(contNouButton).isDisplayed();
    }

//    public void clickContNouButton() {
//        LOG.info("Click on 'Cont nou' button");
//        driver.findElement(contNouButton).click();
//    }

    public void typePrenume(String prenume) { //Metoda ce inseareaza Prenumele definit ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Type firstname in 'Prenume' field");
        driver.findElement(prenumeField).sendKeys(prenume);
    }

    public void typeNume(String nume) { //Metoda ce inseareaza Numele definit ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Type lastname in 'Nume' field");
        driver.findElement(numeField).sendKeys(nume);
    }

    public void typeEmail(String email) { //Metoda ce inseareaza Email-ul definit ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Type email address in 'Email' field");
        driver.findElement(emailAddressField).sendKeys(email);
    }

    public void typeParola(String parola) { //Metoda ce inseareaza Parola definita ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Type parola in 'Parola' field");
        driver.findElement(parolaField).sendKeys(parola);
    }

    public void typeConfirmaParola(String parola) { //Metoda ce inseareaza Confirmarea Parolei definita ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Type parola in 'Confirma Parola' field");
        driver.findElement(confirmaParolaField).sendKeys(parola);
    }

    public void clickTinemaMinteInfoField() { //Metoda ce inseareaza Confirmarea Parolei definita ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Check 'Tine-ma minte Info' field");
        driver.findElement(tinemaMinteInfoField).click();
    }

    public void clicktermeniSiConditiiField() { //Metoda ce inseareaza Confirmarea Parolei definita ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Check 'Am citit şi sunt de acord cu Termenii şi condiţiile' field");
        driver.findElement(termeniSiConditiiField).click();
    }

    public void clicknewsetterField() { //Metoda ce inseareaza Confirmarea Parolei definita ca si variabila de tip String in clasa ContNouTest.
        LOG.info("Check 'Newsletter' field");
        driver.findElement(newsetterField).click();
    }


}
