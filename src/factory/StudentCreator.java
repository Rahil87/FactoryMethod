package factory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentCreator  implements Factory{
	
//bu metodun funksiyasi melumatlari fayldan oxumaqdir
	
	@Override
	public Product getData() {
	      String str="C:/New Text Document.txt";
	      try {
				 FileReader fw = new FileReader(str);
				 BufferedReader bw = new BufferedReader(fw);
				 bw.readLine();
				 bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
					 return  new Student();
	   
	}

}
