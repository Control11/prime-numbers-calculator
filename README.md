# prime-numbers-calculator
This app displays all prime numbers up to upper boundary given as the input argument.

## Usage
To run this app You should use git clone command or download zip file with this project and extract it. After that open Command Line at project directory and run application using this command:

```bash
mvn spring-boot:run
```

After starting the app visit this home website under URL: 
```bash
http://localhost:8080/calculator
```

Enter boundary value in input area and click Calculate button. You will be transferred to http://localhost:8080/calculate-prime endpoint that serves You the results.

![image](https://github.com/Control11/prime-numbers-calculator/assets/84398641/492cd90c-9a45-4ef5-a198-01fa11e76e41)


## Used tools
Project was built using Maven environment, Java 11, Lombok, Spring-Boot 2.7.13 version, Spring Web and Thymeleaf modules.
