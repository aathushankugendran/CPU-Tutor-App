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

public class WhatIsACPUScreen implements ActionListener {

	// fields - title
	private static JLabel title = new JLabel("What Is A CPU ?");
	private static JPanel panel = new JPanel();
	private static JFrame frame = new JFrame("What Is A CPU ?");

	// fields - facts
	private static JLabel fact1 = new JLabel(
			"- The central processing unit (CPU) is a principal part of any digital computer");
	private static JLabel fact1a = new JLabel("system.");
	private static JLabel fact2 = new JLabel(
			"- A CPU calculates and interprets instructions while you’re surfing the web,");
	private static JLabel fact2a = new JLabel(
			"creating documents, playing games, or running software programs. It’s a critical");
	private static JLabel fact2b = new JLabel("component that your PC can’t function without.");
	private static JLabel fact3 = new JLabel(
			"- A CPU is a small computer chip found on top of the motherboard in your PC. ");
	private static JLabel fact3a = new JLabel(
			"It’s placed into the CPU socket with its pins facing down. A small lever that");
	private static JLabel fact3b = new JLabel("keeps it secure.");
	private static JLabel fact4 = new JLabel(
			"- CPUs generate a lot of heat, even when running for a short amount of time.");
	private static JLabel fact4a = new JLabel(
			"Due to this thermal activity, the CPU is usually attached to a heat sink with");
	private static JLabel fact4b = new JLabel("a fan located right on top of it.");

	private static JButton close = new JButton("Go Back");

	public WhatIsACPUScreen() {

		// creates Frame
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);

		panel.setLayout(null);

		close.setFont((new Font("Monospaced", Font.BOLD, 19)));
		close.setBounds(10, 1020, 200, 55);
		close.setForeground(Color.BLACK);
		close.setBackground(Color.RED);
		close.setOpaque(true);
		close.setFocusable(false);
		close.addActionListener(this);
		panel.add(close);

		// title label added to panel
		title.setFont((new Font("Monospaced", Font.PLAIN, 105)));
		title.setBounds(565, 50, 975, 220);
		panel.add(title);

		// fact 1 - line 1
		fact1.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact1.setBounds(50, 250, 1500, 220);
		panel.add(fact1);

		// fact 1 - line 2
		fact1a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact1a.setBounds(50, 250, 1500, 295);
		panel.add(fact1a);

		// fact 2 - line 1
		fact2.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact2.setBounds(50, 250, 1500, 420);
		panel.add(fact2);

		// fact 2 - line 2
		fact2a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact2a.setBounds(55, 250, 1500, 495);
		panel.add(fact2a);

		// fact 2 - line 3
		fact2b.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact2b.setBounds(55, 250, 1500, 570);
		panel.add(fact2b);

		// fact 3 - line 1
		fact3.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact3.setBounds(50, 250, 1500, 800);
		panel.add(fact3);

		// fact 3 - line 2
		fact3a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact3a.setBounds(55, 250, 1500, 875);
		panel.add(fact3a);

		// fact 3 - line 3
		fact3b.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact3b.setBounds(55, 250, 1500, 950);
		panel.add(fact3b);

		// fact 4 - line 1
		fact4.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact4.setBounds(50, 250, 1500, 1220);
		panel.add(fact4);

		// fact 4 - line 2
		fact4a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact4a.setBounds(55, 250, 1500, 1295);
		panel.add(fact4a);

		// fact 4 - line 3
		fact4b.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact4b.setBounds(55, 250, 1500, 1370);
		panel.add(fact4b);

		// background
		JLabel background = new JLabel(new ImageIcon("backgroundpluscpu.png"));
		background.setBounds(0, 0, 1920, 1080);
		panel.add(background);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == close) {
			frame.dispose();
		}

	}

}
