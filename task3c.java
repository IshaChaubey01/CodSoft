//Implement methods for each option, such as withdraw(amount), deposit(amount), and checkBalance().

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task3c {
    private JFrame frame;
    private JLabel balanceLabel;
    private double balance = 1000.0; // Initial balance

    public task3c() {
        frame = new JFrame("ATM Machine");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to the ATM Machine!");
        welcomeLabel.setBounds(10, 10, 280, 25);
        panel.add(welcomeLabel);

        balanceLabel = new JLabel("Your balance: $" + balance);
        balanceLabel.setBounds(10, 40, 280, 25);
        panel.add(balanceLabel);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(10, 80, 100, 25);
        panel.add(withdrawButton);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(120, 80, 100, 25);
        panel.add(depositButton);

        JButton checkBalanceButton = new JButton("Check Balance");
        checkBalanceButton.setBounds(230, 80, 140, 25);
        panel.add(checkBalanceButton);

        // Add action listeners for buttons
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                withdraw();
            }
        });

        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deposit();
            }
        });

        checkBalanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkBalance();
            }
        });
    }

    private void withdraw() {
        String amountStr = JOptionPane.showInputDialog("Enter the withdrawal amount: $");
        try {
            double amount = Double.parseDouble(amountStr);
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                updateBalanceLabel();
                JOptionPane.showMessageDialog(null, "Withdrawn $" + amount + " successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid withdrawal amount or insufficient funds.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
        }
    }

    private void deposit() {
        String amountStr = JOptionPane.showInputDialog("Enter the deposit amount: $");
        try {
            double amount = Double.parseDouble(amountStr);
            if (amount > 0) {
                balance += amount;
                updateBalanceLabel();
                JOptionPane.showMessageDialog(null, "Deposited $" + amount + " successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid deposit amount. Amount must be greater than zero.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid amount.");
        }
    }

    private void checkBalance() {
        JOptionPane.showMessageDialog(null, "Your balance: $" + balance);
    }

    private void updateBalanceLabel() {
        balanceLabel.setText("Your balance: $" + balance);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new task3c();
            }
        });
    }
}
