/*
* This Java source file was generated by the Gradle 'init' task.
*/
package pizzixp;
//Usually you will require both swing and awt packages
// even if you are working with just swings.
import java.util.Scanner;
import java.awt.Toolkit;
class App
{
    public static void main(String args[]) 
    {
        new MainMenu();
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
        Toolkit.getDefaultToolkit().beep();
    }

}
