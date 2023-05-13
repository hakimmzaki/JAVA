[Java Programming for Complete Beginners | Udemy](https://www.udemy.com/course/java-programming-tutorial-for-beginners/)
[[Exercises]] 
Java installed on C:\\Program Files\\Java
This tutor is teaching java using [[Eclipse JAVA IDE]].
### Good Java Practices
- ####### refactoring                        
	 restructuring the code without changing functionality
		 ex : from  unfactored![[MultiplicationTableUnfactored.java]]
		 to factored![[MultiplicationTable.java]]
### JAVA Commands
- java                                             // to run java class files
- javac                                           //to compile files with .java extension
### Literals
- numeric value 
- 7 is an integer literal
- 7.5 is decimal literal
- 8 * 5 is an expression
- statements are sometimes made of expressions 

### Class
- is a template
- can be used to create instances and multiple instances of the same class
	- ex : 
	 jshell> class Planet {
   ...> }
	|  created class Planet
		
		jshell> Planet Earth = new Planet ()
		Earth ==> Planet@6d5380c2

		jshell> Planet Mars = new Planet ()
		Mars ==> Planet@2328c243
	
		jshell> Planet Jupiter = new Planet ()
		Jupiter ==> Planet@7a4f0f29

		jshell> Planet Venus = new Planet ()
		Venus ==> Planet@2077d4de
- to call [[#Methods]] on a class, use the object in the class, not the class itself.
	ex:
	jshell> Malaysia.soon()                                  /// Malaysia is an object of a class
	Coming Soon 
### Methods 
- A named block of code that performs a specific task and can be called multiple times
- a name given to a set line of codes
- case-sensitive
- Java has pre-defined methods, 
- same rules as [[Variables#Naming Variable]]
- if returntype = void is not gonna return anything
- if theres a return, it can only return one value.
- the syntax is ReturnType nameOfTheMethod () {
  //Body of the method
   }
	 Ex:
		  jshell> void sayHelloWorld2(){                   //[[Variables#DECLARATION]]
		   ...>     System.out.println("Hello World");  // Body (what the method does)
		   ...>     System.out.println("Hello World");  // also known as defining 
		   ...> }                                                           
		|  created method sayHelloWorld2()            
[[Exercises#101 JAVA Methods]]

this is called [[#Operators]] .

### Operators
simple example : 8 * 5
	* is the operators
	8 and 5 is the operants.
	==  is comparison operator
	= is [[Variables#ASSIGNMENT]] operator
	the multiplication symbol in JAVA is * not X.

% (mode) which means to give the remainder of which after the number is divided by the given value
	ex: 5%2 = 1

[[JShell]] can execute operations that has multiple operators.
BODMAS takes precedence in java operations
[[JShell#Jshell Commands]]

escape character (\\) is used to tell JAVA to include the quote.
	usage : put \\ before "
	ex: System.out.println("hello\\"world\\"")

comma is used to separate between multiple values

  * [[#Strings]] are used to represent texts
  * [[Variables]] are something that the value can change over the lifetime of the program.
  
### Strings
are used to represent texts
Strings : "" (double quotes)
anything thats between the double quotes are called string literals

###### CONCATENATION
ex: 
> jshell> "1" +2 +3
> $1 = "123"
> jshell> "1"+(2+3)
> $2 = "15"




## Conditionals
a condition returns a #boolean value
this is called condition
	jshell> i = 10 
	i ==> 10
	jshell> i < 5
	$8 ==> false

#### Blocks
#Blocks { }
typically used in programming language, starts with { and ends with }.
using blocks is a good practice, even if there's only one statement
	Example: jshell> if (i == 5){
	   ...> System.out.println("i is odd"); System.out.println("i is prime");
	   ...> }
	i is odd
	i is prime



