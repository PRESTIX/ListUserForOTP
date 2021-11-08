package ru.yakunin;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Получить коллекцию пользователей
//Вывести ее на экран в столбик
//*Возраст может быть опциональным
//*Отсортиовать по возрасту по убыванию (пустые вверху)
//засечь время

//**Вебсервис, возвращающий Привет, (Данные)
//Спринг бут

public class Main {

    public static void main(String[] args) throws IOException {
        List<User> users;
        List<String> lines = Files.readAllLines(Paths.get("D:\\ListUserForOTP\\src\\ru\\yakunin\\user.txt"));
        users = UsersApi.createUsers(lines);
        System.out.println("Неотсортированный список:");
        for (User user : users) {
            System.out.println(user);
        }
        users.sort((u1,u2) -> u1.getYear().compareTo(u2.getYear()));
        System.out.println("Отсортированный список:");
        for (int i = users.size()-1; i >= 0; i--) {
            System.out.println(users.get(i));
        }
    }
}
