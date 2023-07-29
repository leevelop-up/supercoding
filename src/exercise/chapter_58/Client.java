package exercise.chapter_58;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        //서버 연결
        try(Socket socket = new Socket("localhost",1234)){

            //서버로 데이터를 보내기 위한 output
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            //서버로부터 데이터를 받기 위한 input
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            //서버에 메시지 전송
            Customer customer = new Customer("a2df","이동현");

            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            //서버로부터 받은 응답 출력
            String response = bufferedReader.readLine();
            System.out.println("서버로부터 받은 응답(고객대기리스트 : "+ response);

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
