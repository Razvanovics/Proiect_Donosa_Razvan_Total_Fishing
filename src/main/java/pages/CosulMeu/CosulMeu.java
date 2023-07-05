package pages.CosulMeu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;


public class CosulMeu extends BasePage {

    private static final Logger LOG = LoggerFactory.getLogger(CosulMeu.class);
    public static CosulMeu instance;

    private CosulMeu() {
    }

    public static CosulMeu getInstance() { //Methoda prin care face Clasa CosulMeu sa fie apelata din Base Test

        if (instance == null) {
            instance = new CosulMeu();
        }
        return instance;
    }



    //Locatori Autentificare
    private By contulMeuButtonMenu = By.xpath("//span[@data-bind=\"text: 'Contul meu'\"]");
    private By contulMeuButon = By.xpath("//ul[@class='header links']//a[normalize-space()='Contul meu']");
    private By autentificareButton = By.xpath("//a[@href='https://www.totalfishing.ro/customer/account/login/referer/aHR0cHM6Ly93d3cudG90YWxmaXNoaW5nLnJvLw%2C%2C/']");
    private By autentificareEmail = By.id("email");
    private By autentificareParola = By.id("pass");
    private By autentificareClientButton = By.id("send2");

    //Locatori Filtrare Catalog Pescuit
    private By catalogPescuitMenu = By.xpath("//span[normalize-space()='Catalog Pescuit']");
    private By pescuitLaFeederStationarSubmenu = By.xpath("//a[@id='ui-id-3']//span[contains(text(),'Pescuit la feeder, stationar')]");
    private By lanseteFeederPicker = By.xpath("//a[@id='ui-id-119']//span[contains(text(),'Lansete feeder, picker')]");
    // private By priceSlider = By.xpath("//div[@class='ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all']");
//  private By priceSlider = By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/div/div[3]/a[1]");
    private By filtruProducator = By.xpath("//input[@class='filter-search']");
    private By filtruProducatorBenzar = By.xpath("//input[@id='brandFilter_option_8']");
    private By lansetaBenzarNoLimit = By.xpath("//form[@data-product-sku='12344360']");
    private By lansetaBenzarUniveral = By.xpath("//form[@data-product-sku='12329360']");
    private By wishlistBenzarConcourse = By.xpath("//a[@data-sku='12345360']");

    //Locatori Cautare Produs
    private By productSearchField = By.xpath("//input[@id='search']");
    private By cautareButton = By.xpath("//button[@title='Cautare']");
    private By nadaBenzarMixMorunasMreanaScobarVerde = By.xpath("//form[@data-product-sku='94005320']");
    private By nadaBenzarMixSpecialMorunasMreanaScobar = By.xpath("//div//h2/a[@href='https://www.totalfishing.ro/nada-benzar-mix-special-mreana-morunas-scobar-parmezan-3kg-p-53886.html']");
    private By whishlistNadaBenzarMixSpecialMorunasMreanaScobar = By.xpath("//a[@data-sku='94008356']");
    private By addToCartWishlistNadaBenzarMix = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[2]/div[1]/div[2]/div[2]/fieldset[1]/div[2]/div[1]/button[1]/span[1]");//Locator initializat in pagina dupa adaugare ( din pacate este variabil nu static)
    private By addToCartWishlistNadaBenzarMix2 = By.xpath("//button[@data-item-id='383987'"); //Locator initializat in pagina dupa adaugare numarul 2 ( din pacate este variabil nu static)

    private By addToCartWishlistLansetaBenzarConcourse = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/div[1]/form[1]/div[1]/ol[1]/li[1]/div[1]/div[2]/div[2]/fieldset[1]/div[2]/div[1]/button[1]");
    private By addToCartWishlistLansetaBenzarConcrouse2 = By.xpath("//button[@data-item-id='383986']");

