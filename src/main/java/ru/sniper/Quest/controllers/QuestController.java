package ru.sniper.Quest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.sniper.Quest.entity.QuestEntity;
import ru.sniper.Quest.service.QuestService;

import java.util.List;

@Controller
public class QuestController {

    private QuestService questService;

    @Autowired
    public QuestController(QuestService questService) {
        this.questService = questService;
    }

    @GetMapping("/quest")
    public String list(Model model) {
        List<QuestEntity> questEntities = questService.getAll();
        model.addAttribute("quests", questEntities);
        model.addAttribute("quest", new QuestEntity());
        return "quest";
    }
}
