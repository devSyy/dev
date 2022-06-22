package spring.redis.dev;

import org.springframework.data.repository.CrudRepository;

public interface PostDtoRepository extends CrudRepository<PostDto, String> {
    
}
