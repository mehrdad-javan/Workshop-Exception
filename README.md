# Workshop: Exception handling.

In this workshop I have created a program that read strings from three different files.  
These files contains male first names, female first names and last names.  
There is also a save feature that can be used to make your changes persistent.  
The purpose is to build a library of names that you can use to “seed” random female and male names which could be of use when you need to create many
objects.


**Your task is to handle the checked exceptions that I haven’t handled inside the CSVReader_Writer
utility class.**

- [ ] At least one method should be handled with a try-catch-finally.
- [ ] At least one method should be handled with a try with resources with a catch.
- [ ] One method declare a “throws” that needs to be handled at the method invocation.
- [ ] You should create one custom exception that will get thrown from the add methods in
NameService class and handled with a friendly error message whenever you try to add a
name that already exists.
- [ ] You must successfully be able to create object of type Person using the method
getNewRandomPerson.
- [ ] If you add new names you must also be able to save the lists to file.



>You may not:
>- Declare a throws clause in static void main method
>- Refactor the code to get around the exception handling. (This workshop is about exception
handling after all ) When you are done you are free to refactor the code as much as you
wish.  

#### Good luck!