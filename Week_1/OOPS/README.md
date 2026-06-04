# Week 1 OOPS

Topic: Interface

Files:
 LibraryUser.java
 KidUsers.java
 AdultUser.java
 LibraryInterfaceDemo.java

### LibraryUser.java
Contains the interface with:
- registerAccount()
- requestBook()

### KidUser.java
Implements LibraryUser for child users.
Rules:
- Age < 12 for registration
- Can borrow only Kids books

### AdultUser.java
Implements LibraryUser for adult users.
Rules:
- Age > 12 for registration
- Can borrow only Fiction books

### LibraryInterfaceDemo.java
Driver class containing test cases.

## Learning Outcome
Learned how interfaces provide a common contract for multiple classes and how different classes implement the same methods according to their own requirements.
