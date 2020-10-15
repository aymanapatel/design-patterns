package creational.factoryabstract.api.documentbuilder;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class DocumentBuilderFactoryMain {


    public static void main(String[] args) throws Exception{

        String xml = "<document><body>Ayman</body></document>";
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(xml.getBytes());

        DocumentBuilderFactory  abstractFactory = DocumentBuilderFactory.newInstance(); // Don't know underlying impl of this
        DocumentBuilder factory = abstractFactory.newDocumentBuilder();                 // Know underlying impl of this
        Document doc = factory.parse(byteArrayInputStream);

        doc.getDocumentElement().normalize();

        System.out.println("Root element:" + doc.getDocumentElement().getNodeName());

        System.out.println("Abstract Factory GetClass " + abstractFactory.getClass());
        System.out.println("Factory GetClass " + factory.getClass());

    }
}
