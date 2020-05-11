package cn.wm.community.service;

import cn.wm.community.dto.PaginationDTO;

public interface QuestionService {

    PaginationDTO list(Integer page, Integer size);

    PaginationDTO list(Long id, Integer page, Integer size);
}
