package com.br.paginas;

import com.br.paginas.elementosdapagina.ElementoShoppingCartPaymentPage;
import com.br.validacao.ValidacaoShoppingCartPaymentPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPaymentPage extends BasePage {

    private static final Logger logger = Logger.getLogger(ShoppingCartPaymentPage.class);
    private ElementoShoppingCartPaymentPage elementoShoppingCartPaymentPage;
    private ValidacaoShoppingCartPaymentPage validacaoShoppingCartPaymentPage;

    public ShoppingCartPaymentPage(WebDriver driver) {
        super(driver);
        logger.info("iniciando o construtor ShoppingCartPaymentPage");
        elementoShoppingCartPaymentPage = new ElementoShoppingCartPaymentPage(driver);
        validacaoShoppingCartPaymentPage = new ValidacaoShoppingCartPaymentPage();
    }

    public ShoppingCartPaymentPage validarMensagemTelaPayment(String mensagem) {
        logger.info("iniciando a validadacao  validarMensagemdaTelaPayment");
        validacaoShoppingCartPaymentPage.validarListaDeMensagem(elementoShoppingCartPaymentPage.getCampoMensagemBankWirePayment().getText()
                , mensagem);
        logger.info("finalizado a validadacao  validarMensagemdaTelaPayment");
        return this;
    }

    public ShoppingCartPaymentPage validarMensagemTelaOrderPaymentComplete(String mensagem) {
        logger.info("iniciando a validadacao  validarMensagemdaTelaPayment");
        validacaoShoppingCartPaymentPage.validarMensagem(elementoShoppingCartPaymentPage.getCampoMensagemBankWireOrderPaymentComplete().getText()
                , mensagem);
        logger.info("finalizado a validadacao  validarMensagemdaTelaPayment");
        return this;
    }

    public ShoppingCartPaymentPage finalizarPedido() {
        logger.info("Confirmando a Ordem");
        elementoShoppingCartPaymentPage.getBotaoIConfirmMyOrderPayment().click();
        logger.info("Confirmado a Ordem");
        return this;
    }

    public ShoppingCartPaymentPage escolherOpcaoPaybyBankWire() {
        elementoShoppingCartPaymentPage.getBotaoPaybyBankWirePayment().click();
        logger.info("Escolhendo a opção Pay by Bank Wire");
        return this;
    }

    public ShoppingCartPaymentPage escolherOpcaoPaybyCheck() {
        elementoShoppingCartPaymentPage.getBotaoPaybyCheck().click();
        logger.info("Escolhendo a opção Pay by Check");
        return this;
    }
}
