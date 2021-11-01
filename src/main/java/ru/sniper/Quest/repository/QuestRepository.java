package ru.sniper.Quest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sniper.Quest.entity.QuestEntity;

@Repository
public interface QuestRepository extends JpaRepository<QuestEntity,Integer> {
}
