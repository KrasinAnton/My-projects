package lr10.Task1.Example1;



import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class CreateXMLFile {
    public static void main(String[] args) {
        try {
            // Создание объекта DocumentBuilderFactory
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

            // Создание объекта DocumentBuilder
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание нового документа
            Document doc = docBuilder.newDocument();

            // Создание корневого элемента
            Element rootElement = doc.createElement("catalog");
            doc.appendChild(rootElement);

            // Создание дочерних элементов
            Element book1 = doc.createElement("book");
            book1.setAttribute("id", "001");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("title");
            title1.appendChild(doc.createTextNode("The Catcher in the Rye"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("author");
            author1.appendChild(doc.createTextNode("J. D. Salinger"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("year");
            year1.appendChild(doc.createTextNode("1951"));
            book1.appendChild(year1);

            Element book2 = doc.createElement("book");
            book2.setAttribute("id", "002");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("title");
            title2.appendChild(doc.createTextNode("To Kill a Mockingbird"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("author");
            author2.appendChild(doc.createTextNode("Harper Lee"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("year");
            year2.appendChild(doc.createTextNode("1960"));
            book2.appendChild(year2);

            // Запись файла
            doc.getDocumentElement().normalize();
            javax.xml.transform.TransformerFactory transformerFactory = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = transformerFactory.newTransformer();
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("catalog.xml"));
            transformer.transform(source, result);

            System.out.println("XML-файл успешно создан!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

