package lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Main extends JFrame {
    private int madrid;
    private String lastScorerValue;
    private int milan;
    private JButton madridBtn;
    private JButton milanBtn;
    private JLabel lastScorer;
    private JLabel result;
    private JLabel winner;

    public Main(){
        this.madrid = 0;
        this.milan = 0;
        this.lastScorerValue = "N/A";

        setLayout(new BorderLayout());

        this.madridBtn = new JButton("Read madrid");
        this.milanBtn = new JButton("AC Milan");
        this.result = new JLabel();
        this.winner = new JLabel("Winner: DRAW");
        this.lastScorer = new JLabel("Last Scorer: "+lastScorerValue);

        add(madridBtn, BorderLayout.WEST);
        add(milanBtn, BorderLayout.EAST);
        add(lastScorer, BorderLayout.SOUTH);
        add(result, BorderLayout.CENTER);
        add(winner, BorderLayout.NORTH);

        setSize(800, 400);
        updateLabels();

        madridBtn.addActionListener((ActionEvent e)->{
            madrid++;
            lastScorerValue = "Madrid";
            updateLabels();
        });

        milanBtn.addActionListener((ActionEvent e)->{
            milan++;
            lastScorerValue = "Milan";
            updateLabels();
        });
    }
    private void updateLabels(){
        this.result.setText(madrid+"X"+milan);
        this.lastScorer.setText("Last scorer: "+lastScorerValue);
        updateWinner();
    }
    private void updateWinner(){
        if(madrid>milan){
            this.winner.setText("Winner: Real Madrid");
        }else if(madrid<milan){
            this.winner.setText("Winner: AC Milan");
        }else{
            this.winner.setText("Winner: DRAW");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.setVisible(true);
    }
}
