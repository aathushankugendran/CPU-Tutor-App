package CulminatingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class Quiz implements ActionListener {

	// fields - visuals
	private static JFrame frame = new JFrame("CPU Quiz !");
	private static JLabel background = new JLabel(new ImageIcon("quiz.png"));
	private static JButton submit = new JButton("SUBMIT !");
	private static JLabel score = new JLabel();
	private static JButton close = new JButton("CLOSE");

	// fields - question 1
	private static JLabel q1 = new JLabel(
			"Question 1: The central processing unit (CPU) is ___________  any digital computer system.");
	private static ButtonGroup question1 = new ButtonGroup();
	private static JRadioButton q1a = new JRadioButton("not apart of");
	private static JRadioButton q1b = new JRadioButton("important in");
	private static JRadioButton q1c = new JRadioButton("an optional component to have in");
	private static JRadioButton q1d = new JRadioButton("is a principal part of");
	private static JButton hint1 = new JButton("Hint!");
	private static JOptionPane popup1 = new JOptionPane();

	// fields - question 2
	private static JLabel q2 = new JLabel(
			"Question 2: The CPU does not generate a lot of heat even if it is used for a short period of time.");
	private static ButtonGroup question2 = new ButtonGroup();
	private static JRadioButton q2a = new JRadioButton("True");
	private static JRadioButton q2b = new JRadioButton("False");
	private static JButton hint2 = new JButton("Hint!");
	private static JOptionPane popup2 = new JOptionPane();

	// fields - question 3
	private static JLabel q3 = new JLabel(
			"Question 3: What keeps the CPU secured onto the motherboard after placed into the CPU socket?");
	private static ButtonGroup question3 = new ButtonGroup();
	private static JRadioButton q3a = new JRadioButton("Thermal Paste");
	private static JRadioButton q3b = new JRadioButton("A small lever");
	private static JRadioButton q3c = new JRadioButton("Glue");
	private static JRadioButton q3d = new JRadioButton("None of the above");
	private static JButton hint3 = new JButton("Hint!");
	private static JOptionPane popup3 = new JOptionPane();

	// fields - question 4
	private static JLabel q4 = new JLabel("Question 4: What is the order of the instruction cycle?");
	private static ButtonGroup question4 = new ButtonGroup();
	private static JRadioButton q4a = new JRadioButton("Fetch Decode Execute");
	private static JRadioButton q4b = new JRadioButton("Decode Fetch Execute");
	private static JRadioButton q4c = new JRadioButton("Fetch Execute Decode");
	private static JRadioButton q4d = new JRadioButton("None of the above");
	private static JButton hint4 = new JButton("Hint!");
	private static JOptionPane popup4 = new JOptionPane();

	// fields - question 5
	private static JLabel q5 = new JLabel(
			"Question 5: During the instruction cycle, where is an instruction fetched from?");
	private static ButtonGroup question5 = new ButtonGroup();
	private static JRadioButton q5a = new JRadioButton("The Memory");
	private static JRadioButton q5b = new JRadioButton("The RAM");
	private static JRadioButton q5c = new JRadioButton("An instruction isn’t fetched.");
	private static JRadioButton q5d = new JRadioButton("None of the above");
	private static JButton hint5 = new JButton("Hint!");
	private static JOptionPane popup5 = new JOptionPane();

	// fields - question 6
	private static JLabel q6 = new JLabel("Question 6: What purpose does getting a more powerful processor serve?");
	private static ButtonGroup question6 = new ButtonGroup();
	private static JRadioButton q6a = new JRadioButton("We don’t need a CPU, it serves no purpose.");
	private static JRadioButton q6b = new JRadioButton(
			"Getting a more powerful processor has no change on the computers performance");
	private static JRadioButton q6c = new JRadioButton(
			"Getting a more powerful processor can help your computer think and work fast.");
	private static JRadioButton q6d = new JRadioButton("None of the above");
	private static JButton hint6 = new JButton("Hint!");
	private static JOptionPane popup6 = new JOptionPane();

	// fields - question 7
	private static JLabel q7 = new JLabel(
			"Question 7: The cache provides _____ and instructions to prevent the CPU from waiting for __ to be retrieved from the ___.");
	private static ButtonGroup question7 = new ButtonGroup();
	private static JRadioButton q7a = new JRadioButton("data storage, data, RAM");
	private static JRadioButton q7b = new JRadioButton("RAM, data, data storage");
	private static JRadioButton q7c = new JRadioButton("data storage, data, the Memory");
	private static JRadioButton q7d = new JRadioButton("None of the above");
	private static JButton hint7 = new JButton("Hint!");
	private static JOptionPane popup7 = new JOptionPane();

	// fields - question 7
	private static JLabel q8 = new JLabel(
			"Question 8: The main purpose of the RAM is to store programs and data so that they are ready for use when the CPU needs them.");
	private static ButtonGroup question8 = new ButtonGroup();
	private static JRadioButton q8a = new JRadioButton("True");
	private static JRadioButton q8b = new JRadioButton("False");
	private static JButton hint8 = new JButton("Hint!");
	private static JOptionPane popup8 = new JOptionPane();

	public static void main(String[] args) {
		new Quiz();
	}

	UIManager UI = new UIManager();

	public Quiz() {

		JPanel panel = new JPanel();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		submit.setFont((new Font("Monospaced", Font.BOLD, 15)));
		submit.setBounds(1750, 910, 100, 55);
		submit.setForeground(Color.BLACK);
		submit.setBackground(Color.BLACK);
		submit.setOpaque(true);
		submit.setFocusable(false);
		submit.addActionListener(this);
		panel.add(submit);

		close.setFont((new Font("Monospaced", Font.BOLD, 15)));
		close.setBounds(1750, 1000, 100, 55);
		close.setForeground(Color.BLACK);
		close.setBackground(Color.BLACK);
		close.setOpaque(true);
		close.setFocusable(false);
		close.addActionListener(this);
		panel.add(close);

		// question #1
		q1.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q1.setBounds(55, 250, 975, 80);
		panel.add(q1);

		q1a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q1a.setBounds(55, 310, 200, 20);
		question1.add(q1a);
		panel.add(q1a);

		q1b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q1b.setBounds(55, 330, 200, 20);
		question1.add(q1b);
		panel.add(q1b);

		q1c.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q1c.setBounds(700, 310, 315, 20);
		question1.add(q1c);
		panel.add(q1c);

		q1d.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q1d.setBounds(700, 330, 200, 20);
		question1.add(q1d);
		panel.add(q1d);

		hint1.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint1.setBounds(1000, 275, 100, 55);
		hint1.setForeground(Color.BLACK);
		hint1.setBackground(Color.BLACK);
		hint1.setOpaque(true);
		hint1.setFocusable(false);
		hint1.addActionListener(this);
		panel.add(hint1);

		// question #2
		q2.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q2.setBounds(55, 350, 975, 80);
		panel.add(q2);

		q2a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q2a.setBounds(55, 410, 100, 20);
		question2.add(q2a);
		panel.add(q2a);

		q2b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q2b.setBounds(700, 410, 100, 20);
		question2.add(q2b);
		panel.add(q2b);

		hint2.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint2.setBounds(1000, 375, 100, 55);
		hint2.setForeground(Color.BLACK);
		hint2.setBackground(Color.BLACK);
		hint2.setOpaque(true);
		hint2.setFocusable(false);
		hint2.addActionListener(this);
		panel.add(hint2);

		// question #3
		q3.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q3.setBounds(55, 450, 975, 80);
		panel.add(q3);

		q3a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q3a.setBounds(55, 510, 200, 20);
		question3.add(q3a);
		panel.add(q3a);

		q3b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q3b.setBounds(55, 530, 200, 20);
		question3.add(q3b);
		panel.add(q3b);

		q3c.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q3c.setBounds(700, 510, 200, 20);
		question3.add(q3c);
		panel.add(q3c);

		q3d.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q3d.setBounds(700, 530, 200, 20);
		question3.add(q3d);
		panel.add(q3d);

		hint3.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint3.setBounds(1000, 475, 100, 55);
		hint3.setForeground(Color.BLACK);
		hint3.setBackground(Color.BLACK);
		hint3.setOpaque(true);
		hint3.setFocusable(false);
		hint3.addActionListener(this);
		panel.add(hint3);

		// question #4
		q4.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q4.setBounds(55, 550, 975, 80);
		panel.add(q4);

		q4a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q4a.setBounds(55, 610, 200, 20);
		question4.add(q4a);
		panel.add(q4a);

		q4b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q4b.setBounds(55, 630, 200, 20);
		question4.add(q4b);
		panel.add(q4b);

		q4c.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q4c.setBounds(700, 610, 200, 20);
		question4.add(q4c);
		panel.add(q4c);

		q4d.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q4d.setBounds(700, 630, 200, 20);
		question4.add(q4d);
		panel.add(q4d);

		hint4.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint4.setBounds(1000, 570, 100, 55);
		hint4.setForeground(Color.BLACK);
		hint4.setBackground(Color.BLACK);
		hint4.setOpaque(true);
		hint4.setFocusable(false);
		hint4.addActionListener(this);
		panel.add(hint4);

		// question #5
		q5.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q5.setBounds(55, 650, 975, 80);
		panel.add(q5);

		q5a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q5a.setBounds(55, 710, 600, 20);
		question5.add(q5a);
		panel.add(q5a);

		q5b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q5b.setBounds(55, 730, 600, 20);
		question5.add(q5b);
		panel.add(q5b);

		q5c.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q5c.setBounds(700, 710, 600, 20);
		question5.add(q5c);
		panel.add(q5c);

		q5d.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q5d.setBounds(700, 730, 600, 20);
		question5.add(q5d);
		panel.add(q5d);

		hint5.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint5.setBounds(1000, 670, 100, 55);
		hint5.setForeground(Color.BLACK);
		hint5.setBackground(Color.BLACK);
		hint5.setOpaque(true);
		hint5.setFocusable(false);
		hint5.addActionListener(this);
		panel.add(hint5);

		// question #6
		q6.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q6.setBounds(55, 750, 975, 80);
		panel.add(q6);

		q6a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q6a.setBounds(55, 810, 375, 20);
		question6.add(q6a);
		panel.add(q6a);

		q6b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q6b.setBounds(55, 830, 650, 20);
		question6.add(q6b);
		panel.add(q6b);

		q6c.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q6c.setBounds(700, 810, 675, 20);
		question6.add(q6c);
		panel.add(q6c);

		q6d.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q6d.setBounds(700, 830, 600, 20);
		question6.add(q6d);
		panel.add(q6d);

		hint6.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint6.setBounds(1350, 780, 100, 55);
		hint6.setForeground(Color.BLACK);
		hint6.setBackground(Color.BLACK);
		hint6.setOpaque(true);
		hint6.setFocusable(false);
		hint6.addActionListener(this);
		panel.add(hint6);

		// question #7
		q7.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q7.setBounds(55, 850, 1200, 80);
		panel.add(q7);

		q7a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q7a.setBounds(55, 910, 400, 20);
		question7.add(q7a);
		panel.add(q7a);

		q7b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q7b.setBounds(55, 930, 400, 20);
		question7.add(q7b);
		panel.add(q7b);

		q7c.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q7c.setBounds(700, 910, 400, 20);
		question7.add(q7c);
		panel.add(q7c);

		q7d.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q7d.setBounds(700, 930, 400, 20);
		question7.add(q7d);
		panel.add(q7d);

		hint7.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint7.setBounds(1250, 870, 100, 55);
		hint7.setForeground(Color.BLACK);
		hint7.setBackground(Color.BLACK);
		hint7.setOpaque(true);
		hint7.setFocusable(false);
		hint7.addActionListener(this);
		panel.add(hint7);

		// question #8
		q8.setFont((new Font("Open Sans", Font.PLAIN, 20)));
		q8.setBounds(55, 950, 1250, 80);
		panel.add(q8);

		q8a.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q8a.setBounds(55, 1010, 100, 20);
		question8.add(q8a);
		panel.add(q8a);

		q8b.setFont((new Font("Open Sans", Font.PLAIN, 15)));
		q8b.setBounds(700, 1010, 100, 20);
		question8.add(q8b);
		panel.add(q8b);

		hint8.setFont((new Font("Monospaced", Font.BOLD, 15)));
		hint8.setBounds(1300, 970, 100, 55);
		hint8.setForeground(Color.BLACK);
		hint8.setBackground(Color.BLACK);
		hint8.setOpaque(true);
		hint8.setFocusable(false);
		hint8.addActionListener(this);
		panel.add(hint8);

		score = new JLabel("Score:");
		score.setFont((new Font("Open Sans", Font.PLAIN, 30)));
		score.setBounds(1400, 915, 400, 40);
		score.setForeground(Color.BLACK);
		panel.add(score);

		// background
		background.setBounds(0, 0, 1920, 1080);
		panel.add(background);

		// allows frame to display
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int count = 0;
		if (e.getSource() == hint1) {

			UIManager.put("OptionPane.background", Color.white);
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(popup1,
					"Its Best We Have The CPU In Any Digital Computer System! Good Luck :)");
		} else if (e.getSource() == hint2) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup2,
					"This Was Mentioned About When We Learnt About The Topic 'What Is A CPU ?'. Good Luck :)");

		} else if (e.getSource() == hint3) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup3,
					"The Item That Keeps It Secure Does Not Keep The CPU Secured Forever! Good Luck :)");
		} else if (e.getSource() == hint4) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup4,
					"This Was Mentioned About When We Learnt About The Topic 'How Does The CPU Work ?'. Good Luck :)");
		} else if (e.getSource() == hint5) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup5, "An Instruction Is Fetched! Good Luck :)");
		} else if (e.getSource() == hint6) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup6, "A CPU Does Serve A Purpose! Good Luck :)");
		} else if (e.getSource() == hint7) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup7, "This Line Was Mentioned In The Cache Definition. Good Luck :)");
		} else if (e.getSource() == hint8) {
			UIManager.put("OptionPane.background", Color.white);
			JOptionPane.showMessageDialog(popup8,
					"This Was Mentioned About When We Learnt About The Topic 'Key Concepts & Definitions'. Good Luck :)");
		}

		if (e.getSource() == submit) {
			if (q1d.isSelected()) {
				count = count + 1;
			}
			if (q2b.isSelected()) {
				count = count + 1;
			}
			if (q3b.isSelected()) {
				count = count + 1;
			}
			if (q4a.isSelected()) {
				count = count + 1;
			}
			if (q5a.isSelected()) {
				count = count + 1;
			}
			if (q6c.isSelected()) {
				count = count + 1;
			}
			if (q7a.isSelected()) {
				count = count + 1;
			}
			if (q8a.isSelected()) {
				count = count + 1;
			}
			if (count == 0) {
				score.setForeground(Color.RED);
				score.setText("Score: 0/8 -- 0%");
			} else if (count == 1) {
				score.setForeground(Color.RED);
				score.setText("Score: 1/8 -- 12.5%");
			} else if (count == 2) {
				score.setForeground(Color.RED);
				score.setText("Score: 2/8 -- 25%");
			} else if (count == 3) {
				score.setForeground(Color.RED);
				score.setText("Score: 3/8 -- 37.5%");
			} else if (count == 4) {
				score.setForeground(Color.BLACK);
				score.setText("Score: 4/8 -- 50%");
			} else if (count == 5) {
				score.setForeground(Color.BLACK);
				score.setText("Score: 5/8 -- 62.5%");
			} else if (count == 6) {
				score.setForeground(Color.BLACK);
				score.setText("Score: 6/8 -- 75%");
			} else if (count == 7) {
				score.setForeground(Color.GREEN);
				score.setText("Score: 7/8 -- 87.5%");
			} else {
				score.setForeground(Color.GREEN);
				score.setText("Score: 8/8 -- 100%");
			}

		}

		if (e.getSource() == close) {
			frame.dispose();
		}

	}

}