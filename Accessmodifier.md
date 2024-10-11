# Access Modifiers in Java

Java provides a total of **12** modifiers, but only **4** of them are **access modifiers**. Access modifiers determine the **scope** of where members of a class can be accessed.

---

## The 4 Access Modifiers:

1. 🌐 **public**  
2. 🔒 **protected**  
3. 🚫 **default** (no keyword)  
4. 🔐 **private**

---

## Scope of the 4 Access Modifiers:

| Modifier   | Scope (Within the Same Class) | Scope (Within the Same Package) | Scope (Outside the Package) | Special Notes                             |
|------------|-------------------------------|---------------------------------|-----------------------------|-------------------------------------------|
| **public** | Yes                           | Yes                             | Yes                         | Accessible everywhere                    |
| **protected** | Yes                        | Yes                             | No (Yes, in case of inheritance) | Inheritance allows external access       |
| **default** | Yes                          | Yes                             | No                          | No access outside the package            |
| **private**  | Yes                         | No                              | No                          | Strictly limited to the class itself     |

---

## Scope of Boundaries:

### 1. 🌐 **public**  
A `public` member can be accessed:
- ✅ Within the same class
- ✅ Within the same package
- ✅ Outside the package

### 2. 🔒 **protected**  
A `protected` member can be accessed:
- ✅ Within the same class
- ✅ Within the same package
- ❌ Outside the package (except through inheritance)

### 3. 🚫 **default**  
A `default` member (no modifier) can be accessed:
- ✅ Within the same class
- ✅ Within the same package
- ❌ Not outside the package

### 4. 🔐 **private**  
A `private` member can be accessed:
- ✅ Only within the same class
- ❌ Not within the same package
- ❌ Not outside the package

---

## 📝 Notes:
- You can have **any number of classes** in a Java application, but **only one** can be declared as `public`.
- When a class is declared `public`, the `.java` file name **must match** the class name.

---

Designed for clarity and simplicity. Happy coding! ✨
