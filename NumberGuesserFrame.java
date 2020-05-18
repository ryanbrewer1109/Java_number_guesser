import javax.swing.JFrame;    
import javax.swing.JButton;
import javax.swing.JTextField;  
//import javax.swing.JLabel;
import java.awt.FlowLayout; 

class NumberGuesserFrame extends JFrame{

   //private JLabel label_1;
   //private JLabel label_2;

   private JTextField userGuessField;
   private JButton startBtn;

   NumberGuesserFrame(){
      super("Program #6 - Number Guessing Game");
      setLayout(new FlowLayout()); 
      setSize(600,450);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      startBtn = new JButton("Start");
      userGuessField = new JTextField(4);
      label_1 = new JLabel(line_1);
      add(startBtn, FlowLayout.LEFT_TO_RIGHT);
      add(userGuessField, FlowLayout.LEFT_TO_RIGHT);
      add(label_1, FlowLayout.LEFT_TO_RIGHT;
      add(label_2, FlowLayout.LEFT_TO_RIGHT);
      } // end 2-parameter constructor                                                    
            
} // end NumberGuesserFrame class 
