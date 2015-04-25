import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Created by Iaroslav_Sviatkin on 4/24/2015.
 */
public class Runner {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        TestNG testng = new TestNG();
        for (XmlSuite suite : new Parser("Testng.xml").parseToList()) {
            testng.setCommandLineSuite(suite);
        }
        testng.run();

        /*
        TestNG testng = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("My suite :)");
        XmlTest test = new XmlTest(suite);
        test.setClasses(Arrays.asList(new XmlClass("example.CalcTest")));
        suite.setTests(Arrays.asList(test));
        testng.setXmlSuites(Arrays.asList(suite));
        testng.run();*/

    }
}
