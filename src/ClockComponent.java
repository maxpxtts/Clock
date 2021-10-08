/**
 * ClockComponent.java - Instantiates the graphics2d class and calls draw method for components
 * @author Max Petts / eeub35
 * @version 0.1
 * @since 15/10/18
 */

import java.awt.*;
import javax.swing.*;
import java.time.LocalTime;

@SuppressWarnings("serial")
public class ClockComponent extends JComponent{
	
	// Will instantiating this speed up component painting?
	private LocalTime local_time = LocalTime.now();

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		local_time = LocalTime.now();
				
		new Clock(g2, local_time.getHour(), local_time.getMinute());
	}
}
