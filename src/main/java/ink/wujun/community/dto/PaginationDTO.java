package ink.wujun.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WuJun
 * @date 2023/2/10 9:55
 */
@Data
public class PaginationDTO<T> {
    private List<T> data;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private  List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalPage, Integer page) {

        this.totalPage = totalPage;
        this.page = page;
        pages.add(page);
        for(int i = 1;i <= 3;i++){
            if(page - i > 0){
                pages.add(0,page - i);
            }
            if(page + i <= totalPage){
                pages.add(page + i);
            }
        }

        if(page == 1){
            showPrevious = false;
        }else {
            showPrevious = true;
        }


        if(page == totalPage || totalPage == 0){
            showNext = false;
        }else{
            showNext = true;
        }

        if(pages.contains(1)){
            showFirstPage = false;
        }else {
            showFirstPage = true;
        }

        if(pages.contains(totalPage) || totalPage == 0){
            showEndPage = false;
        }else {
            showEndPage = true;
        }

    }
}
