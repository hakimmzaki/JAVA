#### JShell
- can execute operations that has multiple [[101 JAVA#Operators]]
- good because it gives immediate feedbacks
- supports history.
- doesnt need to end lines with semicolon.
- separate multiple statements with semicolon;
- /exit loses all your stored variables
- expressions u made, the value will be assigned to a variable. normally $.
	- ex jshell> 3 * 2
	$2 ==> 6
	$2 is the new variables assigned to the value of 3 * 2 



### Jshell Commands

##### System.out.println() 
print out the value in the parantheses
##### Math.random() 
does not accept any parameters, requires parantheses.
##### System.out.printf()
allows formatting and printing values from expressions
can be used to calculate values, and printed out with .println()

ex: 
	System.out.printf("%d + %d + %d =%d", 5, 6, 7, 5+6+7).println()
	5 + 6 + 7 =18 
		the %d should be defined after the double quotes, multiple values are separated with commas.

	jshell will tell u when u dont feed enough arguments to be given to %d (format arguments)
	
	jshell will only take the first (in order of writing) values to be fed to the modifiers (%d) 
	ex: jshell> System.out.printf("%d + %d + %d" , 5, 6, 7, 8).println()
	5 + 6 + 7
	 in this example, the value of 8 is ignored.

%d is for integers 
%s is for strings
%f is for floating values (contains decimal points)

ex:
	jshell> System.out.printf("%s", "Hello World!").println()
	Hello World
##### if() 
followed by the statement in parantheses 
if (condition)
.. > statement
the statement will only execute if the condition is met.
an if condition can only have 1 statement for it.
to put multiple statements, use [[101 JAVA#Blocks]] :
ex:
	jshell> i = 3            
	i ==> 3
	ex: jshell> if (i<5)                                              // if condition
	   ...> System.out.println("i is less than 5")        // if statement
		i is less than 5
		jshell> int i = 6 
	i ==> 6  
	jshell> if (i== 5)                                                                              //if condition
	...> System.out.println("i is odd");System.out.println("i is prime") //if statement
	i is prime          // this is still getting printed be
	
	cause [[101 JAVA#Blocks]] wasnt used.

[[Exercises#JShell if() :]]


##### for ()
for(initialisation;condition;update)
statement;
initialisation // only executed once, can have (>1) statements
condition    // the condition is checked everytime,  (=1) statement only
update        // executed until the condition no longer fulfills, can (>1) statements 
 ex:                                                            // dont forget [[Variables#DECLARATION]]
	jshell> for(i=1; i<=10;i++){                             //(initialisation;condition;update)
	   ...>     System.out.printf("%d * %d = %d", 5, i, 5 * i).println();   // statement;
	   ...> }                                                               //close bracket 
	5 * 1 = 5                                                            
	5 * 2 = 10
	5 * 3 = 15
	5 * 4 = 20
	5 * 5 = 25
	5 * 6 = 30
	5 * 7 = 35
	5 * 8 = 40
	5 * 9 = 45
	5 * 10 = 50
[[Exercises#JShell for ()]]
##### /methods
display a list of defined methods
##### /save
saves the current session into a specified file
ex: /save backup.txt 
##### /list 
returns the defined method as a whole (body,declaration)
##### /edit
open a JShell editor, to easily edit the method
### Shortcuts : 
use Up and Down arrow to go thru your history
Ctrl+A :takes  to the start of the line
Ctrl+E :takes to the end of the line
Ctrl+R : search
Ctrl+C : to break an infinite loop