# RestCodingChallenge


## Getting Started
As part of a testing framework, I have created a REST HTTP service that generates a random address. Based on the requirements, I have implemented 
a SpringBoot application to randomly generate an address in the format “532 Union St., Apt 72, San Diego, NY, 789302”. 
Please follow step by step instructions below to run the application.<br><br>


### Prerequisites
1. **Java** <br>
Please verify Java installtion on your machine. Please open the console and execute a java command based on the operating system you are working on.<br>
- Windows: - `c:\> java -version`<br>
- Linux/Mac: - `$ java -version`<br>
The minimum requirement is JDK 1.8. The output should be as per below.<br>
   `java version "1.8.0_101"`<br>
   `Java(TM) SE Runtime Environment (build 1.8.0_101)`<br><br>

2. **IDE**<br>
We need and IDE(Integrated development environment) in order to import the project. below are the steps given to run the project through a command line.<br>
The use of Intellij IDEA is recommmended to run the project.<br>
![1](https://user-images.githubusercontent.com/15387499/86395723-b78b3700-bc6e-11ea-9dd3-f17f7210ab6d.png)


3. **Maven**<br>
Apache Maven is a software project management and comprehension tool. Based on the concept of a project object model (POM), Maven can manage a project's build, 
reporting and documentation from a central piece of information.<br>
- Download the latest Maven version from this link:- https://maven.apache.org/download.cgi <br>
- Extract the archive, to the directory you wish to install Maven<br>
- Now open console and execute the following mvn command <br>
  - Windos: - `c:\> mvn --version`<br>
  - Linux/Mac: - `$ mvn --version`<br>
  You will the Maven version installed<br>
  
4. **Git**<br>
Git is a distributed revision control and source code management system.<br>
- For Mac run this command: -`$ brew install git`<br>
- For windows, download package from https://gitforwindows.org/ and following installation instructions.<br><br>


### Installation

1. Clone the git repo<br>

   https://github.com/kushalshinde/RestCodingChallenge.git

2. Navigate to the the project root directory from the command line terminal<br>

3. Build Spring Boot Project with Maven<br>
To be able to run the Spring Boot app, we will need to first build it. To build and package a Spring Boot app 
into a single executable Jar file with a Maven, we use the below command. <br>

   `mvn install`

4. Run Spring Boot app using Maven<br>

   `mvn spring-boot:run`

The application is now running in the localhost:8080 port<br>

5. Access the running application from the browser or Postman, please run below url: -<br>

   http://localhost:8080/randomizer/address

It the Postman app, please select GET HTTP method to get the address result in a JSON format.<br>

In order to get the randomized results, we can hit this URL multiple times.<br><br>

## About The Project

1. 



## Contributing

1. Fork the repo https://github.com/kushalshinde/RestCodingChallenge.git<br>
2. Create your feature branch `git checkout -b feature/fooBar`<br>
3. Commit your changes `git commit -am 'Add some fooBar'`<br>
4. Push to the branch `git push origin feature/fooBar`<br>
5. Create a new Pull Request<br><br>

## Release History

- Initial Commit<br><br>
 
## Contact

Kushal Shinde<br>
kushalshinde@gmail.com<br>
https://github.com/kushalshinde<br><br>
