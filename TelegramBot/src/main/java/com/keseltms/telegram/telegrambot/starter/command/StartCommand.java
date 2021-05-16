package com.keseltms.telegram.telegrambot.starter.command;

import com.keseltms.telegram.telegrambot.starter.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Commandable {

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет. Я Telegram Bot. Я знаю много о городах " +
            "Если ты хочешь что-то узнать о городе введи /search НАЗВАНИЕ ГОРОДА и я попытаюсь \n" +
            "что-нибудь рассказать о нем.";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),
                START_MESSAGE);
    }
}