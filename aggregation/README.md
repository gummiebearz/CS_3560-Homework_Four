# Aggregation - "Has-A" Relationship

"Has-A" relationship is a special form of Association where:
- In Aggregation, both entries can survive individually, meaning when one gets destroyed the other one remains unaffected
- Weak association
- Child objects can exist independently of the parent object (The __contained object__ can exist independently of the __container object__)

## Program Output
```
// One Instructor and One Textbook
Course name: CS3560
Instructor name: Nima Davarpanah
Textbook title: Clean Code, authored by Robert C. Martin

// Two Instructors and Two Textbooks
Course name: CS3560
Instructor: Nima Davarpanah
Instructor: Sarah Johnson
Textbook: Clean Code, authored by Robert C. Martin
Textbook: Effective Java, authored by Joshua Bloch
```
