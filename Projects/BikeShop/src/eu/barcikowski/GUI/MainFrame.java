package eu.barcikowski.GUI;

import com.sun.deploy.panel.JavaPanel;
import eu.barcikowski.Utils.ItemValidator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by GaskinPC on 23.05.2017.
 */
public class MainFrame extends JFrame{


    JPanel centerPanel, leftPanel, bottomPanel;

    /**
     * <h1>Default constructor</h1>
     * Creates default layout for application
     * <p>Uses no arguments</p>
     *
     * https://www.tutorialspoint.com/java/java_documentation.htm :)
     */
    public MainFrame(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        centerPanel = new JPanel(new BorderLayout());
        leftPanel = new JPanel(new BorderLayout());
        bottomPanel = new JPanel(new BorderLayout());
        this.setLayout(new BorderLayout());
        this.add(centerPanel,BorderLayout.CENTER);
        this.add(leftPanel,BorderLayout.WEST);
        this.add(bottomPanel,BorderLayout.SOUTH);
        this.setSize(new Dimension(1337,500));
    }

    /**
     * <h1>Initializes the default windows</h1>
     * Adds a compound panel consisting of JLabels and input JTextAreas
     * and a JButton to add values to TextArea
     */

    public void initializeComponents(){


        JPanel compoundInputPanel = new JPanel(new GridLayout(2,1));
        JPanel descriptionPanel = new JPanel(new GridLayout(1,3));
        JLabel nameLabel = new JLabel("Name:");
        JLabel typeLabel = new JLabel("Type:");
        JLabel costLabel = new JLabel("Cost:");


        descriptionPanel.add(nameLabel);
        descriptionPanel.add(typeLabel);
        descriptionPanel.add(costLabel);


        JPanel inputPanel = new JPanel(new GridLayout(1,3));

        JTextArea nameArea = new JTextArea();
        JTextArea typeArea = new JTextArea();
        JTextArea costArea = new JTextArea();

        inputPanel.add(nameArea);
        inputPanel.add(typeArea);
        inputPanel.add(costArea);

        compoundInputPanel.add(descriptionPanel);
        compoundInputPanel.add(inputPanel);


        bottomPanel.add(compoundInputPanel,BorderLayout.CENTER);


        JTextPane textPane = new JTextPane();

        centerPanel.add(textPane,BorderLayout.CENTER);

        bottomPanel.add(createAddButton(textPane,nameArea,typeArea,costArea),BorderLayout.WEST);

        this.setVisible(true);

    }

    /**
     * Method creates a add button that adds texts from given areas to textPane
     * @param textPane panel that we add text to
     * @param areas areas with text we want to extract
     * @return JButton instance of button that does the "adding"
     */
    private JButton createAddButton(JTextPane textPane, JTextArea... areas){

        JButton addButton = new JButton("ADD");


        addButton.addActionListener(e -> {

            String[] values = new String[areas.length];
            for (int i = 0; i < areas.length; i++) {
                values[i] = areas[i].getText();
            }
            if(!ItemValidator.validate(values)){
                JOptionPane.showMessageDialog(this,"The values you are trying to enter are incorrect!", "Error kurde ;(", JOptionPane.ERROR_MESSAGE);
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (JTextArea area :
                    areas) {
                sb.append(area.getText()).append(",");

            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("\n");

            textPane.setText(textPane.getText() + sb.toString());

            for (JTextArea area :
                    areas) {
                area.setText("");
            }
        });
        addButton.setPreferredSize(new Dimension(80,40));

        return addButton;
    }
}
