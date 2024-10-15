package day11.swing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import day10JDBC.jdbc.DeptDAO;

public class DeptFrame  extends JFrame implements ActionListener{

	JTextField txtDepartmentId;
	JTextField txtDepartmentName;
	JButton btnSave;
	
	public DeptFrame() {
		init();  // 컴포넌트 초기화;
	}
	
	public void init() {
		//프레임 속성 변경
		this.setBounds(100, 100, 250, 150);
		
		//컴포넌트 생성
		txtDepartmentId = new JTextField();
		txtDepartmentName = new JTextField();
		btnSave = new JButton("저장");
		btnSave.addActionListener(this);  //버튼에 핸들러 연결
		//패널에 컴포넌트 추가
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		
		panel.add(new JLabel("부서번호"));
		panel.add(txtDepartmentId);
		
		panel.add(new JLabel("부서명"));
		panel.add(txtDepartmentName);
		
		//프레임에 패널과 저장 버튼 추가
		this.add(panel, BorderLayout.CENTER);
		this.add(btnSave,BorderLayout.SOUTH );	
	}

	//버튼 이벤트 핸들러
	@Override
	public void actionPerformed(ActionEvent e) {
		DeptDAO dao = new DeptDAO();
		dao.insert(txtDepartmentId.getText(), 
				   txtDepartmentName.getText());
	}
	
	public static void main(String[] args) {
		DeptFrame frame = new DeptFrame();
		frame.setVisible(true);
	}
}
