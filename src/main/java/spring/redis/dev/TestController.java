package spring.redis.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

    @Autowired
    PostDtoRepository postDtoRepository;

    @GetMapping("/postdto/{id}")
	public PostDto getPerson(@PathVariable String id) {		
		PostDto person = postDtoRepository.findById(id).get();		
		log.info("person: " + person);		
		return person;
	}

    @GetMapping
    public String get(){
        return postDtoRepository.findAll().toString();
    }

    @PostMapping("/postdto")
    public String set(@RequestBody PostDto postdto){
        return postDtoRepository.save(postdto).toString();
    }
    
}
