package ru.sniper.Quest.service;

import ru.sniper.Quest.entity.ResultEntity;

import java.util.List;

public interface ResultService {
    ResultEntity getById(int id);
    void saveResult(ResultEntity resultEntity);
    void updateResult(int id, int user_id, String quest_result, String answer_result, String answer_user);
    void deleteResult(ResultEntity resultEntity);
    List<ResultEntity> getAll();
}
