package module7StreamAPI.xml;


import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exercise1Runner {
    public static void main(String[] args) {
        Document document = getDocument();

        List<Point> points = new ArrayList<>();

        NodeList nodeList = document.getDocumentElement().getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Point curPoint = new Point();

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node childNode = childNodes.item(j);

                    if (childNode instanceof Element) {
                        String nodeName = childNode.getNodeName().toLowerCase();
                        switch (nodeName){
                            case "x":
                                curPoint.setX(
                                        Integer.parseInt(childNode.getTextContent().trim())
                                );
                                break;
                            case "y":
                                curPoint.setY(
                                        Integer.parseInt(childNode.getTextContent().trim())
                                );
                                break;
                        }
                    }
                }

                points.add(curPoint);
            }
        }

        points.stream().forEach(System.out::println);

    }

    public static Document getDocument() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

        try {
            return builder.parse(
                    ClassLoader.getSystemResourceAsStream("module7StreamAPI/xml/test.xml")
            );
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
