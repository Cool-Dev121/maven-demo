# maven-demo

Clone this to your workspace:

    git clone https://github.com/davidmoten/maven-demo.git

##Import to Eclipse

To import this maven structured project into Eclipse:

* **File - Import - Maven - Existing Maven Projects**
* open the `maven-demo` folder and hit **Finish**

The project includes a dependency on *r-tree*, a main class `Thing` and a test class `ThingTest`.


##Build 
To build from the command line (to produce a jar for instance):

    cd maven-demo
    mvn clean install

You'll see the tests have been run and a jar has been built and put in the *target* directory.
