package Spring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Webserver3 {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8081);
            System.out.println("8081 서비스 시작");

            while (true){
                try(Socket socket = serverSocket.accept()) {
                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 사이트에서 사용자에게 입력받은 값
                    StringBuilder sb = new StringBuilder();
                    String line;
//                    readLine : 1줄 read
//                    read : 전체 read
                    while(!(line = br.readLine()).isBlank()){
                        sb.append(line+"\n");
                    }
                    if(sb.toString().contains("POST")){
                        char[] buffer = new char[1024];
                        br.read(buffer);
                        System.out.println("POST body data : " + new String(buffer));
                        System.out.println("POST header data : " + sb.toString());
                    }
                    String httpRes = "HTTP/1.1 200 OK\r\n\r\n" + "OK"; // 사용자에게 줄 내용
                    socket.getOutputStream().write(httpRes.getBytes("UTF-8"));
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
