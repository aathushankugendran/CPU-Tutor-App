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

public class HowDoesTheCPUWorkScreen implements ActionListener {

	// fields - title
	private static JLabel title;
	private static JPanel panel;
	private static JFrame frame;

	// fields - facts
	private static JLabel fact1;
	private static JLabel fact2;
	private static JLabel fact2a;
	private static JLabel fact2b;
	private static JLabel fact3;
	private static JLabel fact3a;
	private static JLabel fact4;
	private static JLabel fact4a;
	private static JLabel fact4b;

	private static JButton close = new JButton("Go Back");

	public HowDoesTheCPUWorkScreen() {

		// creates panel
		panel = new JPanel();

		// creates Frame
		frame = new JFrame("How Does The CPU Work ?");
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		panel.setLayout(null);

		// title label added to panel
		title = new JLabel("How Does The CPU Work ?");
		title.setFont((new Font("Monospaced", Font.PLAIN, 105)));
		title.setBounds(320, 50, 1500, 220);
		panel.add(title);

		close.setFont((new Font("Monospaced", Font.BOLD, 19)));
		close.setBounds(10, 1020, 200, 55);
		close.setForeground(Color.BLACK);
		close.setBackground(Color.RED);
		close.setOpaque(true);
		close.setFocusable(false);
		close.addActionListener(this);
		panel.add(close);

		// fact 1
		fact1 = new JLabel("- The working of the CPU is defined as a three-step process.");
		fact1.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact1.setBounds(50, 250, 1500, 220);
		panel.add(fact1);

		// fact 2 - line 1
		fact2 = new JLabel("- First, an instruction is fetched from memory.");
		fact2.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact2.setBounds(50, 250, 1500, 420);
		panel.add(fact2);

		// fact 2 - line 2
		fact2a = new JLabel("- Second, the instruction is decoded and the processor places the data");
		fact2a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact2a.setBounds(50, 250, 1500, 620);
		panel.add(fact2a);

		// fact 2 - line 3
		fact2b = new JLabel("into the A and B registers.");
		fact2b.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact2b.setBounds(55, 250, 1500, 695);
		panel.add(fact2b);

		// fact 3 - line 1
		fact3 = new JLabel("- Third, the instruction is executed using the A and B registers with the");
		fact3.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact3.setBounds(50, 250, 1500, 895);
		panel.add(fact3);

		// fact 3 - line 2
		fact3a = new JLabel(" final result put into the accumulator.");
		fact3a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact3a.setBounds(55, 250, 1500, 970);
		panel.add(fact3a);

		// fact 4 - line 1
		fact4 = new JLabel("- These three steps repeat in a cycle that begins again with the CPU");
		fact4.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact4.setBounds(50, 250, 1500, 1170);
		panel.add(fact4);

		// fact 4 - line 2
		fact4a = new JLabel(" fetching the next instruction. The steps are referred to as the");
		fact4a.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact4a.setBounds(55, 250, 1500, 1245);
		panel.add(fact4a);

		// fact 4 - line 3
		fact4b = new JLabel("instruction cycle of the CPU.");
		fact4b.setFont((new Font("Monospaced", Font.PLAIN, 30)));
		fact4b.setBounds(55, 250, 1500, 1320);
		panel.add(fact4b);

		// background
		JLabel background = new JLabel(new ImageIcon("backgroundpluschart.png"));
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
