package ink.wujun.community.contorller;

/**
 * @author WuJun
 * @date 2023/2/2 14:06
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}