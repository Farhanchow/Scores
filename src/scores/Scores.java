/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scores;

/**
 *
 * @author MD FARHAN CHOWDHURY
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Scores {
    private static int i;
    private static int score;
    private static int average;
    private static int TotalScores;
    private static int n;
    private static List<Integer> ListOfScores;
    private static Random randomNumbers = new Random();
    
    public static void main (String[] atgs ) {
        String numberOfStudents = 
                JOptionPane.showInputDialog("How many students?");
        n = Integer.parseInt(numberOfStudents);
        
        ListOfScores = new ArrayList<Integer>();
        for (i = 1; i <= n; i++) {
            String ScoresOfStudents = 
                    JOptionPane.showInputDialog("Please now Enter score for student # " + i);
            score = Integer.parseInt(ScoresOfStudents);
            ListOfScores.add(score);
            TotalScores += score;
            average = TotalScores / n;
        }
        background();
    }
    public static void background () {
        Date date = new Date();
        JFrame application = new JFrame();
        JPanel panel = new JPanel();
        Color color = new Color (randomNumbers.nextInt(256), (randomNumbers.nextInt(256)), 
        (randomNumbers.nextInt(256))); //To generate at random
        panel.setBackground(color);
        JLabel jlabel = new JLabel("The number of students: " + n + "\n");
        JLabel jlabel2 = new JLabel("The individual scores of the students: " + ListOfScores + "\n");
        JLabel jlabel3 = new JLabel("The total scores of all students: " + TotalScores + "\n");
        JLabel jlabel4 = new JLabel("The average score of all students: " + average + "\n");
        JLabel jlabel5 = new JLabel(date.toString());
        panel.add(jlabel);
        panel.add(jlabel2);
        panel.add(jlabel3);
        panel.add(jlabel4);
        panel.add(jlabel5);
        application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        application.setSize (350, 350); // To display everything nice 
        application.add(panel);
        application.setVisible(true);
    }
}

        
    

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
//}
