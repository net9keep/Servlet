package study.model;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Login_Model {
	private String user_id, user_pw;
	public Login_Model(String id, String pw) {
		user_id = id;
		user_pw = pw;
	}
	public int Success(){
		if(checkData()==0)
			return 0;
		return 0;
	}
	private int checkData(){
		if(user_id==null) return 0;
		else if(user_pw==null) return 0;
		else return 1;
	}
	private int logData(){
		try{
			private static FileWriter fw = new FileWriter("/Users/Achaean/Desktop/log.txt");
			BufferedWriter bw = new BufferedWriter(fw);
		}
		catch(IOException e){
			System.out.println("데이터를 기록하 못하였습니다.err : "+e);
			return 1;
		}
	}
}
