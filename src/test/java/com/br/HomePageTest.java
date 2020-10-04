package com.br;

import com.br.paginas.HomePage;
import com.br.util.BaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(HomePageTest.class);

    @Test
    public void validarCamposDaTelaHome() {
        logger.info("realizando validações na tela");
        homePage.validarSeEstouNaTelaHome();
        logger.info("finalizado as validações na tela");

    }
}
