

# 1. Breaking The Surface 



## 1. The Way Java Works 

 *** The goal is to write one application (in this example, an interactive party invitation) and have it **

**work on whatever device your friends have.***



![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248099.png.jpg)



![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248101.png.jpg)



## 2. What you’ll do in Java

**You’ll type a source code file ->  compile it using the `javac` compiler, -> run the compiled bytecode on a Java virtual machine using `java `**



![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248103.png.jpg)

![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248105.png.jpg)

## 3. Code structure in Java

![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248117.png.jpg)

**Put a class in a source file.**

**Put methods in a class.**

**Put statements in a method.**

**What goes in a source file?**

Ans: Class





A **source code file (with the *.java* extension)** holds one ***class*** definition. The class represents a *piece* of your program, although a very tiny application might need just a single class. The class **must go within a pair of curly braces**.



![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248119.png.jpg)

## 4. Anatomy of a class

**When the JVM starts running**, it looks for the class you give it at the command line. The*** it starts looking for  main method that looks exactly like:**

```java
// this is the entry point of the application. 
// in must be in a class.
//  Every Java application has to have at least one **class**, and at least one **main** method
public static void main (String[] args) {  
    
    // your code goes here
}
```

 Every Java application has to have at least one **class**, and at least one **main** method (**not one main per *class***; just **one main per *application***).

## 5. Writing a class with a main

In Java, everything goes in a **class**. You’ll type your **source code** file (with a *.java* extension), then **compile** it **into** a new **class file (with a *.class* extension)**. When you run your program, you’re really running  **class file** .



***The main() method is where your program starts running.***



![compilation](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248127.png.jpg)

![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248129.png.jpg)

## 6 .DATA TYPES

Java is **a strongly typed** language  there are **eight *primitive types***. This means that **every variable must have a declared type**.  **Four of them are integer types( whole numbers )** . 



Two are floating-point number types(decimal numbers);; 

one is the character type `char`

 one is a `boolean` type for truth values.

### 6.1 Integer Types

The integer types are for **numbers without fractional parts**. **Negative values are allowed**. Java provides the **four integer types** shown in

<table class="top">
<thead>
<tr>
<td class="borderbc"><p class="table"><strong>Type</strong></p></td>
<td class="borderbc"><p class="table"><strong>Storage Requirement</strong></p></td>
<td class="borderbc"><p class="table"><strong>Range (Inclusive)</strong></p></td>
</tr>
</thead>
<tbody>
<tr>
<td class="borderb"><p class="table"><code>int</code></p></td>
<td class="borderb"><p class="table">4 bytes</p></td>
<td class="borderb"><p class="table">–2,147,483,648 to 2,147,483,647 (just over 2 billion)</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>short</code></p></td>
<td class="borderb"><p class="table">2 bytes</p></td>
<td class="borderb"><p class="table">–32,768 to 32,767</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>long</code></p></td>
<td class="borderb"><p class="table">8 bytes</p></td>
<td class="borderb"><p class="table">–9,223,372,036,854,775,808 to 9,223,372,036,854,775,807</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>byte</code></p></td>
<td class="borderb"><p class="table">1 byte</p></td>
<td class="borderb"><p class="table">–128 to 127</p></td>
</tr>
</tbody>
</table>

#### Note 

1. Long integer numbers have a suffix L or l (for example, ``` long a = 4000000000L;```).
2. Starting with Java 7, you can write numbers in binary, with a prefix `0b` or `0B`. For example, `0b1001` is 9
3. Also starting with Java 7, you can add underscores to number literals, such as `1_000_000` (or `0b1111_0100_0010_0100_0000`) to denote one million. The underscores are for human eyes only. The Java compiler simply removes them.







### 6.2 Floating-Point Types

**The floating-point types denote numbers with fractional parts**. The two floating-point types are shown in table

<table class="top">
<thead>
<tr>
<td class="borderbc"><p class="table"><strong>Type</strong></p></td>
<td class="borderbc"><p class="table"><strong>Storage Requirement</strong></p></td>
<td class="borderbc"><p class="table"><strong>Range</strong></p></td>
</tr>
</thead>
<tbody>
<tr>
<td class="borderb"><p class="table"><code>float</code></p></td>
<td class="borderb"><p class="table">4 bytes</p></td>
<td class="borderb"><p class="table">Approximately ±3.40282347E+38F (6–7 significant decimal digits)</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>double</code></p></td>
<td class="borderb"><p class="table">8 bytes</p></td>
<td class="borderb"><p class="table">Approximately ±1.79769313486231570E+308 (15 significant decimal digits)</p></td>
</tr>
</tbody>
</table>

#### 1. Special Float-Point Value Type



there are three special floating-point values to denote overflows and errors:

- Positive infinity
- Negative infinity
- NaN (not a number)

