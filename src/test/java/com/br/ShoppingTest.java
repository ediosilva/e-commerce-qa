package com.br;

import com.br.dataproviders.DataProviderItensCompra;
import com.br.util.BaseTest;
import org.apache.log4j.Logger;

import org.testng.annotations.Test;

public class ShoppingTest extends BaseTest {
    private static final Logger logger = Logger.getLogger(ShoppingTest.class);

    @Test(dataProvider = "produtos", dataProviderClass = DataProviderItensCompra.class)
    public void validarCompraComUmProdutoPorPedido(String nomeProduto) {
        logger.info("entrando no metodo validarCompraComUmProdutoPorPedido");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaEscolherTipoPagamento()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarCompraComUmProdutoPorPedido");
    }

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validaFluxoPagamentoBank(String nomeProduto) {
        logger.info("entrando no metodo validaFluxoPagamentoBank");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaEscolherTipoPagamento()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validaFluxoPagamentoBank");
    }


    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validaFluxoPagamentoCheck(String nomeProduto) {
        logger.info("entrando no metodo validaFluxoPagamentoCheck");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaEscolherTipoPagamento()
                .escolherOpcaoPaybyCheck()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validaFluxoPagamentoCheck");
    }

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validarVariosProdutosPorPedido(String nomeProduto) {
        logger.info("entrando no metodo validarVariosProdutosPorPedido");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .pegarQuantidadeItemCarrinhoAnterior()
                .adicionarItemNoCarrinho(nomeProduto)
                .validarSeUmNovoItemFoiAdicionado()
                .irParaEscolherTipoPagamento()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarVariosProdutosPorPedido");
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
                .irParaEscolherTipoPagamento()
                .validarSeBotaoRemoveu()
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarAdicionarDoisItemERemover");
    }

    @Test(dataProvider = "produto", dataProviderClass = DataProviderItensCompra.class)
    public void validarSeOProdutoAdicionadoNoCarrinhoEIgualSelecionado(String nomeProduto) {
        logger.info("entrando no metodo validarSeOProdutoAdicionadoNoCarrinhoEIgualSelecionado");
        homePage.entrar()
                .entrarTelaLogin()
                .realizarLogin(usuario)
                .adicionarItemNoCarrinho(nomeProduto)
                .irParaEscolherTipoPagamento()
                .validaProdutoCarrinhoAdicionadoIgualAoSelecionado(nomeProduto)
                .escolherOpcaoPaybyBankWire()
                .finalizarPedido()
                .realizarLogout();
        logger.info("saindo no metodo validarCompraComUmProdutoPorPedido");
        logger.info("saindo no metodo validarSeOProdutoAdicionadoNoCarrinhoEIgualSelecionado");


    }


}
