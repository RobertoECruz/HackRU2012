// 8:10-9:30
// Arc 103
// break;
// they can only exit out of the closest loop that they are assigned in 
// continue;
// continue will bring you back to conditional
// a continue statement within a nested loop will return to the loop which in its contained
// characters behave in non-intuitive ways
// character variables can be created like: char var;
// it declares a variable of type char
// a literal type char: 'a'
// single quotes represent a character literal
// char a = 'b';
// ^ this says that char a is 'b'
// if you mean to include a character literal use single quotes!
// what can you do with characters?
// var = a;
// if(a == 'a')
// a is not equal to a because a = 'b'
// so the answer of if(a == 'a') is false
// if(var > 'b')
// does var come later in the alphabet than b?
// but the problem is 'b' is a character literal not a letter in the alphabet
// so the answers of if(var > 'b') is false
// int p = 'b'
// since a character is a number, it is acceptable to store
// p as a 98, the value of the character literal 'b'
// int p = '3'
// where '3' = 51 = int p
// char var = 65;
// this does not work because:
// char var = (char) var2;
// must do an error check first
// char from 0-255. <--- Range
// this implicitly casted var2 as a char
// lower case a: someone is filling out a forum online
// if someone stores a name in double case, different variables
// char var 2 = 'b'
// char var = 'B'
// if (var == var2)
// false becomes 66 is not equal to 98
// lower case to upcase
// low - 32 = upcase
// upcase + 32 = low
// java has a library named character that lets you do certain things to chars
// java char api(application programmer interface)
// isDigit: determines if specific char is a digit
// char var = '3'
// if(Character.isDigit(var){
// is var a number?
// var is not a number, it is
// char var = 'b'
// var = Character.toUppercase(var)
// var is now B
// isLetter returns to true if the letter is a letter (if char is a letter)
// strings:
// a string is a bunch of characters "glued" together
// String str;
// str = "Hello";
// double quotes = string literal
// strings are not a primitive type
// they are a reference type
// in java, a reference type is different because it allows us to do special things
// int len = str.length();
// what does it mean for length to be an instance method?
// String s2 = "bye";
// S2.length();
// can use it on a variable that is a string
// int len2 = S2.length();              int is stored as 3!
// strings are reference types that are "immutable": 
// can not be changed!
// str = str.toUpperCase();
// if they are immutable, then you can't change any of the letters
// because they are immutable, the new values of the string will be 
// returned back to you
// charAt(int, index) returns the char value at the specified index
// take a string from the print every character from the string on a different lin
// int v = 64;
//char a = (char)v;
//string s = "hello";
// s = s + c;
// primitive types: just data
// int v = 64; (only thing associated with v is 64.)
// reference types are not just data associated with strings,
// String s = "hello";
// class is another name for reference type, data and operations associated with it
// paraentheses are used to represent subroutines
// 