package xyz.chenmt.aidemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @program aidemo
 * @description: ai控制层
 * @author: chenmet
 * @create: 2019/01/21 09:31
 */
@Controller
public class AiController {


    @RequestMapping("getMsg")
    @ResponseBody
    public Map<String, Object> aiChat(String massage) {
        Map<String, Object> map = new HashMap<>();
        String str;
        str = massage;
        str = str.replace("吗", "");
        str = str.replace("?", "!");
        str = str.replace("？", "!");
        map.put("code", 200);
        map.put("msg", "操作成功");
        map.put("data", str);
        return map;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }


}
