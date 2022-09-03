package CulminatingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class CreateAccountScreen implements ActionListener{
	
	// fields - visuals
	private static JFrame frame = new JFrame("Create An Account ");
	private static JPanel panel = new JPanel();
	private static JLabel background = new JLabel(new ImageIcon("backgroundonly.png"));
	private static JTextField userText = new JTextField(40);
	private static JPasswordField passwordText = new JPasswordField(40);
	private static JPasswordField repasswordText = new JPasswordField(40);
	private static JButton createAccount = new JButton("Create Account !");
	private static JButton back = new JButton("Go Back <--");
	
	// fields - text
	private static JLabel title = new JLabel("CREATE AN ACCOUNT");
	private static JLabel usernameTitle = new JLabel("Username: ");
	private static JLabel passwordTitle = new JLabel("Password: ");
	private static JLabel repasswordTitle = new JLabel("Re-enter password: ");
	private static JLabel repassEmpty;
	private static JLabel userEmpty;
	private static JLabel passEmpty;
	private static JLabel passMatch;
	private static JLabel success;
	

	Border blackline = BorderFactory.createLineBorder(Color.black);

	public static ArrayList <user> userInfo = new ArrayList(); 

	// constructor
	public CreateAccountScreen() {
 
		panel = new JPanel();
		frame.setSize(1920, 1080); 
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		// create account button
		createAccount.setFont((new Font("Monospaced", Font.BOLD, 20)));
		createAccount.setBounds(240, 650, 300, 55);
		createAccount.setForeground(Color.BLACK);
		createAccount.setFocusable(false);
		createAccount.addActionListener(this);
		panel.add(createAccount);

		// back button
		back.setFont((new Font("Monospaced", Font.BOLD, 20)));
		back.setBounds(50, 1000, 150, 55);
		back.setForeground(Color.BLACK);
		back.setFocusable(false);
		back.addActionListener(this);
		panel.add(back);

		// title text
		title.setFont((new Font("Monospaced", Font.BOLD, 105)));
		title.setBounds(490, 125, 1920, 220);
		panel.add(title);

		// username text + entry box
		usernameTitle.setFont((new Font("Monospaced", Font.BOLD, 65)));
		usernameTitle.setBounds(240, 300, 1900, 220);
		panel.add(usernameTitle);

		userText.setBounds(600, 375, 400, 65);
		userText.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		userText.setBorder(blackline);
		panel.add(userText);
		
		// passsword text + entry box
		passwordTitle.setFont((new Font("Monospaced", Font.BOLD, 65)));
		passwordTitle.setBounds(240, 380, 1900, 220);
		panel.add(passwordTitle);

		passwordText.setBounds(600, 455, 400, 65);
		passwordText.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		passwordText.setBorder(blackline);
		panel.add(passwordText);
		
		// re-enter passwrord text + entry box
		repasswordTitle.setBounds(240, 530, 741, 65);
		repasswordTitle.setFont((new Font("Monospaced", Font.BOLD, 65)));
		panel.add(repasswordTitle);
		
		repasswordText.setBounds(950, 530, 400, 65);
		repasswordText.setFont((new Font("Monospaced", Font.BOLD, 30)));
		repasswordText.setBorder(blackline);
		panel.add(repasswordText);
		
		// empty warnings
		
		userEmpty = new JLabel("");
		userEmpty.setBounds(1025, 375, 400, 65);
		userEmpty.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		userEmpty.setForeground(Color.RED);
		panel.add(userEmpty);
		
		passEmpty = new JLabel("");
		passEmpty.setBounds(1025, 450, 400, 65);
		passEmpty.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		passEmpty.setForeground(Color.RED);
		panel.add(passEmpty);
		
		repassEmpty = new JLabel("");
		repassEmpty.setBounds(1375, 550, 400, 65);
		repassEmpty.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		repassEmpty.setForeground(Color.RED);
		panel.add(repassEmpty);
		
		passMatch = new JLabel("");
		passMatch.setBounds(1375, 530, 700, 65);
		passMatch.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		passMatch.setForeground(Color.RED);
		panel.add(passMatch);
		
		success = new JLabel("");
		success.setBounds(560, 645, 741, 65);
		success.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		success.setForeground(Color.GREEN);
		panel.add(success);
		
		// background
		background.setBounds(0, 0, 1920,1080);
		panel.add(background);
		
		// allows frame to display
		frame.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == createAccount) {
			// getting username + password input from user and storing into strings
			String username = userText.getText();
			String password = String.valueOf(passwordText.getPassword());
			String repassword = String.valueOf(repasswordText.getPassword());

			if(username.isEmpty() && password.isEmpty() && repassword.isEmpty()) {
				userEmpty.setForeground(Color.RED);
				userEmpty.setText("* Please Enter A Username ! *");
				passEmpty.setForeground(Color.RED);
				passEmpty.setText("* Please Enter A Password ! *");
				repassEmpty.setForeground(Color.RED);
				repassEmpty.setText("* Please Re-Enter Password ! *");
			}
			
			else if(username.isEmpty() && password.isEmpty() && !repassword.isEmpty()){
				userEmpty.setForeground(Color.RED);
				userEmpty.setText("* Please Enter A Username ! *");
				passEmpty.setForeground(Color.RED);
				passEmpty.setText("* Please Enter A Password ! *");
			}
			
			else if(!username.isEmpty() && password.isEmpty() && repassword.isEmpty()){
				passEmpty.setForeground(Color.RED);
				passEmpty.setText("* Please Enter A Password ! *");
				repassEmpty.setForeground(Color.RED);
				repassEmpty.setText("* Please Re-Enter Password ! *");
			}
			
			else if(username.isEmpty() && !password.isEmpty() && repassword.isEmpty()){
				repassEmpty.setForeground(Color.RED);
				repassEmpty.setText("* Please Re-Enter Password ! *");
				userEmpty.setForeground(Color.RED);
				userEmpty.setText("* Please Enter A Username ! *");
			}
			
			else if(username.isEmpty() && !password.isEmpty() && !repassword.isEmpty()){
				userEmpty.setForeground(Color.RED);
				userEmpty.setText("* Please Enter A Username ! *");
			}
			
			else if(!username.isEmpty() && password.isEmpty() && !repassword.isEmpty()){
				passEmpty.setForeground(Color.RED);
				passEmpty.setText("* Please Enter A Password ! *");
			}

			else if(!username.isEmpty() && !password.isEmpty() && repassword.isEmpty()){
				repassEmpty.setForeground(Color.RED);
				repassEmpty.setText("* Please Re-Enter Password ! *");
			}
			
			else if(!password.equals(repassword) || !repassword.equals(password)){
				passMatch.setForeground(Color.RED);
				passMatch.setText("* Passwords Don't Match ! *");
			}
			
			else {
				
				success.setForeground(Color.GREEN);
				success.setText("Account Created !");
				
				String userPass = username + ", " + password + "\n";
				try {
					Files.write(Paths.get("user+passinfo.txt"), userPass.getBytes(), StandardOpenOption.APPEND);
                    Login.userInfo.add(new user(username,password));
                }
				catch (IOException err) {
                    System.out.println("error");
                }
			}
		}

		if (e.getSource() == back) {
			frame.dispose();
		}
	}
}
