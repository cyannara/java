package day11.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dept.DeptDAO;
import dept.DeptVO;


public class FrameTest extends JFrame {

	private JButton btn;
	private JTextField txt;
	private JTextField txtName;
	
	public FrameTest() {
		btn = new JButton("클릭");
		
		ActionListener action = (e) -> { 
			DeptDAO dao = new DeptDAO();
			DeptVO vo = new DeptVO();
			vo.setDepartment_id(txt.getText());
			vo.setDepartment_name(txtName.getText());
			dao.deptInsert(vo);
			JOptionPane.showMessageDialog(null, "저장완료.");			
		};
	
		btn.addActionListener(action);
		this.getContentPane().add(btn);
		
		txt = new JTextField(10);
		this.getContentPane().add(txt);
		
		txtName = new JTextField(10);
		this.getContentPane().add(txtName);
		
		this.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		FrameTest frame  = new FrameTest();
		frame.setTitle("프레임테스트");
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
