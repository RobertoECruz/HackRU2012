// click cell, reveals flag, or bomb.
// scoring or timer is not important
// Paragraph of gameplay, user does xyz, game reacts abc
// picture before, picture after
// quiz on arrays thursday/reading online.
// second milestone is creating the actual gameplay board that is built.
// put bombs and numbers where you want
// no clicking, just put in coordinates
// method signature: public static void foo(int x, int y)
// static method: dont need an object in order to call it
// void: represents return value(which is nothing)
// foo: name of method
// (int x, int y): variable declarations
// errors: return value expected, no return value
// means you need to give something back at the end of your method
// must return something in every execution path
// when you use equality on a primitive type?
// value of previous type becomes new type, ie: x become a(10) y becomes b(100)
// if you reassign the value after, then the value simply changes
// x becomes 3
// y becomes 4
// how do you get the value of the primitive methods back?
// you must return them!
// methods can return anything
// if a = x in foo: results in error because a is not defined
// what is an array: an array is a series, a data structure. 
// data structure: a way of organizing information 
// we describe arrays as linear data structures:
// minesweeper board: array of arrays
// to access any particular element in an array you need to be able to index the array
// arrays are indexed at 0
// declare an integer array: int[] arr;
// initializion of an array: 
// 1) int[] arr = {1, 2, 3};
// 2) int[] arr2 = new int[_];
// _: represents size of array
// int[] arr2 = new int[3] represents int[] arr = {0, 0, 0};
// String initialization
// String[] sarr = new String[10];
// each one of the elements are going to be null, default value of int = 0
// default value of string = null
// the length of an array looks like this: int len = arr.length;
// length is a property of array(length of an array never changes)
// so int does not require any brackets
// write a method that takes two arrays, int array and string array
// integer represents a channel 
// string represents the network that each channel represents
// channel 2 is cbs
// channel 5 is fox
// channel 7 is abc
// create a lookUp function, given these two arrays along with a #
// returns a network associated with that channel number
// integer array has 2,4,5,7,9
// string array has "cbs","nbc","fox","abc"
// how do you access indexes?
