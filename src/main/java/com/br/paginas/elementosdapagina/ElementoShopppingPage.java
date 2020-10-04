package com.br.paginas.elementosdapagina;

import com.br.paginas.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementoShopppingPage extends BasePage {

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
    private WebElement imagemDoProdutoClicavel;

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

    @FindBy(xpath = "//span[contains(@class,'ajax_cart_quantity')]")
    private WebElement quantidadeItemCarrinho;

    @FindBy(xpath = "//a[contains(@title,'remove this product from my cart')]")
    private List<WebElement> botaoRemoverItemCarrinho;

    public ElementoShopppingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCampoDePesquisa() {
        return campoDePesquisa;
    }

    public void setCampoDePesquisa(WebElement campoDePesquisa) {
        this.campoDePesquisa = campoDePesquisa;
    }

    public WebElement getQuantidadeItemCarrinho() {
        return quantidadeItemCarrinho;
    }

    public void setQuantidadeItemCarrinho(WebElement quantidadeItemCarrinho) {
        this.quantidadeItemCarrinho = quantidadeItemCarrinho;
    }

    public List<WebElement> getBotaoRemoverItemCarrinho() {
        return botaoRemoverItemCarrinho;
    }

    public void setBotaoRemoverItemCarrinho(List<WebElement> botaoRemoverItemCarrinho) {
        this.botaoRemoverItemCarrinho = botaoRemoverItemCarrinho;
    }

    public WebElement getBotaoAddToCart() {
        return botaoAddToCart;
    }

    public void setBotaoAddToCart(WebElement botaoAddToCart) {
        this.botaoAddToCart = botaoAddToCart;
    }

    public WebElement getBotaoCheckBoxShipping() {
        return botaoCheckBoxShipping;
    }

    public void setBotaoCheckBoxShipping(WebElement botaoCheckBoxShipping) {
        this.botaoCheckBoxShipping = botaoCheckBoxShipping;
    }

    public WebElement getBotaoProceedToCheckoutAddress() {
        return botaoProceedToCheckoutAddress;
    }

    public void setBotaoProceedToCheckoutAddress(WebElement botaoProceedToCheckoutAddress) {
        this.botaoProceedToCheckoutAddress = botaoProceedToCheckoutAddress;
    }

    public WebElement getBotaoProceedToCheckoutShipping() {
        return botaoProceedToCheckoutShipping;
    }

    public void setBotaoProceedToCheckoutShipping(WebElement botaoProceedToCheckoutShipping) {
        this.botaoProceedToCheckoutShipping = botaoProceedToCheckoutShipping;
    }


    public WebElement getCampoListaDeProdutosCarrinho() {
        return campoListaDeProdutosCarrinho;
    }

    public void setCampoListaDeProdutosCarrinho(WebElement campoListaDeProdutosCarrinho) {
        this.campoListaDeProdutosCarrinho = campoListaDeProdutosCarrinho;
    }


    public WebElement getImagemDoProdutoClicavel() {
        return imagemDoProdutoClicavel;
    }

    public void setImagemDoProdutoClicavel(WebElement imagemDoProdutoClicavel) {
        this.imagemDoProdutoClicavel = imagemDoProdutoClicavel;
    }

    public WebElement getBotaoProceedToCheckout() {
        return botaoProceedToCheckout;
    }

    public void setBotaoProceedToCheckout(WebElement botaoProceedToCheckout) {
        this.botaoProceedToCheckout = botaoProceedToCheckout;
    }

    public WebElement getBotaologout() {
        return botaologout;
    }

    public void setBotaologout(WebElement botaologout) {
        this.botaologout = botaologout;
    }

    public WebElement getBotaoProceedToCheckoutSummary() {
        return botaoProceedToCheckoutSummary;
    }

    public void setBotaoProceedToCheckoutSummary(WebElement botaoProceedToCheckoutSummary) {
        this.botaoProceedToCheckoutSummary = botaoProceedToCheckoutSummary;
    }

    public WebElement getBotaoPaybyBankWirePayment() {
        return botaoPaybyBankWirePayment;
    }

    public void setBotaoPaybyBankWirePayment(WebElement botaoPaybyBankWirePayment) {
        this.botaoPaybyBankWirePayment = botaoPaybyBankWirePayment;
    }

    public WebElement getBotaoIConfirmMyOrderPayment() {
        return botaoIConfirmMyOrderPayment;
    }

    public void setBotaoIConfirmMyOrderPayment(WebElement botaoIConfirmMyOrderPayment) {
        this.botaoIConfirmMyOrderPayment = botaoIConfirmMyOrderPayment;
    }

    public String tamanhoListaCarrinho() {
        return quantidadeItemCarrinho.getText();

    }
}
