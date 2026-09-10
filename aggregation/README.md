# Aggregation - "Has-A" Relationship

"Has-A" relationship is a special form of Association where:

- In Aggregation, both entries can survive individually, meaning when one gets destroyed the other one remains unaffected
- Weak association
- Child objects can exist independently of the parent object (The __contained object__ can exist independently of the __container object__)

## Program Output

```
AGGREGATION EXERCISE
====================
Case 1: One Instructor and One Textbook
---------------------------------------
Course: CS3560

Instructor(s):
1. Instructor: Nima Davarpanah
   Office: 3-2636

Textbook(s):
1. Clean Code
   Author: Robert C. Martin
   Publisher: Prentice Hall

Case 2: Two Instructors and Two Textbooks
-----------------------------------------
Course: CS3560-02

Instructor(s):
1. Instructor: Nima Davarpanah
   Office: 3-2636
2. Instructor: Sarah Johnson
   Office: 4-1120

Textbook(s):
1. Clean Code
   Author: Robert C. Martin
   Publisher: Prentice Hall
2. Effective Java
   Author: Joshua Bloch
   Publisher: Addison-Wesley
```
