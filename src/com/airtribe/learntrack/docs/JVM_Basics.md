## What is JDK, JRE, JVM

JDK - Java Development Kit (JDK) is a cross-platform software development kit that provides tools and libraries needed to build Java-based applications and applets.

JRE - Java Runtime Environment (JRE) is an open-access software distribution that includes a Java class library, specific tools, and a separate JVM. In Java, it’s one of the main components of the Java Development Kit (JDK).

JVM - The Java Virtual Machine (JVM) is a core component of the Java Runtime Environment (JRE) that allows Java programs to run on any platform without modification. JVM acts as an interpreter between Java bytecode and the underlying hardware, providing Java’s famous Write Once, Run Anywhere (WORA) capability

## What is bytecode

Bytecode is an intermediate, platform-independent code generated when a .java file is compiled into a .class file. This bytecode is executed by the Java Virtual Machine (JVM), enabling Java’s Write Once, Run Anywhere principle.

## What does “write once, run anywhere” mean

JVM(Java Virtual Machine) acts as a run-time engine to run Java applications. JVM is the one that actually calls the main method present in Java code. JVM is a part of the JRE(Java Runtime Environment). Java applications are called WORA (Write Once Run Anywhere). This means a programmer can develop Java code on one system and can expect it to run on any other Java-enabled system without any adjustment. This is all possible because of JVM.

How Java is WORA: In traditional programming languages like C, C++ when programs were compiled, they used to be converted into the code understood by the particular underlying hardware, so If we try to run the same code at another machine with different hardware, which understands different code will cause an error, so you have to re-compile the code to be understood by the new hardware. In Java, the program is not converted to code directly understood by Hardware, rather it is converted to bytecode(.class file), which is interpreted by JVM, so once compiled it generates bytecode file, which can be run anywhere (any machine) which has JVM( Java Virtual Machine) and hence it gets the nature of Write Once and Run Anywhere.