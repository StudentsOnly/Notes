## Java Module Day 16 - Lesson Notes & Code! :)

### Java Collections: LinkedHashSet and TreeSet

### LinkedHashSet

- **Definition**: `LinkedHashSet` is a class that extends `HashSet` and implements the `Set` interface. It maintains a linked list of the entries in the set, in the order in which they were inserted. This means that when iterating over a `LinkedHashSet`, the elements will be returned in the order in which they were inserted.

- **Characteristics**:
  - **Insertion Order**: `LinkedHashSet` maintains the order of elements as they were inserted.
  - **Uniqueness**: Like any other `Set`, it does not allow duplicate elements. If you try to add a duplicate element, it will simply ignore it.
  - **Performance**: The performance of `LinkedHashSet` is almost the same as `HashSet`, with a slight overhead due to the maintenance of the insertion order.

- **Example**:
  ```java
  LinkedHashSet<String> colors = new LinkedHashSet<>();

  colors.add("red");
  colors.add("white");
  colors.add("blue");
  colors.add("green");
  colors.add("green"); // Duplicate, will be ignored

  for (String color : colors) {
      System.out.println(color); // Prints: red, white, blue, green
  }
  ```
  - **Output**:
    ```
    red
    white
    blue
    green
    ```

- **Use Cases**:
  - When you need to maintain the insertion order of elements.
  - When you require the uniqueness of elements, similar to a `HashSet`, but also want to keep track of the order in which elements were added.

---

### TreeSet

- **Definition**: `TreeSet` stores elements in a sorted tree structure, ensuring that the elements are always sorted according to their natural ordering or a specified comparator.

- **Characteristics**:
  - **Sorted Order**: Elements are stored in a sorted order, either by natural ordering or alphabetical order.
  - **Uniqueness**: Like any `Set`, `TreeSet` does not allow duplicates.
  - **Performance**: The operations like `add`, `remove`, and `contains` are faster due to the underlying tree structure.

- **Example with Strings**:
  ```java
  TreeSet<String> colors = new TreeSet<>();

  colors.add("red");
  colors.add("blue");
  colors.add("green");
  colors.add("yellow");

  for (String color : colors) {
      System.out.println(color); // Prints: blue, green, red, yellow (Sorted order)
  }
  ```
  - **Output**:
    ```
    blue
    green
    red
    yellow
    ```

- **Example with Integers**:
  ```java
  TreeSet<Integer> values = new TreeSet<>();

  values.add(12);
  values.add(43);
  values.add(1);
  values.add(5);

  for (Integer value : values) {
      System.out.println(value); // Prints: 1, 5, 12, 43 (Sorted order)
  }
  ```
  - **Output**:
    ```
    1
    5
    12
    43
    ```

- **Example with Custom Objects (`Person`)**:
  ```java
  class Person implements Comparable<Person> {

      String name;
      int age;

      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      @Override
      public String toString() {
          return name + " " + age;
      }

      @Override
      public int compareTo(Person other) {
          return name.compareTo(other.name); // Alphabetical order
      }
  }

  TreeSet<Person> people = new TreeSet<>();

  people.add(new Person("John", 43));
  people.add(new Person("Mary", 34));
  people.add(new Person("Bob", 52));
  people.add(new Person("Stela", 22));

  for (Person person : people) {
      System.out.println(person); // Prints people in alphabetical order of their names
  }
  ```
  - **Output**:
    ```
    Stela 22
    Mary 34
    John 43
    Bob 52
    ```

  - **Custom Sorting**: In the example above, the `Person` class implements `Comparable<Person>` with a custom `compareTo` method that sorts `Person` objects by their name in alphabetical order. This demonstrates how `TreeSet` can be used to store custom objects with a specified sorting order.

- **Use Cases**:
  - Ideal for scenarios where elements need to be naturally ordered or sorted by custom criteria.

---

### Summary of Differences

| Feature            | LinkedHashSet                    | TreeSet                               |
|--------------------|----------------------------------|---------------------------------------|
| **Order**          | Maintains insertion order        | Maintains natural or custom sort order|
| **Duplicates**     | No duplicates allowed            | No duplicates allowed                 |
| **Null Elements**  | Allows a null element            | Does not allow null elements          |
| **Use Case**       | When insertion order matters     | When sorted order matters             |

- **Understanding contains()**:
  ```java
  System.out.println(colors.contains("red")); // true
  System.out.println(colors.contains("Red")); // false (case-sensitive)
  ```

  - **Explanation**: The `contains` method checks if the set contains the specified element. It is case-sensitive, meaning `"red"` and `"Red"` are considered different elements.

---

### Best Practices

- Use `LinkedHashSet` when you need both uniqueness and insertion order preservation.
- Use `TreeSet` when you need uniqueness along with elements to be sorted automatically.
- Always implement `Comparable` for custom objects when using `TreeSet`.
