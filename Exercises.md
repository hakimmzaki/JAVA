

#### [[Variables]]
1. Create three integer variables a,b & c. Create a statement for printing sum of three variables.
   Modify value of a. print value of a+b+c. modify value of b. print value of a+b+c.
answer>		 
	jshell>int a =2
	  a==> 2
	 	jshell> int b = 3
	 b ==> 3
	 jshell> int c = 5
	   c ==> 5  
	  jshell> System.out.printf("%d + %d + %d=%d", a,b,c,a+b+c).println()
	 2 + 3 + 5=10 
	 jshell> int a = 5
	 a ==> 5   
	 jshell> System.out.printf("%d + %d + %d=%d", a,b,c,a+b+c).println()
	 5 + 3 + 5=13 
	 jshell> int b = 7
	 b ==> 7 
	 jshell> System.out.printf("%d + %d + %d=%d", a,b,c,a+b+c).println()
	 5 + 7 + 5=17 


#### [[JShell#if()]]:  
1. Have four variables a,b,c,d and create an if statement to print if a + b is greater than c + d.
answer: 
	jshell> int a = 10
	a ==> 10
	jshell> int b = 20
	b ==> 20
	jshell> int c = 25
	c ==> 25
	jshell> int d = 15

	d ==> 15
	jshell> if (a+b>c+d)
	   ...> System.out.println(a+b > c+d)
	jshell> c = 5
	c ==> 5
	jshell> if (a+b>c+d)
	   ...> System.out.println(a+b > c+d)
	true
	jshell> if (a+b>c+d)
	   ...> System.out.println("a+b > c+d")
	a+b > c+d

2. Have three angles of a triangle stored in three variables angle1, angle2, angle3. Create an if statement to state if the three angles can form a triangle. Hint: angle1+angle2+angle3 = 180
answer: 
	jshell> int angle1=90
	angle1 ==> 90
	jshell> int angle2=45
	angle2 ==> 45
	jshell> int angle3=45
	angle3 ==> 45
	jshell> if (angle1+angle2+angle3 == 180)
	   ...> System.out.println ("Valid Triangle")
	Valid Triangle

3. Have a variable called number. Create an if statement to find if it is an even number. Hint : % operator.
answer:
	jshell> number = 20
	number ==> 20
	jshell> if (number % 2 == 0)
    ...> System.out.println("Even Number")
	Even Number
	jshell> number = 20
	number ==> 20
	jshell> if (number % 2 = 0)                          // Here i used the wrong #operators 
	   ...> System.out.println("even number")
		Error:
			|  unexpected type                                  
			|    required: variable
			|    found:    value
			|  if (number % 2 = 0) 
			|      ^--------^
	jshell> if (number % 2 == 0)                      // Used the correct #operators here
	   ...> System.out.println("even number")
	even number
	jshell> number = 25
	number ==> 25
	jshell> if (number % 2 == 0)
	   ...> System.out.println("even number")

### [[JShell#for ()]]

1. Multiplication table of 7. 
answer
	int i = 5                             // [[Variables#DECLARATION]]
	i = 5
	jshell> for( i=1; i<=10; i++){
	   ...>     System.out.printf(" %d * %d = %d", 7, i, 7 * i).println();
	   ...> }
	 7 * 1 = 7
	 7 * 2 = 14
	 7 * 3 = 21
	 7 * 4 = 28
	 7 * 5 = 35
	 7 * 6 = 42
	 7 * 7 = 49
	 7 * 8 = 56
	 7 * 9 = 63
	 7 * 10 = 70

2. Multiplication table of 6 and 10
answer for 6 :
	jshell> int i = 1                                          // [[Variables#DECLARATION]]
	i ==> 1
	jshell> for( i=1; i<=10; i++){
	   ...>     System.out.printf(" %d * %d = %d", 6, i, 6 * i).println();
	   ...> }
	6 * 1 = 6
	 6 * 2 = 12
	 6 * 3 = 18
	 6 * 4 = 24
	 6 * 5 = 30
	 6 * 6 = 36
	 6 * 7 = 42
	 6 * 8 = 48
	 6 * 9 = 54
	 6 * 10 = 60
answer for 10 : 
	int i = 5                                 // [[Variables#DECLARATION]]
	jshell> for( i =1; i<=10; i++){                                               ...>     System.out.printf(" %d * %d = %d", 10, i, 10 * i).println();
	   ...> }
	 10 * 1 = 10
	 10 * 2 = 20
	 10 * 3 = 30
	 10 * 4 = 40
	 10 * 5 = 50
	 10 * 6 = 60
	 10 * 7 = 70
	 10 * 8 = 80
	 10 * 9 = 90
	 10 * 10 = 100

3. Print numbers from 1 to 10
answer: 
	jshell> int i = 1
	i ==> 1
	jshell> for(i=1; i<=10; i++){
	   ...>     System.out.printf(" %d ", i).println();
	   ...> }
	 1
	 2
	 3
	 4
	 5
	 6
	 7
	 8
	 9
	 10

