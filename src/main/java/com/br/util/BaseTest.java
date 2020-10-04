package com.br.util;

import com.br.configuracao.LeitorPropriedades;
import com.br.configuracao.NavegadorFactory;
import com.br.modelos.Usuario;
import com.br.paginas.HomePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    private static final Logger logger = Logger.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected HomePage homePage;
    protected Usuario usuario;

    @BeforeMethod
    public void inicializarTela() {

        logger.info("iniciando os driver");
        this.driver = new NavegadorFactory().browser(LeitorPropriedades.getInstancia().getBrowser());
        this.driver.get(LeitorPropriedades.getInstancia().geUrl());
        homePage = new HomePage(driver);
        usuario = new Usuario("edio.silva@acad.pucrs.br", "03071989");
        logger.info("driver inicializado com sucesso");
    }

    @AfterMethod
    public void fecharNavegador() {
        driver.quit();
    }


}
