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

public class Definitions implements ActionListener {

	// fields - visuals
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	private static JLabel key = new JLabel(new ImageIcon("key.png"));

	// Arithmetic Logic Unit
	private static JLabel p1 = new JLabel(
			"An arithmetic logic unit (ALU) is a digital circuit used to perform arithmetic and logic");
	private static JLabel p1a = new JLabel(
			"operations. It represents the fundamental building block of the central processing unit");
	private static JLabel p1b = new JLabel("(CPU) of a computer. Modern CPUs contain very powerful and complex ALUs.");

	// Instruction register and pointer
	private static JLabel p2 = new JLabel(
			"The instruction pointer specifies the location in memory containing the next instruction");
	private static JLabel p2a = new JLabel(
			"to be executed by the CPU. When the CPU completes the execution of the current instruction,");
	private static JLabel p2b = new JLabel(
			"the next instruction is loaded into the instruction register from the memory location");
	private static JLabel p2c = new JLabel("pointed to by the instruction pointer.");

	// Random Access Memory (RAM)
	private static JLabel p3 = new JLabel(
			"The main purpose of the RAM is to store programs and data so that they are ready for use");
	private static JLabel p3a = new JLabel("when the CPU needs them.");

	// Memory management unit
	private static JLabel p4 = new JLabel(
			"The memory management unit (MMU) manages the data flow between the main memory (RAM) and the CPU.");
	private static JLabel p4a = new JLabel(
			"It also provides memory protection required in multitasking environments and conversion between");
	private static JLabel p4b = new JLabel("virtual memory addresses and physical addresses.");

	// CPU clock and control unit
	private static JLabel p5 = new JLabel(
			"All of the CPU components must be synchronized to work together smoothly. The control unit");
	private static JLabel p5a = new JLabel(
			"performs this function at a rate determined by the clock speed and is responsible for directing");
	private static JLabel p5b = new JLabel(
			"the operations of the other units by using timing signals that extend throughout the CPU.");

	// Cache
	private static JLabel p6 = new JLabel(
			"Cache memory is faster than the system RAM, and it is closer to the CPU because it is on the");
	private static JLabel p6a = new JLabel(
			"processor chip. The cache provides data storage and instructions to prevent the CPU from waiting");
	private static JLabel p6b = new JLabel(
			"for data to be retrieved from RAM. If the requested data is not in the cache, it's retrieved from");
	private static JLabel p6c = new JLabel(
			"RAM and uses predictive algorithms to move more data from RAM into the cache.");

	private static JButton close = new JButton("Go Back");

	public Definitions() {

		panel = new JPanel();
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);

		close.setFont((new Font("Monospaced", Font.BOLD, 19)));
		close.setBounds(10, 1020, 200, 55);
		close.setForeground(Color.BLACK);
		close.setBackground(Color.RED);
		close.setOpaque(true);
		close.setFocusable(false);
		close.addActionListener(this);
		panel.add(close);

		// def 1 - Arithmetic Logic Unit
		p1.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p1.setBounds(130, 290, 1900, 220);
		panel.add(p1);

		p1a.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p1a.setBounds(130, 305, 1900, 220);
		panel.add(p1a);

		p1b.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p1b.setBounds(130, 320, 1900, 220);
		panel.add(p1b);

		// def 2 - Instruction register and pointer
		p2.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p2.setBounds(130, 510, 1900, 220);
		panel.add(p2);

		p2a.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p2a.setBounds(130, 525, 1900, 220);
		panel.add(p2a);

		p2b.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p2b.setBounds(130, 540, 1900, 220);
		panel.add(p2b);

		p2c.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p2c.setBounds(130, 555, 1900, 220);
		panel.add(p2c);

		// def 3 - RAM
		p3.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p3.setBounds(130, 705, 1900, 220);
		panel.add(p3);

		p3a.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p3a.setBounds(130, 720, 1900, 220);
		panel.add(p3a);

		// def 4 - Memory Management Unit
		p4.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p4.setBounds(1010, 290, 1900, 220);
		panel.add(p4);

		p4a.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p4a.setBounds(1010, 305, 1900, 220);
		panel.add(p4a);

		p4b.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p4b.setBounds(1010, 320, 1900, 220);
		panel.add(p4b);

		// def 5 - cpu clock & control unit
		p5.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p5.setBounds(1010, 510, 1900, 220);
		panel.add(p5);

		p5a.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p5a.setBounds(1010, 525, 1900, 220);
		panel.add(p5a);

		p5b.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p5b.setBounds(1010, 540, 1900, 220);
		panel.add(p5b);

		// def 6 - cache
		p6.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p6.setBounds(1010, 705, 1900, 220);
		panel.add(p6);

		p6a.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p6a.setBounds(1010, 720, 1900, 220);
		panel.add(p6a);

		p6b.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p6b.setBounds(1010, 735, 1900, 220);
		panel.add(p6b);

		p6c.setFont((new Font("Monospaced", Font.PLAIN, 15)));
		p6c.setBounds(1010, 750, 1900, 220);
		panel.add(p6c);

		// background
		key.setBounds(0, 0, 1920, 1080);
		panel.add(key);

		// allows frame to display
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == close) {
			frame.dispose();
		}

	}
}
