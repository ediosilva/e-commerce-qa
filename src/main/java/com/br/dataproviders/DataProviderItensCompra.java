package com.br.dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderItensCompra {


    @DataProvider(name = "dadosValidos")
    public static Object[][] dadosValidos() {
        Object[][] data = new Object[2][1];
        data[0][0] = "Faded Short Sleeve T-shirts";
        data[1][0] = "Blouses";

        return data;
    }
}

