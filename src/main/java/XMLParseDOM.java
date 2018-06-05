import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLParseDOM implements IXmlParse {
    public String parseXML(String fileName) {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //创建DocumentBuilder对象
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            //通过DocumentBuilder对象的parser方法加载books.xml文件到当前项目下
            Document document = db.parse(fileName);

            String tagName = "";
            tagName = "book";
            //获取所有book节点的集合
            NodeList bookList = document.getElementsByTagName(tagName);
            //通过nodelist的getLength()方法可以获取bookList的长度
            System.out.println("一共有" + bookList.getLength() + "本书");


        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
