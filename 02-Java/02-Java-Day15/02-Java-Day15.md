## Java Module Day 15 - Lesson Notes & Code! :)

### Introduction to `HashSet`
The `HashSet` class in Java is part of the Java Collections Framework and is used to create a collection that does not allow duplicate elements. 

### Key Characteristics of `HashSet`

#### 1. **No Duplicates:**
   - `HashSet` automatically handles duplicates by ensuring that only one instance of each unique element is stored. If an attempt is made to add a duplicate, it simply ignores it.

#### 2. **No Indexes:**
   - Unlike `ArrayList` or `LinkedList`, `HashSet` does not maintain any indices for its elements. This means you cannot access elements by a numerical index.

#### 3. **No Order Guarantee:**
   - `HashSet` does not guarantee any specific order of elements. The order in which elements are stored or retrieved can be entirely different from the order in which they were added.

#### 4. **Allows Null Elements:**
   - A `HashSet` can contain a single `null` element. If you try to add multiple `null` values, the additional `null` will be ignored.

#### 5. **Internal Implementation:**
   - `HashSet` is backed by a `HashMap` internally. When you add an element to a `HashSet`, it is stored as a key in the underlying `HashMap`, with a constant value.

#### 6. **Hashing Mechanism:**
   - `HashSet` relies on the `hashCode()` and `equals()` methods of its elements to ensure that duplicates are not stored. Good hashing is essential for efficient operation.

#### 7. **Performance:**
   - **Average Time Complexity:** Fast for basic operations like `add()`, `remove()`, and `contains()` due to its hashing mechanism.
   - **Worst-case Time Complexity:** Slower if many elements have the same hash code (causing collisions).

### Working with `HashSet` of Strings

### Code Example:

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("kiwi");
        fruits.add("watermelon");
        fruits.add("blueberry");
        fruits.add("kiwi");

        System.out.println(fruits.contains("kiwi"));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

### Explanation:
- **Creating a `HashSet`:** `HashSet<String> fruits = new HashSet<>();` creates a new `HashSet` that stores `String` objects.
- **Adding Elements:** `fruits.add("apple");` adds the string "apple" to the set. Duplicate elements like "kiwi" are not added again.
- **Checking for Existence:** `fruits.contains("kiwi");` checks if "kiwi" is present in the set.
- **Iteration:** Using an enhanced for loop, you can iterate through the `HashSet`, but the order of elements is unpredictable.

### Key Points:
- Duplicates are automatically ignored.
- The order of elements in the output will not necessarily match the order in which they were added.

### Custom Class with `HashSet`

#### Code Example:

```java
import java.util.HashSet;
import java.util.Objects;

class Vehicle {
    int serialNumber;
    String type;

    public Vehicle(int serialNumber, String type) {
        this.serialNumber = serialNumber;
        this.type = type;
    }

    @Override
    public String toString() {
        return serialNumber + ": " + type;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(serialNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return serialNumber == vehicle.serialNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        HashSet<Vehicle> vehicles = new HashSet<>();

        vehicles.add(new Vehicle(111, "Car"));
        vehicles.add(new Vehicle(222, "Truck"));
        vehicles.add(new Vehicle(333, "Car"));
        vehicles.add(new Vehicle(444, "Motorcycle"));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
```

### Explanation:
- **Custom Class Definition:** The `Vehicle` class defines a vehicle with a `serialNumber` and `type`. The `hashCode()` and `equals()` methods are overridden to ensure that vehicles are correctly compared in the `HashSet`.
- **Using `HashSet` with Custom Objects:** `HashSet<Vehicle>` holds `Vehicle` objects. Due to the overridden `hashCode()` and `equals()` methods, the `HashSet` can correctly determine if two vehicles are the same (based on their `serialNumber`).
- **Iteration:** The enhanced for loop iterates over the `HashSet` of `Vehicle` objects and prints each one.

### Key Points:
- Overriding `hashCode()` and `equals()` is essential when using custom objects in a `HashSet` to ensure proper behavior.
- The order of iteration is still unpredictable.

---

### Detailed explanation of equals() method:

### Code:
```java
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vehicle vehicle = (Vehicle) o;
    return serialNumber == vehicle.serialNumber;
}
```

