

<h1 align="center">
     💻 <a href="https://www.algaworks.com/" alt="site da Algaworks" target="_blank"> Curso Especialista Spring REST </a>
</h1>

<h3 align="center">
    🏆 Treinamento imersivo e online sobre desenvolvimento de REST APIs com Spring mais completo do mundo, para desenvolvimento de REST APIs, como Spring Framework, Spring MVC, Spring Boot, Spring Data JPA, Spring Security, Spring Security OAuth e Spring HATEOAS. 💚
</h3>

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/georgealan/Especialista-Spring-REST-Algaworks?color=%2304D361">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/georgealan/Especialista-Spring-REST-Algaworks">
  
  <a href="https://github.com/georgealan/Especialista-Spring-REST-Algaworks/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/georgealan/Especialista-Spring-REST-Algaworks">
  </a>
    
   <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
   <a href="https://github.com/georgealan/Especialista-Spring-REST-Algaworks/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/georgealan/Especialista-Spring-REST-Algaworks?style=social">
  </a>

  <a href="https://kodyweb.com.br">
    <img alt="Feito por George Alan Rufo" src="https://img.shields.io/badge/feito%20por-George-%237519C1">
  </a>
  
  <a href="https://blog.kodyweb.com.br/">
    <img alt="Stargazers" src="https://img.shields.io/badge/Blog-KodyWeb-%237159c1?style=flat&logo=ghost">
  </a>
  
 
</p>

<h4 align="center">
	🚧   Em andamento 🚀 🚧
</h4>

