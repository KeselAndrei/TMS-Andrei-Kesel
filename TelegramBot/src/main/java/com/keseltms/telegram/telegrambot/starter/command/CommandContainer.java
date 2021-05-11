package com.keseltms.telegram.telegrambot.starter.command;

import com.google.common.collect.ImmutableMap;
import com.keseltms.telegram.telegrambot.starter.service.SendBotMessageService;

import static com.keseltms.telegram.telegrambot.starter.command.CommandName.*;


public class CommandContainer {

    private final ImmutableMap<String, Commandable> commandMap;
    private final Commandable unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {

        commandMap = ImmutableMap.<String, Commandable>builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(SEARCH.getCommandName(), new SearchCityCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();
        unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Commandable retrieveCommand(String commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}