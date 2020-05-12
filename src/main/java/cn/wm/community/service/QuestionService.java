package cn.wm.community.service;

import cn.wm.community.dto.PaginationDTO;
import cn.wm.community.dto.QuestionDTO;

public interface QuestionService {

    PaginationDTO list(Integer page, Integer size);

    PaginationDTO list(Long id, Integer page, Integer size);

    QuestionDTO getById(Long id);
}