Tabela de conteúdos
=================
<!--ts-->
   * [Sobre o projeto](#-sobre-o-projeto)
   * [Funcionalidades](#-funcionalidades)
   * [Como executar o projeto](#-como-executar-o-projeto)
     * [Pré-requisitos](#pré-requisitos)
     * [Rodando o Backend (servidor)](#user-content--rodando-o-backend-servidor)
     * [Rodando a aplicação web (Frontend)](#user-content--rodando-a-aplicação-web-frontend)
   * [Tecnologias](#-tecnologias)
     * [WebSite](#user-content-website--react----typescript)
     * [Server](#user-content-server--nodejs----typescript)
     * [Mobile](#user-content-mobile--react-native----typescript)
   * [Autor](#-autor)
   * [Licença](#user-content--licença)
<!--te-->


## 💻 Sobre o projeto

♻️ Ecoleta - é uma forma de conectar empresas e entidades de coleta de resíduos orgânicos e inorgânicos as pessoas que precisam descartar seus resíduos de maneira ecológica.


Projeto desenvolvido durante a **NLW - Next Level Week** oferecida pela [Rocketseat](https://blog.rocketseat.com.br/primeira-next-level-week/).
O NLW é uma experiência online com muito conteúdo prático, desafios e hacks onde o conteúdo fica disponível durante uma semana.

---

## ⚙️ Funcionalidades

- [x] Empresas ou entidades podem se cadastrar na plataforma web enviando:
  - [x] uma imagem do ponto de coleta
  - [x] nome da entidade, email e whatsapp
  - [x] e o endereço para que ele possa aparecer no mapa
  - [x] além de selecionar um ou mais ítens de coleta: 
    - lâmpadas
    - pilhas e baterias
    - papéis e papelão
    - resíduos eletrônicos
    - resíduos orgânicos
    - óleo de cozinha

- [x] Os usuários tem acesso ao aplicativo móvel, onde podem:
  - [x] navegar pelo mapa para ver as instituições cadastradas
  - [x] entrar em contato com a entidade através do E-mail ou do WhatsApp

---

## 🚀 Como executar o projeto

Este projeto é divido em três partes:
1. Backend (pasta server) 
2. Frontend (pasta web)
3. Mobile (pasta mobile)

💡Tanto o Frontend quanto o Mobile precisam que o Backend esteja sendo executado para funcionar.

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [Node.js](https://nodejs.org/en/). 
Além disto é bom ter um editor para trabalhar com o código como [VSCode](https://code.visualstudio.com/)

#### 🎲 Rodando o Backend (servidor)

```bash

# Clone este repositório
$ git clone git@github.com:georgealan/Especialista-Spring-REST-Algaworks.git

# Acesse a pasta do projeto no terminal/cmd
$ cd Especialista-Spring-REST-Algaworks

# Vá para a pasta server
$ cd server

# Instale as dependências
$ npm install

# Execute a aplicação em modo de desenvolvimento
$ npm run dev:server

# O servidor inciará na porta:3333 - acesse http://localhost:3333 

```

---

## 🛠 Tecnologias

As seguintes ferramentas estão sendo utilizadas na construção do projeto:

#### **Website**  ([React](https://reactjs.org/)  +  [TypeScript](https://www.typescriptlang.org/))

-   **[React Router Dom](https://github.com/ReactTraining/react-router/tree/master/packages/react-router-dom)**
-   **[React Icons](https://react-icons.github.io/react-icons/)**
-   **[Axios](https://github.com/axios/axios)**
-   **[Leaflet](https://react-leaflet.js.org/en/)**
-   **[React Leaflet](https://react-leaflet.js.org/)**
-   **[React Dropzone](https://github.com/react-dropzone/react-dropzone)**

> Veja o arquivo  [package.json](https://github.com/georgealan/Especialista-Spring-REST-Algaworks/blob/master/web/package.json)

#### [](https://github.com/georgealan/Ecoleta#server-nodejs--typescript)**Server**  ([NodeJS](https://nodejs.org/en/)  +  [TypeScript](https://www.typescriptlang.org/))

-   **[Express](https://expressjs.com/)**
-   **[CORS](https://expressjs.com/en/resources/middleware/cors.html)**
-   **[KnexJS](http://knexjs.org/)**
-   **[SQLite](https://github.com/mapbox/node-sqlite3)**
-   **[ts-node](https://github.com/TypeStrong/ts-node)**
-   **[dotENV](https://github.com/motdotla/dotenv)**
-   **[Multer](https://github.com/expressjs/multer)**
-   **[Celebrate](https://github.com/arb/celebrate)**
-   **[Joi](https://github.com/hapijs/joi)**

> Veja o arquivo  [package.json](https://github.com/georgealan/Especialista-Spring-REST-Algaworks/blob/master/server/package.json)

#### [](https://github.com/georgealan/Ecoleta#mobile-react-native--typescript)**Mobile**  ([React Native](http://www.reactnative.com/)  +  [TypeScript](https://www.typescriptlang.org/))

-   **[Expo](https://expo.io/)**
-   **[Expo Google Fonts](https://github.com/expo/google-fonts)**
-   **[React Navigation](https://reactnavigation.org/)**
-   **[React Native Maps](https://github.com/react-native-community/react-native-maps)**
-   **[Expo Constants](https://docs.expo.io/versions/latest/sdk/constants/)**
-   **[React Native SVG](https://github.com/react-native-community/react-native-svg)**
-   **[Axios](https://github.com/axios/axios)**
-   **[Expo Location](https://docs.expo.io/versions/latest/sdk/location/)**
-   **[Expo Mail Composer](https://docs.expo.io/versions/latest/sdk/mail-composer/)**

> Veja o arquivo  [package.json](https://github.com/georgealan/Especialista-Spring-REST-Algaworks/blob/master/mobile/package.json)

#### [](https://github.com/georgealan/Ecoleta#utilit%C3%A1rios)**Utilitários**

-   Protótipo:  **[Figma](https://www.figma.com/)**  →  **[Protótipo (Ecoleta)](https://www.figma.com/file/1SxgOMojOB2zYT0Mdk28lB/Ecoleta)**
-   API:  **[IBGE API](https://servicodados.ibge.gov.br/api/docs/localidades?versao=1)**  →  **[API de UFs](https://servicodados.ibge.gov.br/api/docs/localidades?versao=1#api-UFs-estadosGet)**,  **[API de Municípios](https://servicodados.ibge.gov.br/api/docs/localidades?versao=1#api-Municipios-estadosUFMunicipiosGet)**
-   Maps:  **[Leaflet](https://react-leaflet.js.org/en/)**
-   Editor:  **[Visual Studio Code](https://code.visualstudio.com/)**  → Extensions:  **[SQLite](https://marketplace.visualstudio.com/items?itemName=alexcvzz.vscode-sqlite)**
-   Markdown:  **[StackEdit](https://stackedit.io/)**,  **[Markdown Emoji](https://gist.github.com/rxaviers/7360908)**
-   Commit Conventional:  **[Commitlint](https://github.com/conventional-changelog/commitlint)**
-   Teste de API:  **[Insomnia](https://insomnia.rest/)**
-   Ícones:  **[Feather Icons](https://feathericons.com/)**,  **[Font Awesome](https://fontawesome.com/)**
-   Fontes:  **[Ubuntu](https://fonts.google.com/specimen/Ubuntu)**,  **[Roboto](https://fonts.google.com/specimen/Roboto)**


---

## 🦸 Autor

<a href="https://blog.kodyweb.com.br/author/george/">
 <img style="border-radius: 50%;" src="https://avatars2.githubusercontent.com/u/37253093?s=400&u=4793c91ecbabc6342381bd7c411d323f14e59dce&v=4" width="100px;" alt=""/>
 <br />
 <sub><b>George Alan</b></sub></a> <a href="https://blog.rocketseat.com.br/author/thiago/" title="Rocketseat">🚀</a>
 <br />

[![Medium Badge](https://img.shields.io/badge/-KodyWeb-black?style=flat-square&labelColor=black&logo=medium&logoColor=white&link=https://medium.com/kodyweb)](https://medium.com/kodyweb) [![Linkedin Badge](https://img.shields.io/badge/-George-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/george-alan-fullstack-developer/)](https://www.linkedin.com/in/george-alan-fullstack-developer/) 
[![Gmail Badge](https://img.shields.io/badge/-georgealan@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:georgealan@gmail.com)](mailto:georgealanrufo@gmail.com) [![Instagram Badge](https://img.shields.io/badge/-georgealan-a43b9d?style=flat-square&logo=Instagram&logoColor=white&link=https://www.instagram.com/georgealanrufo/)](https://www.instagram.com/georgealanrufo/)

---

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

Feito com ❤️ por George Alan Rufo 👋🏽 [Entre em contato!](https://www.linkedin.com/in/george-alan-fullstack-developer/)

---
