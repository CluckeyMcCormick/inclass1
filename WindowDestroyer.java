/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass1;

/**
 *
 * @author nicolas.fredrickson1
 */
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
If you register an object of this class as a listener to any
object of the class JFrame, the object will end the program
and close the JFrame, if the user clicks the JFrame's
close-window button.
*/
public class WindowDestroyer extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}

