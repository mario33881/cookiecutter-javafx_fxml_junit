# {{ cookiecutter.artifactId }}

This is a template for JavaFX + JavaFX FXML applications.

Creates a window with a button that shows the "Hello world" message inside the window and in the terminal.

> This template also defines a simple unit tests template using JUnit 5.

## Repository files

This repository contains the following files:
* ```.editorconfig```: tells your text editor to trim trailing whitespace, set the correct end of line, ...
* ```.gitignore```: tells git which files to ignore (build output)
* ```pom.xml```: Maven configuration file (Defines JavaFX, JavaFX FXML and JUnit as dependencies)
* ```README.md```: this file. Describes what the application does, its structure, how to run it, how to run the tests, who are the authors, ...

This repository contains the following folders:
* ```src```: contains source files and resources used by the project.
    * ```main/java```: contains application's source code
    * ```main/resources```: contains application's resources (for example fxml and CSS files)
    * ```test/java```: contains tests source code
    > You can also create a ```test/resources``` folder which contains tests resources

## How to run the application

### From an IDE

1. Find an "Open project" (or "Open existing project") button and select this folder.

2. Click on the run button used to run a normal application
> You might need to open the main source file that you want to execute so that the IDE knows which file you want to run

> Tested with Intellij IDEA

### From the command line

To run the application, execute the following command in the command line:
```
mvn javafx:run
```

## How to run the tests

### From an IDE

1. Find an "Open project" (or "Open existing project") button and select this folder.

2. Click on the run button used to run the unit tests
> You might need to open the test source file that you want to execute so that the IDE knows which file you want to run

> Tested with Intellij IDEA

### From the command line

To run the application's tests, execute the following command:
```
mvn test
```

## Authors

The authors are x, y, z.
