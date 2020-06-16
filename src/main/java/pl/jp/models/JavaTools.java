package pl.jp.models;

public class JavaTools {
    private String categoryName;
    private String[] pageName;
    private String[] links;

    public JavaTools() {
    }

    public JavaTools(String categoryName, String[] pageName, String[] links) {
        this.categoryName = categoryName;
        this.pageName = pageName;
        this.links = links;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String[] getPageName() {
        return pageName;
    }

    public void setPageName(String[] pageName) {
        this.pageName = pageName;
    }

    public String[] getLinks() {
        return links;
    }

    public void setLinks(String[] links) {
        this.links = links;
    }
}
