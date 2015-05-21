/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gamepkg;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aa
 */
public class TimerClass extends Thread {
  
        JButton btnGuess;
        JButton btnStart;
        JLabel lblTime;
        int i;
        GamePanel2 obj;
        
        public TimerClass(JButton btnGuess,JButton btnStart,JLabel lblTime,GamePanel2 obj)
        {
            this.obj=obj;
            this.lblTime=lblTime;
            this.btnStart=btnStart;
            this.btnGuess=btnGuess;
            
        }

        
       @Override
       public void run()
       {
         
            for(i=0;i<=5;i++ )
            {
                lblTime.setText("00:0"+i);
                
                if(i==5)
                {
                
                    lblTime.setText("00:0"+i);
                    JOptionPane.showMessageDialog(null, "Time over");
                    i=0;
                    obj.setTurns();
                    btnStart.setEnabled(true);
                    btnGuess.setEnabled(false);
                    break;

                }
          
          
           
                try 
                {
                    Thread.sleep(1000);
                } 

                catch (InterruptedException ex)
                {            
                    //====== sout   
                }
           
           }
            
             
       }
}
