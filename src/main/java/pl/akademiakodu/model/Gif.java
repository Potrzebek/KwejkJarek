package pl.akademiakodu.model;

public class Gif {

    private boolean favorite;
    private String name;
    private String userName;
    private int categoryId;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public Gif(boolean favorite, String name, String userName, int categoryid) {
        this.favorite = favorite;
        this.name = name;
        this.userName = userName;
        this.categoryId = categoryid;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
