package whpu.edu.socket.client;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.net.StandardSocketOptions;
import java.net.UnknownHostException;

public class CharClient {
    public static void main(String[] args) throws EOFException {
        System.out.println("客户端启动...");
        Thread thread = new Thread(()->{
                try(
                        Socket socket = new Socket("127.0.0.1",8080);
                        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                        DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                        ){
                    while (true){
                        String aString = bufferedReader.readLine();
                        if(aString.equals("bye"))break;
                        outputStream.writeUTF(aString);
                        outputStream.flush();

                        String iString = inputStream.readUTF();
                        System.out.println(iString);
                    }
                }catch (UnknownHostException e){
                    e.printStackTrace();
                }
                catch (ConnectException e){
                    System.out.println("服务器未启动！");
                }catch (IOException e){
                    e.printStackTrace();
                }
                System.out.println("客户端停止");
        });
        thread.start();
    }
}
