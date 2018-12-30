/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp;

import javax.swing.JOptionPane;

/**
 *
 * @author mt
 */
public class exceptionrule {
     public exceptionrule() 
        {
        
    }
   /* public exceptionrule(String s) {
        super(s);
    }*/

   public int checkPositive(String x) {
        int number;
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter a Positive Number for " + x + " !"));
            if (number < 0) {
                JOptionPane.showMessageDialog(null, "Not a valid Input for Positive Int Try Again");
            }
        } while (number < 0);

        return number;
    }
   public String checkname(){
       String name;
       int i;
       do {
       name=JOptionPane.showInputDialog("Enter a new name for the process!");
       i=0;
       for(int j=0;j<ready_queue.processes.size();j++){
           if(name.equals(ready_queue.processes.get(j).get_pro_name()))
           {
               JOptionPane.showMessageDialog(null, "Redundant process name");
              i++; 
              break;
           }
       }
        } while (i!=0);

        return name;
        }
   }
   

