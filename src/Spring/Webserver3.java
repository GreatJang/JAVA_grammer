package Spring;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");
            while (true){
                try(Socket socket = serverSocket.accept()) {// java내장 소켓 라이브러리 // Spring에는 자동화 되어있음.
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "Hello World"; // 사용자에게 줄 내용
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
