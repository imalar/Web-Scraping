
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lara
 */
public class Scraper {

    public static void main(String[] args) {
        WebClient client = new WebClient();
        try {
            client.getOptions().setCssEnabled(false);
            client.getOptions().setJavaScriptEnabled(false);
            PrintWriter output = new PrintWriter(new FileWriter("C:\\Users\\imane\\test\\print.txt"));
            HtmlPage page = client.getPage(args[0]);
            output.println(page.asText());
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("System error!");
        }

    }
}
