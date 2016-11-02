package study.model;

public class User_data {
	private String name=null;
	private String id=null;
	private String pw=null;
	public void setName(String user_name){ name = user_name; }
	public void setId(String user_id){ id = user_id; }
	public void setPw(String user_pw){ pw = user_pw; }
	public String getName(){return name;}
	public String getId(){return id;}
	public String getPw(){return pw;}
}
