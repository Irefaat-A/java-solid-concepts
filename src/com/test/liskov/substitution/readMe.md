# **Liskov substitution**
    
If you have a Class A that is a Subtype of Class B then we should be able to replace B with A without disrupting the behaviour of our program.

Example, 

You have a Car interface class (class A "subType of class B") with methods in it. Create a MotorCar class (class B) that implements the Car interface . 

You Should be able to replace class B with class A without disrupting behaviour. (Change class A from a interface to a class and then COPY and PASTE logic from class B and paste into class A).

# **Violating Liskov substitution**

Example, 

You have a Car interface class (class A "subType of class B") with methods in it. Now comes ElectricCar class  along and implements the Car interface. 

Liskov substitution no longer works because you dont need one of the methods from the interface. You then have relook at the model.

 



