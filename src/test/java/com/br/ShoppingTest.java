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

    @Test(dataProvider = "produtos", dataProviderClass = DataProviderItensCompra.class)
    public void validarCompraComUmItemPorPedido(String nomeProduto) {
        logger.info("entrando no metodo validarCompraComUmItemPorPedido");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .escolherTipoPagamento()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarCompraComUmItemPorPedido");

    }

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validarCompraMaisItemPorPedido(String nomeProduto) {
        logger.info("entrando no metodo validarListaDecarrinhoItemTshirt");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .pegarQuantidadeItemCarrinhoAnterior()
                .adicionarItemNoCarrinho(nomeProduto)
                .validarSeUmNovoItemFoiAdicionado()
                .escolherTipoPagamento()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarListaDecarrinhoItemTshirt");

    }

    @Test(dataProvider = "inserirDoisProdutosAoMesmoTempo", dataProviderClass = DataProviderItensCompra.class)
    public void validarAdicionarDoisItemERemover(String nomeProduto1, String nomeProduto2) {
        logger.info("entrando no metodo validarAdicionarDoisItemERemover");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto1)
                .pegarQuantidadeItemCarrinhoAnterior()
                .adicionarItemNoCarrinho(nomeProduto2)
                .removerItemDoCarrinho()
                .validarSeBotaoRemover()
                .escolherTipoPagamento()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarAdicionarDoisItemERemover");

    }


}
