## Java Module Day 18 - Lesson Notes & Code! :)

### LinkedHashMap

   - **Definition**: `LinkedHashMap` is a hash table and linked list implementation of the `Map` interface. It maintains a doubly-linked list running through all its entries to preserve the order of insertion.
   - **Insertion Order**: The main feature of `LinkedHashMap` is that it maintains the order of elements as they are inserted. When you iterate over a `LinkedHashMap`, the entries will appear in the order they were added.
   - **Internal Working**:
     - `LinkedHashMap` extends `HashMap`, and its implementation is very similar, but it adds the linked list feature to maintain insertion order.
     - The linked list does add a small overhead to each entry, but this overhead is generally minimal compared to the benefit of maintaining order.
   - **Performance**:
     - **Time Complexity**:
       - `get()`, `put()`, and `remove()` operations are faster, similar to `HashMap`.
       - The linked list management incurs a slight overhead, but it is negligible for most practical purposes.
     - **Memory Usage**: Slightly higher than `HashMap` due to the maintenance of the linked list.
  
   - **Code Example**:
     ```java
     Map<Integer, String> months1 = new LinkedHashMap<>();

     months1.put(1, "January");
     months1.put(9, "September");
     months1.put(12, "December");

     for(Map.Entry<Integer, String> entry : months1.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
     }
     ```
     - **Output**:
       ```
       1: January
       9: September
       12: December
       ```
   - **Use Cases**:
     - When you need to maintain the order of elements based on their insertion sequence.
     - For caching implementations where the order of insertion or access needs to be preserved.
     - Ideal for scenarios where predictable iteration order is required.

---

### TreeMap

   - **Definition**: `TreeMap` is a `Map` implementation that stores its entries in a Red-Black tree, a self-balancing binary search tree. This ensures that the keys are always sorted in natural order or according to a provided `Comparator`.
   - **Sorted Order**: Unlike `LinkedHashMap`, `TreeMap` sorts the keys either by their natural order (for example, ascending order for integers) or according to a custom comparator provided at map creation.
   - **Internal Working**:
     - `TreeMap` is based on a Red-Black tree.
   - **Performance**:
     - **Time Complexity**:
       - `get()`, `put()`, and `remove()` operations are slower.
       - Sorting comes at the cost of slightly slower performance compared to `HashMap` and `LinkedHashMap`.
     - **Memory Usage**: Higher than `HashMap` but comparable to `LinkedHashMap`.
  
   - **Code Example**:
     ```java
     Map<Integer, String> months2 = new TreeMap<>();

     months2.put(11, "November");
     months2.put(2, "February");
     months2.put(3, "March");

     for(Map.Entry<Integer, String> entry : months2.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
     }
     ```
     - **Output**:
       ```
       2: February
       3: March
       11: November
       ```
   - **Use Cases**:
     - When you need a map that maintains a sorted order of its keys.
     - For tasks that require range-based queries (e.g., finding all entries with keys within a certain range).
     - Ideal when ordering of keys is a critical aspect of the application logic, such as in scheduling, routing, or financial systems.

### Custom Objects in TreeMap Using Comparable Interface

   - **Comparable Interface**:
     - This interface defines a single method, `compareTo()`, which allows objects of a class to be compared to one another.
     - When an object implements `Comparable`, it provides a natural order for sorting.
   - **TreeMap with Custom Objects**:
     - When using `TreeMap` with custom objects as keys or values, those objects must implement `Comparable`, or you must provide a `Comparator` when constructing the `TreeMap`.
     - Without a natural order or comparator, the `TreeMap` will throw a `ClassCastException` at runtime.
   
   - **Code Example**:
     ```java
     class Student implements Comparable<Student> {
         Integer id;
         String name;

         public Student(Integer id, String name) {
             this.id = id;
             this.name = name;
         }

         @Override
         public String toString() {
             return id + " " + name;
         }

         @Override
         public int compareTo(Student other) {
             return name.compareTo(other.name);
         }
     }

     TreeMap<Integer, Student> students = new TreeMap<>();
     students.put(1, new Student(107, "John"));
     students.put(2, new Student(102, "Diana"));
     students.put(3, new Student(103, "Elton"));

     System.out.println(students);
     ```
     - **Output**:
       ```
       {1=107 John, 2=102 Diana, 3=103 Elton}
       ```
   - **Key Points**:
     - In this example, the `Student` class implements `Comparable` to sort `Student` objects by their names.
     - `TreeMap` uses the `compareTo` method for its sorting logic. If names were different, they would appear in alphabetical order.

---

### Differences Between LinkedHashMap and TreeMap

| Feature            | LinkedHashMap                   | TreeMap                         |
|--------------------|---------------------------------|---------------------------------|
| **Order**          | Maintains insertion order       | Maintains natural/sorted order  |
| **Implementation** | Hash table with linked list     | Red-Black tree                  |
| **Memory Usage**   | Slightly higher than `HashMap`  | Comparable to `LinkedHashMap`   |
| **Null Keys**      | Supports one null key           | Does not support null keys      |
| **Usage**          | When insertion order matters    | When key sorting is required    |

---

### Summary

- **LinkedHashMap**: Ideal when you need to maintain the order of elements based on their insertion sequence and require constant-time performance for basic operations.
- **TreeMap**: Best suited for scenarios where you need the map to be sorted according to the natural order of keys or a custom comparator. It provides logarithmic time complexity for common operations but does not allow null keys.
