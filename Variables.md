 [[Variables]] are something that the value can change over the lifetime of the program.

Type name = value
example of variables
	int i = 1
	i ==>1 
	int number2 =10
	number2 ==>10

##### DECLARATION
(giving variable a value for the 1st time)
>jshell> int number2 =25
 >number2 = 25

##### ASSIGNMENT 
(assigning values to the variables on the left side)
left hand side should always be variable. 
right hand side can have both variable and value.
>jshell>number2=100
>number2==> 100
>jshell> number2 = 150
>number2 ==>150


Example:
	jshell> System.out.printf("%d * %d =%d", 5, number2, 5*number2).println()
	 5 * 2 =10

[[Exercises#Variables]]
  
any new variables that is made in jShell will get the value of 0.
u can only use variables after declaring it see : [[#DECLARATION]]

4 Things about Variables.
#### Variables & Memory 
#### Naming Variable 
* Combination of letters, numbers, $ and underscore ( _ )
* Cannot start with number
* Cannot be keyword       // 
* No limit on length of identifier
* CamelCase                     // each word starts with Uppercase, first word is excluded.

### Variable Types

* byte b = 5; //8 bits 
* short s=128; //16 bits 
* int i =40000; //32 bits 
* long l = 222222222; //64 bits
* float f= 4.0f; //32 bits (not very precise)
* double d = 67.0 //64bits (not very precise)
* char c = 'A'; //16bits '\\u0000' to '\\uffff
* Boolean isTrue =false; //true or false

### [[#ASSIGNMENT]]  Operators
is used to populate a value into a variable
Incremental 
	{jshell> number2++   
	$12 ==> 150             
	jshell> number2
	number2 ==> 151
Decremental
	 jshell> number2--     
	$14 ==> 151
	jshell> number2
	number2 ==> 150
Compound 
	jshell> int i = 2
	i ==> 2
	
	jshell> i=i+2
	i ==> 4
	jshell> i+=2
	$18 ==> 6

	jshell> i-=1
	$19 ==> 5

	jshell> i*=5
	$20 ==> 25

	jshell> i
	i ==> 25

	jshell> i/=4
	$22 ==> 6

	jshell> i%=2
	$23 ==> 0
