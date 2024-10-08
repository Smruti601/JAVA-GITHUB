# Calling Procedure of the Members of Class

## The Nature of the Members of the Class is of Two Types:
1. **Static Type**
2. **Non-Static Type**

---

## Note

- **Static members** can be declared using the `static` keyword.
- No keyword is used before **non-static variables**.

---

## Important Notes:

- **Static members** can be called directly, by using the class name or the object name within the same class.
- Outside the class, **static members** cannot be called directly, i.e., they must be called by class name or object name.
- **Non-static members** can only be called by object name within the same class and outside the class.
- It is recommended for a programmer to call the static members by class name to avoid memory wastage.

---

## Code Example:

```java
public class variable_calling {
    static int a = 10; // static member
           int b = 20; // non-static member
}

class Test {
    public static void main(String[] args) {
        // Trying to call directly
        // System.err.println(a); // error
        // System.err.println(b); // error

        // Calling by class name
        System.err.println(variable_calling.a); // 10
        // System.err.println(variable_calling.b); // error

        // Calling by object name
        variable_calling obj = new variable_calling();
        
        System.err.println(obj.a); // 10
        System.err.println(obj.b); // 20
    }
}
