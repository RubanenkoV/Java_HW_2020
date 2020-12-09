package web_bot_mp3;

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
import java.io.BufferedInputStream;



import org.jsoup.Jsoup;
import org.jsoup.select.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class web
{
public static int num=1;
public static String SRC  = "";
public static String url1="";

public static void main(String[] arguments) throws IOException, InterruptedException 
{
	for(;;)
	{
	List<String> list = new ArrayList<String>();
	Scanner in = new Scanner(new File("C:\\Users\\PromeV\\IdeaProjects\\web_bot_mp3\\urls.txt"));
	while (in.hasNextLine())
	list.add(in.nextLine());
	String[] Urls = list.toArray(new String[0]);
	
	for (int k=0;k<Urls.length;k++) 
	{
	String tag="iamjuampi";
	System.out.print("\ntag: "+tag+"\nsite: "+Urls[k]+"\nstatus: ");
	try 
	{
	List<Article> articleList = new ArrayList<>();
	Document doc = Jsoup.connect(Urls[k]).get();	
	Elements h2Elements = doc.getElementsByAttributeValue("class","name");
	
	System.out.print("connected\n");
	h2Elements.forEach(h2Element ->{
	Element aElement=h2Element;			
			String url ="http://mp3party.net"+aElement.child(0).attr("href");
			//System.out.print(url);
			String title = aElement.child(0).text();
			//System.out.print(title);
			boolean isContain=title.contains(tag);
			if(isContain)
			{
			articleList.add(new Article(num,url,title));
			num=num+1;
			}
	});
	articleList.forEach(System.out::println);
	
	System.out.println("Which song of the article do you want to download?");
	Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    System.out.print("\nstatus: ");
    try 
    {
    Document doc2 = Jsoup.connect(articleList.get(n-1).getUrl()).get();
    Elements i2Elements = doc2.getElementsByAttributeValue("class","download");
    i2Elements.forEach(i2Element ->{
    	Element bElement=i2Element;	
    
    String url1 = bElement.child(0).attr("href");
    System.out.print(url1);
    });
    

    
		URL website1 = new URL("https://dl1.mp3party.net/download/9755924");
		
		ReadableByteChannel mp3 = Channels.newChannel(website1.openStream());
		FileOutputStream fos = new FileOutputStream(n+"_song.mp3");
		fos.getChannel().transferFrom(mp3, 0, Long.MAX_VALUE);
		System.out.print("\ndownloaded\n");
	}
	catch (Exception e) 
	{
        System.out.print("success\n\n");
    }
	}
	catch (Exception e) 
	{
        System.out.print("/nError");
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