package com.keseltms.telegram.telegrambot.starter.command;

public enum CommandName {

    START("/start"),
    STOP("/stop"),
    HELP("/help"),
    SEARCH("/search"),
    NO("command");

    private final String commandName;

    CommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandName() {
        return commandName;
    }
}