    //Locatori Cosul Meu
    private By cosulMeuButton = By.xpath("//a[@href='https://www.totalfishing.ro/checkout/cart/']");
    private By modificaCosButton = By.xpath("//a[@class='action primary viewcart']");
    private By cantitateField = By.xpath("//input[@data-cart-item-id='94005320']");
    private By deleteLansetaBenzarUniversalFeeder = By.xpath("//tbody[2]/tr[1]/td[5]/div[1]/a[2]");
    private By deleteNadaBenzarSpecialMix = By.xpath("//tbody[4]/tr[1]/td[5]/div[1]/a[2]");
    private By confirmDeleteLansetaBenzarUniversalFeeder = By.xpath("//button[@class='action-primary action-accept']");
    private By confirmDeleteNadaBenzarSpecialMix = By.xpath("//button[@class='action-primary action-accept']");
    private By finalizazaComandaButton = By.xpath("//button[@data-role='proceed-to-checkout']");

    //Locatori Modificare Cosul Meu
    private By selectAdresaLivrare = By.xpath("//div[@class='field addresses']//div[6]");
    private By selectMethodaLivrare = By.xpath("//input[@value='fishfancourier_fishfancourier']");
    private By selectModalitatiDePlata = By.xpath("//input[@id='payu']");
    private By aplicaReducereField = By.xpath("//div[@aria-hidden='false']//input[@id='discount-code']");
    private By aplicaButton = By.xpath("//div[@aria-hidden='false']//button[@value='Aplica Reducere']");
    private By comentariuComandaField = By.xpath("//div[@id='iosc-summary']//textarea");
    private By termeniSiConditii = By.xpath("//div[@id='iosc-summary']//input[@id='agreement__1']");
    private By trimiteComandaButton = By.xpath("//button[contains(text(),'Trimite comanda')]");//Nu folosim acest locator, doar simulam o comanda nu dorim finalizarea reala.
    private By inapoiInCosButton = By.xpath("//span[normalize-space()='Inapoi in cos']");

    //Locatori Meniu Informatii
    private By informatiiMenu = By.xpath("//li[@class='level0 nav-6 info-tab level-top parent']//a[@class='level-top']");
    private By contactatineSubMenu = By.xpath("//li[@class='level1 nav-6-7 last']//a");
    private By addressLink = By.xpath("//a[normalize-space()='click aici pentru detalii']");

    private By priceRangeDown= By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']");
    private By priceRangeUp= By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']");



    //Methode Cosul Meu

