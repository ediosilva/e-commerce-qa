package com.br;

import com.br.dataproviders.DataProviderItensCompra;
import com.br.modelos.Usuario;
import com.br.paginas.HomePage;
import com.br.util.BaseTest;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(ShoppingTest.class);

    private HomePage homePage;
    private Usuario usuario;

    @BeforeMethod
    public void inicializarTela() {
        logger.info("iniciando os driver");
        homePage = new HomePage(driver);
        usuario = new Usuario("edio.silva@acad.pucrs.br", "03071989");
        logger.info("driver inicializado com sucesso");
    }

    @Test(dataProvider = "dadosValidos", dataProviderClass = DataProviderItensCompra.class)
    public void compraItensSucesso(String nomeProduto) {
        logger.info("entrando no metodo validarListaDecarrinhoItemTshirt");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .realizarCompra(nomeProduto)
                .realizarLogout();

    }

    @Test(dataProvider = "dadosValidos", dataProviderClass = DataProviderItensCompra.class)
    public void test(String nomeProduto) {
        logger.info("entrando no metodo validarListaDecarrinhoItemTshirt");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .realizarCompra(nomeProduto)
                .realizarCompra(nomeProduto)
                .realizarLogout();

    }

}
