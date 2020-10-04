package com.br.util;

import com.br.configuracao.LeitorPropriedades;
import com.br.configuracao.NavegadorFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void configuracaoSessao() {
        this.driver = new NavegadorFactory().browser(LeitorPropriedades.getInstancia().getBrowser());
        this.driver.get(LeitorPropriedades.getInstancia().geUrl());
    }

    @AfterClass
    public void finalizaSessao() {
        driver.quit();
    }
}
