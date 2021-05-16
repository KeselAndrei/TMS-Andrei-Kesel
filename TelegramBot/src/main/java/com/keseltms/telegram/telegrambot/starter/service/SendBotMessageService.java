package com.keseltms.telegram.telegrambot.starter.service;

import com.keseltms.telegram.telegrambot.starter.bot.Bot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageService implements Serviceable {
    private final Bot bot;

    @Autowired
    public SendBotMessageService(Bot bot) {
        this.bot = bot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage outMessage = new SendMessage();
        outMessage.setChatId(chatId);
        outMessage.setText(message);
        try {
            bot.execute(outMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}