/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrationform;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
  private Frame mainFrame;
    private Label headerLabel;
    private Panel controlPanel;

    public RegistrationForm() {
        prepareGUI();
    }
   
    public static void main(String[] args) {
 RegistrationForm registrationForm = new RegistrationForm();
        registrationForm.showFrame();
    }
    





    

    private void prepareGUI() {
        mainFrame = new Frame("Registration Form");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        headerLabel.setText("Registration Form");

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.setVisible(true);
    }

    private void showFrame() {
        Label nameLabel = new Label("Name: ");
        TextField nameText = new TextField(20);

        Label emailLabel = new Label("Email: ");
        TextField emailText = new TextField(20);

        Label passwordLabel = new Label("Password: ");
        TextField passwordText = new TextField(20);
        passwordText.setEchoChar('*');

        Button registerButton = new Button("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameText.getText();
                String email = emailText.getText();
                String password = passwordText.getText();

                // You can perform actions with the registration data, e.g., store in a database, display, etc.
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });

        controlPanel.add(nameLabel);
        controlPanel.add(nameText);
        controlPanel.add(emailLabel);
        controlPanel.add(emailText);
        controlPanel.add(passwordLabel);
        controlPanel.add(passwordText);
        controlPanel.add(registerButton);

        mainFrame.setVisible(true);
    }
}


