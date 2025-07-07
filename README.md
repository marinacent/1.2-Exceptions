# Task 2 - Exceptions

## 📄 Description

### Exercise 1

1. Create a *Product* class with attributes *name* and *price*.
2. Create a *Sale* class with:
    - A collection of products.
    - An attribute for the total price.
    - A method *computeTotalPrice()* that:
        - Throws a custom exception *EmptySaleException* if the product collection is empty, with the message *To complete a sale, you need to add products*.
        - If the collection is not empty, it adds the product prices and stores them in the total price attribute.
3. The custom exception *EmptySaleException* extends Exception. Its constructor takes the messsage above, which you display using getMessage() when you catch the exception.

### Exercise 2

1. Create an *Input* class that uses Scanner to read user input.
2. The class must provide methods to read different data types:
    - byte
    - int
    - float
    - double
    - char
    - String
    - boolean
3. If the user enters invalid input, the method should catch the exception, show an error message and ask again until the input is valid.
4. For the byte, int, float and double data types, the exception InputMismatchException must be caught.
5. For char, String and boolean, a custom exception that extends Exception must be used.
6. Each method receives a String with the message to be shown to the user and returns the user’s input once valid.

## 💻 Technologies used

Java 21

## 📋 Requirements

Java 21

## 🛠️ Set up

1. Clone repository: -> git clone
2. Access project repository: cd 1.2-Exceptions
3. The *exceptions* folder contains level 1; *nivell-2* contains level 2.

## ▶️ Run

Open the folders in your IDE and run the Main files.

