package exercise.chapter_58;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // 서버 소켓 생성

        try(ServerSocket serverSocket = new ServerSocket(1234);
        Socket clientSocket = serverSocket.accept()){
            System.out.println("서버가 시작되었습니다");
            System.out.println("클라이언트가 접속하였습니다.");

            //클라이언트로부터 데이터를 받기 위한 inputstream 생성
            InputStream clientInputstream = clientSocket.getInputStream();
            BufferedReader clientbufferedReader = new BufferedReader(new InputStreamReader(clientInputstream)); //inputstream 문자열을 잘받고 buffer로 속도를 높인다.

            //클라이언트로 데이터를 보내기 위한 outputstream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream,true);

            //inputLine;
            String inputLine;

            //클라이언트로부터 데이터를 읽고 화면에 출력
            while((inputLine = clientbufferedReader.readLine()) !=null){
                System.out.println("클라이언트에서 온 요청 ; "+inputLine);

                printWriter.println("서버로부터 응답이 왔습니다.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
