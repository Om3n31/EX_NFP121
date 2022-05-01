import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IHMcli {
    JFrame mainFrame;
    JPanel topPanel, centerPanel, bottomPanel;
    JButton creuseButton, pleineButton, plusButtonIndice, plusButtonAlpha, plusButtonEpsilon;
    JLabel indiceLabel, alphaLabel, epsilonLabel;
    JTextField indiceTextField, alphaTextField, epsilonTextField, mainTextField;

    String cliCommand = "";

    IHMcli(){
        mainFrame = new JFrame("CLI IHM");
        mainFrame.setLayout(new BorderLayout());

        topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(3,3));

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new CardLayout());

        creuseButton = new JButton();
        creuseButton.setText("Creuse (C)");
        creuseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if(indiceTextField.getText() != null){
                    cliCommand = cliCommand + "-K "+indiceTextField.getText()+" ";
                }
                if(alphaTextField.getText() != null){
                    cliCommand = cliCommand + "-A "+alphaTextField.getText()+" ";
                }
                if(epsilonTextField.getText() != null){
                    cliCommand = cliCommand + "-E "+epsilonTextField.getText()+" ";
                }

                cliCommand = cliCommand + "-C";
                updateMainTextField();
            }
        });
        pleineButton = new JButton();
        pleineButton.setText("Pleine (P)");
        pleineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(indiceTextField.getText() != null){
                    cliCommand = cliCommand + "-K "+indiceTextField.getText()+" ";
                }
                if(alphaTextField.getText() != null){
                    cliCommand = cliCommand + "-A "+alphaTextField.getText()+" ";
                }
                if(epsilonTextField.getText() != null){
                    cliCommand = cliCommand + "-E "+epsilonTextField.getText()+" ";
                }

                cliCommand = cliCommand + "-P";
                updateMainTextField();
            }
        });

        topPanel.add(creuseButton);
        topPanel.add(pleineButton);

        indiceLabel = new JLabel("Valeur de l'indice (K)");
        indiceTextField = new JTextField();
        plusButtonIndice = new JButton("+");
        plusButtonIndice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(indiceTextField.getText() != null){
                    cliCommand = cliCommand + "-K " + indiceTextField.getText()+" ";
                    updateMainTextField();
                }
            }
        });
        centerPanel.add(indiceLabel);
        centerPanel.add(indiceTextField);
        centerPanel.add(plusButtonIndice);

        alphaLabel = new JLabel("Valeur de alpha (A)");
        alphaTextField = new JTextField();
        plusButtonAlpha = new JButton("+");
        plusButtonAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(alphaTextField.getText() != null){
                    cliCommand = cliCommand + "-A " + alphaTextField.getText()+" ";
                    updateMainTextField();
                }

            }
        });
        centerPanel.add(alphaLabel);
        centerPanel.add(alphaTextField);
        centerPanel.add(plusButtonAlpha);

        epsilonLabel = new JLabel("Valeur de epsilon (E)");
        epsilonTextField = new JTextField();
        plusButtonEpsilon = new JButton("+");
        plusButtonEpsilon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(epsilonTextField.getText() != null){
                    cliCommand = cliCommand + "-A " + epsilonTextField.getText()+" ";
                    updateMainTextField();
                }
            }
        });
        centerPanel.add(epsilonLabel);
        centerPanel.add(epsilonTextField);
        centerPanel.add(plusButtonEpsilon);

        mainTextField = new JTextField();
        mainTextField.setEditable(false);
        bottomPanel.add(mainTextField);

        mainFrame.add(topPanel, BorderLayout.NORTH);
        mainFrame.add(centerPanel, BorderLayout.CENTER);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        mainFrame.pack();
        mainFrame.setVisible(true);



    }
    private void updateMainTextField(){
        mainTextField.setText(cliCommand);
    }
}
