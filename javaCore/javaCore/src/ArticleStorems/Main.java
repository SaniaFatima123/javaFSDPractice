package ArticleStorems;

import java.util.Collection;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        ArticleStore articleStore = new ArticleStore();
        Article article1 = new Article("Random Pen", 10, "blue");
        Article article2 = new Article("Cello Pen", 15, "black");
        Article article3 = new Article("Sparkle Pen", 20, "Green");
        Article article4 = new Article("Gel Pen", 30, "Red");
        Article article5 = null;
        System.out.println("****Adding Articles****");
        try {
            articleStore.addArticles(article1);
            articleStore.addArticles(article2);
            articleStore.addArticles(article3);
            articleStore.addArticles(article4);
            articleStore.addArticles(article5);
        }
        catch(InvalidArticleException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("There is some error");
        }

        System.out.println("****Getting all the Articles****");
        List<Article> allArticles = articleStore.findAll();
        obj.display(allArticles);

        System.out.println("****Found Article by Color****");
        try {
            Article[] foundArticles = articleStore.findArticleByColor("Green");
            for (Article article : foundArticles) {
                if (article != null) {
                    System.out.println("Name is " + article.getName());
                    System.out.println("Price is " + article.getPrice());
                    System.out.println("Color is " + article.getColor());
                    System.out.println("********");
                }
            }
        } catch (InvalidColorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Some ERROR Occurred");
        }
        System.out.println("****Updating Price****");
        Article foundArticle = articleStore.updatePrice("Gel Pen", 35);
        if (foundArticle != null) {
            System.out.println("Name is " + foundArticle.getName());
            System.out.println("Price is " + foundArticle.getPrice());
            System.out.println("Color is " + foundArticle.getColor());
            System.out.println("********");
        }
        System.out.println("****Getting all articles after update the Price****");
        List<Article> allArticlesFound = articleStore.findAll();
        obj.display(allArticlesFound);

        System.out.println("****Removing Article****");
        String removeArticle = articleStore.removeArticle(article1);
        System.out.println(removeArticle);
        System.out.println("****Getting all the articles after removing a particular Article****");
        List<Article> allArticleFound2 = articleStore.findAll();
        obj.display(allArticleFound2);

    }



        public void display(Collection<Article> allArticles) {
            for (Article article : allArticles) {
                System.out.println("Name is " + article.getName());
                System.out.println("Price is " + article.getPrice());
                System.out.println("Color is " + article.getColor());
                System.out.println("********");
            }
        }
}