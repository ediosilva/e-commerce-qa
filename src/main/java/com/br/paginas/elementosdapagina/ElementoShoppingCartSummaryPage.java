package com.br.paginas.elementosdapagina;

import com.br.paginas.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementoShoppingCartSummaryPage extends BasePage {

    @FindBy(className = "product-name")
    private List<WebElement> nomeDoProdutoSelecionadoSumary;

    public ElementoShoppingCartSummaryPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getNomeDoProdutoSelecionadoSumary() {
        return nomeDoProdutoSelecionadoSumary;
    }

    public void setNomeDoProdutoSelecionadoSumary(List<WebElement> nomeDoProdutoSelecionadoSumary) {
        this.nomeDoProdutoSelecionadoSumary = nomeDoProdutoSelecionadoSumary;
    }
}
