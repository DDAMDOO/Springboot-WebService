package springboot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springboot.service.posts.PostsService;
import springboot.web.dto.PostsSaveRequestDto;

@RequiredArgsConstructor    //final로 선언된 모든 필드의 생성자를 생성
@RestController             //Controller어노테이션에 ResponseBody를 붙인 것이라고 생각
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
}
