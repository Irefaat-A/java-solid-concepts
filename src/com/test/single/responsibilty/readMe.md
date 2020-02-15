# **Single Responsibility**

Let's create a Book class with a few properties in it.
Let's add a few methods that relates directly to the Book class and the properties specified.

**Violating Single Responsibility**

Let's create a method inside the Book class that will also print some text.
This method has nothing to do with the actual Book class and therefore does not belong in the Book class. 
