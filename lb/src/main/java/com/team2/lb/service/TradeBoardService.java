package com.team2.lb.service;

import java.util.ArrayList;
import java.util.Map;

import com.team2.lb.util.PageNavigator;
import com.team2.lb.vo.BookBoard;
import com.team2.lb.vo.LikeBoard;
import com.team2.lb.vo.TradeBoard;

public interface TradeBoardService {
	
	// 글 등록
	int registTrade(TradeBoard tradeBoard);

	PageNavigator getPageNavigator(int pagePerGroup, int countPerPage, int page, String type, String searchWord);

	// 보드리스트
	ArrayList<TradeBoard> showBoardList(PageNavigator navi, String type, String searchWord);

	ArrayList<TradeBoard> search(Map<String, String> map);
	
	// 글 읽기
	TradeBoard readBoard(int boardnum);

	int checkLike(LikeBoard likes);

	// 글 업데이트
	int updateBoard(TradeBoard tradeBoard);

	// 글 삭제
	int deleteBoard(int boardnum);

	ArrayList<TradeBoard> showBoardAll();
	
	void addLike(LikeBoard likes);

	void upLike(LikeBoard likes);

	int selectCnt(LikeBoard likes);

	void deleteLike(LikeBoard likes);

	void downLike(LikeBoard likes);
	
	ArrayList<TradeBoard> bestBoardList();

}
