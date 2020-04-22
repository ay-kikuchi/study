package com.example.jissen.practice.chap11;

import java.net.Socket;

//11-2
public class MailSender {
    public static void main(String args[]) {
        try (var socket = new Socket("smtp.example.com", 60025)) {
            var os = socket.getOutputStream();
            os.write("HELO example.com\r\n".getBytes());
            os.write("MAIL FROM: asaka@example.com\r\n".getBytes());
            os.write("RCPT TO: minato@example.com\r\n".getBytes());
            os.write("DATA\r\n".getBytes());
            os.write("From: asaka@example.com\r\n".getBytes());
            os.write("Subject: Please send me your RPG".getBytes());
            os.write("Hello minato.\r\n".getBytes());
            os.write(".\r\n".getBytes());
            os.write("QUIT".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
