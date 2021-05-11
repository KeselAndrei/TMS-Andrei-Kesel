package com.keseltms.telegram.telegrambot.starter.command;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface Commandable {
    void execute(Update update);
}