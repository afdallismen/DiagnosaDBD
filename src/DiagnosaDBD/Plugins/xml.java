/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosaDBD.Plugins;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author afdallismen
 */
public class xml {
    private String fileName;
    private final String fileLocation = "../asset/";
    
    public void read(){
        try {
            File fXmlFile = new File(fileLocation+getFileName());
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();
            //System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName(getFileName());
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    bahan[temp][0] = eElement.getAttribute("id");
                    bahan[temp][1] = eElement.getElementsByTagName("unit").item(0).getTextContent();
                    bahan[temp][2] = eElement.getAttribute("mUnit");
                    bahan[temp][3] = eElement.getElementsByTagName("name").item(0).getTextContent();
                    bahan[temp][4] = eElement.getElementsByTagName("cat").item(0).getTextContent();
                    bahan[temp][5] = eElement.getElementsByTagName("desc").item(0).getTextContent();
                    bahan[temp][6] = eElement.getElementsByTagName("fat").item(0).getTextContent();
                    bahan[temp][7] = eElement.getElementsByTagName("carb").item(0).getTextContent();
                    bahan[temp][8] = eElement.getElementsByTagName("prot").item(0).getTextContent();
                    bahan[temp][9] = eElement.getElementsByTagName("cal").item(0).getTextContent();
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException | DOMException e) {
            e.printStackTrace();
        }
        return bahan;
    }

    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    
    
}
