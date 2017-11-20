/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dtmanager;

/**
 *
 * @author LENOVO
 */
public interface Messenger {
    //A method to return an appropriate String Message according to a given condition.
    public void GenerateMessage(int[] Result);
    //A method that prepares a given message for display o the graphical User interface.
    public void DisplayMessage();
}
