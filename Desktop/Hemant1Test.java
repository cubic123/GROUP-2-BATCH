Last login: Tue Jun 11 11:09:48 on ttys000
Srijanas-Air:~ Hemant$ git clone https://github.com/hemantdahal/GROUP-2-BATCH.git
fatal: destination path 'GROUP-2-BATCH' already exists and is not an empty directory.
Srijanas-Air:~ Hemant$ ls
Applications			MacKeeper Backups
Assignment-3			Movies
Assignment-4			Music
Black Horse.pages		Pictures
Demojava			Public
Desktop				Second.class
Documents			cubic
Downloads			eclipse
FirstJavaProgram_Sagar.class	eclipse-workspace
FirstJavaProgram_Sagar.java	hemantrepo3
GROUP-2-BATCH			java1234
GROUP2				second.java
Library
Srijanas-Air:~ Hemant$ cd Desktop/
Srijanas-Air:Desktop Hemant$ ls
Aws folder	GROUP-2-BATCH	HemantTest.java	Test.java
Srijanas-Air:Desktop Hemant$ cd GROUP-2-BATCH/
Srijanas-Air:GROUP-2-BATCH Hemant$ ls
Assignment-3	Assignment-4	GROUP2		README.md
Srijanas-Air:GROUP-2-BATCH Hemant$ git pull
remote: Enumerating objects: 47, done.
remote: Counting objects: 100% (47/47), done.
remote: Compressing objects: 100% (34/34), done.
remote: Total 44 (delta 16), reused 30 (delta 8), pack-reused 0
Unpacking objects: 100% (44/44), done.
From https://github.com/cubic123/GROUP-2-BATCH
   563d9a4..9ceec72  master     -> origin/master
Updating 563d9a4..9ceec72
Fast-forward
 Assignment-4                 |   1 +
 Assignment-5                 |  15 +++++++++++++++
 Assignment5/Test             |   0
 FirstJavaProgram.class       | Bin 0 -> 688 bytes
 FirstJavaProgram.java        |  11 +++++++++++
 FirstJavaProgram_Sagar.class | Bin 0 -> 454 bytes
 FirstJavaProgram_Sagar.java  |   6 ++++++
 GROUP2                       |   4 ++--
 Javaprogram1.txt             |   5 +++++
 cubic/GROUP-2-BATCH          |   1 +
 cubic/Second.class           | Bin 0 -> 439 bytes
 cubic/Second.java            |   6 ++++++
 12 files changed, 47 insertions(+), 2 deletions(-)
 create mode 100644 Assignment-5
 create mode 100644 Assignment5/Test
 create mode 100644 FirstJavaProgram.class
 create mode 100644 FirstJavaProgram.java
 create mode 100644 FirstJavaProgram_Sagar.class
 create mode 100644 FirstJavaProgram_Sagar.java
 create mode 100644 Javaprogram1.txt
 create mode 160000 cubic/GROUP-2-BATCH
 create mode 100644 cubic/Second.class
 create mode 100644 cubic/Second.java
Srijanas-Air:GROUP-2-BATCH Hemant$ ls
Assignment-3			FirstJavaProgram_Sagar.class
Assignment-4			FirstJavaProgram_Sagar.java
Assignment-5			GROUP2
Assignment5			Javaprogram1.txt
FirstJavaProgram.class		README.md
FirstJavaProgram.java		cubic
Srijanas-Air:GROUP-2-BATCH Hemant$ cd Assignment5
Srijanas-Air:Assignment5 Hemant$ ls
Test
Srijanas-Air:Assignment5 Hemant$ vi Test
Srijanas-Air:Assignment5 Hemant$ javac Test.java
error: file not found: Test.java
Usage: javac <options> <source files>
use --help for a list of possible options
Srijanas-Air:Assignment5 Hemant$ touch HemantTest.java
Srijanas-Air:Assignment5 Hemant$ ls
HemantTest.java	Test
Srijanas-Air:Assignment5 Hemant$ vi HemantTest.java
Srijanas-Air:Assignment5 Hemant$ rm HemantTest.java
Srijanas-Air:Assignment5 Hemant$ ls
Test
Srijanas-Air:Assignment5 Hemant$ touch Hemant1Test
Srijanas-Air:Assignment5 Hemant$ vi Hemant1Test

class Hemant1Test{
public static void main(String args []){
System.out.println("Hello Hemant");
}
}

~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
~                                                                               
-- INSERT --
