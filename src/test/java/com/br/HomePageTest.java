package com.br;

import com.br.paginas.HomePage;
import com.br.util.BaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {
    private HomePage home;
    private static final Logger logger = Logger.getLogger(HomePageTest.class);


    @BeforeMethod
    public void inicializarTela() {
        logger.info("inicializando o drives da tela HomePageTest");
        home = new HomePage(driver);
        logger.info("inicializacao concluida com sucesso");
        logger.info("entrei na tela principal");

    }

    @Test
    public void validarCamposDaTelaHome() {
        logger.info("realizando validações na tela");
        home.validarSeEstouNaTelaHome();
        logger.info("finalizado as validações na tela");

    }
}
