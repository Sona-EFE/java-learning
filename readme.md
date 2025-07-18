# Java Learning Repository

This repository contains Java code samples and projects for learning purposes.

## Prerequisites

- [Java JDK 17+](https://adoptopenjdk.net/) (or your preferred version)
- [Maven](https://maven.apache.org/) (if using Maven for builds)
- [Git](https://git-scm.com/)

## Setup Instructions

1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/java-learning.git
   cd java-learning
   ```

2. **Open in Visual Studio Code:**
   ```sh
   code .
   ```

3. **Build the project (if using Maven):**
   ```sh
   mvn clean install
   ```

4. **Run your Java files:**
   - For Maven projects:
     ```sh
     mvn exec:java
     ```
   - For standalone files:
     ```sh
     javac YourFile.java
     java YourFile
     ```

## Running Tests

If the project contains tests, run them with:
```sh
mvn test
```

## Contributing

Feel free to fork this repository and submit pull requests!
