import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllBytes;

public class CanonicalizeXML {

    public static void main(String[] args) throws InvalidCanonicalizerException, IOException, CanonicalizationException, SAXException, ParserConfigurationException {
        org.apache.xml.security.Init.init();
        Canonicalizer canon = Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS);
//        Path path = Paths.get("/Users/sachinsomasundar/Downloads/finalProjectOutput/d2.xml");
//        Path path = Paths.get("d2.xml");

        byte canonXmlBytes[] = canon.canonicalize(readAllBytes(Paths.get("d2.xml")));
//        String canonXmlString = new String(canonXmlBytes);
        System.out.println(new String(canonXmlBytes));
    }
}
