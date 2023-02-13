//  Java package is a group of similar types of classes, interfaces and sub-packages.
// Package in java can be categorized in two form, built-in package and user-defined package.
// There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

// 1) User-defined packages:-
                    //These are the packages that are defined by the user. First we create a directory myPackage (name should be same as the name of the package). 
                    // Then create the MyClass inside the directory with the first statement being the package names.

// 2) Built-in Packages:-
// These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are:
// 1) java.lang: Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported.
// 2)  java.io: Contains classed for supporting input / output operations.
// 3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations.
// 4)  java.applet: Contains classes for creating Applets.
// 5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
// 6)  java.net: Contain classes for supporting networking operations.


// Advantage of Java Package
// 1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.

// 2) Java package provides access protection.

// 3) Java package removes naming collision.




// 1) Package naming conventions : Packages are named in reverse order of domain names, i.e., org.geeksforgeeks.practice. For example, in a college, the recommended convention is college.tech.cse, college.tech.ee, college.art.history, etc.


// 2) Adding a class to a Package : We can add more classes to a created package by using package name at the top of the program and saving it in the package directory. We need a new java file to define a public class, otherwise we can add the new class to an existing .java file and recompile it.

// 3) Subpackages: Packages that are inside another package are the subpackages. These are not imported by default, they have to imported explicitly. Also, members of a subpackage have no access privileges, i.e., they are considered as different package for protected and default access specifiers.
// Example :-
// import java.util.*;
// util is a subpackage created inside java package.
