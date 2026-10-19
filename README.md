# Exam2
B section
First javac compiles the code into .class, then JVM will turn it into binary code and run it.
Inheritance happens between UrZokni and TeleportalosUrZokni. (TeleportalosUrZokni inherits from UrZokni). Here public and protected methods are inherited, and can also
be overriden. For example TeleportalosUrZokni overrides cimek(), which changes its implementation defined in the superclass.
Polimorfism happens at UrZokni zokniTwo = new TeleportalosUrZokni("ZOKNIUS MAXIMUS THE SECOND", 10, "THIS"); where UrZokni gets TeleportalosUrZokni, here a cast will
happen, but the overriden methods will have the changed implementation.
