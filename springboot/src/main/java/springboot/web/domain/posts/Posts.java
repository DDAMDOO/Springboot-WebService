package springboot.web.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter             //lombok에서 지원하는 자동으로 Getter를 생성해주는 어노테이션
                    //Entity class에는 setter를 무작위 생성하다보면 코드상 명확히 구분이 힘들기 때문에 setter 메소드를 만들지 않음.
@NoArgsConstructor  //기본적으로 생성자를 만들어주는 어노테이션
@Entity             //테이블과 연동되는 클래스임을 알려주는 어노테이션
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK 생성 규칙.
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //클래스의 빌더 패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
