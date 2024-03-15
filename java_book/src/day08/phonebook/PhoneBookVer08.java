/*
 * ��ȭ��ȣ ���� ���α׷� ���� ������Ʈ
 * Version 0.8
 */
package day08.phonebook;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Iterator;
import java.io.*;

interface INIT_MENU
{
	int INPUT=1, SEARCH=2, DELETE=3, EXIT=4;
}

interface INPUT_SELECT
{
	int NORMAL=1, UNIV=2, COMPANY=3;
}

class MenuChoiceException extends Exception
{
	int wrongChoice;
	
	public MenuChoiceException(int choice)
	{
		super("�߸��� ������ �̷������ϴ�.");
		wrongChoice=choice;
	}
	
	public void showWrongChoice()
	{
		System.out.println(wrongChoice+"�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}

class PhoneInfo implements Serializable
{
	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String num)
	{
		this.name=name;
		phoneNumber=num;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("name: "+name);
		System.out.println("phone: "+phoneNumber);
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		PhoneInfo cmp=(PhoneInfo)obj;
		if(name.compareTo(cmp.name)==0)
			return true;
		else
			return false;
	}

	//�߰�
	@Override
	public String toString() {
		return  INPUT_SELECT.NORMAL +"," + name + "," + phoneNumber +"\r\n";
	}
	
	
}

class PhoneUnivInfo extends PhoneInfo
{
	String major;
	int year;	
	
	public PhoneUnivInfo(String name, String num, String major, int year)
	{
		super(name, num);
		this.major=major;
		this.year=year;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("major: "+major);
		System.out.println("year: "+year);
	}

	// �߰� 
	@Override
	public String toString() {
		return INPUT_SELECT.UNIV + "," + name + "," + phoneNumber  + "," + major + "," + year + "\r\n";
	}
	
	
}

class PhoneCompanyInfo extends PhoneInfo
{
	String company;
	
	public PhoneCompanyInfo(String name, String num, String company)
	{
		super(name, num);
		this.company=company;
	}
	
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("company: "+company);
	}

	//�߰�
	@Override
	public String toString() {
		return INPUT_SELECT.COMPANY +"," + name + "," + phoneNumber + "," + company + "\n";
	}
}

class PhoneBookManager
{
	//private final File dataFile=new File("H:/io_test/PhoneBook3.dat");
	//����:  ������ġ
	private final File dataFile=new File("d:/PhoneBook3.txt");
	HashSet<PhoneInfo> infoStorage=new HashSet<PhoneInfo>();
	
	static PhoneBookManager inst=null;
	public static PhoneBookManager createManagerInst()
	{
		if(inst==null)
			inst=new PhoneBookManager();
		
		return inst;
	}
	
	private PhoneBookManager()
	{
		readFromFile();
	}
	
	private PhoneInfo readFriendInfo()
	{
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}
	
	private PhoneInfo readUnivFriendInfo()
	{
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("����: ");
		String major=MenuViewer.keyboard.nextLine();
		System.out.print("�г�: ");
		int year=MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}
	
	private PhoneInfo readCompanyFriendInfo()
	{
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phone=MenuViewer.keyboard.nextLine();
		System.out.print("ȸ��: ");
		String company=MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);	
	}	
	
	public void inputData() throws MenuChoiceException
	{
		System.out.println("������ �Է��� �����մϴ�..");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>> ");
		int choice=MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info=null;
		
		if(choice<INPUT_SELECT.NORMAL || choice>INPUT_SELECT.COMPANY)
			throw new MenuChoiceException(choice);
		
		switch(choice)
		{
		case INPUT_SELECT.NORMAL:
			info=readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info=readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info=readCompanyFriendInfo();
			break;
		}
		
		boolean isAdded=infoStorage.add(info);
		if(isAdded==true)
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�. \n");
		else
			System.out.println("�̹� ����� �������Դϴ�. \n");
	}
	
	public void searchData()
	{
		System.out.println("������ �˻��� �����մϴ�..");
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		
		PhoneInfo info=search(name);
		if(info==null)
		{
			System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");
		}
		else
		{
			info.showPhoneInfo();
			System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�. \n");			
		}
	}
	
