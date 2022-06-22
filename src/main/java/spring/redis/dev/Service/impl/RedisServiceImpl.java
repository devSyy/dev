// package spring.redis.dev.Service.impl;

// import java.time.Duration;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.redis.core.StringRedisTemplate;
// import org.springframework.data.redis.core.ValueOperations;
// import org.springframework.stereotype.Service;

// import spring.redis.dev.Service.RedisService;

// @Service
// public class RedisServiceImpl implements RedisService {

//     @Autowired
//     private StringRedisTemplate stringRedisTemplate;

//     @Override
//     public String getData(String key) {
//         ValueOperations<String,String> valueOperations = stringRedisTemplate.opsForValue();
//         return valueOperations.get(key);
//     }

//     @Override
//     public void setData(String key, String value) {
//         ValueOperations<String,String> valueOperations = stringRedisTemplate.opsForValue();
//         valueOperations.set(key,value);
//     }

//     @Override
//     public void setDataExpire(String key, String value, int duration) {
//         ValueOperations<String,String> valueOperations = stringRedisTemplate.opsForValue();
//         Duration tempDuration = Duration.ofSeconds(duration);
//         valueOperations.set(key,value,tempDuration);
//     }
// }
