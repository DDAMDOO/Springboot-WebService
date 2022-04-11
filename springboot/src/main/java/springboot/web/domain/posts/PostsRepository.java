package springboot.web.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //이 방식대로 하게 되면 @Repository 어노테이션이 필요없고, JpaRepository<entity class, PK 타입>을 상속하게 되면
    //기본적인 CRUD 메소드가 자동으로 생성된다.
    //다만 Entity class와 Entity Repository가 함께 위치해야 한다.
}
