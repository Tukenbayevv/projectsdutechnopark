package nurik.projectsdutechnopark;

/**
 * Created by пользователь on 11.02.2018.
 */

public class Item {

    private int image;
    private String main, sub;

    public Item(int image, String main, String sub) {
        this.image = image;
        this.main = main;
        this.sub = sub;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

}
