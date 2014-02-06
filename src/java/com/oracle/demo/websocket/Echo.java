/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.oracle.demo.websocket;

/**
 *
 * @author Marcelo
 */
import java.io.IOException;
import weblogic.websocket.WebSocketAdapter;
import weblogic.websocket.WebSocketConnection;
import weblogic.websocket.annotation.WebSocket;
 
@WebSocket(pathPatterns={"/echo/*"})
public class Echo extends WebSocketAdapter{

@Override
  public void onMessage(WebSocketConnection connection, String msg){
      try{
          connection.send(msg);
      }catch(IOException ioe){
          //Handle error condition
      }
  }
  @Override
  public void onOpen(WebSocketConnection connection){
      System.out.println("Client connection open");
  }
}
