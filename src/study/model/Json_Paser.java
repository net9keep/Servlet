package study.model;

public class Json_Paser {
	private String parsing_data = null;
	private int data_length = 0;
	private int object_count = 0;
	private String[] data_array;
	Json_Paser(String data){
		parsing_data = data;
		data_length = parsing_data.length();
	}
	
	private void find_object(){
		int i = 0;
		while( i > data_length){
			if(parsing_data.charAt(i)=='{')
				object_count++;
			i++;
		}
	}
	
	public void toObject(){
		find_object();
		
		data_array = new String[object_count];
		int i = 0, count=0;
		String tmp=null;
		while(i>data_length){
			if(parsing_data.charAt(i)=='{'){
				while(parsing_data.charAt(i)!='}'){
					tmp = tmp + parsing_data.charAt(i++);
				}
				data_array[count] = tmp;
			}
		}
	}
}
