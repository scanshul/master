A defensive copy is a technique used to protect the immutability or encapsulation of an object by returning a copy of a mutable object instead of a reference to the original. It ensures that changes made to the returned copy do not affect the internal state of the object that exposes it.

Why Defensive Copying?
If a class holds a reference to a mutable object (like an array, a list, or another class with mutable fields), exposing that reference could allow external code to modify the internal state of the class. To prevent this, instead of returning or storing the original mutable object, a copy of that object is returned or stored.


Difference between unmodifiableList and final lists

Collections.unmodifiableList() when you want to create a read-only view of a list, and use final List when you want to prevent reassignment of the list reference while still allowing modifications to the list's contents.