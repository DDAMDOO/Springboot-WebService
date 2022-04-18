package springboot.web.dto;

import lombok.Getter;
import springboot.web.domain.posts.Posts;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
