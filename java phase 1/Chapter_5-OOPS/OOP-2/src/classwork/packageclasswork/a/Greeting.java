package classwork.packageclasswork.a;
import classwork.packageclasswork.b.Message;
// import classwork.packageclasswork.c.Message;

/*
 The import classwork.packageclasswork.c.Message collides with another import statement
 how to solve and reason why it cannot differentiate 
 
 */

public class Greeting {
    public static void main(String[] args) {
    Message.greet();
    // Message. see i am not able to access package private methods after dot it is not suggesting me to add greetpremimum  
    }
}



/*
 # Solving Import Collision in Java

The error occurs because you're trying to import two different classes with the same name (`Message`) from different packages, which creates ambiguity for the compiler.

## Solutions:

### 1. Use Fully Qualified Names (Recommended)
Instead of importing, use the full package path when referencing the classes:

```java
// No imports needed
classwork.packageclasswork.b.Message messageB = new classwork.packageclasswork.b.Message();
classwork.packageclasswork.c.Message messageC = new classwork.packageclasswork.c.Message();
```

### 2. Import Only One and Use Fully Qualified for the Other
```java
import classwork.packageclasswork.b.Message;

// Then use fully qualified name for the other one
classwork.packageclasswork.c.Message messageC = new classwork.packageclasswork.c.Message();
Message messageB = new Message(); // This refers to the imported one
```

### 3. Use Aliasing (Not natively supported in Java)
Java doesn't support import aliasing directly, but you can create wrapper classes or use static imports for methods.

### Best Practice:
The first solution (using fully qualified names) is generally the clearest approach when you need to use multiple classes with the same name from different packages.

Remember that having classes with the same name in your codebase can lead to confusion, so consider renaming one of the classes if you have control over their source code.
 */


 /*
  # Why Java Can't Distinguish Between Same-Named Imports

You're absolutely right to wonder why Java can't tell the difference since they're from different packages. Here's the explanation:

## The Core Issue

When you write:
```java
import classwork.packageclasswork.b.Message;
import classwork.packageclasswork.c.Message;
```

The problem occurs when you try to use just `Message` in your code. At that point, Java doesn't know which one you mean:

```java
Message msg = new Message(); // Which one? b or c?
```

## Why Java Behaves This Way

1. **Name Collision in Current Scope**: When you import two classes with the same simple name, both become available in your current namespace without their package qualifiers.

2. **Compiler's Perspective**: The compiler sees this as:
   - You've asked to make `classwork.packageclasswork.b.Message` available as just `Message`
   - You've also asked to make `classwork.packageclasswork.c.Message` available as just `Message`
   - Now there are two definitions for `Message` in your current scope

3. **Language Design Choice**: Java was designed this way to:
   - Prevent ambiguity in code
   - Make it immediately obvious when there's a naming conflict
   - Encourage clear, unambiguous references to classes

## What You Can Do

1. **Use fully qualified names** (as in previous answer)
2. **Import only one** and use fully qualified for the other
3. **Restructure your code** to not need both simultaneously
4. **Use different names** for the classes if you control their source

## Analogy

Think of it like having two people named "John" in your contacts:
- You have "John Smith (Accounting)" and "John Doe (Marketing)"
- If you just say "call John" - which one should it call?
- You need to either:
  - Always say "call John Smith" (fully qualified)
  - Or only have one John in your frequent contacts (import only one)
  - Or give them nicknames (not directly possible in Java)
  */



  /*
   # How Java Resolves Fully Qualified Class Names Without Imports

You're asking a great question about how Java can use classes without imports when you specify the **full package path**. Here's how it works:

## How Fully Qualified Names Work Without Imports

1. **Full Package Path is Unique**:
   - `classwork.packageclasswork.b.Message` and `classwork.packageclasswork.c.Message` are completely distinct to Java
   - The compiler doesn't need imports because you're providing the exact location

2. **Comparison to Filesystem**:
   - Think of it like file paths:
     - `C:\FolderA\file.txt` vs `D:\FolderA\file.txt`
     - Even though both end with `file.txt`, the full paths are different
   - Similarly, the full package + class name uniquely identifies each class

3. **What Imports Actually Do**:
   - Imports are just shortcuts to save typing
   - `import a.b.Foo` means "when I say `Foo`, I mean `a.b.Foo`"
   - Without imports, you just type the full path each time

## Why This Works in Your Example

```java
// No imports needed because we're using full paths
classwork.packageclasswork.b.Message messageB = new classwork.packageclasswork.b.Message();
classwork.packageclasswork.c.Message messageC = new classwork.packageclasswork.c.Message();
```

- The compiler sees these as two completely different classes
- No ambiguity exists because the full paths are different
- No "collision" occurs because we're not trying to use the short name `Message`

## When You Must Use Imports

You only need imports when you want to:
1. Use the short class name (`Message` instead of `full.path.Message`)
2. Use static imports (for static methods/fields)
3. Improve code readability (though full paths can sometimes be clearer)

## Best Practice Tip

While using full paths solves the immediate problem, consider:
1. If you control the classes, rename one to avoid confusion (`b.Message` and `c.CustomMessage`)
2. If you don't control them, organize your code to minimize situations where both are needed in the same file
3. Use full paths only when necessary as they make code verbose

----------------------
# How Java Finds Classes Using Fully Qualified Names

When you use a fully qualified class name like `classwork.packageclasswork.b.Message`, Java follows a specific process to locate and load the class. Here's how it works:

## 1. **Classpath Resolution**
Java looks for classes in this order:
- Bootstrap classes (Java's core libraries)
- Extension classes
- User classes (your code and libraries)

For your example, Java searches the classpath for:
```
classwork/packageclasswork/b/Message.class
```

## 2. **File System Mapping**
Package names directly map to directory structures:
- `classwork.packageclasswork.b.Message` → `classwork/packageclasswork/b/Message.class`
- `classwork.packageclasswork.c.Message` → `classwork/packageclasswork/c/Message.class`

## 3. **The Loading Process**
1. **Parsing the Name**: Java splits the fully qualified name at each dot
2. **Directory Traversal**: Starts from classpath roots, navigating through matching directories
3. **Class File Identification**: Looks for a `.class` file with the exact name

## 4. **ClassLoader Hierarchy**
Java uses different classloaders in this order:
1. **Bootstrap ClassLoader**: For Java core classes
2. **Extension ClassLoader**: For extension libraries
3. **System/Application ClassLoader**: For your application classes

## Example Walkthrough
For `new classwork.packageclasswork.b.Message()`:
1. Checks if class is already loaded
2. If not, System ClassLoader searches:
   - Your JAR files
   - `bin/` or `target/` directories
   - Any paths in `-cp` or `CLASSPATH` environment variable
3. Looks for `classwork/packageclasswork/b/Message.class`
4. Verifies the class exists and is valid
5. Loads it into memory

## Key Points
- Fully qualified names avoid ambiguity because they're complete paths
- The physical `.class` file must exist in the correct directory structure
- Classloaders cache loaded classes for performance
- This works the same whether in IDEs or command line (if classpath is set correctly)

This system is why Java can distinguish between two `Message` classes in different packages when you use their full names.

   */