import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.*;

public class Main {



    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        DataFilesList MyFilesToCopy = new DataFilesList("C:\\Users\\John\\IdeaProjects\\CopyToSvip\\src\\resources\\DataFiles");  // Путь к папке с исходными файлами
        String DestComputersPathXML = "C:\\Users\\John\\IdeaProjects\\CopyToSvip\\src\\resources\\DistFolderToCopy.xml";          // Путь к файлу XML с именами компов на которые записывать файлы

        SAX sax = new SAX();
        //sax.print(DestComputersPathXML);

//        InetAddress address = InetAddress.getByName("dns");
//        System.out.println(address.toString());
//        System.out.println(address.isReachable(3000));




//        soutFilesToCopy(MyFilesToCopy);

        

        String pathSourceString = "C:\\Users\\John\\IdeaProjects\\CopyToSvip\\src\\resources\\DataFiles\\14.jpg";
        String pathDestString = "C:\\Users\\John\\IdeaProjects\\CopyToSvip\\src\\resources\\Share\\path1\\14.jpg";
        Path pathSource = Paths.get("C:\\Users\\John\\IdeaProjects\\CopyToSvip\\src\\resources\\DataFiles\\14.jpg");
        Path pathDest = Paths.get("C:\\Users\\John\\IdeaProjects\\CopyToSvip\\src\\resources\\Share\\path1\\14.jpg");
        Files.copy(pathSource,pathDest, REPLACE_EXISTING);

//        Files.copy("C:\\Users\\John\\IdeaProjects\\Copy To Svip\\src\\resources\\DataFiles\\14.jpg", "C:\\Users\\John\\IdeaProjects\\Copy To Svip\\src\\resources\\Share\\path1\\14.jpg", REPLACE_EXISTING  );

        String[] s = MyFilesToCopy.getStringListFiles();
        for (int i = 0; i < s.length; ++i){
            String file = MyFilesToCopy.getPath() + "\\" +  s[i];
//            Files.copy(file, DestComputersPathXML , REPLACE_EXISTING);
            System.out.println(MyFilesToCopy.getPath()  + "\\" +  s[i]);
        }


    }




    public static void soutFilesToCopy(DataFilesList path){
        String[] s = path.getStringListFiles();
        for (int i = 0; i < s.length ; ++i) {
            System.out.println(s[i]);
        }
    }




}