### Line-by-Line Breakdown:

#### 1. `@Override`
- **Purpose:** 
  - Tells Java that this method is meant to replace the default `equals()` method from the `Object` class.
- **Example:**
  - Without `@Override`, if you accidentally wrote `public boolean equal(Object o)` (missing the "s"), Java wouldn't warn you that you're not actually overriding the `equals()` method. This could lead to unexpected behavior.
- **What If Removed:**
  - The code would still run, but you might not realize you're not properly overriding the method if there's a mistake.

#### 2. `public boolean equals(Object o)`
- **Purpose:** 
  - This is the method that checks if the current `Vehicle` object is equal to another object `o`.
- **Example:**
  - If you have `Vehicle car1 = new Vehicle(123, "Car");` and `Vehicle car2 = new Vehicle(123, "Car");`, you can use `car1.equals(car2)` to check if these two vehicles are considered equal based on their `serialNumber`.
- **What If Removed:**
  - If this method isn't defined, `car1.equals(car2)` would just check if `car1` and `car2` are the same object in memory, not if they have the same `serialNumber`.

#### 3. `if (this == o) return true;`
- **Purpose:** 
  - Checks if `this` (the object calling the method) and `o` are actually the same object in memory. If they are, it returns `true` because an object is always equal to itself.
- **Example:**
  - If you write `car1.equals(car1)`, this line catches that both references point to the same `Vehicle` object, so it immediately returns `true` without doing further checks.
- **What If Removed:**
  - The method would still work but would do unnecessary comparisons even when both references are the same object, slightly reducing efficiency.

#### 4. `if (o == null || getClass() != o.getClass()) return false;`
- **Purpose:** 
  - Ensures that the comparison only proceeds if `o` is not `null` and is of the same type (i.e., both are `Vehicle` objects).
- **Example:**
  - If `o` is `null`, like in `car1.equals(null)`, this line returns `false` because `null` can't be equal to a `Vehicle`.
  - If `o` is a different type, like `Bike`, this line returns `false` because a `Vehicle` shouldn't be equal to a `Bike`.
- **What If Removed:**
  - If `o` is `null`, the method would throw a `NullPointerException` later.
  - If `o` is a different type, you might get a `ClassCastException` when trying to cast `o` to `Vehicle`.

#### 5. `Vehicle vehicle = (Vehicle) o;`
- **Purpose:** 
  - Converts the object `o` to a `Vehicle` type so you can compare its fields, like `serialNumber`.
- **Example:**
  - After this line, you can safely compare `this.serialNumber` with `vehicle.serialNumber`.
- **What If Removed:**
  - You wouldn't be able to access the `serialNumber` of `o`, which means you couldn't compare the two objects' data.

#### 6. `return serialNumber == vehicle.serialNumber;`
- **Purpose:** 
  - Compares the `serialNumber` of this `Vehicle` with the `serialNumber` of the `vehicle` object. If they match, the method returns `true`, meaning the two objects are considered equal.
- **Example:**
  - If `car1` has a `serialNumber` of `123` and `car2` also has a `serialNumber` of `123`, `car1.equals(car2)` will return `true`.
- **What If Removed:**
  - The method wouldn't correctly compare the important data of the two objects, so it might incorrectly consider two vehicles as unequal even if they have the same `serialNumber`.

---

### Advantages and Limitations of `HashSet`

#### Advantages:
1. **Efficiency:** `HashSet` is generally faster than other Set implementations like `TreeSet` when it comes to basic operations (`add()`, `remove()`, `contains()`).
2. **Uniqueness:** Automatically manages unique elements, which is useful in scenarios where duplicates need to be avoided.
3. **Flexibility:** Supports null elements and custom objects with proper `hashCode()` and `equals()` implementation.

#### Limitations:
1. **No Ordering:** `HashSet` does not maintain any order of elements, which can be a drawback if ordered iteration is required. Use `LinkedHashSet` or `TreeSet` for ordered collections.
2. **No Random Access:** Unlike lists, you cannot access elements by index.
3. **Memory Overhead:** Since `HashSet` is backed by a `HashMap`, it may use more memory than other collections, especially when dealing with large datasets.
