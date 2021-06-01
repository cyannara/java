/*
 * 새롭게 추가된 내용 : 고객 이름으로 검색하기와 전체보기
 */
package jdbc;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JDBCProStep3 extends JFrame implements ActionListener {
	  //컴포넌트 객체 선언
	  JPanel panWest; //왼쪽에 텍스트 필드
	  JPanel panSouth;//아래쪽에 버튼 
	  JPanel p1, p2, p3, p4, p5;
	  JTextField txtNo, txtName, txtEmail, txtTel;
	  JButton btnTotal, btnAdd, btnDel, btnSearch, btnCancel; 	  
      //검색과 전체보기를 위한 테이블 객체 생성
	  JTable table;  	  
	  //상태 변화를 위한 변수 선언
	  private static final int NONE=0;
	  private static final int ADD=1;
	  private static final int DELETE=2;
	  private static final int SEARCH=3;
	  private static final int TOTAL=4;	  
	  int cmd=NONE;
	  
	  Connection con; //디비 관련 객체 변수 선언

	  PreparedStatement pstmtInsert;
	  PreparedStatement pstmtDelete;
	  
	  private String driver = "org.gjt.mm.mysql.Driver";//private String driver = "com.mysql.jdbc.Driver";
	  private String url="jdbc:mysql://localhost:3306/test";
	  private String user="root";
	  private String pwd="mysql";
	  
	  private String sqlInsert="insert into customer values(?,?,?,?)";
	  private String sqlDelete="delete from customer where name=?";
	  
	  //새롭게 추가한 내용
	  MyModel model;
	  
	  PreparedStatement pstmtTotal, pstmtTotalScroll;
	  PreparedStatement pstmtSearch, pstmtSearchScroll;
	  
	  private String sqlTotal="select * from customer";
	  private String sqlSearch="select * from customer where name=?";
	  
	  public JDBCProStep3() {
		    //컴포넌트 붙이기
		    panWest=new JPanel(new GridLayout(5, 0));
		    p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		    p1.add(new JLabel("번  호"));
		    p1.add(txtNo=new JTextField(12));
		    panWest.add(p1);
		    
		    p2=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		    p2.add(new JLabel("이  름"));
		    p2.add(txtName=new JTextField(12));
		    panWest.add(p2);
		    
		    p3=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		    p3.add(new JLabel("이 메 일"));
		    p3.add(txtEmail=new JTextField(12));
		    panWest.add(p3);
		    
		    p4=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		    p4.add(new JLabel("전화번호"));
		    p4.add(txtTel=new JTextField(12));
		    panWest.add(p4);
		    
		    p5=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		    p5.add(new JLabel(""));
		    panWest.add(p5);
		    
		    add(panWest, "West");
		    
		    //화면 아래에 버튼 붙이기
		    panSouth=new JPanel();
		    panSouth.add(btnTotal=new JButton("전체보기"));
		    panSouth.add(btnAdd=  new JButton("추    가"));
		    panSouth.add(btnDel=  new JButton("삭    제"));
		    panSouth.add(btnSearch=  new JButton("검    색"));
		    panSouth.add(btnCancel=  new JButton("취    소"));
		    
		    add(panSouth, "South");
		    
            //이벤트 처리
		    btnTotal.addActionListener(this);
		    btnAdd.addActionListener(this);
		    btnDel.addActionListener(this);
		    btnSearch.addActionListener(this);
		    btnCancel.addActionListener(this);
		    
		    //빈 테이블 객체 생성 
		    add(new JScrollPane(table=new JTable()), "Center"); 
		    
		    //[종료] 버튼이 클릭되면 윈도가 닫히도록 한다.
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

		    //메인 창 출력  
		    setBounds(100, 100, 700, 300);
		    setVisible(true);
		    
		    //디비 연동
		    dbConnect();
	  }
	  
	  private void dbConnect(){
	      try{
	        Class.forName(driver);
	        con=DriverManager.getConnection(url, user, pwd);
	        
	        pstmtInsert=con.prepareStatement(sqlInsert);
	        pstmtDelete=con.prepareStatement(sqlDelete); 
	        //새롭게 추가한 내용,스크롤이 되는 전체보기와 검색
	        pstmtTotalScroll = con.prepareStatement(sqlTotal,
	          ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	        pstmtSearchScroll = con.prepareStatement(sqlSearch,
	          ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);         
	        //새롭게 추가한 내용,전체보기와 검색
	        pstmtTotal=con.prepareStatement(sqlTotal);
	        pstmtSearch=con.prepareStatement(sqlSearch);
	        
	        init();        
	      }catch(Exception e){
	        e.printStackTrace();
	      }
	    }

	public void actionPerformed(ActionEvent ae) {
	    Object obj=ae.getSource();
	    setTitle(ae.getActionCommand());//버턴 라벨내용을 창 제목에 출력
	    if(obj == btnAdd){
	      if(cmd != ADD){
	        setText(ADD);
	        return;
	      }
	      //setTitle(ae.getActionCommand());
          add();//추가 
	    }else if(obj == btnDel){
	      if(cmd != DELETE){
	        setText(DELETE);
	        return;
	      }
	      //setTitle(ae.getActionCommand());
	      del();//삭제 
	    }else if(obj == btnSearch){
	      if(cmd != SEARCH){
	        setText(SEARCH);
	        return;
	      }
	      //setTitle(ae.getActionCommand());
	      search();//검색 
	    }else if(obj == btnTotal){
	      //setTitle(ae.getActionCommand());
	      total();//전체 보기 
	    }
	    setText(NONE);
	    init();  
	}
	
    private void init(){
      txtNo.setText("");       txtNo.setEditable(false);
      txtName.setText("");     txtName.setEditable(false);
      txtEmail.setText("");    txtEmail.setEditable(false);
      txtTel.setText("");      txtTel.setEditable(false);
    }
    
    private void setText(int command){
      switch(command){
      case ADD :
        txtNo.setEditable(true);
        txtName.setEditable(true);
        txtEmail.setEditable(true);
        txtTel.setEditable(true);
        break;
      case DELETE :
      case SEARCH :
          txtName.setEditable(true);
          break;
      }
      setButton(command);
    }
    
    private void setButton(int command){
        //취소버튼을 제외하고 어떤 버튼이 눌리더라도 모든 버튼이 비활성화
        btnTotal.setEnabled(false);
        btnAdd.setEnabled(false);
        btnDel.setEnabled(false);
        btnSearch.setEnabled(false);
         switch(command){
        case ADD :
          btnAdd.setEnabled(true);
          cmd=ADD;
          break;
        case DELETE :
          btnDel.setEnabled(true);
          cmd=DELETE;
          break;   
        case SEARCH :
          btnSearch.setEnabled(true);
          cmd=SEARCH;
          break;      
        case TOTAL :
          btnTotal.setEnabled(true);
          cmd=TOTAL;
          break;      
        case NONE :
          btnAdd.setEnabled(true);        
          btnDel.setEnabled(true);
          btnSearch.setEnabled(true);
          btnTotal.setEnabled(true);
          btnCancel.setEnabled(true);
          cmd=NONE;
          break;                
         }
      }
	  public static void main(String[] args) {
		//메인 창을 위한 객체 생성 
	    new JDBCProStep3();
	 }
		//추가 
	   private void add(){
	        try{
		          String strNo=txtNo.getText();
		          String strName=txtName.getText();
		          String strEmail=txtEmail.getText();
		          String strTel=txtTel.getText();
		          if(strNo.length()<1 || strName.length()<1){
		            JOptionPane.showMessageDialog(null, "번호와 이름은 필수 입력란입니다.");
		            return;
		          }
		          pstmtInsert.setInt(1, Integer.parseInt(strNo));
		          pstmtInsert.setString(2, strName);
		          pstmtInsert.setString(3, strEmail);
		          pstmtInsert.setString(4, strTel);
		          pstmtInsert.executeUpdate();        
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        JOptionPane.showMessageDialog(null, "추가 성공");
	  }      

	 //삭제
	  private void del(){
	 	   try{
	 	         String strName=txtName.getText();
	 		          
	 	         if(strName.length()<1){
	 		       JOptionPane.showMessageDialog(null, "이름은 필수 입력란입니다.");
	 		            return;
	 		          }
	 		          
	 		          pstmtDelete.setString(1, strName);
	 		          pstmtDelete.executeUpdate(); 
	 		        }catch(Exception e){
	 		            e.printStackTrace();
	 		          }
	 		        JOptionPane.showMessageDialog(null, "삭제 성공");
	 		      }
		//전체 보기
	    private void total(){
	      try{
	    	//executeQuery메소드는 쿼리문을 DB에 보내 실행하도록하고 
	    	//그 결과값을 ResultSet으로 받게 된다. 
	        ResultSet rsScroll=pstmtTotalScroll.executeQuery();
	        ResultSet rs=pstmtTotal.executeQuery();
	        if(model==null)
	          model=new MyModel();
	        model.getRowCount(rsScroll);
	        model.setData(rs); //ResultSet을 2차원배열로 저장
	        table.setModel(model);
	        table.updateUI();

	}catch(Exception e){
	        e.printStackTrace();
	      }
	    }
	    
	    //검색
	    private void search(){
	    String strName=txtName.getText();
	    if(strName.length()<1){
	      JOptionPane.showMessageDialog(null, "이름은 필수 입력란입니다.");
	      return;
	    }
	    try{
	      pstmtSearchScroll.setString(1, strName);
	      ResultSet rsScroll=pstmtSearchScroll.executeQuery(); 
	      pstmtSearch.setString(1, strName);
	      ResultSet rs=pstmtSearch.executeQuery(); 
	         if(model==null)
	           model=new MyModel();
	        model.getRowCount(rsScroll);
	        model.setData(rs);
	      table.setModel(model);
	      table.updateUI();          
	    }catch(Exception e){
	        e.printStackTrace();
	      }
	   }
}
