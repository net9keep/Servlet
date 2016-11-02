package study.model;

public class Check_inputData {
	private String user_name,user_id,user_pw;
	public Check_inputData(String name, String id, String pw){
		user_name = name;
		user_id = id;
		user_pw = pw;
	}
	public Check_inputData(String id, String pw){
		user_name = null;
		user_id = id;
		user_pw = pw;
	}
	private String Chk_Login(){
		String tmp_log = null;
		if(user_id==null)
			tmp_log = tmp_log + "user_id is null";
		if(user_pw==null)
			tmp_log = tmp_log + "user_pw is null";
		return tmp_log;
	}
	private String Chk_Signup(){
		String tmp_log = null;
		if(user_name==null)
			tmp_log = tmp_log + "user_name is null/";
		if(user_id==null)
			tmp_log = tmp_log + "user_id is null/";
		if(user_pw==null)
			tmp_log = tmp_log + "user_pw is null/";
		return tmp_log;
	}
}
