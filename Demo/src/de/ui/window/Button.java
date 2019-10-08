package de.ui.window;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Button extends JButton
{
	public static void main(String[] args)
	{
		// first example
		Button button = new Button();
		button.setText("Text");
		button.setBackground(Color.RED);
		button.addActionListener(e -> clicked()); // on click, "clicked()" is called.

		// second example - called: "Builder pattern"
		Button button2 = new Button().withText("Text").withColor(Color.RED).withAction(e -> clicked());
	}

	private static void clicked()
	{
		// enter some code here. Code will be executed by button click
	}

	private Button withAction(ActionListener action)
	{
		this.addActionListener(action);
		return this;
	}

	private Button withText(String text)
	{
		this.setText(text);
		return this;
	}

	private Button withColor(Color color)
	{
		this.setBackground(color);
		return this;
	}
}
