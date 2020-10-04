package com.br.configuracao;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class Drivers {
    public static WebDriver getFirefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return configBrowser(new FirefoxDriver());
    }

    public static WebDriver getSafariDriver() {
        return configBrowser(new SafariDriver());
    }

    public static WebDriver getInternetExplorerDriver() {
        WebDriverManager.iedriver().setup();
        return configBrowser(new InternetExplorerDriver());
    }

    public static WebDriver getOperaDriver() {
        WebDriverManager.operadriver().setup();
        return configBrowser(new OperaDriver());
    }

    public static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  configBrowserChrome();
        return configBrowser(driver);
    }

    private static ChromeDriver configBrowserChrome(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("enable-automation");
//        options.addArguments("--headless");
//        options.addArguments("--window-size=1920,1080");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-extensions");
//       options.addArguments("--dns-prefetch-disable");
//       options.addArguments("--disable-gpu");
//        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
         return new ChromeDriver(options);
    }
    private static WebDriver configBrowser(WebDriver driver) {
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //  driver.manage().timeouts().setScriptTimeout(1, TimeUnit.MINUTES);

        return driver;
    }
}
