# maven-demo

Clone this to your workspace:

    git clone https://github.com/davidmoten/maven-demo.git

To build from the command line:

    cd maven-demo
    mvn clean install

You'll see the tests have been run and a jar has been built and put in the *target* directory.

To use this maven structured project in Eclipse:

* **File - Import - Maven - Existing Maven Projects**
* open the `maven-demo` folder and hit **Finish**

The project includes a dependency on *r-tree*, a main class `Thing` and a test class `ThingTest`.
