# Selenium Project Automation APP E-commerce-qa
Projeto de Automação de teste para o site http://automationpractice.com/index.php

Estrutura com exemplo para automação com selenium 

## Configurações / Ferramentas

* [Maven](https://maven.apache.org/) - Dependency Management
* [Intellij](https://www.jetbrains.com/idea/) - IDE
* [TestNG](https://testng.org/doc/) - Framework de teste
* [Selenium](https://www.seleniumhq.org/) - Selenium automates browsers


### Pom.xml

No pom.xml do projeto indicar qual:

* O caminho do driver do selenium.
* Url base do testes


```
  <properties>
                <db.navegador>chrome</db.navegador>
                <db.url>http://automationpractice.com/index.php</db.url>
                <db.driver>webdriver.chrome.driver</db.driver>
   </properties>
```





## Executando os teste via command

Executar os testes via command:
```
mvn clean test -D navegador=chrome
```
