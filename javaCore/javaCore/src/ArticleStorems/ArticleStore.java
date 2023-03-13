package ArticleStorems;

import java.util.ArrayList;
import java.util.List;

public class ArticleStore {
    List<Article> articles = new ArrayList<Article>();

    public void addArticles(Article article) throws InvalidArticleException {
        if(article==null){
            throw new InvalidArticleException("Article is Invalid");
        }
        articles.add(article);
    }

    public Article[] findArticleByColor(String color) throws InvalidColorException {
        if (color.isEmpty() || color.isBlank()) {
            throw new InvalidColorException("color that u are looking for is invalid");
        }
        Article foundArticles[] = new Article[5];
        int index = 0;
        for (Article article : articles) {
            if (article != null && article.getColor().equalsIgnoreCase(color)) {
                if (index < foundArticles.length) {
                    foundArticles[index] = article;
                    index++;
                }
            }
        }
        return foundArticles;
    }

    public Article updatePrice(String name, int price) {
        for (Article article : articles) {
            if (article != null && article.getName().equalsIgnoreCase(name)) {
                article.setPrice(price);
                return article;
            }
        }
        return null;
    }

    public String removeArticle(Article article) {
        articles.remove(article);
        return article + " has been removed.";
    }

    public List<Article> findAll() {
        return articles;

    }

}
