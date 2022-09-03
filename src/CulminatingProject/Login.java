package CulminatingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

public class Login implements ActionListener {

	private static JFrame frame = new JFrame("CPU Tutor App");
	private static JLabel background = new JLabel(new ImageIcon("backgroundonly.png"));
	private static JTextField userText = new JTextField(40);
	private static JPasswordField passwordText = new JPasswordField(40);
	private static JButton loginButton = new JButton("LOGIN");
	private static JButton createAccount = new JButton("Don't Have An Account ?");
	// fields - text
	private static JLabel title = new JLabel("CPU TUTOR APP");
	private static JLabel introText = new JLabel(
			"Hi my name is Aathushan. Today I've created a CPU Tutor App that will provide");
	private static JLabel introText2 = new JLabel(
			"you with information about a CPU along with teaching you the basic foundation");
	private static JLabel introText3 = new JLabel("the CPU has played in our everyday life.");
	private static JLabel loginText = new JLabel("Login:");
	private static JLabel usernameTitle = new JLabel("Username: ");
	private static JLabel passwordTitle = new JLabel("Password: ");
	private static JLabel userTextEmpty;
	private static JLabel passTextEmpty;
	private static JLabel notFound;
	private static JLabel wrongUser;
	private static JLabel wrongPass;

	Border blackline = BorderFactory.createLineBorder(Color.black);

	@SuppressWarnings("unchecked")
	public static ArrayList <user> userInfo = new ArrayList();

	// constructor
	public Login() {

		String[] userPlusPass = new String[2];

		try {
			File users = new File("user+passinfo.txt");
			Scanner myReader = new Scanner(users);
			while (myReader.hasNextLine()) {

				String data = myReader.nextLine();
				userPlusPass = data.split(",");

				String userTemp = userPlusPass[0];
				String passTemp = userPlusPass[1];

				userInfo.add(new user(userTemp, passTemp));
			}
			myReader.close();
		} catch (FileNotFoundException err) {
			System.out.println("File not found.");
		}

		JPanel panel = new JPanel();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		// title text
		title.setFont((new Font("Monospaced", Font.BOLD, 105)));
		title.setBounds(565, 125, 975, 220);
		panel.add(title);

		// message text
		introText.setFont((new Font("Monospaced", Font.PLAIN, 40)));
		introText.setBounds(65, 290, 1900, 220);
		panel.add(introText);
		introText2.setFont((new Font("Monospaced", Font.PLAIN, 40)));
		introText2.setBounds(25, 365, 1900, 220);
		panel.add(introText2);
		introText3.setFont((new Font("Monospaced", Font.PLAIN, 40)));
		introText3.setBounds(475, 440, 1900, 220);
		panel.add(introText3);

		// login text
		loginText.setFont((new Font("Monospaced", Font.BOLD, 65)));
		loginText.setBounds(590, 545, 1900, 220);
		panel.add(loginText);

		// login button
		loginButton.setFont((new Font("Monospaced", Font.BOLD, 25)));
		loginButton.setBounds(1750, 845, 100, 55);
		loginButton.setForeground(Color.BLACK);
		loginButton.setFocusable(false);
		loginButton.addActionListener(this);
		panel.add(loginButton);

		// create account button
		createAccount.setFont((new Font("Monospaced", Font.BOLD, 20)));
		createAccount.setBounds(25, 1000, 300, 55);
		createAccount.setForeground(Color.BLACK);
		createAccount.setFocusable(false);
		createAccount.addActionListener(this);
		panel.add(createAccount);

		// username text + text box
		usernameTitle.setFont((new Font("Monospaced", Font.PLAIN, 65)));
		usernameTitle.setBounds(590, 655, 1900, 220);
		panel.add(usernameTitle);

		userText.setBounds(935, 735, 400, 65);
		userText.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		userText.setBorder(blackline);
		panel.add(userText);

		userTextEmpty = new JLabel("");
		userTextEmpty.setBounds(935, 785, 600, 65);
		userTextEmpty.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		userTextEmpty.setForeground(Color.RED);
		panel.add(userTextEmpty);

		// passsword text + text box
		passwordTitle.setFont((new Font("Monospaced", Font.PLAIN, 65)));
		passwordTitle.setBounds(590, 765, 1900, 220);
		panel.add(passwordTitle);

		passwordText.setBounds(935, 845, 400, 65);
		passwordText.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		passwordText.setBorder(blackline);
		panel.add(passwordText);

		passTextEmpty = new JLabel("");
		passTextEmpty.setBounds(935, 895, 600, 65);
		passTextEmpty.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		passTextEmpty.setForeground(Color.RED);
		panel.add(passTextEmpty);
		
		// user not found message
		notFound = new JLabel("");
		notFound.setBounds(1425, 735, 550, 65);
		notFound.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		notFound.setForeground(Color.RED);
		panel.add(notFound);
		
		// wrong username message
		wrongUser = new JLabel("");
		wrongUser.setBounds(1425, 715, 550, 65);
		wrongUser.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		wrongUser.setForeground(Color.RED);
		panel.add(wrongUser);
		
		// wrong pass message
		wrongPass = new JLabel("");
		wrongPass.setBounds(1425, 845, 550, 65);
		wrongPass.setFont((new Font("Monospaced", Font.PLAIN, 20)));
		wrongPass.setForeground(Color.RED);
		panel.add(wrongPass);
		
		// background
		background.setBounds(0, 0, 1920, 1080);
		panel.add(background);

		// allows frame to display
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == createAccount) {
			new CreateAccountScreen();
		}

		if (e.getSource() == loginButton) {

			// getting username + password input from user and storing into strings
			String username = userText.getText();
			String password = String.valueOf(passwordText.getPassword());

			boolean loginValid = false;

			if (username.isEmpty() && password.isEmpty()) {
				userTextEmpty.setForeground(Color.RED);
				userTextEmpty.setText("* Please Enter Your Username ! *");
				passTextEmpty.setForeground(Color.RED);
				passTextEmpty.setText("* Please Enter Your Password ! *");
			} 
			
			else if (username.isEmpty() && !password.isEmpty()) {
				userTextEmpty.setForeground(Color.RED);
				userTextEmpty.setText("* Please Enter Your Username ! *");
			} 
			
			else if (!username.isEmpty() && password.isEmpty()) {
				passTextEmpty.setForeground(Color.RED);
				passTextEmpty.setText("* Please Enter Your Password ! *");
			}

			for(user userTemp : userInfo) {
                String existingUser = userTemp.getUsername();
                String existingPass = userTemp.getPassword();

                 if(username.equals(existingUser) && password.equals(existingPass)) {
                    //Login Successful
                    loginValid = true;
                    break;
                }
                // need to display (user not found) if username is not equal to existing user 
                // and if password is not equal to existing password
                 else if(!username.equals(existingUser) && !password.equals(existingPass)){
                	notFound.setForeground(Color.RED);
                	notFound.setText("* User Not Found ! *");
                 }
                 // need to display (wrong username) if username is not equal to existing user
                 else if(!username.equals(existingUser) && password.equals(existingPass)) {
                	 wrongUser.setForeground(Color.RED);
                	 wrongUser.setText("* Ivalid Username ! *");
                 }
                 // need to display (wrong password) if password is not equal to existing password
                 else if(username.equals(existingUser) && !password.equals(existingPass)) {
                	 wrongPass.setForeground(Color.RED);
                	 wrongPass.setText("* Invalid Password ! *");
                 }
			}

            if(loginValid == true) {
                //Login is valid so go to the next screen and dispose this frame
                new Main();
                frame.dispose();
            }
            
		}
		
	}
}