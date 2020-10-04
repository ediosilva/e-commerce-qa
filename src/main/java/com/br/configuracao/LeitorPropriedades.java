package com.br.configuracao;

import java.io.InputStream;
import java.util.Properties;

public class LeitorPropriedades {
    private Properties properties;
    private static final String fileProperty = "config_selenium.properties";
    private static LeitorPropriedades instancia = null;

    private LeitorPropriedades() {
        try {
            properties = new Properties();
            InputStream in = getClass().getClassLoader().getResourceAsStream(fileProperty);
            properties.load(in);
            in.close();
        } catch (Exception ex) {
            throw new IllegalAccessError("Erro ao acessar as configurações: " + fileProperty + " - " + ex.getStackTrace());
        }
    }

    public static LeitorPropriedades getInstancia() {
        if (instancia == null)
            instancia = new LeitorPropriedades();
        return instancia;
    }

    public String geUrl() {
        String url = properties.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("Erro ao carregar a URL. Verificar POM");
    }

    public String getBrowser() {
        String browser = properties.getProperty("navegador");
        if (browser != null) return browser;
        else throw new RuntimeException("Erro ao carregar ao instanciar o navegador");
    }
}
