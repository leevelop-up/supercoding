package exercise.chapter_58;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        // 서버 소켓 생성
        try(ServerSocket serverSocket = new ServerSocket(1234);
            ){
            System.out.println("서버가 시작되었습니다");
            while(true){
                try(Socket clientSocket = serverSocket.accept()) {
                    System.out.println("클라이언트가 접속하였습니다.");

                    //클라이언트로부터 데이터를 받기 위한 inputstream 생성
                    InputStream clientInputstream = clientSocket.getInputStream();
                    ObjectInputStream objectInputStream= new ObjectInputStream(clientInputstream); //inputstream 문자열을 잘받고 buffer로 속도를 높인다.

                    //클라이언트로 데이터를 보내기 위한 outputstream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream,true);

                    Customer customer = (Customer) objectInputStream.readObject();
                    customerList.add(customer);
                    System.out.println("대기명단 추가"+customer);
                    printWriter.println("현재 고객명단은 "+ customerList);

                }catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
