import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class AppInterface extends JFrame implements ActionListener{
    JCheckBox actionBox1, actionBox2, actionBox3, zoneBox1, zoneBox2, zoneBox3, destinationBox1, destinationBox2;
    JLabel statusDisplay;

    Action action;
    static Destination destination;
    static ArrayList<Zone> zonesList = new ArrayList<>();

    /**
     * Constructs the GUI of the app
     */
    public AppInterface() {

        JFrame frame = new JFrame("Robovac App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        JLabel cleaningLabel = new JLabel("Cleaning Type:");

        actionBox1 = new JCheckBox(new CleaningInterface().cleanType1);
        actionBox2 = new JCheckBox(new CleaningInterface().cleanType2);
        actionBox3 = new JCheckBox(new CleaningInterface().cleanType3);

        JPanel panelLeft = new JPanel();
        panelLeft.setLayout(new GridLayout(4,1,0,8));
        panelLeft.add(cleaningLabel);
        panelLeft.add(actionBox1);
        panelLeft.add(actionBox2);
        panelLeft.add(actionBox3);

        JLabel zonesLabel = new JLabel("Select Zones:");

        zoneBox1 = new JCheckBox("Zone 1");
        zoneBox2 = new JCheckBox("Zone 2");
        zoneBox3 = new JCheckBox("Zone 3");

        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new GridLayout(4,1,0,8));
        panelCenter.add(zonesLabel);
        panelCenter.add(zoneBox1);
        panelCenter.add(zoneBox2);
        panelCenter.add(zoneBox3);

        JLabel destinationLabel = new JLabel("Select destination:");

        destinationBox1 = new JCheckBox(new CleaningInterface().destination1);
        destinationBox2 = new JCheckBox(new CleaningInterface().destination2);

        JPanel panelRight = new JPanel();
        panelRight.setLayout(new GridLayout(3,1,0,8));
        panelRight.add(destinationLabel);
        panelRight.add(destinationBox1);
        panelRight.add(destinationBox2);

        JPanel bodyPanel = new JPanel();
        bodyPanel.setLayout(new GridLayout(1, 3, 50, 50));
        bodyPanel.add(panelLeft, BorderLayout.WEST);
        bodyPanel.add(panelCenter, BorderLayout.CENTER);
        bodyPanel.add(panelRight, BorderLayout.EAST);

        JButton startButton = new JButton("Start Cleaning");
        startButton.addActionListener(this);

        statusDisplay = new JLabel(new StatusDisplay().status1);
        frame.setLayout(new GridLayout(3,1,10,20));
        frame.add(statusDisplay);
        frame.add(bodyPanel);
        frame.add(startButton);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (actionBox1.isSelected()) {
            action = new Action(actionBox1.getText());
        }

        if (actionBox2.isSelected()) {
            action = new Action(actionBox2.getText());
        }

        if (actionBox3.isSelected()) {
            action = new Action(actionBox3.getText());
        }

        if (destinationBox1.isSelected()) {
            destination = new Destination(destinationBox1.getText());
        }

        if (destinationBox2.isSelected()) {
            destination = new Destination(destinationBox2.getText());
        }

        if (zoneBox1.isSelected()) {
            zonesList.add(new Zone(zoneBox1.getText()));
        }

        if (zoneBox2.isSelected()) {
            zonesList.add(new Zone(zoneBox2.getText()));
        }

        if (zoneBox3.isSelected()) {
            zonesList.add(new Zone(zoneBox3.getText()));
        }

        Controller.instance().makeAndSendTrigger(zonesList, action, destination);
        statusDisplay.setText(new RobotInterface().receiveTrigger(Controller.instance().makeTrigger(zonesList, action
                , destination)));
    }

    public static void main (String[]args){
        Controller.instance();
        new AppInterface();
    }
}
