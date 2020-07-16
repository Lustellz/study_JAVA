package kosta.oop3;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame implements ActionListener{

	MyFrame(){
		Button b = new Button("button");
		add(b);
		setSize(300,200);
		setLocation(300,200);
		setVisible(true);
		b.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button b = (Button) e.getSource();
		String label = b.getLabel();
		System.out.println(label+" 선택됨");
	}

}
