package com.team2.lb.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.team2.lb.dao.ChatDAO;
import com.team2.lb.vo.ChatMessage;
import com.team2.lb.vo.ChatRoom;


@Service
public class ChatServiceImpl implements ChatService{
	
	@Autowired
	ChatDAO dao;
	
	@Override
	public void createChatRoom(ChatRoom chatRoom) {
		dao.createChatRoom(chatRoom);
	}

	
	@Override
	public ChatRoom findRoomById(ChatRoom chatRoom) {
		ChatRoom result = dao.findRoomById(chatRoom);
		return result;
	}
	

	@Override
	public List<ChatRoom> findAllRooms() {
		List<ChatRoom> result = dao.findAllRooms();
		Collections.reverse(result);
		return result;
	}

	@Override
	public void saveMessage(ChatMessage message) {
		dao.saveMessage(message);
		
	}

	@Override
	public ArrayList<ChatMessage> findByMessage(ChatRoom chatroom) {
		ArrayList<ChatMessage> chatMessage = dao.findByMessage(chatroom);
		return chatMessage;
	}

	@Override
	public int selectChatRoom(ChatRoom chatRoom) {
		int ChatRoomNum = dao.selectChatRoom(chatRoom);
		return ChatRoomNum;
	}


	@Override
	public ArrayList<ChatRoom> showChatRoom(int bbno) {
		ArrayList<ChatRoom> chatRoom = dao.showChatRoom(bbno);
		return chatRoom;
	}


	@Override
	public ChatRoom selectByChatRoom(int roomId) {
		ChatRoom chatRoom = dao.selectByChatRoom(roomId);
		return chatRoom;
	}


	@Override
	public ArrayList<ChatRoom> showChatRoomAll(String id) {
	    ArrayList<ChatRoom> chatRooms = dao.showChatRoomAll(id);
		return chatRooms;
	}


	@Override
	public String findByBoardId(int roomId) {
		String boardId = dao.findByBoardId(roomId);
		return boardId;
	}


	@Override
	public int findByBbno(int roomId) {
		int bbno = dao.findByBbno(roomId);
		return bbno;
	}


	@Override
	public String findByMemberId(int roomId) {
		String memberId = dao.findByMemberId(roomId);
		return memberId;
	}

}
