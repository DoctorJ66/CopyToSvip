public class DestFolderToCopy {
    private String comp;

    public String getComp() {
        return comp;
    }

    public void setComp(String comp) {
        this.comp = comp;
    }

    public String toPath(){
        return "\\\\" + this.comp + "\\video\\";
    }
}
