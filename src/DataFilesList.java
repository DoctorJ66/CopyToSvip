import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DataFilesList {
    private String path;        //Путь к папке

// Конструкторы :

    public DataFilesList(String path){                           //Передаём путь к папке
        this.path = path;
    }

// Методы:

    public String getPath() { return path; }                    // Возвращаем путь к папке

    public List<File> getListFiles(){                           // Возвращаем объект "лист файлов"
        File dir = new File(path);
        File[] arrFiles = dir.listFiles();
        List<File> lst = Arrays.asList(arrFiles);
        return lst;
    }

    public String[] getStringListFiles(){                       // Возвращаем объект "лист строк(названий) файлов"
        File dir = new File(path);
        String[] listFiles = dir.list();
        return listFiles;
    }

}
