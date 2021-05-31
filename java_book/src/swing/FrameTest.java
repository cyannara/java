package swing;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class FrameTest implements ActionListener{

	
	public static void main(String[] args) {
		//프레임(창)
		JFrame frame = new JFrame("테스트");
		frame.setSize(300, 400);
		
		//컴포넌트 생성
		JTextField tf1 = new JTextField();
		JButton btn1 = new JButton("눌러줘!!");
		
		//이벤트 지정
		btn1.addActionListener(new FrameTest());
		//패널 레이아웃 변경
		frame.setLayout(new GridLayout(2,6));
		//컴포넌트 추가
		frame.getContentPane().add(new Label("emp_id")); frame.getContentPane().add(tf1);
		frame.getContentPane().add(btn1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("클릭됨");		
	}

}
