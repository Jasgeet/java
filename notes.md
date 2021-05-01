# Java

## Basics
- A programming language to communicate with the computer
-  Applications
    1. Web Applications
    1. Mobile Applications
    1. Desktop Applications
    1. Web Servers
    1. Embedded Systems
- Software required to run java applications: JRE (Java Runtime Environment)
- Software required to build java applications: JDK (Java Development Kit), includes JRE. Download it. 

## First Program

- Basic java boilerplate:

```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, Its me, Star");
    }
}
```
- What is public?- out of course
- Every java program is wrapped in _Class_
- What is a Class?
- The main function(must have) is form where the program starts executing.
- System.out.println(): is a java function to display some output. 
- The content inside () is what is printed.

### Execution
- Filename and class name should match, and extenstion is _.java_.
- Need to compile before executing. It converts java source code to java byte code.
```
javac HelloWorld.java
```
- After compilation, java class file with _.class_ extension is created. Its this file which is executed without using extension.
```
java HelloWorld
```
- To speed-up java building, compilation and execution, use an IDE.

## Data Types

1. Primitive DTs
    - boolean: true/false
    - int: integer
    - double: decimal number
    - char: single character
```
char favouriteLetter = 'G';
```

1. Reference DTs - used for storing data having more than one character. They also include operations/_methods_ to work on data of their type. See details.
    - Srings: a sequence of characters built using several char datatypes.

```
String firstName = "Star";
```
## Strings
### Methods and operations
> All methods are applied to String identifier/labels
- charAt(\<index>): String data type's operation/method which comes along with it. Returns character at \<index>.

```
String schoolName = "Nature Valley";
char firstLetter = schoolName.charAt(0);
```
- equals(\<string>)

```
String city = "New Delhi";
boolean sameCity = city.equals("Amritsar");
```

- String concatenation: combining 2/more strings.

```
System.out.println("I study in " + schoolName + " " + "School");

Since this is a print operation, strings can be concatenated with non String data types also
```

## Variables
- Are used to name/_label_ data of different data types and use them as labels later in the program.

### Local Variables

### Global variables

## Second Program
- If don't use variables in program, they're greyed out.
- _Accessing a String's particular location_: each character is located at an _index_, ranging from 0 to n - 1, n = total string characters.

