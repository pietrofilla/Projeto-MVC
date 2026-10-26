\# Projeto MVC — Spring Boot



\## 1. Descrição do projeto



Projeto desenvolvido com Spring Initializr e IntelliJ IDEA para trabalhar com o padrão MVC (Model-View-Controller), utilizando Java, Spring Boot e Thymeleaf para páginas HTML.



\## 2. Tecnologias utilizadas



\- Java

\- Spring Boot

\- Spring Web MVC

\- Thymeleaf

\- Maven

\- IntelliJ IDEA



\## 3. Erros encontrados durante a execução



\### 3.1. Problema com a versão do Java



Durante a execução, encontrei problemas relacionados à configuração e compatibilidade da SDK do Java no IntelliJ IDEA.



O projeto foi criado com a propriedade `java.version` configurada para 25 no `pom.xml`. Tentei utilizar a versão 24 para resolver o problema, mas o console continuou indicando `Java 25-loom`.



\*\*Ponto a investigar:\*\* verificar a versão do Java utilizada pelo projeto, pelo Maven e pela configuração de execução do IntelliJ.



\### 3.2. Página HTML não exibida



O arquivo `index.html` está localizado em `src/main/resources/templates`, diretório utilizado pelo Thymeleaf para armazenar os templates HTML.



Mesmo após a inicialização da aplicação, a página HTML não foi exibida como esperado.



\*\*Ponto a investigar:\*\* verificar o controller responsável pela rota inicial, as dependências do Spring Web MVC e do Thymeleaf e o endereço acessado no navegador.



\### 3.3. Aplicação encerrando após a inicialização



Durante os testes, o console apresentou as mensagens `Started ProjetomvcApplication` e `Process finished with exit code 0`.



O processo terminou logo após a mensagem de inicialização, e os logs apresentados não mostraram a inicialização do Tomcat.



\*\*Ponto a investigar:\*\* verificar se a aplicação está configurada para iniciar como uma aplicação web e se o servidor permanece ativo durante a execução.



\## 4. Conclusão



Durante os testes, foram observados problemas relacionados à configuração do Java, à exibição da página HTML e ao encerramento do processo após a inicialização.



Este documento registra os comportamentos observados e os pontos que precisam ser investigados para identificar as causas. Os problemas não são considerados resolvidos apenas com as tentativas de alteração de configuração realizadas durante a atividade.



