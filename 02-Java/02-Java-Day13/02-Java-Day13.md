## Java Module Day 13 - Lesson Notes & Code! :)

### Introduction to ArrayList
The `ArrayList` in Java is a part of the Java Collections Framework and is used to dynamically store a sequence of elements. 
Unlike arrays, `ArrayList` can grow or shrink in size during runtime.

- **Resizable Array:** Unlike a regular array, `ArrayList` can change its size dynamically.
- **Indexed Access:** Elements can be accessed by their index.

### Key Methods and Usage:

- **Creating an ArrayList:**
  ```java
  ArrayList<Type> list = new ArrayList<>();
  ```
  Where `Type` is the type of objects the list will hold, e.g., `Integer`, `String`, or a custom class.

- **Adding Elements:**
  ```java
  list.add(element);
  ```
  Adds the element to the end of the list.

- **Inserting Elements:**
  ```java
  list.add(index, element);
  ```
  Inserts the element at the specified position.

- **Accessing Elements:**
  ```java
  list.get(index);
  ```
  Retrieves the element at the specified index.

- **Removing Elements:**
  ```java
  list.remove(index);
  list.remove(element);
  ```
  Removes the element at the specified index or removes the first occurrence of the specified element.

- **Setting Elements:**
  ```java
  list.set(index, element);
  ```
  Replaces the element at the specified position with the specified element.

- **Size and Capacity:**
  ```java
  list.size();
  ```
  Returns the number of elements in the list. Capacity grows automatically as needed.

- **Clearing the List:**
  ```java
  list.clear();
  ```
  Removes all elements from the list.

### Performance Considerations:
- **Access Time:** - Fast, constant time to access elements by index.
- **Insertion/Deletion Time:** - Adding or removing elements, especially from the middle of the list, may be slower as it requires shifting elements.

## Working with ArrayList of Integers

### Code Example:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(9);
        list.add(52);
        list.add(121);

        for (Integer n : list) {
            System.out.println(n);
        }

        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            Integer n = list.get(i);
            System.out.println(i + ": " + n);
        }
    }
}
```

### Explanation:
- **ArrayList Creation:** `ArrayList<Integer> list = new ArrayList<>();` creates a new `ArrayList` for `Integer` objects.
- **Adding Elements:** `list.add(9);` adds integers to the list.
- **Iteration:** Both enhanced and traditional `for` loops are used for iteration, demonstrating different ways to access list elements.

## Custom Class with ArrayList

### Code Example:

```java
import java.util.ArrayList;

class Car {
    String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return brand;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("BMW"));
        cars.add(new Car("Mercedes"));
        cars.add(new Car("Volvo"));
        cars.add(new Car("Volkswagen"));

        cars.set(2, new Car("KIA"));

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
```

### Explanation:
- **Custom Class Definition:** The `Car` class has a `brand` attribute, a constructor, and an overridden `toString()` method.
- **Using ArrayList with Custom Objects:** `ArrayList<Car>` holds `Car` objects. Elements can be modified and iterated similarly to other types.

### Additional Methods:

- **SubList:**
  ```java
  List<Type> subList = list.subList(fromIndex, toIndex);
  ```
  Returns a view of the portion of the list between `fromIndex`, inclusive, and `toIndex`, exclusive.

- **Searching for Elements:**
  ```java
  int index = list.indexOf(element);
  boolean contains = list.contains(element);
  ```
  `indexOf` returns the index of the first occurrence, while `contains` checks if the list contains the element.

- **Sorting:**
  ```java
  Collections.sort(list);
  ```
  Requires that the elements are comparable or a custom comparator is provided.