4. print numbers from 10 to 1
answer: 
	jshell> int i = 1
	i ==> 1
	jshell> for(i=10; i>=1; i--){
	   ...>     System.out.printf(" %d ", i).println();
	   ...> }
	 10
	 9
	 8
	 7
	 6
	 5
	 4
	 3
	 2
	 1
1. print squares of first 10 numbers.
answer: 
	jshell> int i = 1
	i ==> 1
	jshell> for (i=1; i<=10; i++){
	   ...>     System.out.printf("%d * %d = %d", i, i, i * i ).println();
	   ...> }
	1 * 1 = 1
	2 * 2 = 4
	3 * 3 = 9
	4 * 4 = 16
	5 * 5 = 25
	6 * 6 = 36
	7 * 7 = 49
	8 * 8 = 64
	9 * 9 = 81
	10 * 10 = 100

6. Print squares of first 10 even numbers
answer:
	jshell> int i =1
	i ==> 1
	jshell> for(i=2;i<=20; i=i+2){
	   ...>     System.out.printf("%d * %d = %d",i,i,i *i).println();
	   ...> }
	2 * 2 = 4
	4 * 4 = 16
	6 * 6 = 36
	8 * 8 = 64
	10 * 10 = 100
	12 * 12 = 144
	14 * 14 = 196
	16 * 16 = 256
	18 * 18 = 324
	20 * 20 = 400

8. print squares of first 10 odd numbers.
answer: 
	jshell> int i =1
	i ==> 1
	jshell> for ( i=1; i<=20;  i = i+2 ) {
	   ...>     System.out.printf(" %d * %d = %d", i, i, i * i).println();
	   ...> }
	 1 * 1 = 1
	 3 * 3 = 9
	 5 * 5 = 25
	 7 * 7 = 49
	 9 * 9 = 81
	 11 * 11 = 121
	 13 * 13 = 169
	 15 * 15 = 225
	 17 * 17 = 289
	 19 * 19 = 361



### [[101 JAVA#Methods]] 
1. Create sayHelloWorldThrice() and execute.
Ans: 
	jshell> void sayHelloWorld3(){
   ...>     System.out.println("Hello World");
   ...>     System.out.println("Hello World");
   ...>     System.out.println("Hello World");
   ...> }
	|  created method sayHelloWorld3()

	jshell> sayHelloWorld3()
	Hello World
	Hello World
	Hello World


2. Create a method which prints four statements and execute it ; 
	- i've created my first variable
	- i've created my first method
	- i've created my first loop
	- i'm excited to learn JAVA
answer: 
	jshell> void imLearningJavaYep(){
   ...>     System.out.println("I've created my first variable");
   ...>     System.out.println("I've created my first method");
   ...>     System.out.println("I've created my first loop");                                                              ...>     System.out.println("I'm excited to learn JAVA");
   ...> }
	|  created method imLearningJavaYep()

	jshell> imLearningJavaYep()
	I've created my first variable
	I've created my first method
	I've created my first loop
	I'm excited to learn JAVA

3. Create a method - printNumbers (int n) to print number from 1 to n!
answer: 
	jshell> void printNumbers(int noOftimes){
   ...>     for(i=1; i<=noOftimes; i++){                                                                                   ...>         System.out.println( i);
   ...>     }
   ...> }
	|  created method printNumbers(int)

	jshell> printNumbers(10)
	1
	2
	3
	4
	5
	6
	7
	8
	9
	10

4. Create a method - printSquaresOfNumbers (int n) to print squares of numbers from 1 to n!
answer:
		jshell> void printSquaresOfNumbers(int noOfTimes){
   ...>     for(i=1; i<= noOfTimes; i++){
   ...>         System.out.printf("%d*%d = %d", i, i, i * i).println();
   ...>     }
   ...> }
		|  created method printSquaresOfNumbers(int)

		jshell> printSquaresOfNumbers(5)
		1*1 = 1
		2*2 = 4
		3*3 = 9
		4*4 = 16
		5*5 = 25

5. Method to return sum of three numbers         // no longer using void.
answer: 
	jshell> int sumOf3Numbers (int a, int b, int c){
   ...>     int sum = a + b + c;
   ...>     return sum;
   ...> }
	|  created method sumOf3Numbers(int,int,int)

	jshell> sumOf3Numbers (5, 11, 23)
	$29 ==> 39

6. Given two angles, write a method to return the third angle in a triangle
answer:
	jshell> int calculateThirdAngle(int angle1,int angle2){
   ...>     int angle3 = 180 - (angle1 + angle2);
   ...>     return angle3;
   ...> }
	|  created method calculateThirdAngle(int,int)
	jshell> calculateThirdAngle( 90, 20)
	$2 ==> 70                                                          // angle3 returned as variable $2