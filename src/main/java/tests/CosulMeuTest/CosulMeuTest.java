package tests.CosulMeuTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;
import static pages.BasePage.sleep;

public class CosulMeuTest extends BaseTest {

    private static final Logger LOG = LoggerFactory.getLogger(CosulMeuTest.class);
    private String newUrl = getBaseUrl() + "Register.html";

    @Test
    public void CosulMeu() {

        //Variabile definite pentru introducere specifica a anumitor valori in fieldurile definite.

        String email = "razvan.donosa@gmail.com";
        String parola = "?Azimut2023";
        String producator = "Benzar";
        String produs = "Morunas Mreana Scobar";
        String cantitate = "3";
        String codReducere = "TF5";
        String comentariuComanda = "SCHIMBATI DEVELOPERUL M-A TERMINAT PSIHIC SITE-UL!";

        //Testare Cosul Meu

        LOG.info("Check if 'Contul Meu' button is displayed");
        Assert.assertTrue(cosulMeu.isAutentificareButtonDisplayed(), "Button is not displayed");

        LOG.info("Click 'Autentificare' button");
        cosulMeu.clickAutentificareButton();

        LOG.info("Type email address in  'Email' field");
        cosulMeu.typeEmailAutentificare(email);

        LOG.info("Type Parola in  'Parola' field");
        cosulMeu.typeParolaAutentificare(parola);

        LOG.info("Click 'Autentificare Client' button on the bottom page");
        cosulMeu.clickAutentificareClientButton();

        LOG.info("Filter and navigate from 'Catalog Pescuit' Menu to 'Lansete Feeder Picker' Submenu");
        cosulMeu.clickCatalogPescuitMenu();

        sleep(2000);

//        LOG.info("Filter specific price with the 'Price Slider' option");
//        cosulMeu.selectPriceSliderMin();

        LOG.info("Click on 'Producator' field and type 'Benzar' to filter specific Brand");
        cosulMeu.filterProductBenzar(producator);

        LOG.info("Add to cart 'Lanseta feeder Benzar No Limit Method Feeder 3.60m/100-250g' and 'Lanseta feeder Benzar Universal Feeder 3.60m/20-120g' products");
        cosulMeu.addToCartProducts();

        sleep(2000);

        LOG.info("Add to whishlist 'Lanseta feeder Benzar Concourse Method Feeder 3.60m/30-120g' product");
        cosulMeu.addToWishlistProduct();

        LOG.info("Click on 'Cautare' field and search for 'Morunas Mreana scobar' products");
        cosulMeu.searchProduct(produs);

        sleep(4000);

        LOG.info("Add to cart and whislist to separate products");
        cosulMeu.addtoCartAndWhishlistProducts();

        LOG.info("Add to cart products from the wishlist");
        cosulMeu.addToCartWishlistProducts();

        LOG.info("Open 'Cosul Meu' and click on 'Modifica Cos' button");
        cosulMeu.openCosulMeu();

        LOG.info("Modify quantity and delete products from 'Cosul Meu' section");
        cosulMeu.modifyCosulMeu(cantitate);

        LOG.info("Select 'Adresa livrare' field");
        cosulMeu.chooseAdresaLivrare();

        LOG.info("Select 'Fan Courier' as delivery method");
        cosulMeu.chooseMetodeLivrare();

        LOG.info("Select plata cu cardul from 'Modalitati de plata' options");
        cosulMeu.chooseModalitateDePlata();

        LOG.info("Enter promotion code in the 'Aplica Reducerea' field");
        cosulMeu.enterCodeAplicaReducerea(codReducere);

        LOG.info("Enter 'Comentariu comanda' details");
        cosulMeu.writeComentariuComanda(comentariuComanda);

        LOG.info("Check 'Am citit si sunt de acord cu Termenii si conditiile' checkbox");
        cosulMeu.checkTermeniSiConditii();

        LOG.info("Click on 'Inapoi in cos' button to return to 'Cosul meu' page");
        cosulMeu.clickInapoiInCos();

        LOG.info("Navigate from 'Infromatii' Menu to 'Contactati-ne' Submenu");
        cosulMeu.clickInformatiiMenu();

    }


}