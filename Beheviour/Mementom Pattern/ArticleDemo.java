import java.util.*;

class ArticleOriginator{
    private String Font;
    private int size;

    public ArticleOriginator(String t,int s){
        Font = t;
        size = s;

    }

    public void setSize(int size) {
        this.size = size;
    }
    public void setFont(String type) {
        this.Font = type;
    }

    public int getSize() {
        return size;
    }
    public String getFont() {
        return Font;
    }

    public String toString() {
    
        return "Font : " + Font + " Size : " + size;
    }

    public void restoreToState(ArticleMemento m){
        Font = m.getFont();
        size = m.getSize();
    }

    public ArticleMemento saveStatetoMemento(){
        return new ArticleMemento(Font,size);
    }
}

class ArticleMemento{
    private String Font;
    private int size;

    public ArticleMemento(String t,int s){
        Font = t;
        size = s;

    }

    public int getSize() {
        return size;
    }
    public String getFont() {
        return Font;
    }

    public String toString() {
    
        return "Font : " + Font + " Size : " + size;
    }

    
}

class CareTaker{
    List<ArticleMemento> lm = new ArrayList<ArticleMemento>();

    public void addMemento(ArticleMemento m){
        lm.add(m);
    }

    public ArticleMemento getMementoObject(int i){
        return lm.get(i);

    }

}
public class ArticleDemo {
    public static void main(String[] args) {
    ArticleOriginator o1 = new ArticleOriginator("Arial", 20);
    System.out.println(o1);

    CareTaker cto = new CareTaker();
    ArticleMemento m1 = o1.saveStatetoMemento();
    cto.addMemento(m1);

    o1.setFont("Times & Romane");
    o1.setSize(50);
    System.out.println(o1);

    m1 = o1.saveStatetoMemento();
    cto.addMemento(m1);
    
    o1.setFont("Arial Black");
    o1.setSize(63);
    System.out.println(o1);
    m1 = o1.saveStatetoMemento();
    cto.addMemento(m1);

    o1.restoreToState(cto.getMementoObject(0));
    System.out.println(o1);
    }
}
