package day11.swing;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

import jdbc.dept.Dept;
import jdbc.dept.DeptDAO;

public class DeptSwing extends JFrame implements ActionListener{
	
	JTextField txtDepartmentId, txtDepartmentName, txtManagerId, txtLocation;
	JButton btnInsert, btnUpdate, btnDelete, btnSelectAll, btnSelectDepartmentName;
	JLabel lblDepartmentId, lblDepartmentName, lblManagerId, lblLocation;
	JTextArea textArea;
	
	DeptDAO dao;
	
	//생성자. 컴포넌트 생성 및 배치
	public DeptSwing() {
		dao = new DeptDAO();
		
		lblDepartmentId = new JLabel("번호");
		lblDepartmentName = new JLabel("부서명");
		lblManagerId = new JLabel("메니저");
		lblLocation = new JLabel("지역");
		
		txtDepartmentId = new JTextField();	
		txtDepartmentName = new JTextField();
		txtManagerId = new JTextField();
		txtLocation = new JTextField();
		
		btnInsert = new JButton("추가");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");
		btnSelectAll = new JButton("전체조회");
		btnSelectDepartmentName = new JButton("부서명조회");

		lblDepartmentId.setBounds(20, 30, 80, 25);
		lblDepartmentName.setBounds(20, 70, 80, 25);
		lblManagerId.setBounds(20, 110, 80, 25);
		lblLocation.setBounds(20, 150, 80, 25);	
		
		txtDepartmentId.setBounds(120, 30, 180, 25);
		txtDepartmentName.setBounds(120, 70, 180, 25);
		txtManagerId.setBounds(120, 110, 180, 25);
		txtLocation.setBounds(120, 150, 180, 25);
		
		btnInsert.setBounds(30, 200, 90, 25);
		btnUpdate.setBounds(130, 200, 90, 25);
		btnDelete.setBounds(230, 200, 90, 25);
		btnSelectAll.setBounds(30, 240, 90, 25);
		btnSelectDepartmentName.setBounds(130, 240, 90, 25);
		
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnDelete.addActionListener(this);
		btnSelectAll.addActionListener(this);
		btnSelectDepartmentName.addActionListener(this);
		
		textArea  = new JTextArea();
		textArea.setBounds(20, 280, 360, 260);
		
		Container ct = this.getContentPane();
		JPanel p1= new JPanel();
		p1.setLayout(null);		
		
		p1.add(lblDepartmentId);p1.add(lblDepartmentName);p1.add(lblManagerId);p1.add(lblLocation);
		p1.add(txtDepartmentId);p1.add(txtDepartmentName);p1.add(txtManagerId);p1.add(txtLocation);
		p1.add(btnInsert);p1.add(btnUpdate);p1.add(btnDelete);p1.add(btnSelectAll);
		p1.add(btnSelectDepartmentName);
		p1.add(textArea);
		
		ct.add(p1);
	}

	//이벤트 처리
	public void actionPerformed(ActionEvent e) {
		Dept dept = new Dept();
		if(e.getActionCommand().equals("추가")) 
		{
			dept.setLocationId(txtLocation.getText());
			dept.setDepartmentName(txtDepartmentName.getText());
			dept.setManagerId(txtManagerId.getText());
			dao.insertDB(dept);
		} else if (e.getActionCommand().equals("수정")) 
		{
			dept.setLocationId(txtLocation.getText());
			dept.setDepartmentName(txtDepartmentName.getText());
			dept.setManagerId(txtManagerId.getText());
			dept.setDepartmentId(txtDepartmentId.getText());
			dao.updateDB(dept);
		} else if  (e.getActionCommand().equals("삭제")) 
		{
			dept.setDepartmentId(txtDepartmentId.getText());
			dao.deleteDB(dept);
		} else if  (e.getActionCommand().equals("전체조회")) 
		{
			ArrayList<Dept> list = dao.getDBList();
			Iterator<Dept> iter = list.iterator();
			textArea.setText("");
			while (iter.hasNext()) {
				Dept data = (Dept)iter.next();
				textArea.append(data.getDepartmentId() + " : " + 
						        data.getDepartmentName() + " : " + 
						        data.getLocationId() + " : " + 
						        data.getManagerId() +"\n");
			}
		} else if  (e.getActionCommand().equals("부서명조회")) {
			dept.setLocationId(txtLocation.getText());
			ArrayList<Dept> list = dao.getDBSearchList(dept);
			Iterator<Dept> iter = list.iterator();
			textArea.setText("");
			while (iter.hasNext()) {
				Dept data = (Dept)iter.next();
				textArea.append(data.getDepartmentId() + " : " + 
						        data.getDepartmentName() + " : " + 
						        data.getLocationId() + " : " + 
						        data.getManagerId() +"\n");
			}
		}
	}
	
	
	public static void main(String[] args) {
		DeptSwing frame = new DeptSwing();
		frame.setSize(400,600);
		frame.setResizable(false);
		frame.setVisible(true);
	}	
}