    public void clickContulMeuMenu() { //Datorita unui bug al paginii Web ce nu se incarca corect trebuie facut un pas aditional pentru a fi afisat corect meniul de Autentificare
        LOG.info("Click on 'Contul Meu' Menu then 'Contul Meu' button");
        driver.findElement(contulMeuButtonMenu).click();
        driver.findElement(contulMeuButon).click();
        sleep(3000);
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

    public void typeParolaAutentificare(String parola) { //Metoda ce inseareaza parola definita ca si variabila de tip String in clasa AutentificareTest.
        LOG.info("Type parola in 'Parola' field");
        driver.findElement(autentificareParola).sendKeys(parola);
    }

    public void clickAutentificareClientButton() { // Metoda ce da click pe butonul de Autentificare Client.
        LOG.info("Click 'Autentificare' button in the bottom of the page");
        driver.findElement(autentificareClientButton).click();
    }

    public void clickCatalogPescuitMenu() { //Metoda ce navigheaza in filtru Catalog Pescuit si selecteaza submeniul Lansete Feeder Picker
        LOG.info("Filter and navigate from 'Catalog Pescuit' Menu to 'Lansete Feeder Picker' Submenu");
//        driver.findElement(catalogPescuitMenu).click();
        Actions selectCatalogPescuitMenu = new Actions(driver);
        selectCatalogPescuitMenu.moveToElement(driver.findElement(catalogPescuitMenu)).perform();
        Actions selectFeederStationSubmenu = new Actions(driver);
        selectFeederStationSubmenu.moveToElement(driver.findElement(pescuitLaFeederStationarSubmenu)).perform();
        sleep(2000);
        driver.findElement(lanseteFeederPicker).click();
    }

//    public void selectPriceSliderMin() {
//        LOG.info("Filter specific price with the 'Price Slider' option");
//        driver.switchTo().frame(0);
//        WebElement priceSlider = driver.findElement(By.xpath("//a[@class='ui-slider-handle ui-state-default ui-corner-all']"));
//        Actions move = new Actions(driver);
//        Action action = (Action) move.dragAndDropBy(priceSlider, 30, 0).build();
//        action.perform();
//    }

//    public void selectPriceSliderMax() {
//        LOG.info("Filter specific price with the 'Price Slider' option");
//        driver.switchTo().frame(0);
//        WebElement priceSlider = driver.findElement(By.xpath("//a[2][@class='ui-slider-handle ui-state-default ui-corner-all']"));
//        Actions move = new Actions(driver);
//        Action action = (Action) move.dragAndDropBy(priceSlider, 15, 0).build();
//        action.perform();
//    }

//
//    public void moveSlider(int move) { // De modificat slider
//        WebElement slider = driver.findElement(sliderLocation);
//
//        Actions action = new Actions(driver);
//        action.click(slider).build().perform();
//        for (int i = 0; i < 50; i++) {
//            action.sendKeys(Keys.ARROW_LEFT).build().perform();
//        }
//        for (int i = 0; i < move; i++) {
//            action.sendKeys(Keys.ARROW_RIGHT).build().perform();
//        }
//    }

    public void filterProductBenzar(String producator) { //Metoda ce insereaza si filtreaza un producator specific
        LOG.info("Click on 'Producator' field and type 'Benzar' to filter specific Brand");
        driver.findElement(filtruProducator).click();
        sleep(2000);
        driver.findElement(filtruProducator).sendKeys(producator);
        sleep(2000);
        driver.findElement(filtruProducatorBenzar).click();
        sleep(2000);
    }

    public void addToCartProducts() { //Metoda ce adauga in cos 2 produse specifice

        LOG.info("Add to cart 'Lanseta feeder Benzar No Limit Method Feeder 3.60m/100-250g' and 'Lanseta feeder Benzar Universal Feeder 3.60m/20-120g' products");
        driver.findElement(lansetaBenzarNoLimit).click();
        driver.findElement(lansetaBenzarUniveral).click();
        sleep(2000);
    }

    public void addToWishlistProduct() { //Metoda ce adauga la whislist un singur produs specific
        LOG.info("Add to whishlist 'Lanseta feeder Benzar Concourse Method Feeder 3.60m/30-120g' product");
        driver.findElement(wishlistBenzarConcourse).click();
    }

    public void searchProduct(String produs) { //Metoda prin care cautam in pagina principala produsul "Morunas Mreana Scobar"
        LOG.info("Click on 'Cautare' field and search for 'Morunas Mreana Scobar' products");
        driver.findElement(productSearchField).click();
        driver.findElement(productSearchField).sendKeys(produs);
        driver.findElement(productSearchField).sendKeys(Keys.ENTER);
//        driver.findElement(cautareButton).click();
        sleep(5000);
    }

    public void addtoCartAndWhishlistProducts() { //Metoda prin care adaugam in cos si whishlist produsele cautate
        LOG.info("Add to cart and whislist to separate products");
        driver.findElement(nadaBenzarMixMorunasMreanaScobarVerde).click();
        driver.findElement(nadaBenzarMixSpecialMorunasMreanaScobar).click();
        sleep(2000);
        driver.findElement(whishlistNadaBenzarMixSpecialMorunasMreanaScobar).click();
    }

    public void addToCartWishlistProducts() { //Metoda prin care adaugam in cos pordusele din sectiunea whishlist
        LOG.info("Add to cart products from the wishlist");
        driver.findElement(addToCartWishlistNadaBenzarMix).click();
        sleep(2000);
        driver.findElement(addToCartWishlistLansetaBenzarConcourse).click();
        sleep(3000);

    }

//    List<WebElement> dynamicElement =driver.findElements(addToCartWishlistNadaBenzarMix);
//    public void addToCartWishlistProducts() {
//        if (dynamicElement.size() != 0) {
//            driver.findElement(addToCartWishlistNadaBenzarMix).click();
//        } else {
//            driver.findElement(addToCartWishlistNadaBenzarMix2).click();
//        }
//    }

    public void openCosulMeu() { //Metoda prin care deschide Cosul meu si modificam comanda
        LOG.info("Open 'Cosul Meu' ");
//        driver.findElement(cosulMeuButton).click();
//        driver.findElement(modificaCosButton).click();
        driver.navigate().to("https://www.totalfishing.ro/checkout/cart/");
        sleep(3000);
    }

    public void modifyCosulMeu(String cantitate) { //Metoda ce modifica continutul cosului dupa preferintele selectate
        LOG.info("Modify quantity and delete products from 'Cosul Meu' section");
        driver.findElement(cantitateField).click();
        driver.findElement(cantitateField).sendKeys(Keys.DELETE);
        driver.findElement(cantitateField).sendKeys(cantitate);
        driver.findElement(cantitateField).sendKeys(Keys.ENTER);
        sleep(3000);
        driver.findElement(deleteLansetaBenzarUniversalFeeder).click();
        sleep(2000);
        driver.findElement(confirmDeleteLansetaBenzarUniversalFeeder).click();
        sleep(2000);
        driver.findElement(deleteNadaBenzarSpecialMix).click();
        sleep(2000);
        driver.findElement(confirmDeleteNadaBenzarSpecialMix).click();
        sleep(2000);
        driver.findElement(finalizazaComandaButton).click();
        sleep(3000);
    }

    public void chooseAdresaLivrare() { //Metoda ce selecteaza Adresa de livrare
        LOG.info("Select 'Adresa livrare' field");
        driver.findElement(selectAdresaLivrare).click();
        sleep(4000);
    }

    public void chooseMetodeLivrare() { //Metoda ce selecteaza modalitate de livrare    LOCATORUL VIETII VARIABIL
        LOG.info("Select 'Fan Courier' as delivery method");
        driver.findElement(selectMethodaLivrare).click();
        sleep(3000);
    }

    public void chooseModalitateDePlata() { //Metoda ce selecteaza modalitate de plata
        LOG.info("Select plata cu cardul from 'Modalitati de plata' options");
        driver.findElement(selectModalitatiDePlata).click();
        sleep(3000);
    }

    public void enterCodeAplicaReducerea(String codReducere) { //Methoda ce adauga codul de reducere
        LOG.info("Enter promotion code in the 'Aplica Reducerea' field");
        driver.findElement(aplicaReducereField).click();
        driver.findElement(aplicaReducereField).sendKeys(codReducere);
        driver.findElement(aplicaReducereField).sendKeys(Keys.ENTER);
        sleep(5000);
    }

    public void writeComentariuComanda(String comentariuComanda) { //Metoda ce adauga un comentariu la comanda
        LOG.info("Enter 'Comentariu comanda' details");
        driver.findElement(comentariuComandaField).click();
        driver.findElement(comentariuComandaField).sendKeys(comentariuComanda);
        sleep(5000);
    }

    public void checkTermeniSiConditii() { //Methoda ce da click pe 'Am citit si sunt de acord cu Termenii si conditiile'
        LOG.info("Check 'Am citit si sunt de acord cu Termenii si conditiile' checkbox");
        driver.findElement(termeniSiConditii).click();
        sleep(2000);
    }

    public void clickInapoiInCos() { //Methoda ce se intoarce in pagina anterioara Cosul Meu
        LOG.info("Click on 'Inapoi in cos' button to return to 'Cosul meu' page");
        driver.findElement(inapoiInCosButton).click();
        sleep(3000);
    }

    public void clickInformatiiMenu() { //Metoda ce navigheaza in Meniul Informatii apoi submeniul Contactati-ne
        LOG.info("Navigate from 'Infromatii' Menu to 'Contactati-ne' Submenu");
//        driver.findElement(catalogPescuitMenu).click();
        Actions selectInformatiiMenu = new Actions(driver);
        selectInformatiiMenu.moveToElement(driver.findElement(informatiiMenu)).perform();
//        Actions selectContactatineSubMenu = new Actions(driver);
//        selectContactatineSubMenu.moveToElement(driver.findElement(pescuitLaFeederStationarSubmenu)).perform();
        sleep(2000);
        driver.findElement(contactatineSubMenu).click();
        sleep(2000);
        driver.findElement(addressLink).click();
        sleep(2000);
        JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
        scrollDown.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        WebElement element = driver.findElement(By.xpath("//iframe[@id='map_canvas']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


}


