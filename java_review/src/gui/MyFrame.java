package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame  {
	//�ʵ�
	JTextField tf;
	JButton btn;	
	//������ -> ������Ʈ �ʱ�ȭ �޼��� ȣ��
	public MyFrame() {
		init();
	}	
	//�޼���
	public void init() {
		//������ ���� : Ÿ��Ʋ, â�� ũ�� �� â�� �Ӽ��� ����
		this.setTitle("�������");
		this.setBounds(200, 200, 300, 300);
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridLayout(2, 1, 50, 50));
		
		//������Ʈ ����
		tf = new JTextField();  
		btn = new JButton();   //������Ʈ ����
		btn.setText("����");     //������Ʈ �Ӽ� ����
		                       //�̺�Ʈ ����
        btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("Ŭ����.");				
			}
		});	
		//������Ʈ ��ġ
        //tf.setBounds(50, 100, 200, 30);
        //btn.setBounds(300, 100, 80, 30);
		this.add(tf);
		this.add(btn);
	}	
}
