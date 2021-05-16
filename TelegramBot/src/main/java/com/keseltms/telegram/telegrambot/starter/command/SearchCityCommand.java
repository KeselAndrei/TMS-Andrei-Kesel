package com.keseltms.telegram.telegrambot.starter.command;

import com.keseltms.telegram.telegrambot.starter.connectionDatabase.ConnectionDatabase;
import com.keseltms.telegram.telegrambot.starter.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SearchCityCommand implements Commandable {
    private final SendBotMessageService sendBotMessageService;
    public static String descriptionCity;
    public static boolean isChek;

    public SearchCityCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {

        try {
            if (isSearchCity(update)) {
                sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),
                        descriptionCity);
            } else {
                sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(),
                        "Я не знаю такого города");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean isSearchCity(Update update) {
        ConnectionDatabase connectionDatabase = new ConnectionDatabase();
        HashMap<String, String> hashMap = null;
        try {
            hashMap = connectionDatabase.connectionDatabase();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Message inMessage = update.getMessage();
        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {

            if (inMessage.getText().substring(8).equalsIgnoreCase(stringStringEntry.getKey())) {
                descriptionCity = (stringStringEntry.getValue()).toLowerCase(Locale.ROOT);
                isChek = true;
                break;
            } else {
                isChek = false;
            }
        }
        return isChek;
    }
}