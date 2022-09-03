package CulminatingProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main implements ActionListener {

	// fields - visuals
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	private static JLabel background = new JLabel(new ImageIcon("mainbackground.png"));

	// fields - buttons
	private static JButton what = new JButton("What Is A CPU ?");
	private static JButton how = new JButton("How Does The CPU Work ?");
	private static JButton why = new JButton("Why And What Type Of CPU Do We Need?");
	private static JButton key = new JButton("Key Concepts & Definitons");
	private static JButton quiz = new JButton("Quiz");
	
	
	public Main() {
		
		panel = new JPanel();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);


		// (WhatIsACPU Screen) button
		what.setFont((new Font("Monospaced", Font.BOLD, 19)));
		what.setBounds(775, 100, 355, 85);
		what.setForeground(Color.BLACK);
		what.setBackground(Color.BLACK);
		what.setOpaque(true);
		what.setFocusable(false);
		what.addActionListener(this);
		panel.add(what);

		// (HowDoesTheCPUWork Screen) button
		how.setFont((new Font("Monospaced", Font.BOLD, 19)));
		how.setBounds(40, 185, 355, 85);
		how.setForeground(Color.BLACK);
		how.setBackground(Color.BLACK);
		how.setOpaque(true);
		how.setFocusable(false);
		how.addActionListener(this);
		panel.add(how);

		// (WhyDoWeNeedACPU Screen) button
		why.setFont((new Font("Monospaced", Font.BOLD, 17)));
		why.setBounds(1525, 185, 390, 85);
		why.setForeground(Color.BLACK);
		why.setBackground(Color.BLACK);
		why.setOpaque(true);
		why.setFocusable(false);
		why.addActionListener(this);
		panel.add(why);

		// (Definitons Screen) button
		key.setFont((new Font("Monospaced", Font.BOLD, 19)));
		key.setBounds(40, 820, 355, 85);
		key.setForeground(Color.BLACK);
		key.setBackground(Color.BLACK);
		key.setOpaque(true);
		key.setFocusable(false);
		key.addActionListener(this);
		panel.add(key);

		// (Quiz Screen) button
		quiz.setFont((new Font("Monospaced", Font.BOLD, 19)));
		quiz.setBounds(1545, 810, 355, 85);
		quiz.setForeground(Color.BLACK);
		quiz.setBackground(Color.BLACK);
		quiz.setOpaque(true);
		quiz.setFocusable(false);
		quiz.addActionListener(this);
		panel.add(quiz);
		
		background.setBounds(0, 0, 1920, 1080);
		panel.add(background);

		// allows frame to display
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == what) {
			new WhatIsACPUScreen();
		}
		else if (e.getSource() == how) {
			new HowDoesTheCPUWorkScreen();
		}
		else if (e.getSource() == why) {
			new WhyDoWeNeedACPUScreen();
		}
		else if (e.getSource() == key) {
			new Definitions();
		}
		else {
			if (e.getSource() == quiz) {
				frame.dispose();
				new Quiz();
			}
		}
	}

}
