package com.team2.lb.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.team2.lb.vo.ChatMessage;
import com.team2.lb.vo.ChatRoom;

@Mapper
public interface ChatDAO {

	ChatRoom findRoomById(ChatRoom chatRoom);

	void createChatRoom(ChatRoom chatRoom);

	List<ChatRoom> findAllRooms();

	void saveMessage(ChatMessage message);

	ArrayList<ChatMessage> findByMessage(ChatRoom chatroom);

	int selectChatRoom(ChatRoom chatRoom);

	ArrayList<ChatRoom> showChatRoom(int bbno);

	ChatRoom selectByChatRoom(int roomId);

	ArrayList<ChatRoom> showChatRoomAll(String id);

	String findByBoardId(int roomId);

	int findByBbno(int roomId);

	String findByMemberId(int roomId);

}
