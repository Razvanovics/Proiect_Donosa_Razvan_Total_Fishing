package pages.Autentificare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class Autentificare extends BasePage { //Mosteneste din Clasa Best Test;  extends este mostenirea in Java
    public static final Logger LOG = LoggerFactory.getLogger(Autentificare.class);
    public static Autentificare instance;

    private Autentificare() {

    }

    public static Autentificare getInstance() {
        if (instance == null) {
            instance = new Autentificare();
        }
        return instance;
    }

    //Locatori Autentificare Client
    private By basePageLogo = By.xpath("//span[@class='logotagline']");
    private By autentificareButton = By.xpath("//a[@href='https://www.totalfishing.ro/customer/account/login/referer/aHR0cHM6Ly93d3cudG90YWxmaXNoaW5nLnJvLw%2C%2C/']");
    private By autentificareEmail = By.id("email");
    private By autentificareParola = By.id("pass");
    private By autentificareClientButton = By.id("send2");

    //Locatori Contul Meu
    private By autentifacareButtonBugged = By.xpath("//a[normalize-space()='Autentificare']"); //Locator pentru Bypass problema accesare automatizata a sectiunii Contul Meu
    private By contulMeuMainButton = By.xpath("//span[@role='button']");

    //Locatori Agenda
    private By agendaButton = By.xpath("//li//a[@href='https://www.totalfishing.ro/customer/address/']");
    private By persoanaFizicaRadioButton = By.id("address_entity_type-1");
    private By persoanaJuridicaRadioButton = By.id("address_entity_type-2");
    private By judetField = By.id("region_id");
    //    String selectJudet = "//option[normalize-space(), '%s']";
//  private By searchField = By.xpath("//input[@type='search']");
    private By orasField = By.id("select2-city-container");
    private By selectOrasField = By.xpath("//input[@role='textbox']");
    private By schimbaAdresaDeLivrareButton = By.xpath("//span[normalize-space()='Schimba adresa de livrare']");
    private By stradaField = By.id("street_1");
    private By salveazaAdresaButton = By.xpath("//button[@data-action='save-address']");

    //Locatori Comenzile Mele
    private By paginaDoiComenzileMeleButton = By.xpath("//strong[@class='page']");
    private By selectLimiterComenziAfisate = By.id("limiter");
    private By selectLimit50ComenziAfisate = By.xpath("//*[@id=\"limiter\"]/option[3]");
    private By selectVizualizeazaComanda = By.xpath("//a[@href='https://www.totalfishing.ro/sales/order/view/order_id/477699/']");
    private By selectLivrariComandaTab = By.xpath("//a[@href='https://www.totalfishing.ro/sales/order/shipment/order_id/477699/']");
    private By findTrackingNumber = By.xpath("//dd[@class='tracking-content']");
    String awbNumber = "//dd[contains(text(), '%s')]";
    private By deconectareButton = By.xpath("//li[@class='nav item']//a[normalize-space()='Deconectare']");

    //Methode Autentificare Client
    public boolean isBasePageLogoDispalyed() { //Metoda verificare Logo existent.
        LOG.info("Verify if 'TotalFishing Logo' is displayed on the Main Page");
        return driver.findElement(basePageLogo).isDisplayed();
    }

    public boolean isAutentificareButtonDisplayed() { //Metoda verificare button Autentificare existent.
        LOG.info("Verify if 'Autentificare' button is displayed");
        return driver.findElement(autentificareButton).isDisplayed();
    }

    public void clickAutentificareButton() { //Metoda ce da click pe butonul de Autentificare.
        LOG.info("Click 'Autentificare' button");
        driver.findElement(autentificareButton).click();
    }

    public void typeEmailAutentificare(String email) { //Metoda ce inseareaza adresa de email definita ca si variabila de tip String in AutentificareTest.
        LOG.info("Type email address in 'Email' field");
        driver.findElement(autentificareEmail).sendKeys(email);
    }

    public void typeParolaAutentificare(String parola) { //Methoda ce inseareaza parola definita ca si variabila de tip String in clasa AutentificareTest.
        LOG.info("Type parola in 'Parola' field");
        driver.findElement(autentificareParola).sendKeys(parola);
    }

    public void clickAutentificareClientButton() { // Metoda ce da click pe butonul de Autentificare Client.
        LOG.info("Click 'Autentificare' button in the bottom of the page");
        driver.findElement(autentificareClientButton).click();
    }

    public void clickAutentificareButtonBugged() { //BUG: Ca si workaround a trebuit sa adaug un pas in plus deoarece dupa logarea cu success a unui cont existent nu se deschide corect Pagina Web in Sectiunea Contul Meu
        LOG.info("Click 'Autentificare Button' that is buggged");
        driver.findElement(autentifacareButtonBugged).click();
    }

    public boolean isContulMeuMainButtonDisplayed() { //Metoda verificare existenta buton Contul Meu
        LOG.info("Verify if 'Contul Meu Main Button' is displayed on the Main Page");
        return driver.findElement(contulMeuMainButton).isDisplayed();
    }

    //Methode Sectiunea Agenda
    public void clickAgendaButton() { // Metoda ce da click pe Sectiunea Agenda
        LOG.info("Click on 'Agenda' Button");
        driver.findElement(agendaButton).click();
    }

    public void clickSchimbaAdresaDeLivrareButton() { //Metoda ce da click pe butonul Schimba adresa de livrare.
        LOG.info("Click on 'Schimba Adresa De Livrare' Button");
        driver.findElement(schimbaAdresaDeLivrareButton).click();
    }

    public void selectPersoanaJuridicaRadioButton() { //Metoda ce da click pe butonul de tip radio Pers.Juridica.
        LOG.info("Click on 'Pers.Juridica' Radio button");
        driver.findElement(persoanaJuridicaRadioButton).click();


    }

    public void selectPersoanaFizicaRadioButton() { //Metoda ce da click pe butonul de tip radio Pers.Fizica.
        LOG.info("Click on 'Pers.Fizica' Radio button");
        driver.findElement(persoanaFizicaRadioButton).click();
    }

    public void changeStradaField(String strada) { //Metoda ce selecteaza campul Strada, sterge actuala informatie si adauga informatia definita intr-o variabila de tip String in clasa AutentificarTest
        LOG.info("Change 'Adresa Strada' on 'Adresa' Field");
        driver.findElement(stradaField).clear(); // Stergeam valoare deja existenta in Field.
        driver.findElement(stradaField).sendKeys(strada);
    }

    public void changeJudetField(String judet) { //Metoda ce modifica Judetul in campul Judet.
        LOG.info("Change 'Judet' on 'Judet' Field");
        driver.findElement(judetField).click();
        driver.findElement(judetField).sendKeys(judet);
        driver.findElement(judetField).sendKeys(Keys.ENTER);
//        driver.findElement(By.xpath(String.format(selectJudet, judet))).click(); //Methoda ce insereaza specific judetul definit ca o variabila in clasa AutentificareTest, valoarea definita trebuie sa fie in lista valorilor afisate in codul sursa a paginii web.
    }

    public void changeOrasField(String oras) { // Metoda ce modifica Orasul in campul Oras.
        LOG.info("Change 'Oras' on 'Oras' Field");
        driver.findElement(orasField).click();
        driver.findElement(selectOrasField).click();
        driver.findElement(selectOrasField).sendKeys(oras);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        sleep(1000);
        driver.findElement(selectOrasField).sendKeys(Keys.ENTER);
        sleep(1000);//Probleme Salvare aici
    }

    public void clickSalveazaAdressaButton() { //Metoda ce confirma modificarile facute pe sectiunea Agenda
        LOG.info("Click on 'Salveaza Adresa' Button");
        driver.findElement(salveazaAdresaButton).click();
        sleep(4000);
        driver.navigate().to("https://www.totalfishing.ro/sales/order/history/"); // Navigam pe Sectiunea Comenzile mele
    }

    public void clickPaginaDoiComenzileMeleButton() { //Metoda ce navigheaza pe pagina 2 din istoricul Comenzilor mele
        LOG.info("Click on number '2' button to navigate to second Page from 'Comenzile mele' section");
        driver.findElement(paginaDoiComenzileMeleButton).click();
    }

    public void clickSelectLimiterComenziAfisate() {  //Metoda ce da click pe limiter-ul de comenzi afisate
        LOG.info("Click on Limiter 'ComenziAfisate' to show more than 10 orders");
        driver.findElement(selectLimiterComenziAfisate).click();
        driver.findElement(selectLimit50ComenziAfisate).click();
    }

    public void clickSelectVizualizeazaComanda() { //Metoda ce da click pe Vizualizeaza Comanda pentru a verifica o comanda veche
        LOG.info("Click on 'Vizualizeaza Comanda' in order to open an old Order");
        driver.findElement(selectVizualizeazaComanda).click();
    }

    public void clickSelectLivrariComandaTab() { //Metoda ce da click pe Tab-ul Livrari Comanda
        LOG.info("Click on'Livrari Comanda' tab in order to check specific details of the order");
        driver.findElement(selectLivrariComandaTab).click();
    }

    public void setFindTrackingNumber(String awb) { //Metoda ce imi cauta specific numarul AWB ce este definit ca variabila in clasa Autentificare
        LOG.info("Method to find specific tracking number on the order");
//        driver.findElement(findTrackingNumber).click();
        driver.findElement(By.xpath(String.format(awbNumber, awb))).click();
    }

    public void clickDeconectareButton() { //Metoda ce da click pe butonul Deconectare
        LOG.info("Click on 'Deconectare' button in order to log out");
        driver.findElement(deconectareButton).click();
    }

}


