package com.keseltms.telegram.telegrambot.starter.command;

import com.keseltms.telegram.telegrambot.starter.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.keseltms.telegram.telegrambot.starter.command.CommandName.*;

public class HelpCommand implements Commandable {
    private final SendBotMessageService sendBotMessageService;

    public static final String HELP_MESSAGE = String.format("✨Дотупные команды✨\n\n"

                    + "Начать\\закончить работу с ботом\n"
                    + "%s - начать работу со мной\n"
                    + "%s - начать поиск города /search НАЗВАНИЕ ГОРОДА\n"
                    + "%s - приостановить работу со мной\n\n"
                    + "%s - получить помощь в работе со мной\n",
            START.getCommandName(), SEARCH.getCommandName(), STOP.getCommandName(), HELP.getCommandName());

    public HelpCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), HELP_MESSAGE);
    }
}