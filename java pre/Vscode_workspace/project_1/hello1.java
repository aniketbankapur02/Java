//here i am making package using java compiler by forcly command it
// first compile class and then compile package
// 1) javac hello1.java
// 2) javac -d . hello1.java
// also you can give that same file path as class path to Jvm java -cp path classname in fomrat pack.sub-pack1.sub-pack2...classname

/*
 PS C:\code\prog_lang\Vscode_workspace\project_1> javac -d ./com/ecommerce hello1.java
PS C:\code\prog_lang\Vscode_workspace\project_1> java -cp  ./com/ecommerce mypack.Simple5

PS C:\code\prog_lang\Vscode_workspace\project_1> java -cp  .  mypack.Simple5
Error: Could not find or load main class mypack.Simple5
Caused by: java.lang.ClassNotFoundException: mypack.Simple5
PS C:\code\prog_lang\Vscode_workspace\project_1> java -cp  ./com/ecommerce mypack.Simple5
Hello Java

---- latest
PS C:\code\prog_lang\java\java pre\Vscode_workspace\project_1>  javac -d . hello1.java  
PS C:\code\prog_lang\java\java pre\Vscode_workspace\project_1> java -cp . mypack.Simple5
Hello Java
 */

//a package folder is created and in that this simple5 is present 
// now you have to give class to JVM for running access it by package.subpackage.subpackage.....last.class_name
//java mypack.Simple5
package mypack;
class Simple5{  
    public static void main(String args[]){  
     System.out.println("Hello Java"); 
      
    }  
}  
