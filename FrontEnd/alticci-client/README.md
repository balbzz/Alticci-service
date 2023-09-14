# Uso

Na página inicial, você verá um formulário onde pode inserir o índice (n) para calcular o valor da sequência Alticci.

Clique no botão "Calculate" para calcular o valor da sequência Alticci para o índice fornecido.

O valor calculado será exibido na página, juntamente com o tempo de resposta da solicitação ao backend.

# Explicação do Código

O código Angular está organizado em componentes, módulos e serviços.

- O componente `AlticciSequenceComponent` gerencia a interação com o usuário, incluindo o formulário de entrada e a exibição dos resultados.
- O serviço `AlticciService` é responsável por fazer a chamada à API do backend para calcular a sequência Alticci.
- O aplicativo utiliza uma via de dados (Http) para atualizar o valor calculado.

# Personalização

Você pode personalizar o frontend editando os arquivos no diretório `src/`. O aplicativo Angular permite que você personalize a aparência e o comportamento de acordo com suas necessidades.

# AlticciClient

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 16.1.4.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The application will automatically reload if you change any of the source files.

## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
