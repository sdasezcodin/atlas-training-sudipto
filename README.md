# 🚀 ATLAS Training Program - Complete Java Mastery Journey

> **39-Day Intensive Java Development Training - From Fundamentals to Enterprise Applications**

[![Java](https://img.shields.io/badge/Java-8%20%7C%2017-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-2.3.1-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![JUnit](https://img.shields.io/badge/JUnit-5-25A162?style=for-the-badge&logo=junit5&logoColor=white)](https://junit.org/junit5/)
[![Mockito](https://img.shields.io/badge/Mockito-3.12.4-FF6C37?style=for-the-badge&logo=mockito&logoColor=white)](https://mockito.org/)
[![DynamoDB](https://img.shields.io/badge/DynamoDB-FF9900?style=for-the-badge&logo=amazondynamodb&logoColor=white)](https://aws.amazon.com/dynamodb/)
[![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

## 📋 Table of Contents

- [Overview](#-overview)
- [Repository Statistics](#-repository-statistics)
- [Repository Structure](#-repository-structure)
- [Core Modules](#️-core-modules)
- [Technical Skills Covered](#-technical-skills-covered)
- [Daily Progress Log](#-daily-progress-log)
- [Getting Started](#-getting-started)
- [Key Implementations](#-key-implementations)
- [Testing & Quality Assurance](#-testing--quality-assurance)
- [Tools & Technologies](#️-tools--technologies)
- [Learning Outcomes](#-learning-outcomes)

---

## 🎯 Overview

This repository represents my comprehensive journey through the **ATLAS Training Program**, an intensive 39-day Java development bootcamp. Starting from basic programming fundamentals and culminating in enterprise-grade applications, this collection showcases a complete transformation from beginner concepts to advanced software architecture.

The training followed a structured progression: foundational Java → object-oriented programming → data structures & algorithms → design patterns → testing frameworks → cloud integration → enterprise Spring Boot applications.

### 📊 Repository Statistics

| Metric | Count | Description |
|--------|-------|-------------|
| **Training Duration** | 39 Days | May 14 - September 25, 2025 |
| **Total Java Files** | 325+ | 304 in java/, 21 in home-tasks/ |
| **Directory Structure** | 100+ | Organized modules and submodules |
| **Daily Documentation** | 39 Files | Comprehensive .docx reports |
| **Design Patterns** | 23+ | Complete GoF implementation |
| **Testing Files** | 40+ | JUnit, Mockito, Hamcrest, Spring Boot |
| **Enterprise Projects** | 2 | Mobile Store API, DynamoDB Employee System |
| **Cloud Integration** | AWS DynamoDB | Java SDK implementation |

---

## 📁 Repository Structure

### 🏗️ **Complete Directory Breakdown**

```
atlas-training-sudipto/
├── 📁 java/ (304 files, 100+ directories)  # Core Java implementations
│   ├── 📁 algorithms/                # Sorting, searching, data structures
│   ├── 📁 architecture/              # System design patterns
│   ├── 📁 collections/               # Complete Collections Framework
│   │   ├── ArrayList/ HashMap/ LinkedList/ Queue/ Stack/ Tree/
│   │   └── AVLTree.java, CircularLinkedList.java, etc.
│   ├── 📁 dynamodb/                  # AWS DynamoDB integration
│   │   └── employee-manager/ (connection, employee, table)
│   ├── 📁 exceptions/                # Exception handling patterns
│   ├── 📁 fileIO/                    # File operations and I/O
│   ├── 📁 graph/                     # Graph algorithms and implementations
│   ├── 📁 multithreading/            # Concurrency and parallel programming
│   ├── 📁 patterns/ (50+ files)        # Complete GoF Design Patterns
│   │   ├── architectural/ (MVC, Circuit Breaker, Event Sourcing, Microservices, Pub/Sub)
│   │   ├── behavioral/ (Command, Strategy)
│   │   ├── creational/ (Singleton, Factory, Abstract Factory, Builder, Prototype)
│   │   └── structural/ (Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy)
│   ├── 📁 principles/                # SOLID principles implementation
│   ├── 📁 recursion/                 # Recursive algorithms
│   ├── 📁 streams/                   # Java 8+ Streams and Lambda expressions
│   ├── 📁 String & Array/            # String manipulation and array operations
│   └── 📁 testing/ (40+ files)        # Comprehensive Testing Suite
│       ├── compare/ hamcrest/ mockito/ runner/ suite/
│       └── mobilestore/ (Complete Spring Boot Application)
├── 📁 home-tasks/ (21 files)          # Daily assignments and practice tasks
│   └── day-24-25/ day-26-27/ (advanced assignments)
└── 📄 day01-39_*.docx (39 files)      # Complete daily documentation
```

**Organization Philosophy**: Structured by topic for easy navigation, with each module containing multiple implementations and real-world examples. The progression from basic concepts to enterprise applications is evident in the file organization.

---

## 🛠️ Core Modules

### 1. **Comprehensive Design Patterns Implementation** 🏗️
**50+ Files | Complete GoF Pattern Suite**
- **Creational (5 patterns)**: Singleton, Factory, Abstract Factory, Builder, Prototype
- **Structural (7 patterns)**: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
- **Behavioral (2 implemented)**: Command, Strategy
- **Architectural (5 patterns)**: MVC (with Controller/Model/View), Circuit Breaker, Event Sourcing, Microservices, Pub/Sub
- **Real-world Examples**: Pizza Factory, Book Management, Payment Systems, Library MVC

### 2. **Advanced Collections & Data Structures** 📊
**30+ Implementations | Production-Ready Code**
- **ArrayList**: ArrayListCollection.java, ArrayListOperations.java
- **HashMap**: HashMapDemo.java, SynchronizedHashMap.java, HashMapNullDemo.java
- **LinkedList**: Circular, Doubly, Singly linked lists with custom node implementations
- **Trees**: AVLTree.java (self-balancing implementation)
- **Queues**: Array-based and LinkedList-based implementations
- **Stacks**: Complete stack operations with search functionality

### 3. **Enterprise Testing Suite** 🧪
**40+ Test Files | Industry-Standard Testing**
- **JUnit 5**: AssumptionsDemoTest, ExceptionTest, TimeoutTest, TagTest
- **Mockito Integration**: DemoTestMockito.java, User02.java
- **Hamcrest Matchers**: CollectionMatcherDemo, ObjectMatcherDemo, BeanPropertyCheckDemo
- **Spring Boot Testing**: Complete Mobile Store application tests
- **Comparison Testing**: JUnit 4 vs JUnit 5 implementations
- **Test Runners & Suites**: Organized test execution strategies

### 4. **Spring Boot Enterprise Application** 🌱
**Mobile Store REST API | Production-Grade Architecture**
- **Complete MVC Architecture**: Controller, Service, Repository layers
- **Entity-DTO Pattern**: MobileDTO.java, Mobile.java entity
- **Exception Handling**: Custom exceptions with global handler
- **Testing Integration**: MobileServiceTests.java with Mockito
- **Maven Configuration**: Spring Boot 2.3.1, JPA, MySQL, Validation
- **Code Coverage**: Jacoco integration for quality metrics

### 5. **AWS Cloud Integration** ☁️
**DynamoDB Employee Management System**
- **Connection Management**: AWS SDK configuration
- **CRUD Operations**: Complete database operations
- **Table Management**: Creation, deletion, querying
- **Employee Module**: Real-world business logic implementation

### 6. **Advanced Java Concepts** ⚡
**75+ Implementations**
- **Multithreading**: Concurrency patterns and synchronization
- **Streams & Lambda**: Java 8+ functional programming
- **Exception Handling**: Custom exception hierarchies
- **File I/O**: Advanced file operations
- **SOLID Principles**: Clean code architecture
- **Recursion**: Complex recursive algorithms

---

## 💡 Technical Skills Covered

### **Programming Fundamentals**
- ✅ Object-Oriented Programming (OOP) - Complete implementation
- ✅ SOLID Principles - All 5 principles with examples
- ✅ Exception Handling - Custom exception hierarchies
- ✅ File I/O Operations - Advanced file processing
- ✅ Lambda Expressions & Functional Programming - Java 8+ features

### **Advanced Java**
- ✅ Java Collections Framework - Custom implementations
- ✅ Generics and Type Safety - Parameterized types
- ✅ Multithreading and Concurrency - Thread management
- ✅ Streams API - Functional data processing
- ✅ Spring Boot Development - Enterprise applications

### **Software Engineering**
- ✅ Design Pattern Implementation - 23 GoF patterns
- ✅ Software Architecture Principles - MVC, Microservices
- ✅ Test-Driven Development - JUnit, Mockito integration
- ✅ Code Quality Assurance - Best practices and documentation
- ✅ Version Control - Git workflow and collaboration

### **Enterprise & Cloud**
- ✅ RESTful API Development - Spring Boot REST services
- ✅ AWS DynamoDB Integration - NoSQL cloud database
- ✅ Maven Build Management - Dependency management
- ✅ Spring Framework - IoC, DI, and enterprise patterns
- ✅ JSON Processing - Data serialization and APIs

---

## 📅 Daily Progress Log

<details>
<summary><strong>📖 View Complete 39-Day Journey (Click to Expand)</strong></summary>

### **Phase 1: Foundation (Days 1-10)**
| Day | Date | Focus Area | Key Achievements |
|-----|------|------------|------------------|
| 01 | May 14, 2025 | Linux Fundamentals | CLI basics, navigation, file systems |
| 02 | May 15, 2025 | Linux Commands | File operations, permissions, advanced CLI |
| 03 | May 21, 2025 | Development Setup | Git integration, IntelliJ IDEA configuration |
| 04 | May 22, 2025 | Linux Administration | File permissions, system administration |
| 05 | May 28, 2025 | Java Fundamentals | Classes, methods, data types |
| 06 | May 29, 2025 | Control Structures | Loops, arrays, conditional statements |
| 07 | June 4, 2025 | OOP Principles | Encapsulation, inheritance, polymorphism |
| 08 | June 5, 2025 | Practice & Review | Problem-solving, code optimization |
| 09 | June 11, 2025 | Exception Handling | Try-catch blocks, custom exceptions |
| 10 | June 18, 2025 | File I/O & Threading | File operations, multithreading basics |

### **Phase 2: Core Java (Days 11-20)**
| Day | Date | Focus Area | Key Achievements |
|-----|------|------------|------------------|
| 11 | June 19, 2025 | Functional Programming | Streams API, Lambda expressions |
| 12 | June 25, 2025 | Data Structures | Arrays, strings, manipulation techniques |
| 13 | June 26, 2025 | DSA Practice | Algorithm implementation, optimization |
| 14 | July 2, 2025 | Advanced DSA | Complex algorithms, performance analysis |
| 15 | July 3, 2025 | Graph Theory | Graph representations, traversal algorithms |
| 16 | July 9, 2025 | Code Review & Practice | Refactoring, best practices |
| 17 | July 10, 2025 | Core Java Deep Dive | Advanced Java features, JVM understanding |
| 18 | July 16, 2025 | Recursion & Algorithms | Recursive solutions, algorithmic thinking |
| 19 | July 17, 2025 | Collections Framework | Advanced collections, performance tuning |
| 20 | July 23, 2025 | Problem Solving | Logic building, algorithmic challenges |

### **Phase 3: Advanced Concepts (Days 21-30)**
| Day | Date | Focus Area | Key Achievements |
|-----|------|------------|------------------|
| 21 | July 24, 2025 | SOLID Principles | Software design principles, clean code |
| 22 | July 30, 2025 | Design Patterns | Creational and structural patterns |
| 23 | July 31, 2025 | Unit Testing | JUnit framework, test-driven development |
| 24 | August 6, 2025 | Design Patterns Cont. | Behavioral patterns, pattern selection |
| 25 | August 7, 2025 | Advanced Patterns | Architectural patterns, system design |
| 26 | August 13, 2025 | Pattern Implementation | Real-world pattern applications |
| 27 | August 14, 2025 | Code Quality | Refactoring, code reviews, documentation |
| 28 | August 20, 2025 | Performance Optimization | Memory management, performance tuning |
| 29 | August 21, 2025 | Advanced Testing | Integration testing, mocking frameworks |
| 30 | August 27, 2025 | System Integration | Component integration, API design |

### **Phase 4: Enterprise & Cloud (Days 31-39)**
| Day | Date | Focus Area | Key Achievements |
|-----|------|------------|------------------|
| 31 | August 28, 2025 | Project Architecture | System design, scalability considerations |
| 32 | September 3, 2025 | Cloud Integration | AWS services, cloud deployment |
| 33 | September 4, 2025 | Database Integration | DynamoDB operations, data modeling |
| 34 | September 10, 2025 | Full-Stack Integration | End-to-end application development |
| 35 | September 11, 2025 | Project Completion | Final implementation, documentation |
| 36 | September 17, 2025 | Spring Boot Basics | Spring Core, IoC, Dependency Injection |
| 37 | September 18, 2025 | REST API Development | Controller development, DTO implementation |
| 38 | September 24, 2025 | Mobile Store Project | Spring Boot REST API with comprehensive testing |
| 39 | September 25, 2025 | Final Integration | Complete Mobile Store deployment and documentation |

</details>

---

## 🚀 Getting Started

### **Prerequisites**
- Java 8 or higher (Java 17 recommended)
- IntelliJ IDEA or any Java IDE
- Git for version control
- Maven 3.8+ for dependency management
- AWS CLI (for DynamoDB examples)

### **Installation & Setup**

```bash
# Clone the repository
git clone https://github.com/sdasezcodin/atlas-training-sudipto.git

# Navigate to project directory
cd atlas-training-sudipto

# For standalone Java examples
javac -cp . java/algorithms/MergeSortDemo.java
java -cp . java.algorithms.MergeSortDemo

# For Maven projects (Mobile Store)
cd java/testing/mobilestore
mvn clean install
mvn spring-boot:run
```

### **Running Specific Modules**

```bash
# Design Patterns
cd java/patterns/creational && javac SingletonDemo.java && java SingletonDemo

# Collections Framework
cd java/collections/ArrayList && javac ArrayListOperations.java && java ArrayListOperations

# Testing Suite
cd java/testing && mvn test

# Spring Boot Application
cd java/testing/mobilestore && mvn spring-boot:run
```

---

## 🏆 Key Implementations

### **🔥 Flagship Projects**

#### 1. **Mobile Store Spring Boot Application**
**Complete Enterprise REST API**
- **Architecture**: MVC pattern with Controller, Service, Repository layers
- **Features**: CRUD operations, DTO pattern, exception handling
- **Testing**: JUnit 5 + Mockito with comprehensive test coverage
- **Dependencies**: Spring Boot 2.3.1, JPA, MySQL, Validation, ModelMapper
- **Build**: Maven with Jacoco code coverage reporting

#### 2. **AWS DynamoDB Employee Management System**
**Cloud-Native Database Application**
- **Connection Management**: AWS SDK Java configuration
- **Operations**: Complete CRUD with table management
- **Architecture**: Modular design with connection, employee, and table modules
- **Integration**: JSON processing and cloud persistence

#### 3. **Complete GoF Design Patterns Suite**
**50+ Pattern Implementations**
- **Creational**: Factory patterns for Pizza ordering, Book creation
- **Structural**: Adapter, Decorator patterns for real-world scenarios
- **Behavioral**: Command and Strategy patterns for payment systems
- **Architectural**: MVC library system, Microservices, Event Sourcing

#### 4. **Advanced Collections Framework**
**Custom Data Structure Implementations**
- **Trees**: Self-balancing AVL Tree implementation
- **LinkedLists**: Circular, Doubly, and Singly linked with custom nodes
- **Maps**: Synchronized HashMap, Null handling demonstrations
- **Performance**: Analysis and comparison of collection operations

---

## 🧪 Testing & Quality Assurance

### **Comprehensive Testing Strategy**
- **Unit Testing**: JUnit 5 with parameterized and exception tests
- **Mocking**: Mockito integration for service layer testing
- **Assertion Libraries**: Hamcrest matchers for readable assertions
- **Integration Testing**: Spring Boot test slices
- **Test Organization**: Suites, runners, and tagged test execution

### **Quality Metrics**
- **Code Coverage**: Jacoco integration for coverage reporting
- **Test Categories**: Unit, integration, and performance tests
- **Documentation**: Comprehensive inline and external documentation
- **Best Practices**: Clean code principles and SOLID implementation

---

## 🛠️ Tools & Technologies

### **Development Stack**
| Technology | Version | Purpose |
|------------|---------|---------|
| **Java** | 8, 17 | Core programming language |
| **Spring Boot** | 2.3.1 | Enterprise application framework |
| **Maven** | 3.8+ | Build automation and dependency management |
| **JUnit** | 5 | Unit testing framework |
| **Mockito** | 3.12.4 | Mocking framework |
| **IntelliJ IDEA** | 2023+ | Primary development environment |

### **Cloud & Database**
- **AWS DynamoDB**: NoSQL cloud database service
- **AWS SDK for Java**: Cloud service integration
- **MySQL**: Relational database for Spring Boot application
- **JSON Processing**: Data serialization and API communication

### **Build & Testing**
- **Maven Surefire**: Test execution plugin
- **Jacoco**: Code coverage analysis
- **Spring Boot Test**: Integration testing support
- **Hamcrest**: Assertion matchers library

---

## 🎯 Learning Outcomes

The 39-day ATLAS training program has resulted in comprehensive Java development skills:

### **Technical Mastery**
- **Enterprise Java Development**: Spring Boot application architecture
- **Design Pattern Implementation**: Complete GoF pattern suite
- **Testing Excellence**: Multi-framework testing approach
- **Cloud Integration**: AWS service implementation
- **Data Structures**: Advanced collection implementations

### **Professional Skills**
- **Code Quality**: Clean architecture and SOLID principles
- **Problem Solving**: Algorithm design and optimization
- **Documentation**: Comprehensive technical writing
- **Version Control**: Git workflow and collaboration
- **Project Management**: Structured learning and delivery

---

This repository represents not just code implementations, but a complete learning journey from basic programming concepts to enterprise-grade application development. Each module builds upon the previous one, creating a comprehensive foundation for professional Java development.

The progression from simple "Hello World" programs to complex Spring Boot applications with cloud integration demonstrates the depth and breadth of skills acquired during this intensive training program.

---

*Last Updated: September 25, 2025 - Day 39 of ATLAS Training*