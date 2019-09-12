# groovy
Groovy Learning

**Installation**
To make Groovy work we need JDK + Groovy . Follow the below steps to make that available.

1. Download JDK-8 + from any package manager or from Oracle website. Google will be your friend for this. 
2. Download Groovy from [groovy-lang](https://groovy-lang.org/)
3. Create Environment variable for JAVA_HOME and GROOVY_HOME. Make that both available in PATH, so that you can use `java`, `groovy`, `groovysh`, `groovyc` .

**SDKMAN**
SDKMAN is a nice package manager to deal with various Installation like `java`, `groovy`, `rails` and etc..
Please explore [SDKMAN](https://sdkman.io/) for more details.
some helpful command are:
```
sdk help 
sdk list 
sdk list groovy
```

**groovysh**
groovysh is a shell based commandline tool to run small groovy syntext for quick test
Some useful command are:
```
groovysh -help
groovysh -version
groovysh command will bring a console for you with groovy:000> of prompt
groovy:000> 1+1
groovy:000> println "Hello, World"
groovy:000> class Person {
groovy:000> .....continue your class, once you  } it will recognise as complete.
groovy:000>:h - will show groovysh help
like :?, :clear etc..
groovy:000>:q - for quit
```
**groovyc**
groovyc is a groovy compiler . By using this tool you can compile you groovy file.
groovyc - stands for groovy compiler

When Using IDE this steps taken care by IDE in the backend
In [groovy-lang.org](https://groovy-lang.org/) -- Documentation -- Tools section we can find groovyc related documentation

This will generate a .class file with name Person.class
```
groovyc Person.groovy 
```

we can redirect all the compile groovy to other folder by using below command:
```
groovyc -d folderName *.groovy
```

If you want to run a .class file use : `groovy Person`
we no need .class extenstion to be added while running the groovy class by groovy command. 

run the compiled groovy class with java command:
```
java -cp groovy-all.2.4.5.jar Person
```

**groovy console**
Quick way of testing your syntex
Testing small groovy logic
groovyConsole - is the command to be used to open this
