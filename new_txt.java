package web_bot_mp3;



import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class new_txt {

			public static void main(String[] args) throws Exception {
				String[] Urls = new String[] {"http://mp3party.net/pop-music"};//,"https://yandex.ua/"};
		        FileWriter nFile = new FileWriter("urls.txt");
		        for (int i=0;i<Urls.length;i++)
		        nFile.write(Urls[i]+"\n");
		        nFile.close();
		    }
	}
