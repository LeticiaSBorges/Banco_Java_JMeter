# Banco_Java_JMeter

Alunos: Leticia de Sousa Borges; Ranniher da Silva Rosa

Este aplicação proporciona uma API básica para interação com contas bancárias, permitindo operações como depósito e retirada. Além disso, demonstra o uso do controle de concorrência otimista em uma entidade ContaBancariaVersionada. O contém arquivos que compõem uma aplicação básica de banco com Spring Boot e Hibernate, utilizando o banco de dados H2 para armazenamento.

Os arquivos são:

- ***data.sql:***

É um arquivo SQL que contém comandos para inserir dados iniciais nas tabelas do banco de dados H2. Esses dados incluem informações sobre contas bancárias.

- ***application.properties:***

Possui as configurações da aplicação Spring Boot, incluindo detalhes do banco de dados H2, configurações do Hibernate e ativação do console H2 para visualização e execução de consultas SQL.

- ***ContaBancariaControlador.java:***

Contém o controlador Spring MVC que gerencia as operações relacionadas a contas bancárias. Isso inclui listar contas, depositar, retirar, listar contas versionadas, depositar em contas versionadas e retirar de contas versionadas.

- ***ContaBancaria.java:***

Contém Entidade JPA que mapeia a tabela conta_bancaria. Contém campos como id, nomeTitular e saldoConta. As anotações JPA definem o mapeamento entre a classe Java e a tabela no banco de dados.

- ***ContaBancariaVersionada.java:***

É similar à ContaBancaria, esta entidade mapeia a tabela conta_bancaria_versionada. Além dos campos básicos, possui um campo ultimaAlteracaoConta marcado com @Version para controle de concorrência otimista.

- ***ContaRep.java:***

Tem a interface que estende JpaRepository e fornece métodos para operações CRUD na entidade ContaBancaria.

- ***ContaVersionadaRep.java:***

Similar a ContaRep, esta interface fornece métodos para operações CRUD na entidade ContaBancariaVersionada.

- ***BancoApplication.java:***

É a classe principal que inicia a aplicação Spring Boot. Contém o método main que inicia a aplicação.

## JMeter

Para executar os testes foi utilizado a ferramenta JMeter, localizado em [arquivo_Jmeter](https://github.com/LeticiaSBorges/Banco_Java_JMeter/tree/main/arquivo_Jmeter) nomeado como ***teste_plano.jmx***.


