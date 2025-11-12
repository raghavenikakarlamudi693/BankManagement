# 🏦 Bank Management System (Java OOP Project)

A simple **Bank Management System** built using **Core Java** to demonstrate fundamental **Object-Oriented Programming (OOP)** principles such as **Encapsulation**, **Abstraction**, **Inheritance**, and **Polymorphism**.  
This project is implemented as a plain Java console application — no frameworks, just pure Java logic.

---

## 📚 Table of Contents
- Objective(#-objective)
- OOP Concepts Used(#-oop-concepts-used)
- Project Structure(#️-project-structure)
- How to Run(#️-how-to-run)
- Classes Overview(#-classes-overview)
- Sample Output(#-sample-output)
- Future Enhancements(#-future-enhancements)
- Author(#-author)

---

## 🎯 Objective
The goal of this project is to build a **mini banking system** that can:
- Create different types of bank accounts  
- Deposit and withdraw funds  
- Transfer money between accounts  
- Display all account details  

It’s designed primarily for **learning and showcasing OOP concepts** in a clean, modular, and reusable structure.

---

## 🧩 OOP Concepts Used

| Concept | Description | Example |
|----------|--------------|----------|
| **Encapsulation** | Hiding internal details using private fields and getters/setters | Private fields in `Account` |
| **Abstraction** | Abstract class for common structure | `Account` class with abstract `withdraw()` |
| **Inheritance** | Reusing behavior across related classes | `SavingsAccount` and `CurrentAccount` extend `Account` |
| **Polymorphism** | Different implementations for the same method | `withdraw()` behaves differently in each subclass |
| **Composition** | Combining objects for functionality | `BankService` uses multiple `Account` objects |

---

## 🗂️ Project Structure
com.java.bank
└── Main.java → Entry point for the application

com.java.model
├── Account.java → Abstract base class
├── SavingsAccount.java → Derived class with interest feature
├── CurrentAccount.java → Derived class with overdraft feature

com.java.service
├── BankService.java → Handles account creation & display
├── TransactionService.java → Handles money transfers

com.java.util
└── InputHelper.java → Utility class for user input
