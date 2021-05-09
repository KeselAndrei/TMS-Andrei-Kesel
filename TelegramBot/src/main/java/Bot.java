import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.*;

public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "MyTelegramBot";
    }

    @Override
    public String getBotToken() {
        return "1793561468:AAGunp1xoqCfmx97_3lCyORMn1Wp9yLbKsE";
    }

    @Override
    public void onUpdateReceived(Update update) {
        BD bd = new BD();
        HashMap<String, String> hashMap = bd.SQL();
        //проверяем есть ли сообщение и текстовое ли оно
        if (update.hasMessage() && update.getMessage().hasText()) {
            try {
                //Извлекаем объект входящего сообщения
                Message inMessage = update.getMessage();
                //Создаем исходящее сообщение
                SendMessage outMessage = new SendMessage();
                //Указываем в какой чат будем отправлять сообщение
                //(в тот же чат, откуда пришло входящее сообщение)
                outMessage.setChatId(String.valueOf(inMessage.getChatId()));

                    for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
                        if (inMessage.getText().equalsIgnoreCase(stringStringEntry.getKey())) {
                            outMessage.setText( stringStringEntry.getValue());
                            execute(outMessage);
                            break;
                    }

                }
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}