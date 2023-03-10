package ink.wujun.community.contorller;

/**
 * @author WuJun
 * @date 2023/2/2 14:06
 */
import ink.wujun.community.dto.PaginationDTO;
import ink.wujun.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {



    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5") Integer size,
                        @RequestParam(name = "search",required = false) String search
    ) {



        PaginationDTO pagination = questionService.list(search,page,size);

        model.addAttribute("search",search);
        model.addAttribute("pagination", pagination);

        return "index";
    }

}