package com.br;

import com.br.dataproviders.DataProviderItensCompra;
import com.br.util.BaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ShoppingCartPaymentTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(ShoppingTest.class);
    private static String MENSAGEM_BANK_WIRE_PAYMENT = "BANK-WIRE PAYMENT";
    private static String MENSAGEM_FOLLOING_CURRENT = "We allow the following currency to be sent via bank wire";
    private static String MENSAGEM_ACCOUNT_CURRENTY = "Bank wire account information will be displayed on the next page";
    private static String MENSAGEM_BANK_WIRE_ORDER_PAYMENT_COMPLETE = "Your order on My Store is complete.";

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validarBankWireOrderPaymentCompleteMensagens(String nomeProduto) {
        logger.info("entrando no metodo validarBankWireOrderPaymentCompleteMensagens");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaAbaPayment()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .validarMensagemTelaOrderPaymentComplete(MENSAGEM_BANK_WIRE_ORDER_PAYMENT_COMPLETE);
        logger.info("saindo no metodo validarBankWireOrderPaymentCompleteMensagens");
    }

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validarBankWirePaymentMensagens(String nomeProduto) {
        logger.info("entrando no metodo validarBankWirePaymentMensagens");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaAbaPayment()
                .escolherOpcaoPaybyBankWire()
                .validarMensagemTelaPayment(MENSAGEM_BANK_WIRE_PAYMENT)
                .validarMensagemTelaPayment(MENSAGEM_ACCOUNT_CURRENTY)
                .validarMensagemTelaPayment(MENSAGEM_FOLLOING_CURRENT);
        logger.info("saindo no metodo validarBankWirePaymentMensagens");
    }

}
