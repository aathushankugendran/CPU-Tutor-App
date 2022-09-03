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

public class WhyDoWeNeedACPUScreen implements ActionListener {

	private static JLabel title = new JLabel("Why And What Type Of CPU Do We Need?");
	private static JPanel panel;
	private static JFrame frame = new JFrame("Why And What Type Of CPU Do We Need??");

	// fields - facts
	private static JLabel fact1 = new JLabel("- We need a CPU because it provides the instructions and processing");
	private static JLabel fact1a = new JLabel("power the computer needs to do its work.");
	private static JLabel fact2 = new JLabel("- When purchasing a CPU its better to have a more powerful and");
	private static JLabel fact2a = new JLabel("updated processor because that way your computer can complete");
	private static JLabel fact2b = new JLabel("its tasks much faster.");
	private static JLabel fact3 = new JLabel("- Getting a more powerful processor can help your computer think");
	private static JLabel fact3a = new JLabel("and work faster.");
	private static JLabel fact4 = new JLabel("- All in all a CPU is a crucial component for any computer and");
	private static JLabel fact4a = new JLabel("without it the computer wont run, just like for how a human body");
	private static JLabel fact4b = new JLabel("needs its brain to operate, the computer needs a CPU to operate.");

	private static JButton close = new JButton("Go Back");

	public WhyDoWeNeedACPUScreen() {

		// creates panel
		panel = new JPanel();

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
		title.setFont((new Font("Monospaced", Font.PLAIN, 75)));
		title.setBounds(200, 50, 1920, 220);
		panel.add(title);

		// fact 1
		fact1.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact1.setBounds(50, 250, 1900, 240);
		panel.add(fact1);

		// fact 1 - line 2
		fact1a.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact1a.setBounds(50, 250, 1500, 340);
		panel.add(fact1a);

		// fact 2 - line 1
		fact2.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact2.setBounds(50, 250, 1900, 540);
		panel.add(fact2);

		// fact 2 - line 2
		fact2a.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact2a.setBounds(50, 250, 1900, 640);
		panel.add(fact2a);

		// fact 2 - line 3
		fact2b.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact2b.setBounds(50, 250, 1900, 740);
		panel.add(fact2b);

		// fact 3 - line 1
		fact3.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact3.setBounds(50, 250, 1900, 890);
		panel.add(fact3);

		// fact 3 - line 2
		fact3a.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact3a.setBounds(50, 250, 1900, 990);
		panel.add(fact3a);

		// fact 4 - line 1
		fact4.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact4.setBounds(50, 250, 1900, 1140);
		panel.add(fact4);

		// fact 4 - line 2
		fact4a.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact4a.setBounds(50, 250, 1900, 1240);
		panel.add(fact4a);

		// fact 4 - line 2
		fact4b.setFont((new Font("Monospaced", Font.PLAIN, 45)));
		fact4b.setBounds(50, 250, 1900, 1340);
		panel.add(fact4b);

		// background color
		JLabel background = new JLabel(new ImageIcon("backgroundonly.png"));
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
