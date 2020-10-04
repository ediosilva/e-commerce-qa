package com.br.paginas;

import com.br.validacao.ValidacaoShoppingCart;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingPage extends BasePage {

    private static final Logger logger = Logger.getLogger(ShoppingPage.class);

    @FindBy(id = "search_query_top")
    private WebElement campoDePesquisa;

    @FindBy(id = "add_to_cart")
    private WebElement botaoAddToCart;

    @FindBy(id = "cgv")
    private WebElement botaoCheckBoxShipping;

    @FindBy(name = "processAddress")
    private WebElement botaoProceedToCheckoutAddress;

    @FindBy(name = "processCarrier")
    private WebElement botaoProceedToCheckoutShipping;

    @FindBy(xpath = "//a[contains(@title, 'View my shopping cart')]")
    private WebElement campoListaDeProdutosCarrinho;

    @FindBy(xpath = "//img[contains(@itemprop, 'image')]")
    private WebElement imagemFadedShortSleeveTShirts;

    @FindBy(xpath = "//a[contains(@title, 'Proceed to checkout')]")
    private WebElement botaoProceedToCheckout;

    @FindBy(xpath = "//a[contains(@class, 'logout')]")
    private WebElement botaologout;

    @FindBy(xpath = "//a[contains(@class,'standard-checkout')]")
    private WebElement botaoProceedToCheckoutSummary;

    @FindBy(xpath = "//a[contains(@class,'bankwire')]")
    private WebElement botaoPaybyBankWirePayment;

    @FindBy(xpath = "//button[contains(@class,'button-medium')]")
    private WebElement botaoIConfirmMyOrderPayment;

    private ValidacaoShoppingCart validacaoShoppingCart;

    public WebElement getCampoListaDeProdutosCarrinho() {
        return campoListaDeProdutosCarrinho;
    }

    public WebElement getImagemFadedShortSleeveTShirts() {
        return imagemFadedShortSleeveTShirts;
    }

    public WebElement getBotaoAddToCart() {
        return botaoAddToCart;
    }

    public ShoppingPage(WebDriver driver) {
        super(driver);
        logger.info("contrutor da classe ShoppingPage");
        validacaoShoppingCart = new ValidacaoShoppingCart();
    }

    public ShoppingPage realizarCompra(String nomeItem) {
        logger.info("iniciando a inclusao de um novo item no carrinho");
        campoDePesquisa.sendKeys(nomeItem);
        campoDePesquisa.sendKeys(Keys.ENTER);
        imagemFadedShortSleeveTShirts.click();
        botaoAddToCart.click();
        logger.info("adicionado um novo item no carrinho");
        botaoProceedToCheckout.click();
        logger.info("entrando na aba Summary");
        botaoProceedToCheckoutSummary.click();
        logger.info("entrando na aba Address");
        botaoProceedToCheckoutAddress.click();
        logger.info("entrando na aba Shipping");
        botaoCheckBoxShipping.click();
        botaoProceedToCheckoutShipping.click();
        logger.info("entrando na aba Payment");
        botaoPaybyBankWirePayment.click();
        logger.info("Escolhendo a opção Pay by Bank Wire");
        botaoIConfirmMyOrderPayment.click();
        logger.info("Confirmado a Orderm");
        return this;
    }


    public ShoppingPage realizarLogout() {
        logger.info("fazendo logout");
        botaologout.click();
        return this;
    }


    public void validarItemAdcionadoNoCarrinho() {
        validacaoShoppingCart.validarItemAdicionadoNoCarrinho(this);
    }


}
