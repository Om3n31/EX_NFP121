import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class DTD {

    public static void saveXML(CLIClassique Cli, java.io.Writer out)
            throws java.io.IOException
    {

        Element racine = new Element("interfaces");

        Element cli = new Element("cli");
        racine.addContent(cli);

        Element argumentA = new Element("name");
        argumentA.setAttribute("acces","A");
        argumentA.setAttribute("nb", "1");
        argumentA.setText("Valeur de alpha");
        cli.addContent(argumentA);

        Element argumentB = new Element("name");
        argumentA.setAttribute("acces","I");
        argumentA.setAttribute("nb", "1");
        argumentA.setText("Valeur de indice");
        cli.addContent(argumentB);

        Element argumentC = new Element("name");
        argumentA.setAttribute("acces","P");
        argumentA.setText("mode matrice pleine");
        cli.addContent(argumentC);

        Element argumentD = new Element("name");
        argumentA.setAttribute("acces","C");
        argumentA.setText("Mode matrice creuse");
        cli.addContent(argumentD);




        DocType docType = new DocType("cli", "cli.dtd");
        Document document = new Document(racine, docType);

        // Production du fichier XML
        XMLOutputter sortie = new XMLOutputter(Format.getPrettyFormat());
        sortie.output(document, out);
    }
}