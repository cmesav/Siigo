# **Falabella purchase process Automation**

## Pre requirements 📋

- Java version 1.8
- Gradle 
- Cucumber for Java
- Gherkin Plugin

## Programming convention

The following writing styles are used in automations:

- Variables and functions: Lower Camel Case. Example: `nomenclatureExample`.
- Class names: PascalCase or Upper Camel Case. Example: `NomenclatureExample`.
- Feature names: Snake Case. Example: `nomenclature_example`.

## Command for execution ▶️

- The project can be executed from the console with the following command:
  ```gradle clean test```.
- The Serenity report will be generated in the folder ``/target/site/serenity/`` located in the root folder of the
  project.