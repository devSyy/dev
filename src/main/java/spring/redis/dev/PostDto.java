package spring.redis.dev;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.Data;

@RedisHash("postDto")
@Data // toString이 보기좋게 나옴
public class PostDto {
    
    @Id
    String id; //PostDto:<key>
    String name;
    
    List<String> tag;
}
