package json.parser;

// Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
//	   and content. You need to design News Data Model and construct headline news.
//	   You can store in Map and then into ArrayList as your choice of Data Structure.
public class News {
    private String source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publisherAt;
    private String content;

    public News(){
    }
    public News(String source, String author, String title, String description, String url, String urlToImage, String publisherAt, String content){
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publisherAt = publisherAt;
        this.content = content;
    }
    public News(String author, String title, String description, String url, String urlToImage, String publisherAt, String content){

        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
        this.urlToImage = urlToImage;
        this.publisherAt = publisherAt;
        this.content = content;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrlToImage() {
        return urlToImage;
    }
    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }
    public String getPublisherAt() {
        return publisherAt;
    }
    public void setPublisherAt(String publisherAt) {
        this.publisherAt = publisherAt;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
