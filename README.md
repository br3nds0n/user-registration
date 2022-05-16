# 👤 User Registration <a href="https://github.com/br3nds0n/user-registration/releases" target="_blank"><img align="right" src="https://img.shields.io/badge/release-v0.1.0-green"></a>

Welcome.

Hello how are you?! My name is Brendson I am the [author](#-Author) of this test project, which shows some of my development with Java backend. I come through this option to show a little of what I learned. Hope you like!!

Let's get to the project!! 🚀

<br>

> <b>Status code:</b>  Finished!! ✔

 ## <img height="18" width="18" src="https://user-images.githubusercontent.com/82064724/151113975-e8ff6813-b253-4670-b626-80e842363ab2.png">Index
<!--ts-->
   * [🧠 Context](#-Context)
   * [📥 Download and run the project](#-Baixar-e-executar-o-projeto)
     * [Aplication setup](#-Aplication-setup)
     * [Starting the application](#-Starting-the-application)
   * [🛠 Technologies](#-Technologies)
   * [✍🏼 Autor](#-Autor)
   * [📝 License](#-license)
<!--te-->

 ---

 ## 🧠 Context
> **Project Feature:**  *API Rest* 🌐 

This project is a java application with spring boot where I do the following implementations:

 * Interaction of http methods. (POST, GET, UPDATE and DELETE);
 * Connection with JPA database

---

## 📥 Download and run the project

###  Prerequisites

Before getting started, you will need to have the following tools installed on your machine:
[Git](https://git-scm.com), [Java](https://www.java.com/pt-BR/) this application used `Java 11`, and [Maven](https://maven.apache.org/install.html) . Also, it's nice to have an editor to work with code like [VSCode](https://code.visualstudio.com/).


### 💻 Aplication setup

```bash
# clone this repository
$ git clone <https://github.com/br3nds0n/user-registration.git>

# access the project folder
$ cd user-registration

# install the dependencies
$ mvn install
```
### ⚙ Configure environment variables
> You will need to configure the `application.properties` file in the [resources](https://github.com/br3nds0n/user-registration/blob/main/src/main/resources/application.properties) folder. Example:

```java
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
spring.datasource.username = postgres
spring.datasource.password = postgres
spring.datasource.url = jdbc:postgresql://localhost:5432/postgres
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.show-sql = true

```

#

### ▶ Starting the application
> We will run the following command to run the application:
```bash
# Running in production mode
$ mvn spring-boot:run

```
<br>

#

---
## 🛠 Technologies

The following tools/technologies were used in the construction and testing of the project. By clicking on the technology icon, you will be redirected to the official website for installation: <br>

| logo               | Framework                  | Version      |
| :----------------- | :------------------------- | :----------: |
| <a href="https://www.java.com/pt-BR/" target="_blank"><img align="center" alt="java" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/java/java-original.svg"></a> | Java           |  `11.0.5`      |
| <a href="https://start.spring.io/" target="_blank"><img align="center" alt="springboot" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/spring/spring-original.svg"></a> | SpringBoot  |  `2.6.7`       |
| <a href="https://pt-br.reactjs.org/" target="_blank"><img align="center" alt="maven" height="30" width="40" src="https://user-images.githubusercontent.com/82064724/168427904-8ca2ff98-2496-45bc-9747-9875009566b5.png"> | Maven |  `3.6.3`       |
| <a href="https://www.postgresql.org/download/" target="_blank"><img align="center" alt="PostgreSQL" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/postgresql/postgresql-original.svg"></a>            | PostgreSQL                      |  `8.7.3`       |
| <a href="https://code.visualstudio.com/download" target="_blank"><img align="center" alt="VsCode" height="25" width="35" src="https://github.com/devicons/devicon/blob/master/icons/vscode/vscode-original.svg"></a> | VsCode | `1.67.1` |

 <br>

[<Back](#Index)
 
---
                 
## ✍🏼 Author


<div align=left>

- <table>
 <p>  Developed by:</p>
  <tr align=center>
    <th><strong> 🎖 Brendson Victor  </strong></th>
  </tr>
   <td>
      <a href="https://github.com/br3nds0n">
        <img width="168" height="140" src="https://media-exp1.licdn.com/dms/image/C4D03AQH4Lyg5QLY14Q/profile-displayphoto-shrink_800_800/0/1649690168220?e=1655337600&v=beta&t=CE9_lwADS7APVkGKaBXv864HxejH2pwiOCwD_wlhHNU" > <p align="left">
</p></a>
    </td>
  </tr>
</table>
</div>

<div align=left>

<br>

[<Back](#Index)
 
---
 
## 📝 License

This repository is licensed under **MIT LICENSE**. For more detailed information, read the [LICENSE](./LICENSE) file contained in this repository.

 <br> 
	
 [<Back](-User-Registration)
