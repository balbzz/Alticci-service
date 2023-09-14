# Alticci Service

Este é um aplicativo Quarkus que calcula a sequência Alticci.

Na pasta /BackEnd encontra o projecto realizado em Java usando o Quarkus.

Na pasta /FrontEnd encontra um pequeno projecto realizado em Angular.

## Pré-requisitos

Antes de executar o aplicativo, certifique-se de ter os seguintes pré-requisitos instalados:

- Java Development Kit (JDK) 17 ou superior
- Apache Maven (para compilar e construir o projeto)

# Instruções de Execução parte BackEnd

1. Clone o repositório:

   ```shell
   git clone https://github.com/balbzz/Alticci-service.git
   cd Alticci-service/BackEnd/code-with-quarkus

2. Compile e construa o projeto:
    
    ```shell
   mvn clean package

3. Excute o aplicativo:

    ```shell
   java -jar target/seu-projeto-1.0-SNAPSHOT-runner.jar
    

O aplicativo estará disponível em http://localhost:8080.

# Instruções de Execução parte FrontEnd

Este é o frontend Angular para a aplicação que calcula a sequência Alticci.

## Descrição

Este frontend foi desenvolvido em Angular e se conecta ao backend para calcular a sequência Alticci com base no índice fornecido pelo usuário. Ele também exibe o tempo de resposta da solicitação ao servidor.

## Pré-requisitos

Antes de executar o aplicativo frontend, certifique-se de ter os seguintes pré-requisitos instalados:

- Node.js e npm (Node Package Manager)
- Angular CLI (Command Line Interface)

Certifique-se de que o backend da aplicação esteja em execução antes de iniciar o frontend.

## Instruções de Execução

Siga estas etapas para executar o aplicativo frontend:

1. Clone o repositório do frontend:

   ```shell
   git clone https://github.com/balbzz/Alticci-service.git
   cd Alticci-service/FrontEnd/alticci-client
   
2. Compile e construa o projeto:
    
    ```shell
   npm install

3. Excute o aplicativo:

    ```shell
   ng serve

3. Abra um navegador:

O Aplicativo estará disponível em http://localhost:4200
