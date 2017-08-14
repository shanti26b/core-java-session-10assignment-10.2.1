/*  here i am showing Create a java program where only declared class of a package will be accessible
 * 
 * If we use fully qualified name then only we can declare  the class of this package will be 
 * accessible.
 * here there is no need to import. but we have to use fully qualified name every time when  access the class or interface
 * It is generally used when two packages have same class name e.g. java.util and java.sql packages contain Date class.
 */

package mypackages;    // here i am creating package name as mypackages

public class Music {     // here i am created class name as Music
	
	public static void main (String []args){    //and it is the main method
		
System.out.println(" the playing music");     //  prints the playing the music

		mypackages2.Rintone music = new mypackages2.Rintone(); //here created fully qualified name to access the object of the class Music from package as packagesdemo
              
		music.voice();  
		         //displays the get methods for the objects provided
		
	  music.dail();  // and get  method for one object as music.dail
	  
	  music.call();    // and  get method for another object as music.call
	  
	}



		
	}