	public void deleteData()
	{
		System.out.println("������ ������ �����մϴ�..");
		
		System.out.print("�̸�: ");
		String name=MenuViewer.keyboard.nextLine();
		
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.compareTo(curInfo.name)==0)
			{
				itr.remove();
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�. \n");
				return;
			}
		}
		
		System.out.println("�ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�. \n");	
	}
	
	private PhoneInfo search(String name)
	{
		Iterator<PhoneInfo> itr=infoStorage.iterator();
		while(itr.hasNext())
		{
			PhoneInfo curInfo=itr.next();
			if(name.compareTo(curInfo.name)==0)
				return curInfo;
		}
		return null;
	}
	
	public void storeToFile()
	{
		try
		{
			FileOutputStream file=new FileOutputStream(dataFile);		
			/*ObjectOutputStream out=new ObjectOutputStream(file);
			Iterator<PhoneInfo> itr=infoStorage.iterator();
			while(itr.hasNext())
			out.writeObject(itr.next()); */
			
			//����: char writer�� ����
			FileWriter out = new FileWriter(dataFile);
			Iterator<PhoneInfo> itr=infoStorage.iterator();
			while(itr.hasNext()) {
				out.write(itr.next().toString());
			}			
			out.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		if(dataFile.exists()==false)
			return;
		
		try
		{
/*			FileInputStream file=new FileInputStream(dataFile);		
			ObjectInputStream in=new ObjectInputStream(file);
			
			while(true)
			{
				PhoneInfo info=(PhoneInfo)in.readObject();
				if(info==null)
					break;
				infoStorage.add(info);
			}*/
			
			//����: �ؽ�Ʈ���Ϸ� ���� �Է�   
			
			 FileReader reader = new FileReader(dataFile);//reader.read()
	         BufferedReader in = new BufferedReader(reader);//���ۿ� �־ ���ڿ��� �о���̱� ����
	         String string;
	         PhoneInfo info= null;
	         while ((string = in.readLine()) != null) {
	        	 String[] record = string.split(",");
	        	 int gbn = Integer.parseInt(record[0]); 
	        	 switch(gbn)
	     		{
	     		case INPUT_SELECT.NORMAL:
	     			info = new PhoneInfo(record[1],record[2]); 
	     			break;
	     		case INPUT_SELECT.UNIV:
	     			info = new PhoneUnivInfo(record[1],record[2],record[3],Integer.parseInt(record[4])); 
	     			break;
	     		case INPUT_SELECT.COMPANY:
	     			info=new PhoneCompanyInfo(record[1],record[2],record[3]);
	     			break;
	     		}      	
	        		
	        	 infoStorage.add(info);
	        	 System.out.println(string);
	         }
	         in.close();
		}
		catch(IOException e)
		{
			return;
		}
		//���� : 
/*		catch(ClassNotFoundException e)
		{
			return;
		}*/
	}
}

class MenuViewer
{
	public static Scanner keyboard=new Scanner(System.in);
	
	public static void showMenu()
	{
		System.out.println("�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����");
		System.out.print("����: ");
	}
}

class PhoneBookVer08
{	
	public static void main(String[] args)
	{
		PhoneBookManager manager=PhoneBookManager.createManagerInst();
		int choice;
		
		while(true)
		{
			try
			{
				MenuViewer.showMenu();
				choice=MenuViewer.keyboard.nextInt();
				MenuViewer.keyboard.nextLine();
				
				if(choice<INIT_MENU.INPUT || choice>INIT_MENU.EXIT)
					throw new MenuChoiceException(choice);
				
				switch(choice)
				{
				case INIT_MENU.INPUT:
					manager.inputData();
					break;
				case INIT_MENU.SEARCH:
					manager.searchData();
					break;
				case INIT_MENU.DELETE:
					manager.deleteData();
					break;
				case INIT_MENU.EXIT:
					manager.storeToFile();
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
			catch(MenuChoiceException e)
			{
				e.showWrongChoice();
				System.out.println("�޴� ������ ó������ �ٽ� �����մϴ�.\n");
			}
		}
	}
}