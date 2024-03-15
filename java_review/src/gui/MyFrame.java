package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame  {
	//필드
	JTextField tf;
	JButton btn;	
	//생성자 -> 컴포넌트 초기화 메서드 호출
	public MyFrame() {
		init();
	}	
	//메서드
	public void init() {
		//프레임 정보 : 타이틀, 창의 크기 등 창의 속성을 지정
		this.setTitle("사원관리");
		this.setBounds(200, 200, 300, 300);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(2, 1, 50, 50));
		
		//컴포넌트 생성
		tf = new JTextField();  
		btn = new JButton();   //컴포넌트 생성
		btn.setText("저장");     //컴포넌트 속성 변경
		                       //이벤트 지정
        btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("클릭됨.");				
			}
		});	
		//컴포넌트 배치
        //tf.setBounds(50, 100, 200, 30);
        //btn.setBounds(300, 100, 80, 30);
		this.add(tf);
		this.add(btn);
	}	
}
