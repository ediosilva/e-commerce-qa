package com.br.paginas;

import com.br.paginas.elementosdapagina.ElementoShopppingPage;
import com.br.validacao.ValidacaoShoppingCart;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppingPage extends BasePage {

    private static final Logger logger = Logger.getLogger(ShoppingPage.class);
    private ElementoShopppingPage elementoPageShoppping;
    private ValidacaoShoppingCart validacaoShoppingCart;
    private String tamanhoListaCarrinhoAnterior;

    public ShoppingPage(WebDriver driver) {
        super(driver);
        logger.info("contrutor da classe ShoppingPage");
        validacaoShoppingCart = new ValidacaoShoppingCart();
        elementoPageShoppping = new ElementoShopppingPage(driver);
    }


    public ShoppingPage adicionarItemNoCarrinho(String nomeItem) {
        logger.info("iniciando a inclusao de um novo item no carrinho");
        elementoPageShoppping.getCampoDePesquisa().clear();
        logger.info("buscando o item na no campo da pesquisa:" + nomeItem);
        elementoPageShoppping.getCampoDePesquisa().sendKeys(nomeItem);
        elementoPageShoppping.getCampoDePesquisa().sendKeys(Keys.ENTER);
        elementoPageShoppping.getImagemDoProdutoClicavel().click();
        elementoPageShoppping.getBotaoAddToCart().click();
        elementoPageShoppping.getBotaoProceedToCheckout().click();
        logger.info("adicionado um novo item no carrinho");
        return this;
    }

    public ShoppingPage escolherTipoPagamento() {
        elementoPageShoppping.getBotaoProceedToCheckoutSummary().click();
        logger.info("entrando na aba Address");
        elementoPageShoppping.getBotaoProceedToCheckoutAddress().click();
        logger.info("entrando na aba Shipping");
        elementoPageShoppping.getBotaoCheckBoxShipping().click();
        elementoPageShoppping.getBotaoProceedToCheckoutShipping().click();
        logger.info("entrando na aba Payment");
        return this;
    }

    public ShoppingPage escolherOpcaoPaybyBankWire() {
        elementoPageShoppping.getBotaoPaybyBankWirePayment().click();
        logger.info("Escolhendo a opção Pay by Bank Wire");
        return this;
    }

    public ShoppingPage removerItemDoCarrinho() {
        Actions builder = new Actions(driver);
        builder.moveToElement(elementoPageShoppping.getCampoListaDeProdutosCarrinho()).perform();
        elementoPageShoppping.getBotaoRemoverItemCarrinho().get(0).click();
        return this;
    }

    public ShoppingPage pegarQuantidadeItemCarrinhoAnterior() {
        tamanhoListaCarrinhoAnterior = elementoPageShoppping.tamanhoListaCarrinho();
        return this;
    }

    public ShoppingPage finalizarPedido() {
        logger.info("Confirmando a Ordem");
        elementoPageShoppping.getBotaoIConfirmMyOrderPayment().click();
        logger.info("Confirmado a Ordem");
        return this;
    }


    public ShoppingPage realizarLogout() {
        logger.info("fazendo logout");
        elementoPageShoppping.getBotaologout().click();
        return this;
    }

    public ShoppingPage validarSeBotaoRemover() {
        validacaoShoppingCart.validarSeBotaoRemover(
                tamanhoListaCarrinhoAnterior,
                elementoPageShoppping.tamanhoListaCarrinho());
        return this;
    }

    public ShoppingPage validarSeUmNovoItemFoiAdicionado() {
        validacaoShoppingCart
                .validarSeUmNovoItemFoiAdicionado(
                        tamanhoListaCarrinhoAnterior,
                        elementoPageShoppping.tamanhoListaCarrinho());
        return this;
    }


}
