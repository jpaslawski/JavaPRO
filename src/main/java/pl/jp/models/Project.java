package pl.jp.models;

public class Project {

    private String name;

    private String[] codeList;

    public Project() {
    }

    public Project(String name, String[] codeList) {
        this.name = name;
        this.codeList = codeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCodeList() {
        return codeList;
    }

    public void setCodeList(String[] codeList) {
        this.codeList = codeList;
    }
}
