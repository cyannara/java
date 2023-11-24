package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import jdbc.Employees;
import jdbc.dept2.EmployeesDAO;

public class FrameEmp extends JFrame implements ActionListener {

	//컴포넌트 선언
	JTextField txtEmployee_id; 
	JTextField txtFirst_name;
	JTextField txtLast_name;
	JTextField txtEmail;
	JTextField txtJob_id;
	
	JButton btnInsert, btnSelectOne, btnDelete;
	
	public FrameEmp() {
		//frame 속성
		this.setTitle("emloyee manage");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(8, 2));
		//컴포넌트 생성 
		txtEmployee_id = new JTextField();
		txtFirst_name = new JTextField();
		txtLast_name = new JTextField();
		txtEmail = new JTextField();
		txtJob_id = new JTextField();
		btnInsert = new JButton("insert");
		btnSelectOne = new JButton("select");
		btnDelete = new JButton("delete");
		
		//이벤트 연결
		btnInsert.addActionListener(this);
		btnSelectOne.addActionListener(this);
		btnDelete.addActionListener(this);
		
		//프레임에 연결
		this.getContentPane().add(new Label("Employee_id"));
		this.getContentPane().add(txtEmployee_id);		
		this.getContentPane().add(new Label("First_name"));
		this.getContentPane().add(txtFirst_name);		
		this.getContentPane().add(new Label("Last_name"));
		this.getContentPane().add(txtLast_name);		
		this.getContentPane().add(new Label("Email"));
		this.getContentPane().add(txtEmail);			
		this.getContentPane().add(new Label("Job_id"));
		this.getContentPane().add(txtJob_id);
		this.getContentPane().add(btnInsert);
		this.getContentPane().add(btnSelectOne);
		this.getContentPane().add(btnDelete);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new FrameEmp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		EmployeesDAO empDAO = new EmployeesDAO();
		if (e.getSource() == btnInsert) {
			Employees emp = new Employees();
			emp.setEmployee_id(Integer.parseInt(txtEmployee_id.getText()));
			emp.setFirst_name(txtFirst_name.getText());
			emp.setLast_name(txtLast_name.getText());
			emp.setEmail(txtEmail.getText());
			emp.setJob_id(txtJob_id.getText());
			empDAO.insert(emp);
			JOptionPane.showMessageDialog(this, "등록완료");
		} else if (e.getActionCommand().equals("select")) {
			int emp_id = Integer.parseInt(txtEmployee_id.getText());
			Employees emp = empDAO.selectOne(emp_id);
			txtEmployee_id.setText(emp.getEmployee_id().toString());
			txtFirst_name.setText(emp.getFirst_name());
			txtLast_name.setText(emp.getLast_name());
			txtEmail.setText(emp.getEmail());
			txtJob_id.setText(emp.getJob_id());			
		} else if(e.getSource() == btnDelete) {
			
		}
	}
	
}
