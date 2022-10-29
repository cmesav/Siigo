# Test automation for Reqres Api

For this automation the service is used https://reqres.in/

### Built tests 📋

- List users (GET)
- Create users (POST)
- Update users (PUT)
- Delete users (DELETE)

## Requirements to use the project ##

- Java JDK 1.8
- Gradle 3.2.0 o superior
- GIT

## Design pattern used 🧮

- ### [Serenity Screenplay Pattern](http://serenity-bdd.info/docs/articles/screenplay-tutorial.html)
- ### [Patron Builder](https://github.com/sauljabin/design-patterns-java#builder)

## Compilation ⚙️

Download the project and import it into the IDE of preference.

It is important to compile the project for this, run any of the following commands.

Run by console

```
gradle clean build -x test
gradle compileJava
```

## Execution 🚀

**Execution All tests**

To run all the tests of the project and generate the report you can use.

```
gradle clean test
```

**NOTE:** The generated report of the tests is generated on the route `/target/site/serenity/index.html`
