package model;

public class BoardDTO {
    private String title;
    private String content;
    private String writer;

    public String toString() {
        return "BoardDTO{제목='" + this.title + "', 내용='" + this.content + "', 작성자='" + this.writer + "'}";
    }

    public BoardDTO(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}