## Type Casting
- [Rules](http://www.mathcs.emory.edu/~cheung/Courses/170/Syllabus/04/mixed.html)

## Java Standard Library/ Java Class Library
- A store for various classes such as String, Math, Boolean, Integer.
- java.lang provides standard library. [java.lang](https://www.tutorialspoint.com/java/java_library_classes.htm).


## Scanning input
- To take user's input, create a new _Scanner_ which scans System.in.
- Scanned value gets stored in a variable, having a data type called _Scanner_.
- Scanner data type is used to get the input of all other primitiye and reference DTs.
- To use the data type _Scanner_, you need to include _Scanner_ class present in java.util (utility) package.

```
import java.util.Scanner;

Scanner newGPA = new Scanner(System.in); //This statement doesn't actually take input
```
- We can use the same Scanner variable to input multiple times, even different datatypes. 

### Scanner class methods
- How do we know that the new Scanner variable represents which data type? Use Scanner class's methods to identify data input as a particular data type. The next methods actually take input.

```
GPA = newGPA.nextDouble();
```
- Scanner uses resources, so if not closed, get resource leak warning

```
newGPA.close();
```
- To input a String or Pattern(regex) datatype value without spaces, cursor kept at same line:
```
Scanner input = new Scanner(System.in);
String name = input.next();
```
- To input a String with spaces, also throws cursor on next line:
```
String name = input.nextLine();
```
- To match two strings:

```
<string-name-1>.equals(<string-name-2>)

userAnswer.equals(fullName)
```

- To convert all characters of a string into lowercase

```
<fullName.toLowerCase()>
```

## Flow Control
## Flow Control Diagrams
- Circle represents Start
- Parellelogram, an input or output
- Diamond, a decision

## FLow Control Statements
> Are those which can manipulate the execution flow of the program, which by default is sequential/line by line.
### _If_ Statement/ _If-else_ statements.

### Loops

### While Loop
- Keeps on executing statements while a condition is true
- Syntax

```
while(condition) {
    statements
}
```
- Flow control diagram: start -> diamond(condition) ->true-> parallelogram(I/O/operations) -> diamond ->Flase-> exit.

## Operators
### Relational
1. \>
1. <
1. ==
1. \>=
1. <=
1. !=

## Expressions

1. Boolean expressions: result is true/flase. 

```
Age > 20;
```

## Scope
- Refers to the block contained inside curly braces {} 
- A piece of code/variable declared inside a particular scope is only accessible inside that scope, not outside or in any other scope.

## Errors
- Syntax 
- Logical

## Functions
- Are steps to accomplish a particular task
- Can be called as many times, hence reducing code redundancy
- Help in organizing code in meaningful way
- Defined outside main function, have similar keywords as main function

```
public static void makePBandJSandwich() {}
```
- To use function, call it.

## User Defined Functions
- We define them form scratch

## Built-in Functions
- Pre-included in Java
- Eg: 
```
System.out.println();

.equals(): a function of string

Math.pow() - accepts base and power in double. Math is a part of Java standard library.
```
## Dot operator
- Is used to access a method/____ from ____ on which it is applied.

```
System.out.println();
println() method is accessed from out which is accessed from System class
```


## Parameters
- Are values inside curly brackets () of calling and receiving function.

## Return Types
- Specify that the value that the function will return to the calling function will be of what datatype
- Eg: void, int, double, String
- return keyword is used to send back some value to the calling function

## Classes
- Are user defined units/structures/models which can represent any item.
- They've attributes (properties/ variables) and behaviours(or methods/functions) for that item.
- Eg: item - triangle(class), attributes - base, height, sidelengths; behaviours - findArea(), findTriangleType() - equilateral/isosceles/scaling. Note- here all methods will use attributes of triangle
- Note: attributes are also called _instance variables_. Though we can assign default value at time of their definition, but we use a _constructor_
- Attributes are accessible throughout the class
- Can dedicate a new file to the class and create its instance in main function of another class(better), or create its instance in the same class's main function. 

## Object/Instance of Class
- Is an item which the class represents, and contains all attributes and behaviour of that class.
- Eg: 
```
triangle_A ,triangle_B
```
- How to create objects?

## Constructor
- Every class must have a constructor
- Is a special behaviour/method used to _create_ instances of a class and initialize the attributes with some default value.
- Hence it needs to be called to create an object.
- It returns an instance of the class, but has no return type
- Its name is same as the class name

```
public Triangle() {

}
```
- No static keyword with constructor method as its using the class's attributes.

### This Keyword and Dot Operator
- In parameterized constructors, _this_ keyword represents the attributes of the instance being created by the constructor, while _dot_ operator is used to access that attribute.
- Hence it can distinguish the item's attributes and the parameter names.
- Eg
```
public Triangle(double base, double height, double sideOne, double sideTwo, double SideThree) {
    this.base = base;
    this.height = height;
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
    this.sideThree = sideThree;
}
```

### Calling Constructors
- Call constructors to create a new instance, so steps will be:
    1. Create a new instance using constructor
    1. Store it in a variable
    1. Data type of variable should be the class.
- Eg
```
Triangle triangle_A = new Triangle(6.5, 4.2, 7, 8, 6.5);

Triangle triangle_A = new Triangle(4, 6, 3, 6, 4);
```

## Static Keyword
- If a class's method doesn't use its attributes but still relates to the overall idea of that class then we can use _static_ keyword with that method.

## Methods
- Is a function/behaviour of a class 
- IMP- Types 

### Instance/ Non Static Methods
- Are those which require an instance to be created in order to work.
- ```Triangle_A.findArea()```: findArea() cant work without an instance

### Static/ Class Method
- Are those which operate on the class directly. They don't need an instance to function.
- They don't use class's attributes but still relate with the overall idea of that class.
-  ```Math.pow()```

## Non-Static variables
- Are those instance variables which have different values for different instances of class, just like Non-static methods produce instance-dependent results.
- ```Triangle_A.base```

## Static/Static Class variables 
- Are those variables (not instance variables) which are same for the whole class and don't change their value from instance to instance. They're accessed just like Static Methods using the class's name.
- ```Triangle.numberOfSides```