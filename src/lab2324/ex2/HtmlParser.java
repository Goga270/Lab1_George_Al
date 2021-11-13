package lab2324.ex2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.URL;

public class HtmlParser {
    //private static final Object URL = ;
    private static String FOLDER = "src/lab2324/ex2/images";

    public static void main(String[] args) throws IOException {
        new File("src/lab2324/ex2/images").mkdirs();

        String URL = "http://www.mirea.ru";

        Document document = Jsoup.connect(URL).userAgent("Chrome/4.0.249.0 Safari/532.5").timeout(10000).get();

        Elements elementsimg = document.select("img");

        for(Element imgElem : elementsimg){
            String imgURL = imgElem.attr("abs:src");
            downloadImg(imgURL);
        }
    }

    public static void downloadImg(String imgURL){
        String imgName = imgURL.substring(imgURL.lastIndexOf("/")+1);
        System.out.println("Img name - " + imgName);
        try {
            URL url = new URL(imgURL);
            InputStream in = url.openStream();

            byte[] buffer = new byte[4096];
            int n = -1;

            OutputStream os = new FileOutputStream(FOLDER + "/" + imgName);

            while ((n= in.read(buffer))!= -1){
                os.write(buffer,0,n);
            }
            os.close();
            System.out.println("Img saved");
        } catch (IOException e){

        }
    }

}