For example, the result of dividing a positive number by 0 is positive infinity. Computing 0/0 or the square root of a negative number yields ```NaN``.



#### 2. Note

<strong>Note</strong>

The constants `Double.POSITIVE_INFINITY`, `Double.NEGATIVE_INFINITY`, and `Double.NaN` (as well as corresponding `Float` constants) represent these special values, but they are rarely used in practice. In particular, **you cannot test**

```java
if (x == Double.NaN) // is never true
```

to check whether a particular result equals `Double.NaN`. All “not a number” values are considered distinct. However, you can use the `Double.isNaN` method

```java
if (Double.isNaN(x)) // check whether x is "not a number"
```



###  6.3  Char Type

Literal values of type `char` are enclosed in single quotes. For example, `'A'` is a character constant with value 65( google Asci Table for more information ). 

there are several escape sequences for special characters, as shown in.



<table class="top">
<thead>
<tr>
<td class="borderbc"><p class="table"><strong>Escape Sequence</strong></p></td>
<td class="borderbc"><p class="table"><strong>Name</strong></p></td>
<td class="borderbc"><p class="table"><strong>Unicode Value</strong></p></td>
</tr>
</thead>
<tbody>
<tr>
<td class="borderb"><p class="table"><code>\b</code></p></td>
<td class="borderb"><p class="table">Backspace</p></td>
<td class="borderb"><p class="table"><code>\u0008</code></p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>\t</code></p></td>
<td class="borderb"><p class="table">Tab</p></td>
<td class="borderb"><p class="table"><code>\u0009</code></p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>\n</code></p></td>
<td class="borderb"><p class="table">Linefeed</p></td>
<td class="borderb"><p class="table"><code>\u000a</code></p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>\r</code></p></td>
<td class="borderb"><p class="table">Carriage return</p></td>
<td class="borderb"><p class="table"><code>\u000d</code></p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>\"</code></p></td>
<td class="borderb"><p class="table">Double quote</p></td>
<td class="borderb"><p class="table"><code>\u0022</code></p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>\'</code></p></td>
<td class="borderb"><p class="table">Single quote</p></td>
<td class="borderb"><p class="table"><code>\u0027</code></p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>\\</code></p></td>
<td class="borderb"><p class="table">Backslash</p></td>
<td class="borderb"><p class="table"><code>\u005c</code></p></td>
</tr>
</tbody>
</table>

###  6.4 The `boolean` Type

The `boolean` type has two values, `false` and `true`. It is used for evaluating logical conditions. You **cannot convert between** integers and `boolean` values.



## 7. Variables 

###  1. VARIABLES AND CONSTANTS

As in every programming language, variables are used to store values. Constants are variables whose values don’t change



### 2.Declaring Variables

In Java, every variable has a *type*. You declare a variable by placing the **type first**, followed by the n**ame of the variable**. Here are some examples:

```java
double salary;
int vacationDays;
long earthPopulation;
boolean done;
```

Notice the **semicolon at the end of each declaration**. The **semicolon is necessary** because a declaration is a complete Java statement, and **all Java statements end in semicolons**.

A variable name must begin with a letter and must be a sequence of letters or digits. 

 *All* characters in the name of a variable are significant and ***case is also significant**.* The length of a variable name is essentially unlimited.

You also **cannot use a Java reserved word as a variable name.**

You can declare multiple variables on a single line:

```java
int i, j; // both are integers
```

### 3. Initializing Variables

After you declare a variable, **you must explicitly initialize it** by means of an assignment statement—you ca**n never use the value of an uninitialized variable**. For example, the Java compiler flags the following sequence of statements as an error:

````java
int vacationDays;
System.out.println(vacationDays); // ERROR--variable not initialized
````

You assign to a previously declared variable by using the variable name on the left, an equal sign (`=`), and then some Java expression with an appropriate value on the right.

```java
int vacationDays;
vacationDays = 12;
```

You can both **declare and initialize a variable on the same line**. For example:

```java
int vacationDays = 12;
```

Finally, in Java **you can put declarations anywhere in your code**. For example, the following is valid code in Java:

```java
double salary = 65000.0;
System.out.println(salary);
int vacationDays = 12; // OK to declare a variable here
```

####  1. Note:

**starting with Java 10**, you do not need to declare the types of local variables if they can be inferred from the initial value. Simply use the keyword `var` instead of the type:

```java
var vacationDays = 12; // vacationDays is an int
var greeting = "Hello"; // greeting is a String
```



### 4. Constants

In Java, you use the keyword `final` to denote a constant. For example:



```java
public class Constants
{
   public static void main(String[] args)
   { 
       // naming convention is all upper case  seperate by _
      final double CM_PER_INCH = 2.54;
      double paperWidth = 8.5;
      double paperHeight = 11;
      System.out.println("Paper size in centimeters: "
         + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
   }
}
```



The keyword final indicates that you can assign to **the variable once, and then its value is set once and can't be changed**. It is **customary to name constants in all uppercase.**



### 5. Conversions between Numeric Types

It is often necessary to convert from one numeric type to another. graph below shows the legal conversions.

![Images](https://learning.oreilly.com/library/view/core-java-volume/9780135167199/graphics/03fig01_56.jpg)

The **six solid arrows in graph  denote conversions without information loss**. **The three dotted arrows denote conversions that may lose precision**. For example, a large integer such as 123456789 has more digits than the float type can represent. When the integer is converted to a float, the resulting value has the correct magnitude but loses some precision.

```java
int n = 123456789;
float f = n; // f is 1.23456792E8
```

When two values are combined with a binary operator (such as `n + f` where `n` is an integer and `f` is a floating-point value), both operands are converted to a common type before the operation is carried out.

- If either of the operands is of type `double`, the other one will be converted to a `double`.
- Otherwise, if either of the operands is of type `float`, the other one will be converted to a `float`.
- Otherwise, if either of the operands is of type `long`, the other one will be converted to a `long`.
- Otherwise, both operands will be converted to an `int`.



#### 1. Casts

In the preceding section, you saw that `int` values are automatically converted to double values when necessary. On the other hand, there are obviously times when you want to **consider a double as an integer. **Numeric conversions are possible in Java, but of course **information may be lost**.

It is  done by means of **casts**. The syntax for casting is to give the target type in parentheses, followed by the variable name. For example:

```java
double x = 9.997;
int nx = (int) x; // nx = 9  because casting a floating-point value to an integer discards the fractional part.
```

### 6.Combining Assignment with Operators

There is a convenient shortcut for using binary operators in an assignment. For example,

```java
x += 4;
```

is equivalent to

```java
x = x + 4;
```

(In general, place the operator to the left of the = sign, such as *= or %=.)

### 7.  Increment and Decrement Operators

Programmers, of course, know that one of the most common operations with a numeric variable is to add or subtract 1.

Java has both increment and decrement operators: `n++` adds 1 to the current value of the variable `n`, and `n--` subtracts 1 from it. For example, the code

```java
int n = 12;
n++;
```

changes `n` to `13`. Since these operators change the value of a variable, they cannot be applied to numbers themselves. For example, `4++` is not a legal statement.

There are two forms of these operators; you’ve just seen the postfix form of the operator that is placed after the operand. There is also a prefix form, `++n`. Both change the value of the variable by 1. The difference between the two appears only when they are used inside expressions. The prefix form does the addition first; the postfix form evaluates to the old value of the variable. Example

```java
int m = 7;
int n = 7;
int a = 2 * ++m; // now a is 16, m is 8
int b = 2 * n++; // now b is 14, n is 8
```

We recommend against using ++ inside expressions because this often leads to confusing code and annoying bugs.

### 8. Relational and `boolean` Operators

Java has the full complement of relational operators. To test for equality, use a double equal sign, `==`. For example, the value of

```java
3 == 7 //false
```

is `false`.

Use a != for inequality. For example, the value of

```java
3 != 7 //true
```

is `true`.

Finally, you have the usual `<` (less than), `>` (greater than),` <= `(less than or equal), and `>=` (greater than or equal) operators.



Java  uses` && `for the **logical “and”** operator and `||` for the logical **“or” operator**. As you can easily remember from the != operator, **the exclamation point ! is the logical negation operator**. The `&&` and `||` operators are evaluated in **“short circuit” fashion**: **The second argument is not evaluated if the first argument already determines the value**. If you combine two expressions with the && operator,

```java
expression1 && expression2
```

and the **truth value of the first expression has been determined to be false**, then it is **impossible for the result to be true**. Thus, **the value for the second expression is not calculated**. This behavior c**an be exploited to avoid errors.** For example, in the expression

```java
x != 0 && 1 / x > x + y // no division by 0
```





**the second part is never evaluated** if `x` equals zero. Thus, `1 / x` is not computed if `x` is zero, and no divide-by-zero error can occur.

Similarly, **the value of expression1 || expression2 is automatically true if the first expression is true, without evaluating the second expression.**

Finally, Java supports the **ternary ?: operator** that is occasionally useful. The expression

```java
condition ? expression1 : expression2
```

evaluates to the first expression if the condition is `true`, to the second expression otherwise. For example,

```java
x < y ? x : y
```

gives the smaller of `x` and `y`.



### 9. Parentheses and Operator Hierarchy

If no parentheses are used, operations are performed in the hierarchical order indicated. Operators on the same level are processed from left to right, except for those that are right-associative, as indicated in the table. For example, `&&` has a higher precedence than `||`, so the expression.

<table class="top">
<thead>
<tr>
<td class="borderbc"><p class="table"><strong>Operators</strong></p></td>
<td class="borderbc"><p class="table"><strong>Associativity</strong></p></td>
</tr>
</thead>
<tbody>
<tr>
<td class="borderb"><p class="table"><code>[] . ()</code> (method call)</p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>! ~ ++ -- +</code> (unary) <code>-</code> (unary) <code>()</code> (cast) <code>new</code></p></td>
<td class="borderb"><p class="table">Right to left</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>* / %</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>+ -</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>&lt;&lt; &gt;&gt; &gt;&gt;&gt;</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>&lt; &lt;= &gt; &gt;= instanceof</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>== !=</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>&amp;</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>^</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>|</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>&amp;&amp;</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>||</code></p></td>
<td class="borderb"><p class="table">Left to right</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>?:</code></p></td>
<td class="borderb"><p class="table">Right to left</p></td>
</tr>
<tr>
<td class="borderb"><p class="table"><code>= += -= *= /= %= &amp;= |= ^= &lt;&lt;= &gt;&gt;= &gt;&gt;&gt;=</code></p></td>
<td class="borderb"><p class="table">Right to left</p></td>
</tr>
</tbody>
</table>

```java
a && b || c
```

means

```java
(a && b) || c
```

Since `+=` associates right to left, the expression

```java
a += b += c
```

means

```java
a += (b += c)
```



### 10. Basic String(Will come back latter)

Conceptually, Java strings are sequences of characters.

```java
String e = ""; // an empty string Note it is double quote 
String greeting = "Hello";
```



#### 1. Testing Strings for Equality

To test whether two strings are equal, use the `equals` method. The expression

```java
s.equals(t);
```

returns `true` if the strings `s` and `t` are equal, `false` otherwise. Note that `s` and `t` can be string variables or string literals. For example, the expression

```java
"Hello".equals(greeting)
```



is perfectly legal. To test whether two strings are identical except for the upper/lowercase letter distinction, use the `equalsIgnoreCase` method.

```java
"Hello".equalsIgnoreCase("hello")
```

**Do *not*** use the `==` operator **to test whether two strings are equal**



## 11. If Else 

Java supports the usual logical conditions from mathematics:

- Less than: a < b
- Less than or equal to: a <= b
- Greater than: a > b
- Greater than or equal to: a >= b
- Equal to a == b
- Not Equal to: a != b

You can use these conditions to perform different actions for different decisions.

Java has the following conditional statements:

- Use `if` to specify a block of code to be executed, if a specified condition is true
- Use `else` to specify a block of code to be executed, if the same condition is false
- Use `else if` to specify a new condition to test, if the first condition is false
- Use `switch` to specify many alternative blocks of code to be executed

Use the `if` statement to specify a block of Java code to be executed if a condition is `true`.

```java
//Syntax
if (condition) {
  // block of code to be executed if the condition is true
}
```

**Note that `if` is in lowercase letters. Uppercase letters (If or IF) will generate an error.**

In the example below, we test two values to find out if 20 is greater than 18. If the condition is `true`, print some text:

```java
if (20 > 18) {
  System.out.println("20 is greater than 18");
}
```

[Run](https://www.w3schools.com/java/showjava.asp?filename=demo_if)

We can also test variables:

```java
int x = 20;
int y = 18;
if (x > y) {
  System.out.println("x is greater than y");
}


```

[Run](https://www.w3schools.com/java/showjava.asp?filename=demo_if2)

In the example above we use two variables, `x` and `y`, to test whether x is greater than y (using the `>` operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

#### 1.Else 

Use the `else` statement to specify a block of code to be executed if the condition is `false`.

```java
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```

Example

```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "Good evening."
```

In the example above, time (20) is greater than 18, so the condition is `false`. Because of this, we move on to the `else` condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".

#### 2. Else If

Use the `else if` statement to specify a new condition if the first condition is `false`.

```java
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```



Example:

```java
int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 20) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// Outputs "G
```

In the example above, time (22) is greater than 10, so the **first condition** is `false`. The next condition, in the `else if` statement, is also `false`, so we move on to the `else` condition since **condition1** and **condition2** is both `false` - and print to the screen "Good evening".

However, if the time was 14, our program would print "Good day."

#### 3. Short Hand If...Else (Ternary Operator)

There is also a short-hand if else, which is known as the **ternary operator** because it consists of three operands. It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:

Syntax:

```java
variable = (condition) ? expressionTrue :  expressionFalse;
```

Instead of writing:

```java
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
```

You can simply write:

```java
int time = 20;
String result = (time < 18) ? "Good day." : "Good evening.";
System.out.println(result);

```







# 2.Classes and Objects

![image with no caption](https://learning.oreilly.com/library/view/head-first-java/0596009208/httpatomoreillycomsourceoreillyimages2248125.png.jpg)







