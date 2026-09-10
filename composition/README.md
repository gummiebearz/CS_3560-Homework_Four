# Composition - "Own A" Relationship

- Composition provides a flexible way to reuse code without using inheritance
- One class contains another class, the __contained object__ cannot exist independently of the __container object__
- Represents strong dependency between objects
- Objects are created and managed by the owner class

## Features

- Supports code reusability and flexibility
- Helps achieve some flexibility similar to multiple inheritance through composition
- Improves testability and maintainability of classes
- Allows replacing or modifying member objects
- Enables dynamic behavior changes at runtime

## Program Output

`ArrayList<>` is preferred over fixed arrays because a folder can contain zero or more files or sub-folders, suggesting dynamic collection.

```
ORIGINAL FOLDER STRUCTURE:
php_demo1
  |-Source Files
    |-.phalcon
    |-app
      |-config
      |-controllers
      |-library
      |-migrations
      |-models
      |-views
    |-cache
    |-public
      |-.htaccess
      |-.htrouter.php
      |-index.html

AFTER REMOVING FOLDER "APP":
php_demo1
  |-Source Files
    |-.phalcon
    |-cache
    |-public
      |-.htaccess
      |-.htrouter.php
      |-index.html

AFTER REMOVING FOLDER "PUBLIC":
php_demo1
  |-Source Files
    |-.phalcon
    |-cache
```
