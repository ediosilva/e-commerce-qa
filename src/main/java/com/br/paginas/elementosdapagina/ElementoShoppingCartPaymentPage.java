package com.br.paginas.elementosdapagina;

import com.br.paginas.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementoShoppingCartPaymentPage extends BasePage {

    @FindBy(className = "cheque-box")
    private WebElement campoMensagemBankWirePayment;

    @FindBy(className = "cheque-indent")
    private WebElement campoMensagemBankWireOrderPaymentComplete;

    @FindBy(xpath = "//a[contains(@class,'bankwire')]")
    private WebElement botaoPaybyBankWirePayment;

    @FindBy(xpath = "//a[contains(@class,'cheque')]")
    private WebElement botaoPaybyCheck;

    @FindBy(xpath = "//button[contains(@class,'button-medium')]")
    private WebElement botaoIConfirmMyOrderPayment;

    public WebElement getBotaoIConfirmMyOrderPayment() {
        return botaoIConfirmMyOrderPayment;
    }

    public ElementoShoppingCartPaymentPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBotaoPaybyBankWirePayment() {
        return botaoPaybyBankWirePayment;
    }

    public WebElement getBotaoPaybyCheck() {
        return botaoPaybyCheck;
    }

    public WebElement getCampoMensagemBankWirePayment() {
        return campoMensagemBankWirePayment;
    }

    public WebElement getCampoMensagemBankWireOrderPaymentComplete() {
        return campoMensagemBankWireOrderPaymentComplete;
    }
}
