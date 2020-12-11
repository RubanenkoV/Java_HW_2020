import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Create_file {

			public static void main(String[] args) throws Exception {
				String[] Urls = new String[] {"http://4pda.ru","https://yandex.ua/"};
		        FileWriter nFile = new FileWriter("urls.txt");
		        for (int i=0;i<Urls.length;i++)
		        nFile.write(Urls[i]+"\n");
		        nFile.close();
		    }
	}
