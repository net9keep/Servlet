package study.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;

public class File_Controll {
	private String data_path = "/Users/Achaean/Desktop/user.txt";
	private String log_path = "/Users/Achaean/Desktop/log.txt";
	private String s = new String();
	
	public String file_Read() throws IOException{
		try{
			FileReader reader = new FileReader(data_path);
			int c;
			while((c=reader.read()) != -1){
			  s = s + (char) c;
			}
			reader.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File is Not Found");
			File file = new File(data_path);
			file.createNewFile();
			file_Read();
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		if(s.length()==0)
			s=null;
		return s;
	}
	
	public int file_Write(String data, String path) throws IOException{
		
		String tmp_path = null;
		if(path.equals("data"))
			tmp_path = data_path;
		else if(path.equals("log"))
			tmp_path = log_path;
		else return 0;
		
		try{
			FileWriter fw = new FileWriter(tmp_path);
			fw.write(data);
			fw.flush();
			fw.close();
		}
		catch(FileNotFoundException e){
			System.out.println("File is Not Found");
			File file = new File(tmp_path);
			file.createNewFile();
			file_Write(data, path);
		}
		catch(IOException e){
			System.out.println(e);
			return 1;
		}
		return 0;
	}
}
