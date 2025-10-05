# Integer Sorter Program 


![Java](https://img.shields.io/badge/Java-17%2B-blue)
![Status](https://img.shields.io/badge/Build-Passing-brightgreen)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Version](https://img.shields.io/badge/Version-1.0-pink)
![Author](https://img.shields.io/badge/Author-Rylee%20Eliou-ffb6c1)



This program reads integers that are input
from the user, sorts them, and prints out the result as a Stack.  

This program demonstrates **code reuse** by:  
- Using Java Collections Framework ('List', 'Stack', and 'Collections.sort')  
- Factors input and sorting logic into a helper class ('NumberLists')

------ 

## Compile & Run
```bash
cd src  
javac Main.java NumberLists.java  
java Main
```
-----

## Javadoc
```bash
cd src  
javadoc -d doc Main.java NumberLists.java  
open doc/index.html
```
------

## Example:
**Input**:
```text
5  
5 2 9 1 5 
```

**Output**:
```text
Sorted Stack: [1, 2, 5, 5, 9]
```
-------

## Diagram

See attached PDF.
