package service;

import org.springframework.stereotype.Service;

/**
 * Created by wuxinxin on 2018/11/26.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "hello"+word+" !";
    }
}
