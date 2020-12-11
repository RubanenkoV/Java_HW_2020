import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.jsoup.Jsoup;
import org.jsoup.select.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class WEB
{
public static int num=1;
public static String SRC  = "";

public static void main(String[] arguments) throws IOException, InterruptedException 
{
	for(;;)
	{
	List<String> list = new ArrayList<String>();
	Scanner in = new Scanner(new File("C:\\Users\\PromeV\\IdeaProjects\\Web_Bot\\urls.txt"));
	while (in.hasNextLine())
	list.add(in.nextLine());
	String[] Urls = list.toArray(new String[0]);
	
	for (int k=0;k<Urls.length;k++) 
	{
	String tag="Samsung";
	System.out.print("\ntag: "+tag+"\nsite: "+Urls[k]+"\nstatus: ");
	try {
	List<Article> articleList = new ArrayList<>();
	Document doc = Jsoup.connect(Urls[k]).get();	
	Elements h2Elements = doc.getElementsByAttributeValue("class","list-post-title");
	Elements i2Elements = doc.getElementsByAttributeValue("class","tUKx5G7z0 tUKx5G7z0");
	System.out.print("connected\n");
	h2Elements.forEach(h2Element ->{
	Element aElement=h2Element.child(0);
			
			String url = aElement.attr("href");
			String title = aElement.child(0).text();
			boolean isContain=title.contains(tag);
			if(isContain)
			{
			articleList.add(new Article(num,url,title));
			num=num+1;
			}
	});
	articleList.forEach(System.out::println);
	
	
	System.out.println("What image of the article do you want to download?");
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.print("\nstatus: ");
    try {
	i2Elements.forEach(i2Element ->{
	Element a2Element=i2Element.child(0);
			
			String src = a2Element.attr("src");
			String alt = a2Element.attr("alt");
			
			boolean isContain=alt.contains(articleList.get(n-1).getName());
			if(isContain)
			{
			SRC="http:"+src;
			}
	});
	
		String url=SRC;
		URL website = new URL(url);
		ReadableByteChannel jpg = Channels.newChannel(website.openStream());
		FileOutputStream fos = new FileOutputStream(n+"_image.jpg");
		fos.getChannel().transferFrom(jpg, 0, Long.MAX_VALUE);
		System.out.print("downloaded\n");
	}
	catch (Exception e) {
        System.out.print("failed\n\n");
    }
	}
	catch (Exception e) {
        System.out.print("no connection");
    }
}

java.util.concurrent.TimeUnit.SECONDS.sleep(4);
}
}
}

class Article {
	private String url, name;
	private int num;
	
	public Article(int num, String url, String name) {
		super();
		this.num=num;
		this.url = url;
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return num+")"+" Article [url=" + url + ", name=" + name +  "]";
	}	
}