# SpringCore

Working with the Spring Framework core principles and examples of various dependency injection and IoC concepts.

## Table of Contents

- [Overview](#overview)
- [Project Structure](#project-structure)
- [Modules](#modules)
  - [Constructor Injection](#constructor-injection)
  - [Setter Injection](#setter-injection)
  - [Spring Core IoC](#spring-core-ioc)
  - [Annotation-Based Configuration](#annotation-based-configuration)
  - [Bean Definition Example](#bean-definition-example)
  - [Student Gate Pass Example](#student-gate-pass-example)
  - [Autowiring](#autowiring)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Running Examples](#running-examples)
- [License](#license)

## Overview

This repository contains examples demonstrating core Spring Framework concepts including Inversion of Control (IoC), dependency injection (DI), and autowiring. Each module showcases a different configuration style (XML, annotations, constructor/setter injection) and real-world use cases.

## Project Structure

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── DataProvider.IoC/       # Constructor-based DI examples ([github.com](https://github.com/otAdarshP/SpringCore/blob/master/src/main/resources/ApplicationBeanIOC.xml))
│   │   │   ├── annotations/components/ # Annotation-based DI ([github.com](https://github.com/otAdarshP/SpringCore/tree/master/src/main/resources))
│   │   │   ├── car/usage/injections/   # Constructor and setter injection examples ([github.com](https://github.com/otAdarshP/SpringCore/tree/master/src/main/java/car/usage/injections))
│   │   │   ├── com/student/details/    # Student GatePass example ([github.com](https://github.com/otAdarshP/SpringCore/blob/master/src/main/resources/gatepass.xml))
│   │   │   ├── org/MyBean/             # Basic bean definition ([github.com](https://github.com/otAdarshP/SpringCore/blob/master/src/main/resources/ApplicationBeanContext.xml))
│   │   │   ├── spring/core/autowire/   # Autowiring examples
│   │   │   ├── use/autowire/byname/    # Autowire by name
│   │   │   └── use/autowire/bytype/    # Autowire by type
│   │   └── resources/
│   │       ├── ApplicationBeanContext.xml
│   │       ├── ApplicationBeanIOC.xml
│   │       ├── annotations.components.xml
│   │       ├── autowire.xml
│   │       ├── autowireByType.xml
│   │       └── gatepass.xml
└── pom.xml
```

## Modules

### Constructor Injection

Demonstrates constructor-based dependency injection in the `car.usage.injections.constructor` package using XML configuration.

### Setter Injection

Shows setter-based injection in the `car.usage.injections.setter` package.

### Spring Core IoC

Illustrates core IoC with a `UserManager` and multiple `UserDataProvider` implementations wired via constructor args in `ApplicationBeanIOC.xml`. ([github.com](https://github.com/otAdarshP/SpringCore/blob/master/src/main/resources/ApplicationBeanIOC.xml))

### Annotation-Based Configuration

Uses `@Component` and component-scanning (`annotations.components.xml`) to wire an `Employee` bean without XML bean definitions. ([github.com](https://github.com/otAdarshP/SpringCore/tree/master/src/main/resources))

### Bean Definition Example

A simple `FirstBean` defined in `org.MyBean` and loaded from `ApplicationBeanContext.xml`. ([github.com](https://github.com/otAdarshP/SpringCore/blob/master/src/main/resources/ApplicationBeanContext.xml))

### Student Gate Pass Example

Represents a `GatePass` bean that depends on a `studentDetails` bean, demonstrating property and constructor injection in `gatepass.xml`. ([github.com](https://github.com/otAdarshP/SpringCore/blob/master/src/main/resources/gatepass.xml))

### Autowiring

Examples of autowiring by name, by type, and by constructor using Spring's `<bean autowire="byName|byType|constructor"/>` settings.

## Prerequisites

- Java JDK 8 or higher
- Maven 3.6+
- Internet connection to download dependencies

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/otAdarshP/SpringCore.git
   cd SpringCore
   ```
2. Build the project with Maven:
   ```bash
   mvn clean install
   ```

## Running Examples

Each module has its own `Main` class. For example, to run the IoC example:

```bash
mvn exec:java -Dexec.mainClass="DataProvider.IoC.Main"
```

Replace `DataProvider.IoC.Main` with the appropriate fully-qualified main class for other examples (e.g., `annotations.components.Main`, `org.MyBean.Main`, etc.).

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.

