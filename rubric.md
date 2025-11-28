# Project Assessment Rubric

**Project:** Excusez - Excuse Letter Management System
**Section:** C2A
**Course:** Object Oriented Programming

## Grading Breakdown

### 1. Class Diagram Completeness (25%)
**Score:** 5/5
**Notes:** Complete UML diagram provided in PDF format (UML DIAGRAM.pdf). The diagram clearly shows the class hierarchy with User as the abstract base class, three concrete user types (Student, Teacher, Dean), the Submitter interface, ExcuseLetter class, LetterStatus enum, and ExcusezSystem class. Relationships, associations, and multiplicities are well-documented showing a comprehensive system design.

### 2. Java Program - OOP Concepts (50%)
**Score:** 5/5
**Notes:**
- **Encapsulation (Excellent):** All classes use proper encapsulation with private/protected fields and public getters. User class uses protected fields (userId, name, email, password) accessible to subclasses. ExcuseLetter encapsulates letter details with private fields and controlled access methods.
- **Abstraction (Excellent):** User is an abstract base class with abstract method viewExcuseHistory() that subclasses must implement. The Submitter interface defines a contract for submitting excuse letters. This demonstrates both abstract classes and interfaces as abstraction mechanisms.
- **Inheritance (Excellent):** Clear three-level hierarchy where Student, Teacher, and Dean all extend the abstract User class. Each subclass inherits common user properties (userId, name, email, password) and methods (login, logout) while implementing specialized behavior.
- **Polymorphism (Excellent):** Multiple demonstrations of polymorphism: Student implements Submitter interface (interface polymorphism), all user types override viewExcuseHistory() with different implementations, Teacher and Dean both have rejectLetter() methods with similar signatures showing method overriding. The @Override annotations confirm proper polymorphic behavior.

The project demonstrates all four OOP concepts at a professional level with excellent use of abstract classes, interfaces, inheritance hierarchies, and polymorphic methods. The system architecture is well-designed with clear separation of concerns and role-based functionality.

### 3. Git Usage & Collaboration (15%)
**Score:** 5/5
**Notes:** Excellent collaboration with 67 total commits from 4 contributors: yuan (31 commits), Erith1 (22 commits), Benedict Tanghal (13 commits), and Michael Ong (1 commit). This demonstrates strong team participation with balanced contributions from multiple developers. The high commit count indicates iterative development, active collaboration, and proper version control practices throughout the project lifecycle.

### 4. Base Grade (10%)
**Score:** 5/5

---

## Final Grade: 100/100

*Assessment generated based on project analysis.*
