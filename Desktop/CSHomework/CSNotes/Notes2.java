// ram: random access memory
// stores state of program as it is running
// int x = 3;
// int y = 4;
// x = y;
// y = 6;
// s.o.pln(x)
// s.o.pln(y)
// when you declare a variable in x, java will carve out exact size of 
// int(4bytes)
// String s = "Hello";
// String s2 = "Bye";
// s1 = s2;
// s2 = "hi!"
// s.o.p(s1);
// s.o.p(s2);
// for strings, the memory, once set equal to each other, arrow goes to assigned location
// String s1 = "hello";
// String s2 = "IO.readString();
// if(s1==s2)
// s.o.p("Yayyyyyyyyyyy");
// equality operator means something completely different in terms of reference types
// what are they referencing? (==) 
// when working with referencing types, s1.equals(s2);
// nulness vs emptiness:
// string s1;
// string s2;
// what happens in memory?
// nullness = idea that when you declare a reference type without assigning it to anything, 
//it is referencing nothing. idea of nothing is called nothing, called null. 
// int x = s1.length();
// s1 does not exist, length of nothing does not exist.
// "null pointer exception"
// nothingness vs emptiness in regards to string
// string s2 = "";
// points to emptiness, but still a string
// can not call subroutines on null
// inexof and substring
// "hello".indexof("llo")
// returns 2
// llo is found at 2
// 