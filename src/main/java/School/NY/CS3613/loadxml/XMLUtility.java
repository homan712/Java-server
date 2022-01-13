package School.NY.CS3613.loadxml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.function.Consumer;

public class XMLUtility {
    public static float getAttributeNumber(Element element, String name){
        float value = Float.parseFloat(element.getAttribute(name));
        return value;
    }

    public static float getNumberContent(Element element){
        float value = Float.parseFloat(element.getTextContent());
        return value;
    }

    public static void process(String fileName, String tagName, Consumer<Element> consumer) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try {
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            DocumentBuilder db = dbf.newDocumentBuilder();

            Document doc = db.parse(new File(fileName));

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            // get <staff>
            NodeList list = doc.getElementsByTagName(tagName);

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    consumer.accept(element);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
