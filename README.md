# Projeto MVC

## Sobre o projeto

Projeto criado pelo Spring Initializr e desenvolvido no IntelliJ IDEA, utilizando Java, Spring Boot, Spring MVC e Thymeleaf para trabalhar com páginas HTML.

## Erros encontrados

- **SDK do Java:** a SDK que estava configurada inicialmente estava desatualizada e não funcionava corretamente. Tentei utilizar o Java 25, mas isso gerou um problema maior. Depois, troquei para o Java 24 e consegui fazer o projeto iniciar.

- **Página HTML:** mesmo após resolver o problema da SDK, a página `index.html`, localizada na pasta `templates`, não era exibida no navegador.

- **Encerramento da aplicação:** o projeto mostrava que havia iniciado, mas encerrava logo em seguida, sem manter o servidor web ativo.
