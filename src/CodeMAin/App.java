package CodeMAin;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App {
    private JPanel PanelMain;
    private JTextArea txtDisplay;
    private JButton btnclick;
    private JLabel lblMax;
    private JLabel lblMin;

    String listnum = "";


    public App() {

        txtDisplay.setEditable(true);

        Random rng = new Random();


        btnclick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int[] array = new int[10];
                for (int i = 0; i < array.length; i++){
                    array[i] = rng.nextInt(99+1 );
                    listnum = listnum + Integer.toString(array[i]) +"\n";
                }
                txtDisplay.setText(listnum);
                int maxValue = array[0];
                for(int i=1;i < array.length;i++){
                    if(array[i] > maxValue){
                        maxValue = array[i];
                    }
                }
                lblMax.setText("The Max is: " + Integer.toString(maxValue));
                //max value stuff

                int minValue = array[0];
                for(int i=1;i < array.length;i++){
                    if(array[i] < minValue){
                        minValue = array[i];
                    }
                }
                lblMin.setText("The Min is: "+ Integer.toString(minValue));
                //min value stuff
            }
        });

    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
