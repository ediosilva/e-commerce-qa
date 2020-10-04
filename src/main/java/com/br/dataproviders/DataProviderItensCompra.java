package com.br.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderItensCompra {


    @DataProvider(name = "produtos")
    public static Object[][] produtos() {
        Object[][] data = new Object[2][1];
        data[0][0] = "Faded Short Sleeve T-shirts";
        data[1][0] = "Blouses";
        return data;
    }

    @DataProvider(name = "produto")
    public static Object[][] produto() {
        Object[][] data = new Object[1][1];
        data[0][0] = "Faded Short Sleeve T-shirts";
        return data;
    }

    @DataProvider(name = "inserirDoisProdutosAoMesmoTempo")
    public static Object[][] inserirDoisProdutosAoMesmoTempo() {
        Object[][] data = new Object[][]{{"Faded Short Sleeve T-shirts", "Blouses"}};
        return data;
    }
}

