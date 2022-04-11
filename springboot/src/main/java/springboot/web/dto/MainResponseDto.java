package springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter                     //선언된 모든 필드에 대해서 get 메소드를 생성해주는 어노테이션
@RequiredArgsConstructor    //선언된 모든 final 필드에 대해서 생성자를 만들어 줌
public class MainResponseDto {

    private final String name;
    private final int amount;
}
