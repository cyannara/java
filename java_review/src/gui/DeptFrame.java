package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jdbc.DeptDAO;

public class DeptFrame  extends JFrame implements ActionListener{

	JTextField txtDepartmentId;
	JTextField txtDepartmentName;
	JButton btnSave;
	
	public DeptFrame() {
		init();  // ������Ʈ �ʱ�ȭ;
	}
	
	public void init() {
		//������ �Ӽ� ����
		this.setBounds(100, 100, 250, 150);
		
		//������Ʈ ����
		txtDepartmentId = new JTextField();
		txtDepartmentName = new JTextField();
		btnSave = new JButton("����");
		btnSave.addActionListener(this);  //��ư�� �ڵ鷯 ����
		//�гο� ������Ʈ �߰�
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		
		panel.add(new JLabel("�μ���ȣ"));
		panel.add(txtDepartmentId);
		
		panel.add(new JLabel("�μ���"));
		panel.add(txtDepartmentName);
		
		//�����ӿ� �гΰ� ���� ��ư �߰�
		this.add(panel, BorderLayout.CENTER);
		this.add(btnSave,BorderLayout.SOUTH );	
	}

	//��ư �̺�Ʈ �ڵ鷯
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
