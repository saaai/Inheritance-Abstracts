
public interface MyInterface {
	
	int a = 10;
	
	// In Interface:

	//we can call this in another subclass by using MyInterface.a .
	     		//since it's static we need to have static method there in sub class.
	//started at 1250 pm
	
	//only instance variable, can't create local variable becos there's no method body to create local variable
	//if its  a non static instance variable we have to create a object to call it, but we can't create an object in interfaces.
	//So, now how to access this w/o creating object in the interface? by implementing it in the another class.
	/*
	 * first we need to find the structure of the class, 
	 * to find the structure of the class we need to do it in the cmd prompt and access it using command javap "Filename".
	 * internally int a= 10; it's mentioned as public static final int a;
	 * public means we can access the method or variable or class anywhere
	 * static means w/o creation of the class or object we can access the property. 
	 * 			which mean i can directly give MyInterface.a
	 * final means that's it it is final, we can't change it it means it acts like a constant.
	 * 
	 * So, when u r creating instance variable in the interface by default
	 * 			 all the instance variables are going to be public static final. So, u can't change them.
	 * 
	 * coming to methods, internally by default all the methods we create in the interface are going to change to public abstract.
	 *  
	 * In abstract class:
	 * 
	 * if it's abstract method we need to add abstract key word and there can't be any body
	 * if it's non - abstract method don't need to add abstract key word and we have to add body
	 *
	 * note: whatever changes we make even the minor one's the eclipse will be compiling the program internally always.
	 *in bin folder we get the auto compiled program only.
	 * 
	 *
	 * when we give instance variable in the abstract class:
	 *  when we check the structure of the abstract class file in the cmd prompt, 
	 * 		we find there are no additional keywords attached to it like they were added in the interface file 
	 * 			ex: final, static , public
	 *  	
	 * In the abstract class when we declare a variable as final,
	 * 	 	then we cannot increment that(means Calling) variable inside the normal method using "this" keyword, because it wont allow any kind of editing. 
	 * ex: public abstract class Calculator{
	 *  final int a=10;
	 *   float calculate(inta, int b)
	 * 	{
	 * 		S.o.p("Inside calculator.calculate()");
	 * 		this.a++;
	 * 		return a+b;
	 * 	}
	 * }
	 *  normally, we can call the variable using this."VariableName", but the variable has been declared as final so we can't change it or edit it.
	 * 
	 * static : if u don't want to create an object to access any property of a class then u have to use static
	 * 			suppose if u want to use instance variable inside the the static method then
	 * 			 we use static keyword for the instance variable and make it available for the static method for calling using the class name as reference.
	 * 
	 * final: you just can't edit it inside the method when calling it.
	 * 
	 * for methods also we can use final variable and for classes also we can use final variable.
	 * 
	 * when your'e using "final" for the method then it can't be changed or edited anywhere else like when calling it in the sub classes or anywhere else,
	 * 	 except it can be changed or edited in the same class file where final has be declared.
	 *  ex:
	 *  
	 *  final float calculate (int a , int b)//float method
	 *  when creating final method it will allow u to change anything only here in this class file and in this code. 
	 *	{
	 *	System.out.println("Inside Calculator.calculate()we wrote calculate() to mean calculate method");
	 *	int  c = a+b;
	 *	return c;
		}
	 * 
	 * the intention of using abstract keyword is we used abstract to implement it later but not right now.
	 * 
	 * abstract and final keywords can't be used together.
	 * abstract and static keywords also can't be used together.
	 * 
	 * abstract class can't be final because is incomplete, because the methods are not complete in the other sub classes.
	 * 
	 * the class can be either abstract or final it can't be both, So final class can't be used for abstract class.
	 * 
	 * final can't be used even for abstract methods also,
	 * 
	 * 		int a =10;
	 *		float b = 20;
	 *   we can't store value of b in a 
	 *   we can store value of a in b, because the float value is bigger than int value.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * CollectioFrameWork:
	 * 
	 * collection is nothing but a group of elements.
	 * what are the draw back s of array?
	 * ans: arrays store single data type
	 * 		arrays size is not dynamic, means once u declare an array u can't increase the size or u can'tshrink the size.
	 *  
	 *  by considering the drawbacks of arrays they came up with collection frame work:
	 *  
	 *  collection is nothing but a group objects,
	 *   it will only store objects within the collection object,
	 *   	it can't store primitive data types(character, float, int, long) values.
	 * 
	 * collection will only store a group of objects with in the collection object .
	 * 
	 * if you go one time you have to get the data in a single chunk itself.
	 * 
	 * when in a network or any communication you have to pass some data, 
	 * 		you will grouping the data together and sending the grouped object only.
	 * 
	 * ex:
	 * obj1 
	 * obj2
	 * obj3
	 * obj4 
	 * we have 4 objects and we need to move all of them from one place to another place or from one class to another class.
	 * 	instead of sending obj1 once, obj2 next and obj3 in the third iteration, obj4 in the fourth iterations, 
	 * 		we can be wrapping everything together by using the collection object,
	 *			so in this collection object you will be adding obj1, obj2, obj3, obj4 
	 *				now by adding all these four object this will become a single collection object
	 *					you'll be moving this single collection object to another place might be a java program or network transfer
	 *					So, now whoever receives this collectiong object will be fetching the data from this single collection object itself.
	 *	
	 *		-this same thing can be done with arrays also, but using arrays all the objects your keep in the array
	 *			 should only be a single data type.
	 *		-but coming to collection here like, you can give a collection of data types also. 
	 *			it's not mandatory to use a single data type you can keep different data types under one single object 
	 *				and send it anywhere you want or the other party.
	 *
	 * 		-Here different data types means not only the "primitive data types, A class can also be considered as a data type 
	 * 
	 * advantages of collection frame work is:
	 * 
	 * 1) if u want to add one more element you can add one more element to the single collection object set.
	 * 		you can also remove objects if you don't want.
	 * 2) it will be supporting multiple data types.
	 * 
	 * we can group the entire collection object into four interfaces here, 
	 * 		one single interface can have multiple implementation classes,
	 * 			based on the implementation classes we will be using them or dividing them based on our requirement.
	 * 
	 * 
	 * 		interfaces 				|	implementation classes
	 * 	_______________________________________________________________________
	 * 			Set	interface has 	|			hashSet as implementation classes
	 *								|
	 * 								|
	 * 			List	||			|			LinkedList
	 *								|			ArrayList
	 * 								|
	 * 			Queue	||			|			LinkedList
	 * 								|
	 * 								|
	 * 			Map		||			|			HashMap
	 * 								|
	 * 
	 * LinkedList is a multiple inheritance becos it's having List and Queue as parents classes
	 * 
	 * 
	 * set/queue/list/map the purpose is we have to use them for grouping the elements only, 
	 * 		depending on the requirements we will be using whether to go for set or map or queue or list.
	 * 
	 * Now, Set is a group of elements where it won't support duplicates means ex: 123 then size of set is three 
	 * 					then again if u r adding 3 or 2 it wont be increasing the size, but instead it will be overriding with the previous value only.
	 * 
	 * Now, List is a group of elements / collection of objects but this supports duplicate elements.
	 * 	ex: if we add 123 now the size is 3 and again if we add 1 then the size will be increasing to four.
	 * 
	 * Now, Queue will be using internally first in first out(FIFO) mechanism.
	 * 
	 * Now, Map will be expecting "keys" and "values" pair where key should be unique and values can be duplicated.
	 * 			basically, key is like a identifier and value can be duplicates.
	 *				keys is like set and values are like List 
	 *
	 *def: an object that maps keys to values. a map contains duplicate keys, each key can map to at most one value.
	 *
	 * Note: all these classes and interfaces belong java.util package.
	 * 
	 * 
	 * 
	 *    
	 * 
	 * 
	 * 
	 * 
	
	*/
	
	
	boolean login();
	 
	float calculate( );
	
}