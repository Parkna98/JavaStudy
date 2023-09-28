import java.io.FileReader;

public class DataCollection {
	static String fileReaderData(String path) // 메소드
	{
		String seoulData="";
		try
		{
			FileReader fr=new FileReader("C:\\javaDev\\"+path);
			int i=0;
			while((i=fr.read())!=-1) {
				seoulData+=(char)i;
			}
			fr.close();
		}catch(Exception ex) {}
		
		return seoulData;
	}
}
