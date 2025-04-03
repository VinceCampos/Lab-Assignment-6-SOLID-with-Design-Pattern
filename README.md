# Lab-Assignment-6-SOLID-with-Design-Pattern
The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook() and borrowJournal() with a parameter of title, which directly depends on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Create a repository in your GitHub account. Put your solution there. The readme file must include the problem statement, and UML Class Diagram of the proposed solution.

Make sure you have a TestProgram that will validate the proposed refactored codes.

UML CLASS DIAGRAM:
![Lab-Assignment-6-Dependency-Inversion (1)](https://github.com/user-attachments/assets/212ed090-a538-4357-83c1-ea41b9a3c503)
