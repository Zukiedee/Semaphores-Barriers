# Operating Systems Assignment 2: Synchronization
# Part1: Simple Barrier with Semaphores Application

This Application is designed to run using command line terminal on the UNIX operating system. 


## Program explanation of execution:
This program takes in the size of the barrier and number of threads and only releases threads once they equal the size of the barrier, upon which all threads will be released thereafter.  
  
## Compilation procedure:

Run the keyword "make" from your terminal in the directory containing the 
program makefile as well as bin and src folders:

This execution compiles all files with the aid of makefile in the program and redirects them in the bin folder and needs to be executed before the program can run. 

### An example of how to compile the program:
```
	--> make
```

## How to run the program:

Run: ' make run n="arg0" t="arg1" ' 
	- Where the arguments arg0 and arg1 represent the size of the barrier and number of threads respectively. 
	
### An example of how to run the program:
```
	--> make run n="5" t="5"
```
 
## Other commands:
	use "make clean" to clean all the class files from the bin directory.

	--> make clean
  
## Author
```
Zukiswa Lobola
```
