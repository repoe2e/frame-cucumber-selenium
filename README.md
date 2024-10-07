# Projeto de Testes Automatizados com Cucumber e Selenium

Este projeto utiliza **Cucumber** e **Selenium** para a automação de testes em uma aplicação. Os testes são organizados de acordo com tags, permitindo que você execute apenas um subconjunto de testes, conforme necessário.

## Estrutura do Projeto

## Executando os Testes

Os testes são executados na classe `Executador` de acordo com a tag escolhida. Para executar os testes, siga os passos abaixo:

1. **Certifique-se de que o ambiente de desenvolvimento está configurado:**
   - Java JDK 11 ou superior.
   - Maven instalado.

2. **Compile o projeto:**
   ```bash
   mvn clean install

   
#mvn test -Dcucumber.options="--tags @sua_tag"

Substitua @sua_tag pela tag que deseja executar. Por exemplo, para executar testes marcados como @regressao, o comando será:
mvn test -Dcucumber.options="--tags @regressao"

