package com.keseltms.telegram.telegrambot.starter.command;

import com.keseltms.telegram.telegrambot.starter.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StopCommand implements Commandable {

    private final SendBotMessageService sendBotMessageService;

    public static final String STOP_MESSAGE = "До встречи друг!!!";

    public StopCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), STOP_MESSAGE);
    }
}