import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Election extends JFrame {
    private JLabel lblName, lblVoterID, lblpincode, lblParty;
    private JTextField txtName, txtVoterID, txtpincode;
    private JComboBox<String> partyComboBox;
    private JButton submitButton;

    public Election() {
        setTitle("Election Booth 2024");
        setSize(200, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        lblName = new JLabel("Enter your name: ");
        txtName = new JTextField();
        lblVoterID = new JLabel("Enter your voter ID: ");
        txtVoterID = new JTextField();
        lblpincode = new JLabel("Enter your city pincode: ");
        txtpincode = new JTextField();
        lblParty = new JLabel("Choose your party: ");
        String[] parties = {"party 1", "party 2", "party 3"};
        partyComboBox = new JComboBox<>(parties);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> VotingForm());

        add(lblName);
        add(txtName);
        add(lblVoterID);
        add(txtVoterID);
        add(lblpincode);
        add(txtpincode);
        add(lblParty);
        add(partyComboBox);
        add(new JLabel());
        add(submitButton);
        setVisible(true);
    }

    private void VotingForm() {
        String name = txtName.getText();
        String voter_id = txtVoterID.getText();
        int pincode = Integer.parseInt(txtpincode.getText());
        String party = (String) partyComboBox.getSelectedItem();

        // Displaying the details
        JOptionPane.showMessageDialog(this, "Name: " + name + "\nVoter ID: " + voter_id + "\nPincode: " + pincode + "\nParty: " + party + "\n\nYour vote is successful.", "Vote Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Election());
    }
}