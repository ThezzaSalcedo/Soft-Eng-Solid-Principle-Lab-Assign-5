# Soft-Eng-Solid-Principle-Lab-Assign-5
## SOLID Order Processing System

A Java-based demonstration of refactoring "smelly" code into a clean, maintainable architecture using **SOLID Principles**.

## 📌 Project Overview
This project refactors a "Fat Interface" (`Order`) that violated multiple OOP principles. The new architecture is decoupled, where responsibilities are segregated, and high-level modules depend on abstractions rather than concrete implementations.

## 🛠 SOLID Principles Applied

| Principle | Implementation in this Project |
| :--- | :--- |
| **S**RP | Each class has a single responsibility (e.g., `EmailNotificationService` only handles emails). |
| **O**CP | New functionality (like SMS alerts) can be added by creating new classes without modifying existing logic. |
| **L**SP | Any implementation of `OrderCalculator` can be swapped into the `OrderProcessor` without breaking the system. |
| **I**SP | The original `Order` interface was split into four smaller interfaces so clients only depend on what they use. |
| **D**IP | `OrderProcessor` depends on interfaces (`OrderPlacer`, `OrderCalculator`) injected via the constructor. |

### Sample Output
Total: $20.0 <br> 
Order placed for John Doe at 123 Main St <br>
Invoice generated: order_123.pdf <br>
Email sent to johndoe@example.com: Your order is on the way!

## UML Diagram
![alt text](https://github.com/ThezzaSalcedo/Soft-Eng-Solid-Principle-Lab-Assign-5/blob/main/Solid%20Principle%20UML.png)
