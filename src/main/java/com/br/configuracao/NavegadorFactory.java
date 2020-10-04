package com.br.configuracao;

import org.openqa.selenium.WebDriver;

public class NavegadorFactory {

    public WebDriver browser(String browser) {
        switch (browser) {
            case "firefox":
                return Drivers.getFirefoxDriver();
            case "chrome":
                return Drivers.getChromeDriver();
            case "ie":
                return Drivers.getInternetExplorerDriver();
            case "opera":
                return Drivers.getOperaDriver();
            case "safari":
                return Drivers.getSafariDriver();
        }
        return null;
    }
}
